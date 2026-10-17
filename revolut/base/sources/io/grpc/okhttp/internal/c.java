package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class c {
    public static final c e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f162996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f162997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f162998c;
    public final boolean d;

    static {
        a[] aVarArr = {a.TLS_AES_128_GCM_SHA256, a.TLS_AES_256_GCM_SHA384, a.TLS_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_AES_128_GCM_SHA256, a.TLS_RSA_WITH_AES_256_GCM_SHA384, a.TLS_RSA_WITH_AES_128_CBC_SHA, a.TLS_RSA_WITH_AES_256_CBC_SHA, a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        b bVar = new b(true);
        bVar.a(aVarArr);
        o oVar = o.TLS_1_3;
        o oVar2 = o.TLS_1_2;
        bVar.b(oVar, oVar2);
        bVar.d = true;
        c cVar = new c(bVar);
        e = cVar;
        o[] oVarArr = {oVar, oVar2, o.TLS_1_1, o.TLS_1_0};
        boolean z = cVar.f162996a;
        if (!z) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
        if (oVarArr.length == 0) {
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        String[] strArr = new String[oVarArr.length];
        for (int i = 0; i < oVarArr.length; i++) {
            strArr[i] = oVarArr[i].javaName;
        }
        if (!z) {
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }
    }

    public c(b bVar) {
        this.f162996a = bVar.f162993a;
        this.f162997b = bVar.f162994b;
        this.f162998c = bVar.f162995c;
        this.d = bVar.d;
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof c)) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        c cVar = (c) obj2;
        boolean z = cVar.f162996a;
        boolean z3 = this.f162996a;
        if (z3 != z) {
            return false;
        }
        if (z3) {
            return Arrays.equals(this.f162997b, cVar.f162997b) && Arrays.equals(this.f162998c, cVar.f162998c) && this.d == cVar.d;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f162996a) {
            return ((((527 + Arrays.hashCode(this.f162997b)) * 31) + Arrays.hashCode(this.f162998c)) * 31) + (!this.d ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        List listUnmodifiableList;
        o oVar;
        if (!this.f162996a) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.f162997b;
        if (strArr == null) {
            listUnmodifiableList = null;
        } else {
            a[] aVarArr = new a[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                aVarArr[i] = str.startsWith("SSL_") ? a.valueOf("TLS_" + str.substring(4)) : a.valueOf(str);
            }
            String[] strArr2 = p.f163019a;
            listUnmodifiableList = Collections.unmodifiableList(Arrays.asList((Object[]) aVarArr.clone()));
        }
        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("ConnectionSpec(cipherSuites=", listUnmodifiableList == null ? "[use default]" : listUnmodifiableList.toString(), ", tlsVersions=");
        String[] strArr3 = this.f162998c;
        o[] oVarArr = new o[strArr3.length];
        for (int i2 = 0; i2 < strArr3.length; i2++) {
            String str2 = strArr3[i2];
            if ("TLSv1.3".equals(str2)) {
                oVar = o.TLS_1_3;
            } else if ("TLSv1.2".equals(str2)) {
                oVar = o.TLS_1_2;
            } else if ("TLSv1.1".equals(str2)) {
                oVar = o.TLS_1_1;
            } else if ("TLSv1".equals(str2)) {
                oVar = o.TLS_1_0;
            } else {
                if (!"SSLv3".equals(str2)) {
                    throw new IllegalArgumentException(j6.a.q("Unexpected TLS version: ", str2));
                }
                oVar = o.SSL_3_0;
            }
            oVarArr[i2] = oVar;
        }
        String[] strArr4 = p.f163019a;
        sbX.append(Collections.unmodifiableList(Arrays.asList((Object[]) oVarArr.clone())));
        sbX.append(", supportsTlsExtensions=");
        return com.google.android.gms.internal.mlkit_vision_face.a.t(sbX, this.d, ")");
    }
}

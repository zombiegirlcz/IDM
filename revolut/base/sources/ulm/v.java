package ulm;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class v {

    @NotNull
    public static final u Companion;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.google.gson.internal.m f281143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f281144c;
    public static final v d;
    public static final v e;
    public static final v f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v f281145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final v f281146h;
    public static final v i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final v f281147j;
    public static final v k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final v f281148l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final v f281149m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final v f281150n;
    public static final v o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final v f281151p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final v f281152q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final v f281153r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final v f281154s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f281155a;

    static {
        u uVar = new u();
        Companion = uVar;
        f281143b = new com.google.gson.internal.m(2);
        f281144c = new LinkedHashMap();
        u.a(uVar, "SSL_RSA_WITH_NULL_MD5");
        u.a(uVar, "SSL_RSA_WITH_NULL_SHA");
        u.a(uVar, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        u.a(uVar, "SSL_RSA_WITH_RC4_128_MD5");
        u.a(uVar, "SSL_RSA_WITH_RC4_128_SHA");
        u.a(uVar, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        u.a(uVar, "SSL_RSA_WITH_DES_CBC_SHA");
        d = u.a(uVar, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        u.a(uVar, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        u.a(uVar, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        u.a(uVar, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        u.a(uVar, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        u.a(uVar, "SSL_DH_anon_WITH_RC4_128_MD5");
        u.a(uVar, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        u.a(uVar, "SSL_DH_anon_WITH_DES_CBC_SHA");
        u.a(uVar, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_KRB5_WITH_DES_CBC_SHA");
        u.a(uVar, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_KRB5_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_KRB5_WITH_DES_CBC_MD5");
        u.a(uVar, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        u.a(uVar, "TLS_KRB5_WITH_RC4_128_MD5");
        u.a(uVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        u.a(uVar, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        u.a(uVar, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        u.a(uVar, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        e = u.a(uVar, "TLS_RSA_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        f = u.a(uVar, "TLS_RSA_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_RSA_WITH_NULL_SHA256");
        u.a(uVar, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        u.a(uVar, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        u.a(uVar, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        u.a(uVar, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        u.a(uVar, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        u.a(uVar, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        u.a(uVar, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        u.a(uVar, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        u.a(uVar, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        u.a(uVar, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        u.a(uVar, "TLS_PSK_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_PSK_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_PSK_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_RSA_WITH_SEED_CBC_SHA");
        f281145g = u.a(uVar, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        f281146h = u.a(uVar, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        u.a(uVar, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        u.a(uVar, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        u.a(uVar, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        u.a(uVar, "TLS_FALLBACK_SCSV");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_ECDH_RSA_WITH_NULL_SHA");
        u.a(uVar, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        u.a(uVar, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        i = u.a(uVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        f281147j = u.a(uVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_ECDH_anon_WITH_NULL_SHA");
        u.a(uVar, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        u.a(uVar, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        u.a(uVar, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        u.a(uVar, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        u.a(uVar, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        u.a(uVar, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        k = u.a(uVar, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        f281148l = u.a(uVar, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        u.a(uVar, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        f281149m = u.a(uVar, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        f281150n = u.a(uVar, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        u.a(uVar, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        u.a(uVar, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        u.a(uVar, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        o = u.a(uVar, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        f281151p = u.a(uVar, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        u.a(uVar, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        u.a(uVar, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        f281152q = u.a(uVar, "TLS_AES_128_GCM_SHA256");
        f281153r = u.a(uVar, "TLS_AES_256_GCM_SHA384");
        f281154s = u.a(uVar, "TLS_CHACHA20_POLY1305_SHA256");
        u.a(uVar, "TLS_AES_128_CCM_SHA256");
        u.a(uVar, "TLS_AES_128_CCM_8_SHA256");
    }

    public v(String str) {
        this.f281155a = str;
    }

    public final String toString() {
        return this.f281155a;
    }
}

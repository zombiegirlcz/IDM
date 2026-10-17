package xjl;

import akl.i0;
import akl.k0;
import android.util.Base64;
import gkl.v0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wjl.b f306560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f306561b;

    public i(wjl.b pkceCodeGenerator, i0 pendingAuthenticationRepository) {
        Intrinsics.checkNotNullParameter(pkceCodeGenerator, "pkceCodeGenerator");
        Intrinsics.checkNotNullParameter(pendingAuthenticationRepository, "pendingAuthenticationRepository");
        this.f306560a = pkceCodeGenerator;
        this.f306561b = pendingAuthenticationRepository;
    }

    public final String a(String codeVerifier) throws NoSuchAlgorithmException {
        String strA;
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        i0 i0Var = this.f306561b;
        gkl.j jVarB = i0Var.b();
        if (jVarB != null && (strA = jVarB.a()) != null) {
            return strA;
        }
        ((wjl.c) this.f306560a).getClass();
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        wjl.d.a();
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = codeVerifier.getBytes(Charsets.d);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String strEncodeToString = Base64.encodeToString(messageDigest.digest(bytes), 11);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "run(...)");
        gkl.j data = new gkl.j(codeVerifier, strEncodeToString);
        i0Var.a();
        ne0.j jVar = i0Var.f6033c;
        xm0.a aVar = i0Var.f6031a;
        Intrinsics.checkNotNullParameter(data, "data");
        v0 v0VarD = i0Var.d();
        String strA2 = v0VarD != null ? v0VarD.a() : null;
        if (!Intrinsics.f(strA2, data.a()) && strA2 != null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "Revolut SSO", j6.a.s("Failed to set code verifier data with id=", data.a(), ":\nThere is already a stored session for ", v0VarD.a(), "\nIf this call was intentional, make sure you call clear() and restart the affected logic properly before"), null, h0Var);
            return strEncodeToString;
        }
        try {
            i0Var.e(k0.INITIATED);
            aVar.b("ID", data.a());
            aVar.b("CODE_VERIFIER", data.b());
            jVar.f("ID", data.a());
            jVar.f("CODE_VERIFIER", data.b());
            Unit unit = Unit.f186387a;
        } catch (Exception e) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
        }
        return strEncodeToString;
    }

    public final String b() {
        String strB;
        gkl.j jVarB = this.f306561b.b();
        if (jVarB != null && (strB = jVarB.b()) != null) {
            return strB;
        }
        ((wjl.c) this.f306560a).getClass();
        byte[] bArrB = wjl.d.b();
        if (bArrB == null) {
            byte[] bArr = new byte[32];
            new SecureRandom().nextBytes(bArr);
            bArrB = bArr;
        }
        String strEncodeToString = Base64.encodeToString(bArrB, 11);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
        return strEncodeToString;
    }
}

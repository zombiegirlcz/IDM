package gm0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class h implements dm0.d {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i70.a f144739a;

    public h(i70.a vendorIdProvider) {
        Intrinsics.checkNotNullParameter(vendorIdProvider, "vendorIdProvider");
        this.f144739a = vendorIdProvider;
    }

    @Override // dm0.d
    public final c a() {
        return c.GLOBAL;
    }

    @Override // dm0.d
    public final dm0.b b() {
        String string;
        String strA = this.f144739a.a();
        if (strA == null || d0.W(strA)) {
            m70.a.c(t0.f186434a);
            string = "";
        } else {
            StringBuilder sb6 = new StringBuilder(strA);
            int length = strA.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = strA.charAt(i);
                if ((Intrinsics.k(cCharAt, 31) <= 0 && cCharAt != '\t') || Intrinsics.k(cCharAt, CertificateBody.profileType) >= 0) {
                    sb6.setCharAt(i, '_');
                }
            }
            string = sb6.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        }
        return new dm0.b(string, 0, string, null);
    }

    @Override // dm0.d
    public final boolean clear() {
        return true;
    }
}

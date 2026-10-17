package o45;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class v0 {

    @NotNull
    public static final u0 Companion = new u0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f222113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f222114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f222115c;
    public final String d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f222116g;

    public /* synthetic */ v0(int i, String str, String str2, t0 t0Var, String str3, String str4, LocalDate localDate, String str5) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(q0.f222094a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.f222113a = str;
        this.f222114b = str2;
        this.f222115c = t0Var;
        this.d = str3;
        this.e = str4;
        this.f = localDate;
        this.f222116g = str5;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return Intrinsics.f(this.f222113a, v0Var.f222113a) && Intrinsics.f(this.f222114b, v0Var.f222114b) && Intrinsics.f(this.f222115c, v0Var.f222115c) && Intrinsics.f(this.d, v0Var.d) && Intrinsics.f(this.e, v0Var.e) && Intrinsics.f(this.f, v0Var.f) && Intrinsics.f(this.f222116g, v0Var.f222116g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f222113a.hashCode() * 31, 31, this.f222114b);
        t0 t0Var = this.f222115c;
        int iHashCode = (iC + (t0Var == null ? 0 : t0Var.hashCode())) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.f;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str3 = this.f222116g;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public v0(String mode, String interestRate, t0 t0Var, String str, String str2, LocalDate localDate, String str3) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(interestRate, "interestRate");
        this.f222113a = mode;
        this.f222114b = interestRate;
        this.f222115c = t0Var;
        this.d = str;
        this.e = str2;
        this.f = localDate;
        this.f222116g = str3;
    }
}

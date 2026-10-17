package t48;

import com.revolut.feature.terms.api.model.TermsScope;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TermsScope f267926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TermsScope f267927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TermsScope f267928c;
    public final TermsScope d;
    public final TermsScope e;
    public final TermsScope f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TermsScope f267929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TermsScope f267930h;

    public p(TermsScope termsAndConditionTerm, TermsScope privacyPolicyTerm, TermsScope termsScope, TermsScope termsScope2, TermsScope termsScope3, TermsScope termsScope4, TermsScope termsScope5, TermsScope termsScope6) {
        Intrinsics.checkNotNullParameter(termsAndConditionTerm, "termsAndConditionTerm");
        Intrinsics.checkNotNullParameter(privacyPolicyTerm, "privacyPolicyTerm");
        this.f267926a = termsAndConditionTerm;
        this.f267927b = privacyPolicyTerm;
        this.f267928c = termsScope;
        this.d = termsScope2;
        this.e = termsScope3;
        this.f = termsScope4;
        this.f267929g = termsScope5;
        this.f267930h = termsScope6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f267926a, pVar.f267926a) && Intrinsics.f(this.f267927b, pVar.f267927b) && Intrinsics.f(this.f267928c, pVar.f267928c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e) && Intrinsics.f(this.f, pVar.f) && Intrinsics.f(this.f267929g, pVar.f267929g) && Intrinsics.f(this.f267930h, pVar.f267930h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f267926a.f90390a.hashCode() * 31, 31, this.f267927b.f90390a);
        TermsScope termsScope = this.f267928c;
        int iHashCode = (iC + (termsScope == null ? 0 : termsScope.f90390a.hashCode())) * 31;
        TermsScope termsScope2 = this.d;
        int iHashCode2 = (iHashCode + (termsScope2 == null ? 0 : termsScope2.f90390a.hashCode())) * 31;
        TermsScope termsScope3 = this.e;
        int iHashCode3 = (iHashCode2 + (termsScope3 == null ? 0 : termsScope3.f90390a.hashCode())) * 31;
        TermsScope termsScope4 = this.f;
        int iHashCode4 = (iHashCode3 + (termsScope4 == null ? 0 : termsScope4.f90390a.hashCode())) * 31;
        TermsScope termsScope5 = this.f267929g;
        int iHashCode5 = (iHashCode4 + (termsScope5 == null ? 0 : termsScope5.f90390a.hashCode())) * 31;
        TermsScope termsScope6 = this.f267930h;
        return iHashCode5 + (termsScope6 != null ? termsScope6.f90390a.hashCode() : 0);
    }
}

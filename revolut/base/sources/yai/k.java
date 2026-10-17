package yai;

import com.revolut.feature.referrals.code.data.api.ReferrerDetailsState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f312033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f312034c;
    public final boolean d;
    public final ReferrerDetailsState e;
    public final List f;

    public k(String email, j validationResult, boolean z, boolean z3, ReferrerDetailsState referrerDetailsEnabledState, List emailDomainSuggestions) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(referrerDetailsEnabledState, "referrerDetailsEnabledState");
        Intrinsics.checkNotNullParameter(emailDomainSuggestions, "emailDomainSuggestions");
        this.f312032a = email;
        this.f312033b = validationResult;
        this.f312034c = z;
        this.d = z3;
        this.e = referrerDetailsEnabledState;
        this.f = emailDomainSuggestions;
    }

    public static k a(k kVar, String str, j jVar, boolean z, ReferrerDetailsState referrerDetailsState, List list, int i) {
        if ((i & 1) != 0) {
            str = kVar.f312032a;
        }
        String email = str;
        if ((i & 2) != 0) {
            jVar = kVar.f312033b;
        }
        j validationResult = jVar;
        if ((i & 4) != 0) {
            z = kVar.f312034c;
        }
        boolean z3 = z;
        boolean z4 = kVar.d;
        if ((i & 16) != 0) {
            referrerDetailsState = kVar.e;
        }
        ReferrerDetailsState referrerDetailsEnabledState = referrerDetailsState;
        if ((i & 32) != 0) {
            list = kVar.f;
        }
        List emailDomainSuggestions = list;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        Intrinsics.checkNotNullParameter(referrerDetailsEnabledState, "referrerDetailsEnabledState");
        Intrinsics.checkNotNullParameter(emailDomainSuggestions, "emailDomainSuggestions");
        return new k(email, validationResult, z3, z4, referrerDetailsEnabledState, emailDomainSuggestions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f312032a, kVar.f312032a) && Intrinsics.f(this.f312033b, kVar.f312033b) && this.f312034c == kVar.f312034c && this.d == kVar.d && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + j6.a.c(j6.a.c((this.f312033b.hashCode() + (this.f312032a.hashCode() * 31)) * 31, 31, this.f312034c), 31, this.d)) * 31);
    }
}

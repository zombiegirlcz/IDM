package sh1;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f263371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f263372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f263373c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Clause f263374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f263375h;
    public final Clause i;

    public k(Clause searchAddressHint, Clause searchPostcodeHint, Clause loadingMessage, Clause noResultsFound, Clause addressNotHere, Clause somethingWentWrong, Clause errorDescription, Clause invalidPostcode, Clause enterValidPostcode) {
        Intrinsics.checkNotNullParameter(searchAddressHint, "searchAddressHint");
        Intrinsics.checkNotNullParameter(searchPostcodeHint, "searchPostcodeHint");
        Intrinsics.checkNotNullParameter(loadingMessage, "loadingMessage");
        Intrinsics.checkNotNullParameter(noResultsFound, "noResultsFound");
        Intrinsics.checkNotNullParameter(addressNotHere, "addressNotHere");
        Intrinsics.checkNotNullParameter(somethingWentWrong, "somethingWentWrong");
        Intrinsics.checkNotNullParameter(errorDescription, "errorDescription");
        Intrinsics.checkNotNullParameter(invalidPostcode, "invalidPostcode");
        Intrinsics.checkNotNullParameter(enterValidPostcode, "enterValidPostcode");
        this.f263371a = searchAddressHint;
        this.f263372b = searchPostcodeHint;
        this.f263373c = loadingMessage;
        this.d = noResultsFound;
        this.e = addressNotHere;
        this.f = somethingWentWrong;
        this.f263374g = errorDescription;
        this.f263375h = invalidPostcode;
        this.i = enterValidPostcode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f263371a, kVar.f263371a) && Intrinsics.f(this.f263372b, kVar.f263372b) && Intrinsics.f(this.f263373c, kVar.f263373c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f263374g, kVar.f263374g) && Intrinsics.f(this.f263375h, kVar.f263375h) && Intrinsics.f(this.i, kVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + p.a.a(p.a.a(p.a.a(p.a.a(p.a.a(p.a.a(p.a.a(this.f263371a.hashCode() * 31, 31, this.f263372b), 31, this.f263373c), 31, this.d), 31, this.e), 31, this.f), 31, this.f263374g), 31, this.f263375h);
    }
}

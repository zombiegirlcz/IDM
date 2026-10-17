package k3h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wdh.a f180740b;

    public e(String instrumentRef, wdh.a creditRatingsProvider) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        Intrinsics.checkNotNullParameter(creditRatingsProvider, "creditRatingsProvider");
        this.f180739a = instrumentRef;
        this.f180740b = creditRatingsProvider;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f180739a, eVar.f180739a) && this.f180740b == eVar.f180740b;
    }

    public final int hashCode() {
        return this.f180740b.hashCode() + (this.f180739a.hashCode() * 31);
    }
}

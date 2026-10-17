package gd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wc8.a f143084b;

    public g(String consentId, wc8.a state) {
        Intrinsics.checkNotNullParameter(consentId, "consentId");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f143083a = consentId;
        this.f143084b = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f143083a, gVar.f143083a) && this.f143084b == gVar.f143084b;
    }

    public final int hashCode() {
        return this.f143084b.hashCode() + (this.f143083a.hashCode() * 31);
    }
}

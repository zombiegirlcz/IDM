package cv3;

import ht3.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f109247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f109248b;

    public d(l0 creditPromptContent, h offerType) {
        Intrinsics.checkNotNullParameter(creditPromptContent, "creditPromptContent");
        Intrinsics.checkNotNullParameter(offerType, "offerType");
        this.f109247a = creditPromptContent;
        this.f109248b = offerType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f109247a, dVar.f109247a) && this.f109248b == dVar.f109248b;
    }

    public final int hashCode() {
        return this.f109248b.hashCode() + (this.f109247a.hashCode() * 31);
    }
}

package jvc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h93.f0 f178844a;

    public q(h93.f0 revolutCard) {
        Intrinsics.checkNotNullParameter(revolutCard, "revolutCard");
        this.f178844a = revolutCard;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f178844a, ((q) obj2).f178844a);
    }

    public final int hashCode() {
        return this.f178844a.hashCode();
    }
}

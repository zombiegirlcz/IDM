package p5l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f233196a;

    public d(a details) {
        Intrinsics.checkNotNullParameter(details, "details");
        this.f233196a = details;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f233196a, ((d) obj2).f233196a);
    }

    public final int hashCode() {
        return this.f233196a.f233193a.hashCode();
    }
}

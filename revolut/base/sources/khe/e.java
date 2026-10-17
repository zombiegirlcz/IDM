package khe;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f184100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f184101b;

    public e(ArrayList items, d scrollTarget) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(scrollTarget, "scrollTarget");
        this.f184100a = items;
        this.f184101b = scrollTarget;
    }

    @Override // cli.p
    public final List c() {
        return this.f184100a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f184100a.equals(eVar.f184100a) && this.f184101b.equals(eVar.f184101b);
    }

    public final int hashCode() {
        return this.f184101b.hashCode() + (this.f184100a.hashCode() * 31);
    }
}

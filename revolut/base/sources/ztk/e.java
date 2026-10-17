package ztk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325178a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f325178a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f325178a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f325178a, ((e) obj2).f325178a);
    }

    public final int hashCode() {
        return this.f325178a.hashCode();
    }
}

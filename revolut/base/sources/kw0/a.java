package kw0;

import aw0.d0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f190184a;

    public a(d0 aspectRatio) {
        Intrinsics.checkNotNullParameter(aspectRatio, "aspectRatio");
        this.f190184a = aspectRatio;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f190184a, ((a) obj2).f190184a);
    }

    public final int hashCode() {
        return this.f190184a.hashCode();
    }

    public a() {
        this(new d0(100, 83));
    }
}

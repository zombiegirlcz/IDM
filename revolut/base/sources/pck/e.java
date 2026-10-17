package pck;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f234927a;

    public e(d info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.f234927a = info;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f234927a, ((e) obj2).f234927a);
    }

    public final int hashCode() {
        return this.f234927a.hashCode();
    }
}

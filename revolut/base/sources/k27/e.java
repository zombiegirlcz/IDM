package k27;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f180399a;

    public e(f option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f180399a = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f180399a == ((e) obj2).f180399a;
    }

    public final int hashCode() {
        return this.f180399a.hashCode();
    }
}

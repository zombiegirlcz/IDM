package zfi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f322003a;

    public v(n option) {
        Intrinsics.checkNotNullParameter(option, "option");
        this.f322003a = option;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof v) && Intrinsics.f(this.f322003a, ((v) obj2).f322003a);
    }

    public final int hashCode() {
        return this.f322003a.hashCode();
    }
}

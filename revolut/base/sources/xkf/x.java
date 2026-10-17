package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306794a;

    public x(String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f306794a = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f306794a, ((x) obj2).f306794a);
    }

    public final int hashCode() {
        return this.f306794a.hashCode();
    }
}

package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306672a;

    public a0(String note) {
        Intrinsics.checkNotNullParameter(note, "note");
        this.f306672a = note;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f306672a, ((a0) obj2).f306672a);
    }

    public final int hashCode() {
        return this.f306672a.hashCode();
    }
}

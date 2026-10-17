package vl4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f290277a;

    public o(p styledLabel) {
        Intrinsics.checkNotNullParameter(styledLabel, "styledLabel");
        this.f290277a = styledLabel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f290277a, ((o) obj2).f290277a);
    }

    public final int hashCode() {
        return this.f290277a.hashCode();
    }
}

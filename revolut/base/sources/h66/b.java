package h66;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c66.e f149596a;

    public b(c66.e words) {
        Intrinsics.checkNotNullParameter(words, "words");
        this.f149596a = words;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149596a, ((b) obj2).f149596a);
    }

    public final int hashCode() {
        return this.f149596a.hashCode();
    }
}

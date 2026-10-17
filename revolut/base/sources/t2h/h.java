package t2h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f267573a;

    public h(a input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f267573a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f267573a, ((h) obj2).f267573a);
    }

    public final int hashCode() {
        return this.f267573a.hashCode();
    }
}

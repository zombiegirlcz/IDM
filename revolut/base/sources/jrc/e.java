package jrc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bqc.a f177988a;

    public e(bqc.a number) {
        Intrinsics.checkNotNullParameter(number, "number");
        this.f177988a = number;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f177988a, ((e) obj2).f177988a);
    }

    public final int hashCode() {
        return this.f177988a.hashCode();
    }
}

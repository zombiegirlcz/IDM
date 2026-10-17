package daa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f112497a;

    public f(String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.f112497a = input;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f112497a, ((f) obj2).f112497a);
    }

    public final int hashCode() {
        return this.f112497a.hashCode();
    }
}

package vm6;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290545a;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f290545a, ((b) obj2).f290545a);
    }

    public final int hashCode() {
        return this.f290545a.hashCode();
    }

    public b(int i) {
        Intrinsics.checkNotNullParameter("", "content");
        this.f290545a = "";
    }
}

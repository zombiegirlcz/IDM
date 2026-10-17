package dg5;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114581a;

    public b(String str) {
        this.f114581a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f114581a, ((b) obj2).f114581a);
    }

    public final int hashCode() {
        String str = this.f114581a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}

package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ja extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272865a;

    public ja(String str) {
        this.f272865a = str;
    }

    public final String a() {
        return this.f272865a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ja) && Intrinsics.f(this.f272865a, ((ja) obj2).f272865a);
    }

    public final int hashCode() {
        String str = this.f272865a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}

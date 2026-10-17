package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f272786a;

    public h7(n apmProvider) {
        Intrinsics.checkNotNullParameter(apmProvider, "apmProvider");
        this.f272786a = apmProvider;
    }

    public final n a() {
        return this.f272786a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h7) && this.f272786a == ((h7) obj2).f272786a;
    }

    public final int hashCode() {
        return this.f272786a.hashCode();
    }
}

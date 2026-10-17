package vv8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3i.i f292479a;

    public f(t3i.i scanResult) {
        Intrinsics.checkNotNullParameter(scanResult, "scanResult");
        this.f292479a = scanResult;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f292479a, ((f) obj2).f292479a);
    }

    public final int hashCode() {
        return this.f292479a.hashCode();
    }
}

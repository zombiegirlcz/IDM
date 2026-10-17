package ksk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189475a;

    public e(String instrumentRef) {
        Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
        this.f189475a = instrumentRef;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f189475a, ((e) obj2).f189475a);
    }

    public final int hashCode() {
        return this.f189475a.hashCode();
    }
}

package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f9 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272755a;

    public f9(String digitizedCardId) {
        Intrinsics.checkNotNullParameter(digitizedCardId, "digitizedCardId");
        this.f272755a = digitizedCardId;
    }

    public final String a() {
        return this.f272755a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f9) && Intrinsics.f(this.f272755a, ((f9) obj2).f272755a);
    }

    public final int hashCode() {
        return this.f272755a.hashCode();
    }
}

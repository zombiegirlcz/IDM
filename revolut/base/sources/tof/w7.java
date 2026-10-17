package tof;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w7 extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273146a;

    public w7(String str) {
        this.f273146a = str;
    }

    public final String a() {
        return this.f273146a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w7) && Intrinsics.f(this.f273146a, ((w7) obj2).f273146a);
    }

    public final int hashCode() {
        String str = this.f273146a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}

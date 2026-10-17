package tof;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class cc extends i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272674a;

    public cc(List types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f272674a = types;
    }

    public final List a() {
        return this.f272674a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof cc) && Intrinsics.f(this.f272674a, ((cc) obj2).f272674a);
    }

    public final int hashCode() {
        return this.f272674a.hashCode();
    }
}

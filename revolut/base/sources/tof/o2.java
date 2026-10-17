package tof;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f272962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f272963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f272964c;

    public o2(double d, List list, boolean z) {
        this.f272962a = d;
        this.f272963b = list;
        this.f272964c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o2)) {
            return false;
        }
        o2 o2Var = (o2) obj2;
        return Double.compare(this.f272962a, o2Var.f272962a) == 0 && Intrinsics.f(this.f272963b, o2Var.f272963b) && this.f272964c == o2Var.f272964c;
    }

    public final int hashCode() {
        int iHashCode = Double.hashCode(this.f272962a) * 31;
        List list = this.f272963b;
        return Boolean.hashCode(this.f272964c) + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
    }
}

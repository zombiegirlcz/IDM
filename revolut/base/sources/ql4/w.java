package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f247186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f247187b;

    public w(x initial, x actual) {
        Intrinsics.checkNotNullParameter(initial, "initial");
        Intrinsics.checkNotNullParameter(actual, "actual");
        this.f247186a = initial;
        this.f247187b = actual;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f247186a, wVar.f247186a) && Intrinsics.f(this.f247187b, wVar.f247187b);
    }

    public final int hashCode() {
        return this.f247187b.hashCode() + (this.f247186a.hashCode() * 31);
    }
}

package aqd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.i f8358a;

    public k0(aw0.i actionFooterModel) {
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f8358a = actionFooterModel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f8358a, ((k0) obj2).f8358a);
    }

    public final int hashCode() {
        return this.f8358a.hashCode();
    }
}

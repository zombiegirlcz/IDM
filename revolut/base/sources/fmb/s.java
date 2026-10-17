package fmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f136300a;

    public s(y navigationBarData) {
        Intrinsics.checkNotNullParameter(navigationBarData, "navigationBarData");
        this.f136300a = navigationBarData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f136300a, ((s) obj2).f136300a);
    }

    public final int hashCode() {
        return this.f136300a.hashCode();
    }
}

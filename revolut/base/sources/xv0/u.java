package xv0;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionEvent f309175a;

    public u(MotionEvent downEvent) {
        Intrinsics.checkNotNullParameter(downEvent, "downEvent");
        this.f309175a = downEvent;
    }

    @Override // xv0.v
    public final MotionEvent a() {
        return this.f309175a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof u) && Intrinsics.f(this.f309175a, ((u) obj2).f309175a);
    }

    public final int hashCode() {
        return this.f309175a.hashCode();
    }
}

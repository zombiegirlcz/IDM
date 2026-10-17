package xv0;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionEvent f309172a;

    public s(MotionEvent downEvent) {
        Intrinsics.checkNotNullParameter(downEvent, "downEvent");
        this.f309172a = downEvent;
    }

    @Override // xv0.v
    public final MotionEvent a() {
        return this.f309172a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f309172a, ((s) obj2).f309172a);
    }

    public final int hashCode() {
        return this.f309172a.hashCode();
    }
}

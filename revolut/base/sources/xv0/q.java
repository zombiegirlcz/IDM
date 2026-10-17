package xv0;

import android.view.MotionEvent;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class q implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionEvent f309169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f309170b;

    public q(MotionEvent downEvent, ArrayList events) {
        Intrinsics.checkNotNullParameter(downEvent, "downEvent");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f309169a = downEvent;
        this.f309170b = events;
    }

    @Override // xv0.v
    public final MotionEvent a() {
        return this.f309169a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f309169a, qVar.f309169a) && this.f309170b.equals(qVar.f309170b);
    }

    public final int hashCode() {
        return this.f309170b.hashCode() + (this.f309169a.hashCode() * 31);
    }
}

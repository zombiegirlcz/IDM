package xv0;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MotionEvent f309173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f309174b;

    public t(RecyclerView recyclerView, MotionEvent downEvent) {
        Intrinsics.checkNotNullParameter(downEvent, "downEvent");
        this.f309173a = downEvent;
        this.f309174b = recyclerView;
    }

    @Override // xv0.v
    public final MotionEvent a() {
        return this.f309173a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f309173a, tVar.f309173a) && Intrinsics.f(this.f309174b, tVar.f309174b);
    }

    public final int hashCode() {
        int iHashCode = this.f309173a.hashCode() * 31;
        RecyclerView recyclerView = this.f309174b;
        return iHashCode + (recyclerView == null ? 0 : recyclerView.hashCode());
    }
}

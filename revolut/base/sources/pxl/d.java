package pxl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f240636a;

    public d(RecyclerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f240636a = view;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f240636a, ((d) obj2).f240636a);
    }

    @Override // pxl.e
    public final View getView() {
        return this.f240636a;
    }

    public final int hashCode() {
        return this.f240636a.hashCode();
    }
}

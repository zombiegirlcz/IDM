package au0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d4 implements RecyclerView.OnChildAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e4 f9170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9171b;

    public d4(e4 e4Var, RecyclerView recyclerView) {
        this.f9170a = e4Var;
        this.f9171b = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (this.f9171b.getChildViewHolder(view) instanceof x) {
            return;
        }
        e4.h(this.f9170a, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public final void onChildViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b4 b4Var = (b4) this.f9170a.f9182h.remove(view);
        if (b4Var != null) {
            twg.c cVar = b4Var.f9150a;
            c4 c4Var = (c4) cVar.f275019c;
            if (c4Var != null) {
                c4Var.cancel();
            }
            cVar.f275019c = null;
            b4Var.f9151b.e();
        }
    }
}

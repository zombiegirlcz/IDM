package tw0;

import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ix0.a2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 implements View.OnLayoutChangeListener, a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f274820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tml.a f274821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f274822c;
    public final /* synthetic */ float d;
    public final /* synthetic */ View e;
    public final /* synthetic */ float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f274823g;

    public i0(View view, tml.a aVar, RecyclerView recyclerView, float f, View view2, float f4, j0 j0Var) {
        this.f274820a = view;
        this.f274821b = aVar;
        this.f274822c = recyclerView;
        this.d = f;
        this.e = view2;
        this.f = f4;
        this.f274823g = j0Var;
    }

    @Override // ix0.a2
    public final void cancel() {
        this.f274820a.removeOnLayoutChangeListener(this);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.f274821b.invoke();
        this.f274822c.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 0, this.d, this.e.getTop() + this.f, 0));
        this.f274823g.f274826c = null;
    }
}

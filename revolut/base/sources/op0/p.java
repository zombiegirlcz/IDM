package op0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.DraggableWidgetRootFrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class p extends koi.b implements tw0.d {
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f227372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DraggableWidgetRootFrameLayout f227373h;
    public final fp0.p i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f227373h = (DraggableWidgetRootFrameLayout) itemView;
        fp0.m mVar = fp0.p.Companion;
        gp0.g gVar = new gp0.g(fp0.h.f137024a);
        mVar.getClass();
        this.i = fp0.m.a(itemView, gVar);
    }

    public final void F(q size) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.f227373h.setWidgetSize(size);
    }

    @Override // tw0.d
    public final void a() {
    }

    @Override // tw0.d
    public final void t() {
    }
}

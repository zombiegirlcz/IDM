package bx0;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19400g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        this.f = new xv0.n(new androidx.lifecycle.b(itemView, 7));
        this.f19400g = -1;
        this.f19401h = -1;
    }

    public void F(int i, int i2) {
    }

    @Override // xv0.m
    public final void f(Image image, ImageView to6, Function1 function1, Function0 function0, boolean z) {
        Intrinsics.checkNotNullParameter(to6, "to");
        this.f.f(image, to6, function1, null, z);
    }

    @Override // xv0.m
    public final xv0.i getItemRenderState() {
        return this.f.f309159b;
    }

    @Override // xv0.m
    public final View getRenderView() {
        return this.f.getRenderView();
    }

    @Override // xv0.m
    public final void setItemRenderState(xv0.i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        this.f.setItemRenderState(iVar);
    }
}

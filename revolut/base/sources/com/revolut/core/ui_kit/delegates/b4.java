package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(View itemView) {
        super(itemView);
        View viewFindViewById = itemView.findViewById(R$id.internalDelegateCompactCell_mainImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        ImageView mainImageView = (ImageView) viewFindViewById;
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(mainImageView, "mainImageView");
        this.f = new xv0.n(new ie7.a(mainImageView, 5));
        View viewFindViewById2 = itemView.findViewById(R$id.internalDelegateCompactCell_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = itemView.findViewById(R$id.internalDelegateCompactCell_description);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ix0.k0 k0Var = new ix0.k0(new il9.p(this));
        Intrinsics.i(mainImageView, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.CutoutImageView");
        new ix0.l0((ViewGroup) itemView, zhm.v.k(k0Var, (CutoutImageView) mainImageView));
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
        xv0.n nVar = this.f;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(iVar, "<set-?>");
        nVar.f309159b = iVar;
    }
}

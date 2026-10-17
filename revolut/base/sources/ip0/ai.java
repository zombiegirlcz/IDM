package ip0;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.VoucherSmallTileDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ai extends koi.b implements xv0.m {
    public final /* synthetic */ xv0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f163449g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ImageView f163450h;
    public final ImageView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f163451j;
    public final ImageView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ImageView f163452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LargeActionButton f163453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AsyncDiffRecyclerView f163454n;
    public final AsyncDiffRecyclerView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(View itemView, ChallengeMediumDelegate challengeMediumDelegate, VoucherSmallTileDelegate voucherSmallTileDelegate) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(challengeMediumDelegate, "challengeMediumDelegate");
        Intrinsics.checkNotNullParameter(voucherSmallTileDelegate, "voucherSmallTileDelegate");
        this.f = new xv0.n(new au0.z3(itemView, 2));
        View viewFindViewById = itemView.findViewById(R$id.feedCollection_backgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f163450h = (ImageView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.feedCollection_headerIconImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.i = (ImageView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.feedCollection_headerTitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f163451j = (TextView) viewFindViewById3;
        View viewFindViewById4 = itemView.findViewById(R$id.feedCollection_shareIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.k = (ImageView) viewFindViewById4;
        View viewFindViewById5 = itemView.findViewById(R$id.feedCollection_favoriteIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.f163452l = (ImageView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.feedCollection_actionButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f163453m = (LargeActionButton) viewFindViewById6;
        View viewFindViewById7 = itemView.findViewById(R$id.feedCollection_collectionProductScroller);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) viewFindViewById7;
        this.f163454n = asyncDiffRecyclerView;
        View viewFindViewById8 = itemView.findViewById(R$id.feedCollection_collectionChallengesScroller);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        AsyncDiffRecyclerView asyncDiffRecyclerView2 = (AsyncDiffRecyclerView) viewFindViewById8;
        this.o = asyncDiffRecyclerView2;
        asyncDiffRecyclerView.setAdapter(new z4l.j(7, zhm.u.c(voucherSmallTileDelegate), false));
        asyncDiffRecyclerView2.setAdapter(new z4l.j(7, zhm.u.c(challengeMediumDelegate), false));
        H(asyncDiffRecyclerView);
        H(asyncDiffRecyclerView2);
        F();
        c8g.a.a(itemView, ny0.a.f220589a, new ad(this, 8));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void F() {
        int iA;
        View view = this.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        if (((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
            Context context = this.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iA = ny0.i.d(context) ? com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 320.0f) : com.google.android.gms.internal.mlkit_vision_face.a.a(this.itemView, "getContext(...)", 417.0f);
        } else {
            iA = Integer.MAX_VALUE;
        }
        constraintLayout.setMaxHeight(iA);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(androidx.recyclerview.widget.RecyclerView r12) {
        /*
            r11 = this;
            java.lang.Object r0 = jo0.g.f176833q
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "getContext(...)"
            if (r0 == 0) goto L26
            android.view.View r0 = r11.itemView
            android.content.Context r0 = r0.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            float r0 = c8g.c.J(r0)
            r2 = 1141243904(0x44060000, float:536.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L26
            r0 = 3
        L24:
            r4 = r0
            goto L28
        L26:
            r0 = 2
            goto L24
        L28:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r12.getLayoutManager()
            boolean r2 = r0 instanceof com.revolut.core.ui_kit.internal.delegates.scroller.lm.ScrollerLayoutManager
            if (r2 == 0) goto L33
            com.revolut.core.ui_kit.internal.delegates.scroller.lm.ScrollerLayoutManager r0 = (com.revolut.core.ui_kit.internal.delegates.scroller.lm.ScrollerLayoutManager) r0
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L3b
            int r0 = r0.f55870a
            if (r0 != r4) goto L3b
            return
        L3b:
            android.view.View r0 = r11.itemView
            r2 = 1090519040(0x41000000, float:8.0)
            int r6 = com.google.android.gms.internal.mlkit_vision_face.a.a(r0, r1, r2)
            android.view.View r0 = r11.itemView
            r2 = 1098907648(0x41800000, float:16.0)
            int r8 = com.google.android.gms.internal.mlkit_vision_face.a.a(r0, r1, r2)
            android.content.Context r3 = r12.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            xq0.l r7 = xq0.l.FILL_FIRST_AND_LAST
            zhm.f0 r9 = zhm.f0.f322471a
            com.revolut.core.ui_kit.internal.delegates.scroller.lm.ScrollerLayoutManager r2 = new com.revolut.core.ui_kit.internal.delegates.scroller.lm.ScrollerLayoutManager
            aw0.x4$a r5 = aw0.x4.a.f10602a
            r10 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r12.setLayoutManager(r2)
        L61:
            int r0 = r12.getItemDecorationCount()
            if (r0 <= 0) goto L6c
            r0 = 0
            r12.removeItemDecorationAt(r0)
            goto L61
        L6c:
            xq0.k r0 = new xq0.k
            xq0.l r1 = xq0.l.FILL_FIRST_AND_LAST
            r0.<init>(r6, r4, r1, r8)
            r12.addItemDecoration(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ip0.ai.H(androidx.recyclerview.widget.RecyclerView):void");
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

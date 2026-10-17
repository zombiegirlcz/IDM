package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.recyclerkit.UIKitRecyclerView;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
public final class e2 extends op0.p {

    @NotNull
    public static final op0.e2 Companion = new op0.e2();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final op0.a2 f55338j;
    public final LinearLayout k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f55339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UIKitRecyclerView f55340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LargeActionButton f55341n;
    public final ShimmerFrameLayout o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f55342p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z4l.j f55343q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ood.k f55344r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(View itemView, List itemDelegates, ood.k itemDelegateEvents, om4.m1 tileSpacing) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(itemDelegates, "itemDelegates");
        Intrinsics.checkNotNullParameter(itemDelegateEvents, "itemDelegateEvents");
        Intrinsics.checkNotNullParameter(tileSpacing, "tileSpacing");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        op0.a2 a2Var = (op0.a2) tileSpacing.invoke(context);
        this.f55338j = a2Var;
        View viewFindViewById = itemView.findViewById(R$id.gridWidget_container);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.k = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(R$id.gridWidget_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f55339l = textView;
        View viewFindViewById3 = itemView.findViewById(R$id.gridWidget_recycler);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        UIKitRecyclerView uIKitRecyclerView = (UIKitRecyclerView) viewFindViewById3;
        this.f55340m = uIKitRecyclerView;
        View viewFindViewById4 = itemView.findViewById(R$id.gridWidget_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        LargeActionButton largeActionButton = (LargeActionButton) viewFindViewById4;
        this.f55341n = largeActionButton;
        View viewFindViewById5 = itemView.findViewById(R$id.gridWidget_buttonLoading);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.o = (ShimmerFrameLayout) viewFindViewById5;
        this.f55342p = yhm.j.b(new au0.z3(itemView, 17));
        z4l.j jVar = new z4l.j(7, itemDelegates, false);
        this.f55343q = jVar;
        uIKitRecyclerView.setAdapter(jVar);
        uIKitRecyclerView.addItemDecoration(new tw0.b(a2Var.f227164b, a2Var.f227163a, 12));
        uIKitRecyclerView.setNestedScrollingEnabled(false);
        uIKitRecyclerView.setClipToPadding(false);
        uIKitRecyclerView.setConsumeTouchEvents(false);
        largeActionButton.o(LargeActionButton.ButtonStyle.o);
        qv0.k kVar = qv0.k.OutOfGroup;
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setBackground(dr0.b.b(c.C1364c.f249512a, kVar, context2, false, null, 48));
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        textView.setPaddingRelative(kli.a.k(context3, 16.0f), com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 12.0f), com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 16.0f), com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 12.0f));
        ((efm.r) itemDelegateEvents.invoke(this)).filter(new op0.x(15, new op0.d2(this, 0))).subscribe(new op0.x(16, new op0.d2(this, 1)));
        H().f.forEach(new op0.x(17, new op0.d2(this, 2)));
    }

    public final FixedTabs H() {
        return (FixedTabs) this.f55342p.getValue();
    }
}

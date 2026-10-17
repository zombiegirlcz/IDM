package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RateOneClickDelegate;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import ip0.d90;
import ip0.h90;
import ip0.i90;
import ip0.j90;
import ip0.k90;
import ip0.w10;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class he extends koi.b {
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f54239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AsyncDiffRecyclerView f54240h;
    public final TextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TextView f54241j;
    public hsa.l k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RateOneClickDelegate.b f54242l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinearLayoutManager f54243m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final tw0.a0 f54244n;
    public final tw0.a0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z4l.j f54245p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        jh.d.f(context).Q();
        View viewFindViewById = itemView.findViewById(R$id.rateOneClick_root);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = itemView.findViewById(R$id.rateOneClick_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f = (TextView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.rateOneClick_closeButton);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        ImageView imageView = (ImageView) viewFindViewById3;
        this.f54239g = imageView;
        View viewFindViewById4 = itemView.findViewById(R$id.rateOneClick_options);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) viewFindViewById4;
        this.f54240h = asyncDiffRecyclerView;
        View viewFindViewById5 = itemView.findViewById(R$id.rateOneClick_bottomStartLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.i = (TextView) viewFindViewById5;
        View viewFindViewById6 = itemView.findViewById(R$id.rateOneClick_bottomEndLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.f54241j = (TextView) viewFindViewById6;
        w10 w10Var = new w10(this, 10);
        RateOneClickDelegate.RateOneClickSingleItemDelegate rateOneClickSingleItemDelegate = new RateOneClickDelegate.RateOneClickSingleItemDelegate(w10Var);
        RateOneClickDelegate.RateOneClickProgressiveItemDelegate rateOneClickProgressiveItemDelegate = new RateOneClickDelegate.RateOneClickProgressiveItemDelegate(w10Var);
        this.f54242l = new RateOneClickDelegate.b();
        this.f54243m = new LinearLayoutManager(itemView.getContext(), 0, false);
        int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 4.0f);
        int iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 4.0f);
        this.f54244n = new tw0.a0(iA2, iA2, iA, iA);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        int iK = kli.a.k(context, 4.0f);
        Intrinsics.checkNotNullExpressionValue(context, "context");
        this.o = new tw0.a0(com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 8.0f), com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 8.0f), iK, kli.a.k(context, 12.0f));
        z4l.j jVar = new z4l.j(7, zhm.v.k(rateOneClickSingleItemDelegate, rateOneClickProgressiveItemDelegate), false);
        this.f54245p = jVar;
        asyncDiffRecyclerView.setAdapter(jVar);
        Object obj2 = or0.u.f228038a;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        or0.k kVarJ = or0.u.j(imageView);
        kVarJ.c(null);
        kVarJ.a();
    }

    /* JADX WARN: Type inference failed for: r5v8, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void F(d90 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        boolean z = content instanceof j90;
        z4l.j jVar = this.f54245p;
        AsyncDiffRecyclerView asyncDiffRecyclerView = this.f54240h;
        if (z) {
            asyncDiffRecyclerView.setLayoutManager(this.f54242l);
            ViewGroup.LayoutParams layoutParams = asyncDiffRecyclerView.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            asyncDiffRecyclerView.setLayoutParams(layoutParams2);
            H(this.f54244n);
            j90 j90Var = (j90) content;
            List list = j90Var.f164806a;
            ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
            int i = 0;
            for (Object obj2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    zhm.v.s();
                    throw null;
                }
                k90 k90Var = (k90) obj2;
                String str = k90Var.f164978a;
                Image image = k90Var.f164979b;
                ?? r56 = k90Var.f164980c;
                Integer num = j90Var.f164807b;
                arrayList.add(new fe(str, image, r56, num != null && i == num.intValue()));
                i = i2;
            }
            jVar.c(arrayList);
            return;
        }
        if (!(content instanceof h90)) {
            throw new NoWhenBranchMatchedException();
        }
        asyncDiffRecyclerView.setLayoutManager(this.f54243m);
        ViewGroup.LayoutParams layoutParams3 = asyncDiffRecyclerView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = -2;
        asyncDiffRecyclerView.setLayoutParams(layoutParams4);
        H(this.o);
        h90 h90Var = (h90) content;
        Integer num2 = h90Var.f164523b;
        int iIntValue = num2 != null ? num2.intValue() : -1;
        List list2 = h90Var.f164522a;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        int i3 = 0;
        for (Object obj3 : list2) {
            int i5 = i3 + 1;
            if (i3 < 0) {
                zhm.v.s();
                throw null;
            }
            i90 i90Var = (i90) obj3;
            arrayList2.add(new ce(i90Var.f164663a, i3 <= iIntValue ? i90Var.f164665c : i90Var.f164664b));
            i3 = i5;
        }
        jVar.c(arrayList2);
    }

    public final void H(RecyclerView.ItemDecoration itemDecoration) {
        AsyncDiffRecyclerView asyncDiffRecyclerView = this.f54240h;
        int itemDecorationCount = asyncDiffRecyclerView.getItemDecorationCount();
        if (itemDecorationCount > 1) {
            throw new IllegalStateException("Check failed.");
        }
        if (itemDecorationCount == 1 && Intrinsics.f(asyncDiffRecyclerView.getItemDecorationAt(0), itemDecoration)) {
            return;
        }
        if (itemDecorationCount == 1) {
            asyncDiffRecyclerView.removeItemDecorationAt(0);
        }
        asyncDiffRecyclerView.addItemDecoration(itemDecoration);
    }
}

package com.revolut.core.ui_kit.delegates.widgets;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewGroupKt;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.RowPlaceholderDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.UIKitRecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class y3 extends m {
    public ro0.y A;
    public final SmallActionButton B;
    public final fp0.p C;
    public final LinearLayout D;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Function0 f55559s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f55560t;
    public op0.x3 u;
    public op0.x3 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public op0.x3 f55561w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public op0.x3 f55562x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public op0.x3 f55563y;
    public op0.x3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(View itemView, ok7.b delegateBlurProcessorFactory) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(delegateBlurProcessorFactory, "delegateBlurProcessorFactory");
        this.f55559s = delegateBlurProcessorFactory;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        ProgressStepVerticalDelegate progressStepVerticalDelegate = new ProgressStepVerticalDelegate();
        SmallActionButtonDelegate smallActionButtonDelegate = new SmallActionButtonDelegate();
        SwipeToActionDelegate swipeToActionDelegate = new SwipeToActionDelegate(rowDelegate, false);
        FixedTabsDelegate fixedTabsDelegate = new FixedTabsDelegate();
        int i = 1;
        this.f55560t = zhm.v.k(rowDelegate, new RowLoadingDelegate(), progressStepVerticalDelegate, new RowPlaceholderDelegate(), new RowsWidgetDelegate.SmallRowDelegate(), smallActionButtonDelegate, new RowsWidgetDelegate.SmallRowLoadingDelegate(), swipeToActionDelegate, fixedTabsDelegate);
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SmallActionButton smallActionButton = new SmallActionButton(context, null, 6, 0);
        smallActionButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        Context context2 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        or0.u.z(smallActionButton, 0, kli.a.k(context2, 16.0f), 0, 0, false, 29);
        smallActionButton.i(ms0.h4.SEMIACCENT);
        this.B = smallActionButton;
        this.C = smallActionButton.getClickHandler();
        LinearLayout linearLayout = new LinearLayout(itemView.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        linearLayout.setGravity(1);
        linearLayout.setVisibility(8);
        ImageView imageView = new ImageView(itemView.getContext());
        imageView.setImageDrawable(itemView.getContext().getDrawable(R$drawable.uikit_icn_16_lock_closed));
        Context context3 = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        rd0.e.q(imageView, Integer.valueOf(kli.a.s(R$attr.uikit_colorForeground, context3)));
        linearLayout.addView(imageView);
        linearLayout.addView(smallActionButton);
        this.D = linearLayout;
        I();
        ((FrameLayout) itemView).addView(linearLayout);
        int i2 = 3;
        rowDelegate.f53218h.subscribe(new op0.o3(i2, new op0.c4(this, 0)));
        op0.c4 c4Var = new op0.c4(this, i2);
        int i3 = 4;
        rowDelegate.f53220l.subscribe(new op0.o3(i3, c4Var));
        int i5 = 5;
        progressStepVerticalDelegate.d.subscribe(new op0.o3(i5, new op0.c4(this, i3)));
        smallActionButtonDelegate.f53336c.f121375b.subscribe(new op0.o3(6, new op0.c4(this, i5)));
        swipeToActionDelegate.f.subscribe(new op0.o3(i, new op0.c4(this, i)));
        int i6 = 2;
        fixedTabsDelegate.f52339c.f121375b.subscribe(new op0.o3(i6, new op0.c4(this, i6)));
    }

    @Override // com.revolut.core.ui_kit.delegates.widgets.m
    public final List H() {
        return this.f55560t;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // com.revolut.core.ui_kit.delegates.widgets.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(op0.q r14) {
        /*
            r13 = this;
            java.lang.String r0 = "widgetSize"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            int[] r0 = op0.d4.f227228a
            int r1 = r14.ordinal()
            r1 = r0[r1]
            java.lang.String r2 = "getContext(...)"
            com.revolut.recyclerkit.UIKitRecyclerView r3 = r13.f55425p
            r4 = 1
            if (r1 == r4) goto L8d
            r5 = 4
            r6 = 3
            r7 = 2
            if (r1 == r7) goto L24
            if (r1 == r6) goto L24
            if (r1 != r5) goto L1e
            goto L24
        L1e:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L24:
            op0.y3 r1 = new op0.y3
            android.view.View r8 = r13.itemView
            android.content.Context r8 = r8.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            android.content.Context r9 = r3.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r2)
            android.content.res.Resources r10 = r9.getResources()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            int r10 = r10.widthPixels
            float r10 = kli.a.z(r10, r9)
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            float r9 = r9.fontScale
            double r11 = (double) r9
            double r11 = java.lang.Math.sqrt(r11)
            float r9 = (float) r11
            int r11 = r14.ordinal()
            r0 = r0[r11]
            if (r0 == r4) goto L87
            if (r0 == r7) goto L85
            r4 = 360(0x168, float:5.04E-43)
            if (r0 == r6) goto L7d
            if (r0 != r5) goto L77
            float r0 = (float) r4
            float r0 = r0 * r9
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L6b
            goto L89
        L6b:
            r0 = 390(0x186, float:5.47E-43)
            float r0 = (float) r0
            float r0 = r0 * r9
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L75
            r5 = 5
            goto L89
        L75:
            r5 = 6
            goto L89
        L77:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        L7d:
            float r0 = (float) r4
            float r0 = r0 * r9
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto L85
            r5 = r7
            goto L89
        L85:
            r5 = r6
            goto L89
        L87:
            r5 = 12
        L89:
            r1.<init>(r8, r14, r5)
            goto L98
        L8d:
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.View r0 = r13.itemView
            android.content.Context r0 = r0.getContext()
            r1.<init>(r0)
        L98:
            r3.setLayoutManager(r1)
            r0 = 0
            r3.setClipToPadding(r0)
            op0.q r1 = op0.q.DYNAMIC
            if (r14 == r1) goto Lab
            android.view.View r14 = r13.itemView
            r0 = 1094713344(0x41400000, float:12.0)
            int r0 = com.google.android.gms.internal.mlkit_vision_face.a.a(r14, r2, r0)
        Lab:
            int r14 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r14, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.y3.J(op0.q):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void K() {
        ro0.y yVar;
        if (this.itemView.isAttachedToWindow()) {
            koi.j jVar = this.e;
            RowsWidgetDelegate.Model model = jVar instanceof RowsWidgetDelegate.Model ? (RowsWidgetDelegate.Model) jVar : null;
            if (model == null || model.o == null || (yVar = this.A) == null) {
                return;
            }
            View.OnLayoutChangeListener onLayoutChangeListener = yVar.k;
            String cacheKey = model.e;
            UIKitRecyclerView recyclerView = this.f55425p;
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
            yVar.i++;
            if (yVar.d != recyclerView) {
                yVar.c();
                yVar.d = recyclerView;
                recyclerView.addItemDecoration(yVar);
                recyclerView.addOnChildAttachStateChangeListener(yVar);
                recyclerView.addOnLayoutChangeListener(onLayoutChangeListener);
                for (View view : ViewGroupKt.getChildren(recyclerView)) {
                    RecyclerView recyclerView2 = yVar.d;
                    if (recyclerView2 != null && yVar.e(recyclerView2, view)) {
                        view.addOnLayoutChangeListener(onLayoutChangeListener);
                    }
                }
            }
            yVar.e = cacheKey;
            yVar.f255795j = null;
            yVar.b(recyclerView);
            long j2 = yVar.i;
            OneShotPreDrawListener oneShotPreDrawListener = yVar.f255793g;
            if (oneShotPreDrawListener != null) {
                oneShotPreDrawListener.removeListener();
            }
            yVar.f255793g = OneShotPreDrawListener.add(recyclerView, new yc.d(recyclerView, yVar, recyclerView, cacheKey, j2, 2));
        }
    }
}

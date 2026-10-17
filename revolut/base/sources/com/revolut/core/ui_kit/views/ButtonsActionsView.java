package com.revolut.core.ui_kit.views;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import aw0.p0;
import aw0.q0;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ix0.c2;
import ix0.w0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.p2;
import org.jetbrains.annotations.NotNull;
import rp0.y;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/core/ui_kit/views/ButtonsActionsView;", "Landroid/widget/LinearLayout;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrp0/m;", "getBottomDialogDisplayer", "()Lrp0/m;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ButtonsActionsView extends LinearLayout implements w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f58369h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LargeActionButton f58371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton f58372c;
    public final LargeActionButton d;
    public final e01.a e;
    public q0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public rp0.m f58373g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonsActionsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit a(ButtonsActionsView buttonsActionsView) {
        q0 q0Var = buttonsActionsView.f;
        List list = q0Var != null ? q0Var.f10480c : null;
        if (list != null && (!list.isEmpty())) {
            rp0.m bottomDialogDisplayer = buttonsActionsView.getBottomDialogDisplayer();
            List<p0> list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            for (p0 p0Var : list2) {
                String str = p0Var.f10454a;
                TextLocalisedClause textLocalisedClause = p0Var.f10455b;
                Image image = p0Var.f10456c;
                arrayList.add(new RowDelegate.Model(str, image != null ? new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 60) : null, textLocalisedClause, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, p0Var, null, 0, 0, 0, 0, 532676568));
            }
            yp0.b.k(arrayList, 0, 0, 0, 0, 31);
            bottomDialogDisplayer.k(new y(arrayList, null, rp0.l.WINDOW, null, null, null, null, null, null, new TextLocalisedClause(R$string.uikit_actions_more, null, null, 14), 1784));
        }
        return Unit.f186387a;
    }

    private final rp0.m getBottomDialogDisplayer() {
        rp0.m mVar = this.f58373g;
        if (mVar != null) {
            return mVar;
        }
        rp0.m mVar2 = new rp0.m();
        this.f58373g = mVar2;
        RowDelegate rowDelegate = new RowDelegate(null, null, 7);
        mVar2.i(new maa.r(rowDelegate, 25));
        mVar2.d(this);
        rowDelegate.f53218h.subscribe(new mv9.h(26, new p2(this, 0)));
        return mVar2;
    }

    public final void b(q0 items) {
        Intrinsics.checkNotNullParameter(items, "items");
        if (Intrinsics.f(this.f, items)) {
            return;
        }
        p0 p0Var = items.f10478a;
        p0 p0Var2 = items.f10479b;
        this.f58371b.setText(p0Var.f10455b);
        int i = p0Var2 != null ? 0 : 8;
        LargeActionButton largeActionButton = this.f58372c;
        largeActionButton.setVisibility(i);
        if (p0Var2 != null) {
            largeActionButton.setText(p0Var2.f10455b);
        }
        this.d.setVisibility(items.f10480c.isEmpty() ? 8 : 0);
        this.f = items;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58370a.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonsActionsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonsActionsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58370a = new c2(this);
        this.e = new e01.a();
        setPaddingRelative(kli.a.k(context, 8.0f), kli.a.k(context, 24.0f), kli.a.k(context, 8.0f), kli.a.k(context, 16.0f));
        int i2 = 0;
        setClipToPadding(false);
        setClipChildren(false);
        setOrientation(0);
        setLayoutTransition(new LayoutTransition());
        setBackground(context.getDrawable(R$drawable.uikit_bottom_button_gradient));
        AttributeSet attributeSet2 = null;
        int i3 = 6;
        LargeActionButton largeActionButton = new LargeActionButton(context, attributeSet2, i3, i2);
        largeActionButton.o(LargeActionButton.ButtonStyle.f58725a);
        largeActionButton.setId(R$id.buttonsActionsView_primary);
        this.f58371b = largeActionButton;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(kli.a.k(context, 8.0f), 0, kli.a.k(context, 8.0f), 0);
        layoutParams.weight = 1.0f;
        Unit unit = Unit.f186387a;
        addView(largeActionButton, layoutParams);
        LargeActionButton largeActionButton2 = new LargeActionButton(context, attributeSet2, i3, i2);
        LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
        largeActionButton2.o(defaultFilledButton);
        largeActionButton2.setId(R$id.buttonsActionsView_secondary);
        this.f58372c = largeActionButton2;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(kli.a.k(context, 8.0f), 0, kli.a.k(context, 8.0f), 0);
        layoutParams2.weight = 1.0f;
        addView(largeActionButton2, layoutParams2);
        LargeActionButton largeActionButton3 = new LargeActionButton(context, attributeSet2, i3, i2);
        largeActionButton3.o(defaultFilledButton);
        largeActionButton3.setIcon(new ResourceImage(R$drawable.uikit_icn_24_more_ios, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
        largeActionButton3.setId(R$id.buttonsActionsView_more);
        this.d = largeActionButton3;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(kli.a.k(context, 56.0f), -2);
        layoutParams3.setMargins(kli.a.k(context, 8.0f), 0, kli.a.k(context, 8.0f), 0);
        addView(largeActionButton3, layoutParams3);
        onAttachedToWindow();
        largeActionButton.o.subscribe(new mv9.h(27, new p2(this, 1)));
        largeActionButton2.o.subscribe(new mv9.h(28, new p2(this, 2)));
        largeActionButton3.o.subscribe(new mv9.h(29, new p2(this, 3)));
    }

    public /* synthetic */ ButtonsActionsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

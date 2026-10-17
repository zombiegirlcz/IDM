package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.c2;
import ix0.w0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx0.p3;
import mx0.q3;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002\f'B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/revolut/core/ui_kit/views/CenteredFixedTabsView;", "Landroid/widget/FrameLayout;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lmx0/q3;", "newItems", "", "selectedId", "", "setItems", "(Ljava/lang/Iterable;Ljava/lang/String;)V", "", "value", "d", "Z", "getOnMedia$ui_kit_components_release", "()Z", "setOnMedia$ui_kit_components_release", "(Z)V", "onMedia", "Lcom/google/android/material/tabs/TabLayout;", "e", "Le8/q;", "getTabLayout", "()Lcom/google/android/material/tabs/TabLayout;", "tabLayout", "f", "getTabLayoutContainer", "()Landroid/widget/FrameLayout;", "tabLayoutContainer", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredFixedTabsView extends FrameLayout implements w0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f58424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterable f58425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f58426c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public boolean onMedia;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final e8.q tabLayout;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final e8.q tabLayoutContainer;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f58427g;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.CenteredFixedTabsView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredFixedTabsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final TabLayout getTabLayout() {
        return (TabLayout) this.tabLayout.f();
    }

    private final FrameLayout getTabLayoutContainer() {
        return (FrameLayout) this.tabLayoutContainer.f();
    }

    public static /* synthetic */ void setItems$default(CenteredFixedTabsView centeredFixedTabsView, Iterable iterable, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        centeredFixedTabsView.setItems(iterable, str);
    }

    public final void a(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        int tabCount = getTabLayout().getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = getTabLayout().getTabAt(i);
            Object tag2 = tabAt != null ? tabAt.getTag() : null;
            q3 q3Var = tag2 instanceof q3 ? (q3) tag2 : null;
            if (Intrinsics.f(q3Var != null ? q3Var.f209950a : null, itemId)) {
                tabAt.select();
                return;
            }
        }
        throw new IllegalArgumentException(j6.a.q("Can't find item with id ", itemId));
    }

    public final void b(TabLayout.Tab tab2, int i) {
        TextView textView;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(i, context);
        View customView = tab2.getCustomView();
        if (customView == null || (textView = (TextView) customView.findViewById(R$id.centeredFixedTabs_tabText)) == null) {
            return;
        }
        textView.setTextColor(iS);
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    /* JADX INFO: renamed from: getOnMedia$ui_kit_components_release, reason: from getter */
    public final boolean getOnMedia() {
        return this.onMedia;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        return super.onApplyWindowInsets(this.f58427g.c(insets));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        String str;
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        this.f58426c = bundle.getString("STATE_KEY_SELECTED");
        if (getTabLayout().getTabCount() > 0 && (str = this.f58426c) != null) {
            a(str);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putString("STATE_KEY_SELECTED", this.f58426c);
        return bundle;
    }

    public final void setItems(@NotNull Iterable<q3> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        if (!Intrinsics.f(newItems, this.f58425b)) {
            getTabLayout().removeAllTabs();
            for (q3 q3Var : newItems) {
                View viewR = kotlin.jvm.internal.s.r(this, R$layout.internal_view_centered_fixed_tabs_item);
                ty0.c cVarB0 = or0.u.k(this).b0();
                Clause clause = q3Var.f209951b;
                View viewFindViewById = viewR.findViewById(R$id.centeredFixedTabs_tabText);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
                ty0.c.b(cVarB0, clause, (TextView) viewFindViewById, null, null, 12);
                TabLayout.Tab tabNewTab = getTabLayout().newTab();
                tabNewTab.setCustomView(viewR);
                tabNewTab.setTag(q3Var);
                b(tabNewTab, R$attr.uikit_colorGreyTone50);
                tabNewTab.view.setBackgroundResource(R$drawable.internal_centered_tab_item_background_ripple);
                Intrinsics.checkNotNullExpressionValue(tabNewTab, "apply(...)");
                getTabLayout().addTab(tabNewTab, false);
            }
            this.f58425b = newItems;
        }
        if (selectedId != null) {
            a(selectedId);
        } else {
            q3 q3Var2 = (q3) d0.c0(newItems);
            if (q3Var2 != null) {
                a(q3Var2.f209950a);
            }
        }
        View childAt = getTabLayout().getChildAt(0);
        LinearLayout linearLayout = childAt instanceof LinearLayout ? (LinearLayout) childAt : null;
        if (linearLayout != null) {
            linearLayout.setMeasureWithLargestChildEnabled(true);
            int childCount = linearLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = linearLayout.getChildAt(i).getLayoutParams();
                LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.weight = 1.0f;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setOnMedia$ui_kit_components_release(boolean r6) {
        /*
            r5 = this;
            r5.onMedia = r6
            android.widget.FrameLayout r6 = r5.getTabLayoutContainer()
            android.content.Context r0 = r5.getContext()
            java.lang.String r1 = "getContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r2 = r5.onMedia
            if (r2 == 0) goto L2c
            android.content.Context r2 = r5.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            boolean r1 = kli.a.q(r2)
            if (r1 != 0) goto L2c
            com.revolut.core.ui.models.Color$Composite r1 = new com.revolut.core.ui.models.Color$Composite
            int r2 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorGroupedBackground
            int r3 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorSegmentedBackground
            ho0.a r4 = ho0.a.SRC_OVER
            r1.<init>(r2, r3, r4)
            goto L33
        L2c:
            com.revolut.core.ui.models.Color$Solid r1 = new com.revolut.core.ui.models.Color$Solid
            int r2 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorSegmentedBackground
            r1.<init>(r2)
        L33:
            r2 = 0
            r3 = 0
            r4 = 1101004800(0x41a00000, float:20.0)
            android.graphics.drawable.GradientDrawable r0 = dr0.l.h(r0, r4, r1, r3, r2)
            r6.setBackground(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.CenteredFixedTabsView.setOnMedia$ui_kit_components_release(boolean):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CenteredFixedTabsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenteredFixedTabsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58424a = v0.a.d("create(...)");
        this.f58425b = f0.f322471a;
        this.tabLayout = kli.a.J(R$id.centeredFixedTabs_tabLayout, this);
        this.tabLayoutContainer = kli.a.J(R$id.centeredFixedTabs_tabLayoutContainer, this);
        this.f58427g = new c2(this);
        View.inflate(context, R$layout.internal_view_centered_fixed_tabs, this);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CenteredFixedTabsView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setOnMedia$ui_kit_components_release(typedArrayObtainStyledAttributes.getBoolean(R$styleable.CenteredFixedTabsView_uikit_onMedia, this.onMedia));
        Unit unit = Unit.f186387a;
        typedArrayObtainStyledAttributes.recycle();
        getTabLayout().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new p3(this));
    }

    public /* synthetic */ CenteredFixedTabsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

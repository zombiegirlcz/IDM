package com.revolut.core.ui_kit.internal.views.reactionskeyboard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.AutoFitTabLayout;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import es0.b0;
import es0.u;
import es0.v;
import es0.w;
import ihm.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lkf.f0;
import lu0.p;
import lu0.r;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u00032\u00070\u0004¢\u0006\u0002\b\u0005:\u0005)\u001d\u000f/@B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001c\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J%\u0010#\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b#\u0010$J)\u0010&\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b%\u0010$J'\u0010'\u001a\u00020\u00182\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b'\u0010$R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b0\u00101R)\u00109\u001a\u0010\u0012\f\u0012\n 4*\u0004\u0018\u00010\u00130\u0013038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardTabs;", "Landroid/widget/FrameLayout;", "Les0/w;", "Les0/u;", "Les0/v;", "Lorg/jetbrains/annotations/NotNull;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/a;", "getCurrentTabs$ui_kit_components_release", "()Ljava/util/List;", "getCurrentTabs", "", "getSelectedTabId$ui_kit_components_release", "()Ljava/lang/String;", "getSelectedTabId", "Lkotlin/Function1;", "", "function", "setOnLongTabClickListener$ui_kit_components_release", "(Lkotlin/jvm/functions/Function1;)V", "setOnLongTabClickListener", "Llu0/q;", "gravity", "setTabsGravity", "(Llu0/q;)V", "newItems", "selectedId", "setItemsWithDiffing", "(Ljava/util/List;Ljava/lang/String;)V", "setItemsAfterReordering$ui_kit_components_release", "setItemsAfterReordering", "setItems", "Lcom/revolut/core/ui_kit/views/AutoFitTabLayout;", "a", "Le8/q;", "getReactionsKeyboardTabs_tabLayout", "()Lcom/revolut/core/ui_kit/views/AutoFitTabLayout;", "ReactionsKeyboardTabs_tabLayout", "Landroid/view/View;", "b", "getLastTabLayoutGradient", "()Landroid/view/View;", "lastTabLayoutGradient", "Lihm/f;", "kotlin.jvm.PlatformType", "d", "Lkotlin/Lazy;", "getFakeTabClickSubject", "()Lihm/f;", "fakeTabClickSubject", "Landroidx/transition/Transition;", "h", "getDeleteTransition", "()Landroidx/transition/Transition;", "deleteTransition", "Companion", "lu0/p", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardTabs extends FrameLayout implements w, u, v {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q ReactionsKeyboardTabs_tabLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q lastTabLayoutGradient;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f57499c;
    public final Object d;
    public Function1 e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f57500g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f57501h;
    public volatile boolean i;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardTabs(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(ReactionsKeyboardTabs reactionsKeyboardTabs, int i) {
        reactionsKeyboardTabs.getReactionsKeyboardTabs_tabLayout().setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Transition getDeleteTransition() {
        return (Transition) this.f57501h.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final f getFakeTabClickSubject() {
        return (f) this.d.getValue();
    }

    private final View getLastTabLayoutGradient() {
        return this.lastTabLayoutGradient.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AutoFitTabLayout getReactionsKeyboardTabs_tabLayout() {
        return (AutoFitTabLayout) this.ReactionsKeyboardTabs_tabLayout.f();
    }

    public static final void i(ReactionsKeyboardTabs reactionsKeyboardTabs, List list, String str) {
        reactionsKeyboardTabs.j();
        reactionsKeyboardTabs.i = true;
        reactionsKeyboardTabs.getReactionsKeyboardTabs_tabLayout().o();
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a aVar = (a) it8.next();
            AutoFitTabLayout reactionsKeyboardTabs_tabLayout = reactionsKeyboardTabs.getReactionsKeyboardTabs_tabLayout();
            b0.a aVarK = reactionsKeyboardTabs.k(aVar);
            ArrayList arrayList = reactionsKeyboardTabs_tabLayout.d;
            reactionsKeyboardTabs_tabLayout.b(aVarK, arrayList.size(), arrayList.isEmpty());
        }
        reactionsKeyboardTabs.i = false;
        reactionsKeyboardTabs.n(str, true, true);
        reactionsKeyboardTabs.f = list;
    }

    public static void o(b0.a aVar, int i) {
        View view = aVar.f;
        if (view != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iS = kli.a.s(i, context);
            ((AppCompatTextView) view.findViewById(R$id.ReactionsKeyboardTabs_tabText)).setTextColor(iS);
            ((AppCompatImageView) view.findViewById(R$id.ReactionsKeyboardTabs_tabIcon)).setColorFilter(iS);
            ((AppCompatImageView) view.findViewById(R$id.ReactionsKeyboardTabs_largeIcon)).setColorFilter(iS);
        }
    }

    public static /* synthetic */ void setItems$default(ReactionsKeyboardTabs reactionsKeyboardTabs, List list, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        reactionsKeyboardTabs.setItems(list, str);
    }

    public static /* synthetic */ void setItemsAfterReordering$ui_kit_components_release$default(ReactionsKeyboardTabs reactionsKeyboardTabs, List list, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        reactionsKeyboardTabs.setItemsAfterReordering$ui_kit_components_release(list, str);
    }

    @Override // es0.t
    public final void a(b0.a tab2) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        if (aVar == null || (i = aVar.f57503b) == R$attr.uikit_colorGreyTone50) {
            i = R$attr.uikit_colorForeground;
        }
        o(tab2, i);
        Object obj3 = tab2.f128806a;
        a aVar2 = obj3 instanceof a ? (a) obj3 : null;
        this.f57500g = aVar2 != null ? aVar2.f57502a : null;
        if (this.i || (str = this.f57500g) == null) {
            return;
        }
        this.f57499c.onNext(str);
    }

    @Override // es0.t
    public final void d(b0.a tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
    }

    @Override // es0.v
    public final void e(b0.a tab2) {
        String str;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        if (aVar == null || (str = aVar.f57502a) == null) {
            throw new IllegalStateException("should be Tabs.Item as a TAG");
        }
        Function1 function1 = this.e;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    @Override // es0.t
    public final void f(b0.a tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        if (aVar != null) {
            o(tab2, aVar.f57503b);
        }
    }

    @Override // es0.u
    public final void g(b0.a tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        a aVar = obj2 instanceof a ? (a) obj2 : null;
        if (aVar != null) {
            getFakeTabClickSubject().onNext(aVar.f57502a);
        }
    }

    @NotNull
    public final List<a> getCurrentTabs$ui_kit_components_release() {
        return this.f;
    }

    /* JADX INFO: renamed from: getSelectedTabId$ui_kit_components_release, reason: from getter */
    public final String getF57500g() {
        return this.f57500g;
    }

    public final void j() {
        TransitionManager.endTransitions(getReactionsKeyboardTabs_tabLayout());
    }

    public final b0.a k(a aVar) {
        View viewR = s.r(this, R$layout.internal_reactions_keyboard_view_emoji_tabs_item);
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewR.findViewById(R$id.ReactionsKeyboardTabs_tabIcon);
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewR.findViewById(R$id.ReactionsKeyboardTabs_tabText);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) viewR.findViewById(R$id.ReactionsKeyboardTabs_largeIcon);
        com.revolut.core.ui_kit.internal.views.reactionskeyboard.b bVar = aVar.f57504c;
        ty0.c cVarB0 = or0.u.k(this).b0();
        TextClause textClause = aVar.f57504c.f57505a;
        Intrinsics.h(appCompatTextView);
        ty0.c.b(cVarB0, textClause, appCompatTextView, null, null, 12);
        appCompatImageView.setImageDrawable(null);
        appCompatTextView.setVisibility(0);
        Intrinsics.h(appCompatImageView2);
        appCompatImageView2.setVisibility(8);
        appCompatImageView.setVisibility(8);
        b0.a aVarM = getReactionsKeyboardTabs_tabLayout().m(false, true);
        Intrinsics.checkNotNullExpressionValue(aVarM, "newTab(...)");
        aVarM.f = viewR;
        aVarM.c();
        o(aVarM, aVar.f57503b);
        aVarM.f128806a = aVar;
        return aVarM;
    }

    public final void l(List list) {
        if (list.size() == this.f.size() && list.equals(this.f)) {
            return;
        }
        getReactionsKeyboardTabs_tabLayout().o();
        this.i = true;
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            a aVar = (a) it8.next();
            AutoFitTabLayout reactionsKeyboardTabs_tabLayout = getReactionsKeyboardTabs_tabLayout();
            b0.a aVarK = k(aVar);
            ArrayList arrayList = reactionsKeyboardTabs_tabLayout.d;
            reactionsKeyboardTabs_tabLayout.b(aVarK, arrayList.size(), arrayList.isEmpty());
        }
        this.f = list;
        this.i = false;
    }

    public final void m(String itemId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, this.f57500g)) {
            return;
        }
        int tabCount = getReactionsKeyboardTabs_tabLayout().getTabCount();
        for (int i = 0; i < tabCount; i++) {
            b0.a aVarK = getReactionsKeyboardTabs_tabLayout().k(i);
            Object obj2 = aVarK != null ? aVarK.f128806a : null;
            a aVar = obj2 instanceof a ? (a) obj2 : null;
            if (Intrinsics.f(aVar != null ? aVar.f57502a : null, itemId) && !aVarK.a()) {
                if (!z) {
                    if (z3) {
                        getReactionsKeyboardTabs_tabLayout().post(new com.google.android.material.sidesheet.b(this, i, 5));
                    } else {
                        getReactionsKeyboardTabs_tabLayout().setScrollPosition(i, BitmapDescriptorFactory.HUE_RED, true);
                    }
                }
                this.i = true;
                aVarK.b();
                this.f57500g = itemId;
                this.i = false;
                return;
            }
        }
    }

    public final void n(String str, boolean z, boolean z3) {
        if (str == null || str.equals(this.f57500g)) {
            return;
        }
        m(str, z, z3);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("STATE_KEY_SELECTED");
        this.f57500g = string;
        if (string != null) {
            m(string, false, true);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putString("STATE_KEY_SELECTED", this.f57500g);
        return bundle;
    }

    public final void setItems(@NotNull List<a> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        l(newItems);
        n(selectedId, false, true);
    }

    public final void setItemsAfterReordering$ui_kit_components_release(@NotNull List<a> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        l(newItems);
        n(selectedId, false, false);
    }

    public final void setItemsWithDiffing(@NotNull List<a> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new p(this.f, newItems), false);
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
        diffResultCalculateDiff.dispatchUpdatesTo(new lu0.s(this, newItems, selectedId));
    }

    public final void setOnLongTabClickListener$ui_kit_components_release(Function1<? super String, Unit> function) {
        this.e = function;
    }

    public final void setTabsGravity(@NotNull lu0.q gravity) {
        int i;
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        ViewGroup.LayoutParams layoutParams = getReactionsKeyboardTabs_tabLayout().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i2 = r.f200004a[gravity.ordinal()];
        if (i2 == 1) {
            i = 8388611;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = 8388613;
        }
        layoutParams2.gravity = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardTabs(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardTabs(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.ReactionsKeyboardTabs_tabLayout = kli.a.J(R$id.ReactionsKeyboardTabs_tabLayout, this);
        this.lastTabLayoutGradient = kli.a.J(R$id.tabs_Gradient, this);
        this.f57499c = v0.a.d("create(...)");
        k kVar = k.NONE;
        this.d = j.c(kVar, new f0(23));
        this.f = zhm.f0.f322471a;
        this.f57501h = j.c(kVar, new f0(24));
        View.inflate(context, R$layout.internal_reactions_keyboard_view_emoji_tabs, this);
        setClipToPadding(false);
        setClipChildren(false);
        getReactionsKeyboardTabs_tabLayout().a(this);
        getReactionsKeyboardTabs_tabLayout().f128790b = this;
        getReactionsKeyboardTabs_tabLayout().f128789a = this;
        int paddingRight = getPaddingRight();
        Integer numValueOf = paddingRight == 0 ? null : Integer.valueOf(paddingRight);
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            ViewGroup.LayoutParams layoutParams = getLastTabLayoutGradient().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.rightMargin = -iIntValue;
            }
        }
    }

    public /* synthetic */ ReactionsKeyboardTabs(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

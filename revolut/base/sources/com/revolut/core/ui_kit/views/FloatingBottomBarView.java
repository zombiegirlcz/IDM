package com.revolut.core.ui_kit.views;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit.internal.drawables.BottomAnchoredGradientDrawable;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import com.revolut.core.ui_kit.internal.views.box.ShadowLayout;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.haptic.Haptic;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.youTransactor.uCube.rpc.Constants;
import ie.a0;
import ip0.d6;
import ip0.g0;
import ip0.xe;
import ix0.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import mt0.y;
import mx0.m6;
import mx0.n6;
import mx0.o6;
import mx0.p6;
import mx0.q6;
import mx0.r6;
import mx0.s2;
import mx0.s6;
import mx0.t6;
import mx0.u6;
import mx0.v6;
import mx0.w6;
import mx0.x6;
import mx0.y6;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.PassportService;
import ro0.e0;
import ro0.q;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b&\b\u0007\u0018\u0000 f2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\bghij\u0019kl8B'\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010 \u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\tH\u0003¢\u0006\u0004\b\"\u0010\u000eJ\u000f\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010!J\u0017\u0010-\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010!J\u000f\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0002¢\u0006\u0004\b5\u00106R*\u0010@\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b8\u00109\u0012\u0004\b>\u0010?\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010F\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bA\u0010B\u0012\u0004\bE\u0010?\u001a\u0004\bC\u0010DR\u001a\u0010L\u001a\u00020G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR.\u0010S\u001a\u0004\u0018\u00010&2\b\u0010M\u001a\u0004\u0018\u00010&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010)R\"\u0010Y\u001a\u00020\u00158\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010\u0018R*\u0010`\u001a\u0004\u0018\u0001018\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b_\u0010?\u001a\u0004\b\\\u00103\"\u0004\b]\u0010^R\u001a\u0010a\u001a\u00020\u00158\u0016X\u0096D¢\u0006\f\n\u0004\ba\u0010U\u001a\u0004\bb\u0010WR\u0014\u0010\u0016\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u0010WR\u0014\u0010e\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bd\u0010W¨\u0006m"}, d2 = {"Lcom/revolut/core/ui_kit/views/FloatingBottomBarView;", "Landroid/widget/LinearLayout;", "Lg01/a;", "Lwx0/b;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "getSuggestedMinimumHeight", "()I", "", "Lcom/revolut/core/ui_kit/views/FloatingBottomBarView$Item;", "items", "", "setItems", "(Ljava/util/List;)V", "", "withLabels", "setWithLabels", "(Z)V", "Lmx0/r6;", "mode", "setScrollAnimationMode", "(Lmx0/r6;)V", "show", "setVisibilityOnScroll", "visibility", "setVisibility", "(I)V", "getCollapsedGradientHeightPx", "Landroid/view/View;", "getOrCreateBottomInsetView", "()Landroid/view/View;", "", "itemId", "setVisualSelection", "(Ljava/lang/String;)V", "displayedItemsCount", "setupFloatingBottomBarWidth", "barWidth", "setupContentPaddings", "Lmt0/y;", "getTabLayoutVariant", "()Lmt0/y;", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/a;", "getExpandedViewController", "()Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/a;", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomTabView;", "getOrCreateTabView", "()Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/FloatingBottomTabView;", "Ljava/lang/Runnable;", "b", "Ljava/lang/Runnable;", "getPendingSelectionAnimation$ui_kit_components_release", "()Ljava/lang/Runnable;", "setPendingSelectionAnimation$ui_kit_components_release", "(Ljava/lang/Runnable;)V", "getPendingSelectionAnimation$ui_kit_components_release$annotations", "()V", "pendingSelectionAnimation", "i", "Landroid/widget/LinearLayout;", "getContent$ui_kit_components_release", "()Landroid/widget/LinearLayout;", "getContent$ui_kit_components_release$annotations", "content", "Landroid/widget/FrameLayout;", "j", "Landroid/widget/FrameLayout;", "getContentContainer$ui_kit_components_release", "()Landroid/widget/FrameLayout;", "contentContainer", "value", "m", "Ljava/lang/String;", "getSelectedItemId", "()Ljava/lang/String;", "setSelectedItemId$ui_kit_components_release", "selectedItemId", "s", "Z", "g", "()Z", "setVisibilityAnimationsOnScrollEnabled", "isVisibilityAnimationsOnScrollEnabled", "F", "Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/a;", "getBottomBarController$ui_kit_components_release", "setBottomBarController$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/internal/views/floatingbottombar/a;)V", "getBottomBarController$ui_kit_components_release$annotations", "bottomBarController", "fitsReadableArea", "getFitsReadableArea", "getWithLabels", "getBottomNavigationRequiresInsets", "bottomNavigationRequiresInsets", "Companion", "a", "mx0/p6", "mx0/q6", "Item", "mx0/o6", "mx0/x6", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FloatingBottomBarView extends LinearLayout implements g01.a, wx0.b, ny0.h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public final int A;
    public final p0 B;
    public final x6 C;
    public final mt0.j D;
    public final mt0.v E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public com.revolut.core.ui_kit.internal.views.floatingbottombar.a bottomBarController;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f58571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Runnable pendingSelectionAnimation;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f58573c;
    public boolean d;
    public a e;
    public final ArrayDeque f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f58574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ShadowLayout f58575h;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final LinearLayout content;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final FrameLayout contentContainer;
    public final FloatingBottomBarExpandedView k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f58577l;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public String selectedItemId;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f58579n;
    public final ArrayDeque o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.f f58580p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ihm.f f58581q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ihm.f f58582r;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean isVisibilityAnimationsOnScrollEnabled;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f58584t;
    public Integer u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f58585w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f58586x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ifm.b f58587y;
    public final com.revolut.core.ui_kit.internal.views.floatingbottombar.j z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/FloatingBottomBarView$Item;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Item implements TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f58588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextLocalisedClause f58589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceImage f58590c;
        public final boolean d;
        public Parcelable e;

        public Item(String id10, TextLocalisedClause contentDescription, ResourceImage icon, boolean z, int i) {
            z = (i & 8) != 0 ? true : z;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f58588a = id10;
            this.f58589b = contentDescription;
            this.f58590c = icon;
            this.d = z;
            this.e = null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Item)) {
                return false;
            }
            Item item = (Item) obj2;
            return Intrinsics.f(this.f58588a, item.f58588a) && this.f58589b.equals(item.f58589b) && this.f58590c.equals(item.f58590c) && this.d == item.d && Intrinsics.f(this.e, item.e);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF57047h() {
            return this.e;
        }

        public final int hashCode() {
            int iC = j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f58590c, t61.a.a(this.f58588a.hashCode() * 31, 31, this.f58589b), 31), 31, this.d);
            Parcelable parcelable = this.e;
            return iC + (parcelable == null ? 0 : parcelable.hashCode());
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f58591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f58592b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public FloatingBottomBarView f58593c;

        public final void a(int i) {
            this.f58591a = Integer.valueOf(i);
            FloatingBottomBarView floatingBottomBarView = this.f58593c;
            if (floatingBottomBarView != null) {
                Integer numValueOf = Integer.valueOf(i);
                Companion companion = FloatingBottomBarView.INSTANCE;
                floatingBottomBarView.u = numValueOf;
                floatingBottomBarView.m();
            }
        }

        public final void b() {
            this.f58592b = true;
            FloatingBottomBarView floatingBottomBarView = this.f58593c;
            if (floatingBottomBarView != null) {
                ArrayDeque arrayDeque = floatingBottomBarView.f;
                if (Intrinsics.f(floatingBottomBarView.e, this)) {
                    floatingBottomBarView.e = null;
                    while (floatingBottomBarView.e == null && !arrayDeque.isEmpty()) {
                        Object objRemove = arrayDeque.remove(0);
                        if (((a) objRemove).f58592b) {
                            objRemove = null;
                        }
                        a aVar = (a) objRemove;
                        if (aVar != null) {
                            floatingBottomBarView.t(aVar);
                        }
                    }
                    if (floatingBottomBarView.e == null) {
                        floatingBottomBarView.u = null;
                        floatingBottomBarView.m();
                    }
                }
            }
            this.f58593c = null;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.FloatingBottomBarView$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingBottomBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static Unit c(FloatingBottomBarView floatingBottomBarView, Configuration it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        floatingBottomBarView.setupFloatingBottomBarWidth(floatingBottomBarView.f58579n.size());
        return Unit.f186387a;
    }

    public static /* synthetic */ void getBottomBarController$ui_kit_components_release$annotations() {
    }

    /* JADX INFO: renamed from: getBottomNavigationRequiresInsets, reason: from getter */
    private final boolean getF58586x() {
        return this.f58586x;
    }

    private final int getCollapsedGradientHeightPx() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.k(context, 84.0f);
    }

    public static /* synthetic */ void getContent$ui_kit_components_release$annotations() {
    }

    private final com.revolut.core.ui_kit.internal.views.floatingbottombar.a getExpandedViewController() {
        com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar = this.bottomBarController;
        if (aVar != null) {
            return aVar;
        }
        int iA = this.B.a();
        x6 x6Var = this.C;
        v6 v6Var = x6Var instanceof v6 ? (v6) x6Var : null;
        u6 u6Var = v6Var != null ? v6Var.f210050a : null;
        s6 s6Var = u6Var instanceof s6 ? (s6) u6Var : null;
        FloatingBottomBarDrawable floatingBottomBarDrawable = s6Var != null ? s6Var.f209993a : null;
        mm7.h hVar = new mm7.h(1, this.E, mt0.v.class, "setExpanded", "setExpanded(Z)V", 0, 28);
        mt0.j jVar = this.D;
        com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar2 = new com.revolut.core.ui_kit.internal.views.floatingbottombar.a(this.f58575h, this.content, this.k, iA, floatingBottomBarDrawable, hVar, jVar != null ? new mt0.h(jVar, 3) : null, new n6(this, 3));
        this.bottomBarController = aVar2;
        return aVar2;
    }

    private final View getOrCreateBottomInsetView() {
        View view = this.f58577l;
        if (view != null) {
            return view;
        }
        View view2 = new View(getContext());
        this.f58577l = view2;
        view2.setClickable(true);
        addView(view2);
        return view2;
    }

    private final FloatingBottomTabView getOrCreateTabView() {
        ArrayDeque arrayDeque = this.o;
        if (!arrayDeque.isEmpty()) {
            return (FloatingBottomTabView) arrayDeque.removeFirst();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new FloatingBottomTabView(context, null, 6, 0);
    }

    public static /* synthetic */ void getPendingSelectionAnimation$ui_kit_components_release$annotations() {
    }

    private final y getTabLayoutVariant() {
        x6 x6Var = this.C;
        if (x6Var instanceof v6) {
            return y.FLOATING;
        }
        if (x6Var instanceof w6) {
            return y.SOLID;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean getWithLabels() {
        return this.f58573c && !this.d;
    }

    public static void h(FloatingBottomBarView floatingBottomBarView) {
        floatingBottomBarView.p();
        floatingBottomBarView.getExpandedViewController().d(true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public static boolean r() {
        return ((Boolean) jo0.g.f176836t.getValue()).booleanValue() || ((Boolean) jo0.g.f176835s.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setVisualSelection(String itemId) {
        ArrayList arrayList = this.f58579n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) arrayList.get(i);
            FloatingBottomTabView.DisplayedItemModel displayedItem = floatingBottomTabView.getDisplayedItem();
            floatingBottomTabView.setSelected(Intrinsics.f(displayedItem != null ? displayedItem.f57043a : null, itemId));
        }
    }

    private final void setupContentPaddings(int barWidth) {
        int iG;
        if (this.C instanceof v6) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iG = kli.a.k(context, 4.0f);
        } else {
            int i = this.A;
            if (barWidth == -1) {
                iG = i;
            } else {
                Iterator it8 = this.f58579n.iterator();
                int minContentWidth = 0;
                while (it8.hasNext()) {
                    minContentWidth += ((FloatingBottomTabView) it8.next()).getMinContentWidth();
                }
                iG = kotlin.ranges.f.g((barWidth - minContentWidth) / 2, 0, i);
            }
        }
        LinearLayout linearLayout = this.content;
        linearLayout.setPadding(iG, linearLayout.getPaddingTop(), iG, linearLayout.getPaddingBottom());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void setupFloatingBottomBarWidth(int r3) {
        /*
            r2 = this;
            mx0.x6 r0 = r2.C
            boolean r0 = r0 instanceof mx0.v6
            if (r0 != 0) goto L7
            goto L58
        L7:
            r0 = 3
            java.lang.String r1 = "getContext(...)"
            if (r3 > r0) goto L1a
            android.content.Context r3 = r2.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            r0 = 1132724224(0x43840000, float:264.0)
            int r3 = kli.a.k(r3, r0)
            goto L38
        L1a:
            java.lang.Object r3 = jo0.g.f176833q
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L37
            android.content.Context r3 = r2.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r1)
            boolean r3 = ny0.i.d(r3)
            if (r3 == 0) goto L37
            r3 = -2
            goto L38
        L37:
            r3 = -1
        L38:
            com.revolut.core.ui_kit.internal.views.box.ShadowLayout r0 = r2.f58575h
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            int r1 = r1.width
            if (r1 == r3) goto L58
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L50
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            r1.width = r3
            r0.setLayoutParams(r1)
            return
        L50:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r3.<init>(r0)
            throw r3
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.FloatingBottomBarView.setupFloatingBottomBarWidth(int):void");
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    public static void w(FloatingBottomBarView floatingBottomBarView, String selectedId, boolean z, boolean z3, int i) {
        int i2;
        boolean z4;
        boolean z6;
        Object obj2;
        Item item;
        List list;
        Object obj3;
        boolean z11 = (i & 4) != 0 ? false : z3;
        boolean z12 = (i & 8) != 0;
        boolean z29 = (i & 16) == 0;
        ArrayList arrayList = floatingBottomBarView.f58579n;
        Intrinsics.checkNotNullParameter(selectedId, "itemId");
        String str = floatingBottomBarView.selectedItemId;
        boolean zF = Intrinsics.f(str, selectedId);
        if (floatingBottomBarView.s()) {
            com.revolut.core.ui_kit.internal.views.floatingbottombar.a expandedViewController = floatingBottomBarView.getExpandedViewController();
            expandedViewController.getClass();
            Intrinsics.checkNotNullParameter(selectedId, "selectedId");
            mt0.p pVarA = mt0.p.a(expandedViewController.o, null, selectedId, 3);
            expandedViewController.o = pVarA;
            if (expandedViewController.f57052h) {
                expandedViewController.f57050c.setModel(pVarA);
            }
            if (!Intrinsics.f(selectedId, floatingBottomBarView.selectedItemId)) {
                int size = arrayList.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size) {
                        FloatingBottomTabView.DisplayedItemModel displayedItem = ((FloatingBottomTabView) arrayList.get(i3)).getDisplayedItem();
                        if ((displayedItem != null ? displayedItem.f57046g : null) == com.revolut.core.ui_kit.internal.views.floatingbottombar.k.CONTENT && Intrinsics.f(displayedItem.f57043a, selectedId)) {
                            z4 = false;
                            break;
                        }
                        i3++;
                    } else {
                        z4 = true;
                        break;
                    }
                }
                int size2 = arrayList.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size2) {
                        z6 = false;
                        break;
                    }
                    FloatingBottomTabView.DisplayedItemModel displayedItem2 = ((FloatingBottomTabView) arrayList.get(i5)).getDisplayedItem();
                    if ((displayedItem2 != null ? displayedItem2.f57046g : null) == com.revolut.core.ui_kit.internal.views.floatingbottombar.k.CONTENT_AND_EXPAND) {
                        z6 = true;
                        break;
                    }
                    i5++;
                }
                if (z4 || z6) {
                    int size3 = arrayList.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size3) {
                            obj2 = null;
                            break;
                        }
                        obj2 = arrayList.get(i6);
                        FloatingBottomTabView.DisplayedItemModel displayedItem3 = ((FloatingBottomTabView) obj2).getDisplayedItem();
                        if (displayedItem3 != null) {
                            int i21 = com.revolut.core.ui_kit.internal.views.floatingbottombar.l.f57086a[displayedItem3.f57046g.ordinal()];
                            if (i21 != 1) {
                                if (i21 != 2 && i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        i6++;
                    }
                    FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) obj2;
                    if (floatingBottomTabView != null) {
                        if (!z4 || (list = floatingBottomBarView.f58571a) == null) {
                            item = null;
                        } else {
                            int size4 = list.size();
                            int i22 = 0;
                            while (true) {
                                if (i22 >= size4) {
                                    obj3 = null;
                                    break;
                                }
                                obj3 = list.get(i22);
                                if (Intrinsics.f(((Item) obj3).f58588a, selectedId)) {
                                    break;
                                } else {
                                    i22++;
                                }
                            }
                            item = (Item) obj3;
                        }
                        floatingBottomTabView.setTabContent(floatingBottomBarView.y(item));
                    }
                }
            }
        }
        floatingBottomBarView.selectedItemId = selectedId;
        floatingBottomBarView.setVisualSelection(selectedId);
        if (zF && !z29) {
            if (z) {
                floatingBottomBarView.f58582r.onNext(new q6(selectedId));
                return;
            }
            return;
        }
        Iterator it8 = arrayList.iterator();
        int i32 = 0;
        while (true) {
            i2 = -1;
            if (!it8.hasNext()) {
                i32 = -1;
                break;
            }
            FloatingBottomTabView.DisplayedItemModel displayedItem4 = ((FloatingBottomTabView) it8.next()).getDisplayedItem();
            if (Intrinsics.f(displayedItem4 != null ? displayedItem4.f57043a : null, str)) {
                break;
            } else {
                i32++;
            }
        }
        Integer numValueOf = Integer.valueOf(i32);
        if (i32 < 0) {
            numValueOf = null;
        }
        Iterator it9 = arrayList.iterator();
        int i33 = 0;
        while (true) {
            if (!it9.hasNext()) {
                break;
            }
            FloatingBottomTabView.DisplayedItemModel displayedItem5 = ((FloatingBottomTabView) it9.next()).getDisplayedItem();
            if (Intrinsics.f(displayedItem5 != null ? displayedItem5.f57043a : null, selectedId)) {
                i2 = i33;
                break;
            }
            i33++;
        }
        Integer numValueOf2 = i2 >= 0 ? Integer.valueOf(i2) : null;
        if (!zF) {
            floatingBottomBarView.f58581q.onNext(new p6(str, selectedId));
        }
        x6 x6Var = floatingBottomBarView.C;
        if (!(x6Var instanceof v6)) {
            if (!(x6Var instanceof w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        Runnable runnable = floatingBottomBarView.pendingSelectionAnimation;
        if (runnable != null) {
            floatingBottomBarView.removeCallbacks(runnable);
        }
        boolean z31 = z12;
        a0 a0Var = new a0(floatingBottomBarView, numValueOf, numValueOf2, z31, 1);
        if (!z31 || !z11 || !((Boolean) jo0.g.J.getValue()).booleanValue()) {
            a0Var.run();
        } else {
            floatingBottomBarView.pendingSelectionAnimation = a0Var;
            floatingBottomBarView.postOnAnimation(a0Var);
        }
    }

    public final void A() {
        float fZ;
        x6 x6Var = this.C;
        if (x6Var instanceof v6) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            fZ = kli.a.z(this.content.getHeight() / 2, context);
        } else {
            if (!(x6Var instanceof w6)) {
                throw new NoWhenBranchMatchedException();
            }
            fZ = BitmapDescriptorFactory.HUE_RED;
        }
        this.f58575h.setCornersRadius(fZ);
        v6 v6Var = x6Var instanceof v6 ? (v6) x6Var : null;
        u6 u6Var = v6Var != null ? v6Var.f210050a : null;
        s6 s6Var = u6Var instanceof s6 ? (s6) u6Var : null;
        if (s6Var == null) {
            return;
        }
        FloatingBottomBarDrawable floatingBottomBarDrawable = s6Var.f209993a;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        floatingBottomBarDrawable.f(kli.a.l(context2, fZ));
    }

    @Override // wx0.b
    public final efm.r a() {
        return this.f58580p;
    }

    @Override // wx0.b
    public final void b(String itemId) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        w(this, itemId, false, false, 28);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.z != null;
    }

    @Override // wx0.b
    public final void d(String itemId, boolean z) {
        Object obj2;
        FloatingBottomTabView.DisplayedItemModel displayedItem;
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        ArrayList arrayList = this.f58579n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj3 = arrayList.get(i);
            FloatingBottomTabView.DisplayedItemModel displayedItem2 = ((FloatingBottomTabView) obj3).getDisplayedItem();
            if (Intrinsics.f(displayedItem2 != null ? displayedItem2.f57043a : null, itemId)) {
                obj2 = obj3;
                break;
            }
            i++;
        }
        FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) obj2;
        if (floatingBottomTabView == null || (displayedItem = floatingBottomTabView.getDisplayedItem()) == null) {
            return;
        }
        floatingBottomTabView.setTabContent(FloatingBottomTabView.DisplayedItemModel.a(displayedItem, false, z, PassportService.DEFAULT_MAX_BLOCKSIZE));
    }

    @Override // wx0.b
    public final efm.r f() {
        return this.f58581q;
    }

    @Override // g01.a
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsVisibilityAnimationsOnScrollEnabled() {
        return this.isVisibilityAnimationsOnScrollEnabled;
    }

    /* JADX INFO: renamed from: getBottomBarController$ui_kit_components_release, reason: from getter */
    public final com.revolut.core.ui_kit.internal.views.floatingbottombar.a getBottomBarController() {
        return this.bottomBarController;
    }

    @NotNull
    /* JADX INFO: renamed from: getContent$ui_kit_components_release, reason: from getter */
    public final LinearLayout getContent() {
        return this.content;
    }

    @NotNull
    /* JADX INFO: renamed from: getContentContainer$ui_kit_components_release, reason: from getter */
    public final FrameLayout getContentContainer() {
        return this.contentContainer;
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF51506a() {
        return false;
    }

    /* JADX INFO: renamed from: getPendingSelectionAnimation$ui_kit_components_release, reason: from getter */
    public final Runnable getPendingSelectionAnimation() {
        return this.pendingSelectionAnimation;
    }

    public final String getSelectedItemId() {
        return this.selectedItemId;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return getMinimumHeight();
    }

    @Override // wx0.b
    public final void i(wx0.b other) {
        Intrinsics.checkNotNullParameter(other, "other");
        List list = this.f58571a;
        if (list != null) {
            other.setItems(list);
        }
        String str = this.selectedItemId;
        if (str != null) {
            other.b(str);
        }
        other.setWithLabels(this.f58573c);
        ArrayList arrayList = this.f58579n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FloatingBottomTabView.DisplayedItemModel displayedItem = ((FloatingBottomTabView) arrayList.get(i)).getDisplayedItem();
            if (displayedItem != null) {
                other.d(displayedItem.f57043a, displayedItem.f);
            }
        }
    }

    @Override // wx0.b
    public final efm.r j() {
        return this.f58582r;
    }

    @Override // wx0.b
    public final efm.r k() {
        return this.k.f57026c;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, kotlin.Lazy] */
    public final void m() {
        this.f58584t = u();
        x6 x6Var = this.C;
        if (!(x6Var instanceof v6)) {
            if (!Intrinsics.f(x6Var, w6.f210074a)) {
                throw new NoWhenBranchMatchedException();
            }
            this.content.setBackgroundColor(this.f58584t);
            View view = this.f58577l;
            if (view != null) {
                view.setBackgroundColor(this.f58584t);
                return;
            }
            return;
        }
        v6 v6Var = (v6) x6Var;
        u6 u6Var = v6Var.f210050a;
        if (u6Var instanceof s6) {
            FloatingBottomBarDrawable floatingBottomBarDrawable = ((s6) u6Var).f209993a;
            mt0.j jVar = this.D;
            floatingBottomBarDrawable.e((jVar != null ? (ro0.o) jVar.f208709n.getValue() : null) instanceof ro0.l ? dr0.n.REFLECTION : dr0.n.BLUR);
        } else {
            if (!(u6Var instanceof t6)) {
                throw new NoWhenBranchMatchedException();
            }
            ((t6) u6Var).f210013a.e(dr0.n.SOLID);
        }
        int iV = v();
        BottomAnchoredGradientDrawable bottomAnchoredGradientDrawable = v6Var.f210051b;
        int[] colors = {0, io0.a.d(0.45f, iV), iV};
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (!Arrays.equals(bottomAnchoredGradientDrawable.d, colors)) {
            int[] iArrCopyOf = Arrays.copyOf(colors, 3);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
            bottomAnchoredGradientDrawable.d = iArrCopyOf;
            Rect bounds = bottomAnchoredGradientDrawable.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "getBounds(...)");
            bottomAnchoredGradientDrawable.b(bounds, true);
            bottomAnchoredGradientDrawable.invalidateSelf();
        }
        n();
    }

    public final void n() {
        x6 x6Var = this.C;
        v6 v6Var = x6Var instanceof v6 ? (v6) x6Var : null;
        if (v6Var == null) {
            return;
        }
        int i = this.v;
        if (i < 0) {
            i = 0;
        }
        boolean z = (!r() || getF58586x() || this.f58585w) ? false : true;
        int iV = v();
        BottomAnchoredGradientDrawable bottomAnchoredGradientDrawable = v6Var.f210051b;
        int collapsedGradientHeightPx = getCollapsedGradientHeightPx() + (z ? i : 0);
        if (z) {
            i = 0;
        }
        bottomAnchoredGradientDrawable.a(collapsedGradientHeightPx, i);
        View view = this.f58577l;
        if (view != null) {
            view.setBackgroundColor(z ? 0 : iV);
        }
    }

    public final void o() {
        ArrayList arrayList = this.f58579n;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) arrayList.get(i);
            FloatingBottomTabView.DisplayedItemModel displayedItem = floatingBottomTabView.getDisplayedItem();
            if (displayedItem != null) {
                floatingBottomTabView.setTabContent(FloatingBottomTabView.DisplayedItemModel.a(displayedItem, getWithLabels(), false, Constants.TAG_BLE_FIRMWARE_VERSION));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.WindowInsets onApplyWindowInsets(android.view.WindowInsets r10) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.FloatingBottomBarView.onApplyWindowInsets(android.view.WindowInsets):android.view.WindowInsets");
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onAttachedToWindow();
        mt0.j jVar = this.D;
        if (jVar != null) {
            FloatingBottomBarView floatingBottomBarView = jVar.f208701a;
            ro0.p pVar = jVar.d;
            if (pVar != null) {
                pVar.e();
            }
            q.a aVar = ro0.q.Companion;
            e0 e0Var = e0.BOTTOM_BAR;
            aVar.getClass();
            ro0.q qVarA = q.a.a(floatingBottomBarView, e0Var);
            jVar.d = qVarA != null ? ro0.q.e(qVarA, floatingBottomBarView, jVar.o, (ro0.o) jVar.f208709n.getValue(), null, null, 56) : null;
        }
        if (s()) {
            ifm.b bVar = this.f58587y;
            bVar.d();
            bVar.a(this.k.f().subscribe(new s2(new m6(this, 0), 15)));
            com.revolut.core.ui_kit.internal.views.floatingbottombar.a expandedViewController = getExpandedViewController();
            Context context = expandedViewController.f57048a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ComponentCallbacks2 componentCallbacks2M = kli.a.m(context);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = componentCallbacks2M instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) componentCallbacks2M : null;
            if (onBackPressedDispatcherOwner == null || (onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher()) == null) {
                return;
            }
            onBackPressedDispatcher.addCallback(expandedViewController.f57057p);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Runnable runnable = this.pendingSelectionAnimation;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        this.pendingSelectionAnimation = null;
        com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar = this.bottomBarController;
        if (aVar != null) {
            Context context = aVar.f57048a.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Activity activityI = z92.f.i(context);
            if (activityI == null || activityI.isFinishing() || activityI.isDestroyed()) {
                aVar.i = null;
            } else {
                View view = aVar.i;
                if (view != null) {
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(view);
                    }
                }
            }
            aVar.f57057p.remove();
        }
        com.revolut.core.ui_kit.internal.views.floatingbottombar.j jVar = this.z;
        if (jVar != null && jVar.f57081n) {
            Choreographer.getInstance().removeFrameCallback(jVar.f57085s);
            jVar.f57081n = false;
        }
        super.onDetachedFromWindow();
        mt0.j jVar2 = this.D;
        if (jVar2 != null) {
            ro0.p pVar = jVar2.d;
            if (pVar != null) {
                pVar.e();
            }
            jVar2.d = null;
            jVar2.f208708m = null;
        }
        this.f58587y.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a4 A[RETURN] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.FloatingBottomBarView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i5) {
        super.onLayout(z, i, i2, i3, i5);
        if (z) {
            A();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        setupContentPaddings(View.MeasureSpec.getMode(i) == 0 ? -1 : View.MeasureSpec.getSize(i));
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        com.revolut.core.ui_kit.internal.views.floatingbottombar.j jVar = this.z;
        if (jVar != null) {
            FloatingBottomBarDrawable floatingBottomBarDrawable = jVar.f57074b;
            o6 o6Var = jVar.f57075c;
            FloatingBottomBarView floatingBottomBarView = o6Var.f209887a;
            Intrinsics.checkNotNullParameter(event, "event");
            if (jVar.f == mt0.x.SWIPING) {
                int action = event.getAction();
                if (action == 1) {
                    String tabId = jVar.c(jVar.g(event.getX(), event.getY()));
                    if (Intrinsics.f(tabId, "EXPAND_ACTION")) {
                        o6Var.a(jVar.f57078j);
                        floatingBottomBarDrawable.b(null, null, true);
                        floatingBottomBarView.getExpandedViewController().d(true);
                    } else {
                        if (tabId != null && !tabId.equals(jVar.f57078j)) {
                            Intrinsics.checkNotNullParameter(tabId, "tabId");
                            w(floatingBottomBarView, tabId, false, false, 28);
                            ArrayList arrayList = floatingBottomBarView.f58579n;
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) arrayList.get(i);
                                FloatingBottomTabView.DisplayedItemModel displayedItem = floatingBottomTabView.getDisplayedItem();
                                if (Intrinsics.f(displayedItem != null ? displayedItem.f57043a : null, tabId)) {
                                    FloatingBottomTabView.DisplayedItemModel displayedItem2 = floatingBottomTabView.getDisplayedItem();
                                    if (displayedItem2 != null) {
                                        or0.u.k(floatingBottomBarView).n0().a(floatingBottomTabView, displayedItem2, new py0.c(displayedItem2.f57044b));
                                    }
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        o6Var.a(jVar.f57078j);
                        floatingBottomBarDrawable.b(null, null, true);
                    }
                    ViewParent parent = jVar.f57073a.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                    jVar.f57078j = null;
                    jVar.a(true);
                    return true;
                }
                if (action == 2) {
                    jVar.d(event.getX(), event.getY());
                    return true;
                }
                if (action == 3) {
                    o6Var.a(jVar.f57078j);
                    jVar.a(true);
                    return true;
                }
            }
        }
        return super.onTouchEvent(event);
    }

    public final void p() {
        x6 x6Var = this.C;
        if (!(x6Var instanceof v6)) {
            if (!Intrinsics.f(x6Var, w6.f210074a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            ((com.revolut.core.ui_kit_core.displayers.haptic.b) or0.u.k(this).Y()).a(new Haptic.Effect(com.revolut.core.ui_kit_core.displayers.haptic.c.SHORT, true));
        }
    }

    public final void q(String str, boolean z, boolean z3, boolean z4) {
        w(this, str, z, z4, 24);
        if (z3) {
            getExpandedViewController().d(false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean s() {
        return (this.C instanceof v6) && ((Boolean) jo0.g.u.getValue()).booleanValue();
    }

    public final void setBottomBarController$ui_kit_components_release(com.revolut.core.ui_kit.internal.views.floatingbottombar.a aVar) {
        this.bottomBarController = aVar;
    }

    @Override // wx0.b
    public void setItems(@NotNull List<Item> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        x(items, false);
    }

    public final void setPendingSelectionAnimation$ui_kit_components_release(Runnable runnable) {
        this.pendingSelectionAnimation = runnable;
    }

    @Override // wx0.b
    public void setScrollAnimationMode(@NotNull r6 mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        mt0.v vVar = this.E;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "animationMode");
        if (vVar.k == mode) {
            return;
        }
        vVar.k = mode;
        vVar.c(false, false);
        if (mode != r6.VISIBILITY) {
            vVar.b();
        }
    }

    public final void setSelectedItemId$ui_kit_components_release(String str) {
        this.selectedItemId = str;
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        ny0.u.Companion.getClass();
        ny0.u uVarA = ny0.r.a(this);
        if (uVarA.f220614c) {
            super.setVisibility(visibility);
        } else {
            uVarA.b(visibility, "EXTERNAL_VISIBILITY_TOKEN");
        }
    }

    public void setVisibilityAnimationsOnScrollEnabled(boolean z) {
        this.isVisibilityAnimationsOnScrollEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8  */
    @Override // g01.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVisibilityOnScroll(boolean r25) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.FloatingBottomBarView.setVisibilityOnScroll(boolean):void");
    }

    @Override // wx0.b
    public void setWithLabels(boolean withLabels) {
        if (this.f58573c == withLabels) {
            return;
        }
        this.f58573c = withLabels;
        o();
    }

    public final void t(a aVar) {
        this.e = aVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(this, "bottomBar");
        aVar.f58593c = this;
        Integer num = aVar.f58591a;
        if (num != null) {
            this.u = num;
            m();
        }
    }

    public final int u() {
        Integer num = this.u;
        if (num != null) {
            return num.intValue();
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return kli.a.s(R$attr.uikit_colorElevatedBackground, context);
    }

    public final int v() {
        Color.Companion companion = Color.INSTANCE;
        int i = this.f58584t;
        companion.getClass();
        float[] fArr = Color.f51457a;
        android.graphics.Color.colorToHSV(i, fArr);
        fArr[1] = Math.max(fArr[1] - 0.05f, BitmapDescriptorFactory.HUE_RED);
        fArr[2] = Math.max(fArr[2] - 0.05f, BitmapDescriptorFactory.HUE_RED);
        return android.graphics.Color.HSVToColor(fArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v32, types: [aim.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Collection, java.util.List] */
    public final void x(List items, boolean z) {
        ?? arrayList;
        ArrayList arrayList2;
        LinearLayout linearLayout;
        FloatingBottomTabView orCreateTabView;
        int iK;
        int i;
        Item item;
        if (!Intrinsics.f(items, this.f58571a) || z) {
            this.f58571a = items;
            if (s()) {
                com.revolut.core.ui_kit.internal.views.floatingbottombar.a expandedViewController = getExpandedViewController();
                expandedViewController.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                mt0.p pVarA = mt0.p.a(expandedViewController.o, items, null, 6);
                expandedViewController.o = pVarA;
                if (expandedViewController.f57052h) {
                    expandedViewController.f57050c.setModel(pVarA);
                }
            }
            String str = this.selectedItemId;
            int iA = this.B.a();
            int i2 = 0;
            if (items.size() <= iA || !s()) {
                arrayList = new ArrayList(items.size());
                int size = items.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Item item2 = (Item) items.get(i3);
                    arrayList.add(new FloatingBottomTabView.DisplayedItemModel(item2.f58588a, item2.f58589b, item2.f58590c, getWithLabels(), getTabLayoutVariant(), false, com.revolut.core.ui_kit.internal.views.floatingbottombar.k.CONTENT, item2.e));
                }
            } else {
                int i5 = iA - 1;
                int size2 = items.size();
                int i6 = i5;
                while (true) {
                    if (i6 >= size2) {
                        item = null;
                        break;
                    }
                    item = (Item) items.get(i6);
                    if (Intrinsics.f(item.f58588a, str)) {
                        break;
                    } else {
                        i6++;
                    }
                }
                aim.e eVar = new aim.e(iA);
                for (int i21 = 0; i21 < i5; i21++) {
                    Item item3 = (Item) items.get(i21);
                    eVar.add(new FloatingBottomTabView.DisplayedItemModel(item3.f58588a, item3.f58589b, item3.f58590c, getWithLabels(), getTabLayoutVariant(), false, com.revolut.core.ui_kit.internal.views.floatingbottombar.k.CONTENT, item3.e));
                }
                eVar.add(y(item));
                arrayList = zhm.u.a(eVar);
            }
            ?? r92 = arrayList;
            String str2 = this.selectedItemId;
            setupFloatingBottomBarWidth(r92.size());
            while (true) {
                arrayList2 = this.f58579n;
                int size3 = arrayList2.size();
                int size4 = r92.size();
                linearLayout = this.content;
                if (size3 <= size4) {
                    break;
                }
                FloatingBottomTabView floatingBottomTabView = (FloatingBottomTabView) arrayList2.remove(zhm.v.j(arrayList2));
                linearLayout.removeView(floatingBottomTabView);
                floatingBottomTabView.setOnClickListener(null);
                floatingBottomTabView.setOnLongClickListener(null);
                floatingBottomTabView.setSelected(false);
                this.o.addLast(floatingBottomTabView);
            }
            int size5 = r92.size();
            int i22 = 0;
            while (i22 < size5) {
                FloatingBottomTabView.DisplayedItemModel displayedItemModel = (FloatingBottomTabView.DisplayedItemModel) r92.get(i22);
                if (i22 < arrayList2.size()) {
                    orCreateTabView = (FloatingBottomTabView) arrayList2.get(i22);
                } else {
                    orCreateTabView = getOrCreateTabView();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                    layoutParams.weight = 1.0f;
                    x6 x6Var = this.C;
                    boolean z3 = x6Var instanceof v6;
                    if (z3) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        iK = kli.a.k(context, 60.0f);
                    } else {
                        if (!(x6Var instanceof w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Context context2 = getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        iK = kli.a.k(context2, 56.0f);
                    }
                    layoutParams.height = iK;
                    if (z3) {
                        if (i22 != 0) {
                            Context context3 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            i = -kli.a.k(context3, 6.0f);
                        }
                        layoutParams.setMarginStart(i);
                        linearLayout.addView(orCreateTabView, i22, layoutParams);
                        arrayList2.add(orCreateTabView);
                    } else if (!(x6Var instanceof w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 0;
                    layoutParams.setMarginStart(i);
                    linearLayout.addView(orCreateTabView, i22, layoutParams);
                    arrayList2.add(orCreateTabView);
                }
                FloatingBottomTabView floatingBottomTabView2 = orCreateTabView;
                floatingBottomTabView2.setTabContent(displayedItemModel);
                int i32 = y6.f210123a[displayedItemModel.f57046g.ordinal()];
                if (i32 == 1) {
                    py0.c cVar = new py0.c(displayedItemModel.f57044b);
                    or0.m.a(floatingBottomTabView2);
                    floatingBottomTabView2.setOnClickListener(new d6(displayedItemModel, cVar, this, floatingBottomTabView2, displayedItemModel, 10));
                } else {
                    if (i32 != 2 && i32 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    floatingBottomTabView2.setOnClickListener(new g0(this, 29));
                }
                floatingBottomTabView2.setOnLongClickListener(new xe(floatingBottomTabView2, this, 5));
                i22++;
                i2 = 0;
            }
            if (str2 != null) {
                List list = items;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(((Item) it8.next()).f58588a, str2)) {
                        w(this, str2, false, false, 4);
                        return;
                    }
                }
            }
        }
    }

    public final FloatingBottomTabView.DisplayedItemModel y(Item item) {
        if (item == null) {
            FloatingBottomTabView.DisplayedItemModel.Companion aVar = FloatingBottomTabView.DisplayedItemModel.INSTANCE;
            y variant = getTabLayoutVariant();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(variant, "variant");
            return new FloatingBottomTabView.DisplayedItemModel("EXPAND_ACTION_ID", new TextLocalisedClause(R$string.uikit_actions_more, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_vertical_expand, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, variant, false, com.revolut.core.ui_kit.internal.views.floatingbottombar.k.EXPAND, null);
        }
        com.revolut.core.ui_kit.internal.views.floatingbottombar.k kVar = com.revolut.core.ui_kit.internal.views.floatingbottombar.k.CONTENT_AND_EXPAND;
        return new FloatingBottomTabView.DisplayedItemModel(item.f58588a, item.f58589b, item.f58590c, getWithLabels(), getTabLayoutVariant(), false, kVar, item.e);
    }

    public final void z(a ownership, boolean z) {
        Intrinsics.checkNotNullParameter(ownership, "ownership");
        a aVar = this.e;
        if (Intrinsics.f(aVar, ownership)) {
            return;
        }
        if (aVar == null) {
            t(ownership);
            return;
        }
        ArrayDeque arrayDeque = this.f;
        if (z) {
            arrayDeque.addFirst(aVar);
            t(ownership);
        } else {
            if (arrayDeque.contains(ownership)) {
                return;
            }
            arrayDeque.addLast(ownership);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FloatingBottomBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FloatingBottomBarView(@org.jetbrains.annotations.NotNull android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instruction units count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.FloatingBottomBarView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ FloatingBottomBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

package com.revolut.core.ui_kit.views.reactionskeyboard;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import au0.j4;
import au0.r5;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.NoSwipeableViewPager;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardBottomBarView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardSearchView;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.ReactionsKeyboardTabs;
import com.revolut.core.ui_kit.internal.views.reactionskeyboard.c;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FixedTabs;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature_reactions_keyboard.R$string;
import e8.q;
import efm.d0;
import fu0.a;
import ihm.f;
import ix0.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.z;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import od0.i;
import onh.b;
import org.jetbrains.annotations.NotNull;
import r83.d;
import r9i.e;
import rv0.g;
import te0.w;
import ts0.t;
import ua2.r;
import ufm.n;
import zc0.x2;
import zhm.f0;
import zhm.h0;
import zhm.u;
import zhm.v;
import zp0.a0;
import zul.l0;
import zx0.b0;
import zx0.c0;
import zx0.h;
import zx0.j;
import zx0.k;
import zx0.l;
import zx0.p;
import zx0.s;
import zx0.x;
import zx0.y;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0007\u0018\u0000 \u0099\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\f\u0012\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001.B\u001d\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u0010J\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010\u000eJ\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,R\u001b\u00102\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010/\u001a\u0004\b5\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010/\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010/\u001a\u0004\bD\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bH\u0010/\u001a\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010/\u001a\u0004\bN\u0010OR\u001b\u0010S\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010/\u001a\u0004\bR\u0010OR\u001b\u0010V\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010/\u001a\u0004\bU\u0010OR$\u0010^\u001a\u0004\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R/\u0010g\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR/\u0010k\u001a\u0004\u0018\u00010_2\b\u0010`\u001a\u0004\u0018\u00010_8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bh\u0010b\u001a\u0004\bi\u0010d\"\u0004\bj\u0010fR\u001b\u0010o\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010\u0010R\u001b\u0010r\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010m\u001a\u0004\bq\u0010\u0010R\u001b\u0010u\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010m\u001a\u0004\bt\u0010\u0010R\u001b\u0010z\u001a\u00020v8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bw\u0010m\u001a\u0004\bx\u0010yR\u001b\u0010}\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010m\u001a\u0004\b|\u0010\u0010R\u001e\u0010\u0082\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b\u007f\u0010m\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0012\u0010#\u001a\u00020\u00128F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010\u0014R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u0010\u0089\u0001\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u0010R\u0016\u0010\u008b\u0001\u001a\u00020*8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u0010,R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R)\u0010\u0098\u0001\u001a\u0014\u0012\u0007\u0012\u0005\u0018\u00010\u0095\u0001\u0012\u0006\u0012\u0004\u0018\u00010_0\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/revolut/core/ui_kit/views/reactionskeyboard/ReactionsKeyboardView;", "Landroid/widget/FrameLayout;", "Lix0/v0;", "Lrv0/g;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "height", "", "setSemiOpenedKeyboardHeightPx", "(I)V", "getSemiOpenedKeyboardHeightPx", "()I", "getSemiOpenedKeyboardHeightWithoutInsetsPx", "Lzx0/j;", "getBackState", "()Lzx0/j;", "Lcom/revolut/core/ui_kit/models/Clause;", "title", "setTitle", "(Lcom/revolut/core/ui_kit/models/Clause;)V", "setEmptySearchTitle", "setSearchHint", "message", "action", "setErrorMessage", "(Lcom/revolut/core/ui_kit/models/Clause;Lcom/revolut/core/ui_kit/models/Clause;)V", "", "typeId", "setType", "(Ljava/lang/String;)V", "state", "setState", "(Lzx0/j;)V", "setStateInternal", "getParentHeightPx", "inset", "setBottomSystemBarInset", "", "getHeaderSizeDp", "()F", "Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/NoSwipeableViewPager;", "a", "Le8/q;", "getViewPager", "()Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/NoSwipeableViewPager;", "viewPager", "Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardTabs;", "b", "getCategoriesTabs", "()Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardTabs;", "categoriesTabs", "Lcom/revolut/core/ui_kit/views/FixedTabs;", "c", "getTypesTabs", "()Lcom/revolut/core/ui_kit/views/FixedTabs;", "typesTabs", "Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardBottomBarView;", "d", "getBottomBar", "()Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardBottomBarView;", "bottomBar", "Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardSearchView;", "e", "getSearchView", "()Lcom/revolut/core/ui_kit/internal/views/reactionskeyboard/ReactionsKeyboardSearchView;", "searchView", "Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", "f", "getNavBar", "()Lcom/revolut/core/ui_kit/views/navbar/NavBarWithToolbar;", "navBar", "Landroid/view/ViewGroup;", "g", "getTabsAndListContainer", "()Landroid/view/ViewGroup;", "tabsAndListContainer", "h", "getContentContainer", "contentContainer", "i", "getHeader", "header", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "l", "Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "getAnalyticsProduct", "()Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;", "setAnalyticsProduct", "(Lcom/revolut/analytics/tracking/v3/AnalyticsProduct;)V", "analyticsProduct", "Lifm/c;", "<set-?>", "w", "Lkotlin/properties/ReadWriteProperty;", "getCategoriesDisposable", "()Lifm/c;", "setCategoriesDisposable", "(Lifm/c;)V", "categoriesDisposable", "x", "getTypesDisposable", "setTypesDisposable", "typesDisposable", "y", "Lkotlin/Lazy;", "getEmojiTabsHeightPx", "emojiTabsHeightPx", "z", "getBottomBarHeightPx", "bottomBarHeightPx", "A", "getMarginTopExpandedStatePx", "marginTopExpandedStatePx", "Landroid/view/animation/AccelerateDecelerateInterpolator;", "B", "getInterpolator", "()Landroid/view/animation/AccelerateDecelerateInterpolator;", "interpolator", "C", "getDefaultSemiOpenedKeyboardHeightPx", "defaultSemiOpenedKeyboardHeightPx", "Llu0/i;", "F", "getCategorySelectionHelper", "()Llu0/i;", "categorySelectionHelper", "getState", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "getImeInsetPx", "imeInsetPx", "getBottomBarHiddenTranslationPx", "bottomBarHiddenTranslationPx", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "activity", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "window", "Lkotlin/properties/ReadWriteProperty;", "", "getDisposableDelegate", "()Lkotlin/properties/ReadWriteProperty;", "disposableDelegate", "Companion", "zx0/l", "zx0/k", "zx0/i", "zx0/o", "InternalState", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ReactionsKeyboardView extends FrameLayout implements v0, g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final /* synthetic */ KProperty[] O;
    public final Object A;
    public final Object B;
    public final Object C;
    public Integer D;
    public int E;
    public final Object F;
    public final a G;
    public final int H;
    public final int I;
    public boolean J;
    public boolean K;
    public final b0 L;
    public final c M;
    public b N;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q viewPager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q categoriesTabs;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final q typesTabs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final q bottomBar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final q searchView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final q navBar;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final q tabsAndListContainer;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final q contentContainer;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final q header;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InternalState f59625j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public AnalyticsProduct analyticsProduct;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e f59627m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Pair f59628n;
    public final ihm.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ihm.b f59629p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Object f59630q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f59631r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f59632s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f59633t;
    public final ihm.b u;
    public final ifm.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final ReadWriteProperty categoriesDisposable;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final ReadWriteProperty typesDisposable;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f59636y;
    public final Object z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0083\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit/views/reactionskeyboard/ReactionsKeyboardView$InternalState;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InternalState implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InternalState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j f59637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f59638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final j f59639c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InternalState(parcel.readInt() == 0 ? null : j.valueOf(parcel.readString()), parcel.readInt() != 0 ? j.valueOf(parcel.readString()) : null, j.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InternalState[i];
            }
        }

        public InternalState(j jVar, j jVar2, j current) {
            Intrinsics.checkNotNullParameter(current, "current");
            this.f59637a = jVar;
            this.f59638b = jVar2;
            this.f59639c = current;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InternalState)) {
                return false;
            }
            InternalState internalState = (InternalState) obj2;
            return this.f59637a == internalState.f59637a && this.f59638b == internalState.f59638b && this.f59639c == internalState.f59639c;
        }

        public final int hashCode() {
            j jVar = this.f59637a;
            int iHashCode = (jVar == null ? 0 : jVar.hashCode()) * 31;
            j jVar2 = this.f59638b;
            return this.f59639c.hashCode() + ((iHashCode + (jVar2 != null ? jVar2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            j jVar = this.f59637a;
            if (jVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(jVar.name());
            }
            j jVar2 = this.f59638b;
            if (jVar2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(jVar2.name());
            }
            dest.writeString(this.f59639c.name());
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    static {
        z zVar = new z(ReactionsKeyboardView.class, "categoriesDisposable", "getCategoriesDisposable()Lio/reactivex/disposables/Disposable;", 0);
        p0 p0Var = o0.f186429a;
        O = new KProperty[]{p0Var.f(zVar), v0.a.s(ReactionsKeyboardView.class, "typesDisposable", "getTypesDisposable()Lio/reactivex/disposables/Disposable;", 0, p0Var)};
        INSTANCE = new Companion();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.viewPager = kli.a.J(R$id.ReactionsKeyboardView_viewPager, this);
        this.categoriesTabs = kli.a.J(R$id.ReactionsKeyboardView_categoriesTabs, this);
        this.typesTabs = kli.a.J(R$id.ReactionsKeyboardView_typesTabs, this);
        this.bottomBar = kli.a.J(R$id.ReactionsKeyboardView_bottomBar, this);
        this.searchView = kli.a.J(R$id.ReactionsKeyboardView_searchView, this);
        this.navBar = kli.a.J(R$id.ReactionsKeyboardView_navBar, this);
        this.tabsAndListContainer = kli.a.J(R$id.ReactionsKeyboardView_tabsAndListContainer, this);
        this.contentContainer = kli.a.J(R$id.ReactionsKeyboardView_contentContainer, this);
        this.header = kli.a.J(R$id.ReactionsKeyboardView_header, this);
        this.k = true;
        this.o = j6.a.h("create(...)");
        i.Companion.getClass();
        ihm.b bVarE = ihm.b.e(i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f59629p = bVarE;
        f0 f0Var = f0.f322471a;
        this.f59630q = f0Var;
        this.f59631r = f0Var;
        this.f59633t = v0.a.d("create(...)");
        this.u = j6.a.h("create(...)");
        this.v = new ifm.b();
        this.categoriesDisposable = getDisposableDelegate();
        this.typesDisposable = getDisposableDelegate();
        this.f59636y = w.y0(new t(context, 6));
        this.z = w.y0(new t(context, 7));
        this.A = w.y0(new t(context, 8));
        this.B = w.y0(new h(0));
        this.C = w.y0(new t(context, 9));
        this.F = w.y0(new h(1));
        this.G = new a(5, this, false);
        this.H = getWindow().getStatusBarColor();
        this.I = getWindow().getNavigationBarColor();
        this.L = new b0(this);
        c0 c0Var = new c0(this);
        FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        c cVar = new c(supportFragmentManager);
        this.M = cVar;
        View.inflate(context, R$layout.internal_reactions_keyboard_view, this);
        getViewPager().setAdapter(cVar);
        getViewPager().addOnPageChangeListener(c0Var);
        setOnTouchListener(new gzl.b(this, 12));
        setBackgroundColor(kli.a.s(R$attr.uikit_colorBlack_70, context));
        getBackground().setAlpha(0);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setStateInternal(j.HIDDEN);
        getBottomBar().setStartItem(Integer.valueOf(R$drawable.uikit_icn_24_search));
        getSearchView().setVisibility(8);
        ViewGroup header = getHeader();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        header.setBackgroundColor(kli.a.s(R$attr.uikit_colorGroupedBackground, context2));
        NavBarWithToolbar navBar = getNavBar();
        navBar.setMenuItems(u.c(IconNavBarMenuItem.Companion.a(IconNavBarMenuItem.INSTANCE, "MENU_ITEM_WITH_SEARCH_ID", new ResourceImage(R$drawable.uikit_icn_24_search, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), null, null, null, 124)));
        navBar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_16_chevron_down_small));
    }

    public static void E(ReactionsKeyboardView reactionsKeyboardView, e viewModel, ArrayList arrayList) {
        reactionsKeyboardView.getClass();
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        reactionsKeyboardView.f59632s = null;
        f0 f0Var = f0.f322471a;
        reactionsKeyboardView.f59630q = f0Var;
        c cVar = reactionsKeyboardView.M;
        cVar.f = null;
        cVar.notifyDataSetChanged();
        ReactionsKeyboardBottomBarView.setSelectableItems$default(reactionsKeyboardView.getBottomBar(), f0Var, null, 2, null);
        ReactionsKeyboardTabs.setItems$default(reactionsKeyboardView.getCategoriesTabs(), f0Var, null, 2, null);
        reactionsKeyboardView.f59627m = viewModel;
        ufm.b bVarM = d0.m(v.k(new i9i.f("type_gif", R$drawable.uikit_icn_20_keyboard_gif, R$string.reactions_keyboard_types_gif), new i9i.f("type_sticker", R$drawable.uikit_icn_20_keyboard_sticker, R$string.reactions_keyboard_types_sticker)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        ufm.i iVar = new ufm.i(bVarM, new d(13, new qi3.i(1, viewModel.f252733b, r9i.a.class, "mapTypes", "mapTypes(Ljava/util/List;)Ljava/util/List;", 0, 21)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(iVar, new zx0.b(new r(22, arrayList), 7), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        pfm.z zVarI = ue0.e.I(iVar2, h0.f322473a, new l0(6));
        efm.c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        n nVarN = zVarI.n(c0Var);
        Intrinsics.checkNotNullExpressionValue(nVarN, "observeOn(...)");
        zx0.a aVar = new zx0.a(reactionsKeyboardView, 11);
        ufm.i iVar3 = new ufm.i(nVarN, new xz7.f(5, new x2(new BreadcrumbException(), 5)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar3, "onErrorResumeNext(...)");
        ofm.i iVar4 = new ofm.i(new a0(1, aVar), new a0(1, zx0.r.f326011a), 0);
        iVar3.q(iVar4);
        Intrinsics.checkNotNullExpressionValue(iVar4, "subscribe(...)");
        reactionsKeyboardView.setTypesDisposable(iVar4);
        efm.r rVarDistinctUntilChanged = reactionsKeyboardView.f59629p.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        efm.r rVarObserveOn = w.a0(rVarDistinctUntilChanged, new l0(5)).switchMapSingle(new zx0.b(new zx0.g(viewModel, reactionsKeyboardView), 6)).observeOn(c0Var);
        Intrinsics.checkNotNullExpressionValue(rVarObserveOn, "observeOn(...)");
        zx0.g gVar = new zx0.g(reactionsKeyboardView, viewModel);
        efm.r rVarOnErrorResumeNext = rVarObserveOn.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0(1, gVar), new a0(1, zx0.q.f326010a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        reactionsKeyboardView.setCategoriesDisposable(cVarSubscribe);
    }

    public static void H(NavBarWithToolbar navBarWithToolbar) {
        Object systemService = navBarWithToolbar.getContext().getSystemService("input_method");
        Intrinsics.i(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(navBarWithToolbar.getWindowToken(), 0);
    }

    public static Unit a(ReactionsKeyboardView reactionsKeyboardView, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        InternalState internalState = reactionsKeyboardView.f59625j;
        if (internalState == null) {
            Intrinsics.r("internalState");
            throw null;
        }
        j jVar = internalState.f59638b;
        if (jVar != null) {
            reactionsKeyboardView.setStateInternal(jVar);
        }
        return Unit.f186387a;
    }

    public static Unit b(ReactionsKeyboardView reactionsKeyboardView, List list) {
        Intrinsics.h(list);
        List<l> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((l) it8.next()).f326003a);
        }
        reactionsKeyboardView.f59631r = arrayList;
        l lVar = (l) zhm.d0.d0(list);
        AnalyticsContext analyticsContext = null;
        String str = lVar != null ? lVar.f326003a : null;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (l lVar2 : list2) {
            arrayList2.add(new lu0.b(lVar2.f326003a, lVar2.f326004b));
        }
        reactionsKeyboardView.getBottomBar().setSelectableItems(arrayList2, str);
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list2, 10));
        for (l lVar3 : list2) {
            arrayList3.add(new FixedTabs.Item(lVar3.f326003a, new TextLocalisedClause(lVar3.f326005c, null, null, 14), analyticsContext, 12));
        }
        reactionsKeyboardView.getTypesTabs().setItems(arrayList3, str);
        reactionsKeyboardView.getTypesTabs().setVisibility(arrayList.size() > 1 ? 0 : 8);
        reactionsKeyboardView.F(str);
        return Unit.f186387a;
    }

    public static Unit c(ReactionsKeyboardView reactionsKeyboardView) {
        ViewGroup tabsAndListContainer = reactionsKeyboardView.getTabsAndListContainer();
        ViewGroup.LayoutParams layoutParams = reactionsKeyboardView.getTabsAndListContainer().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = -1;
        tabsAndListContainer.setLayoutParams(layoutParams);
        return Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static yhm.r d(com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView r5, java.lang.String r6, java.util.List r7) {
        /*
            java.lang.String r0 = "categories"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            lu0.i r1 = r5.getCategorySelectionHelper()
            java.lang.String r5 = r5.f59632s
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = 0
            r1 = 0
            if (r5 == 0) goto L4b
            java.util.Iterator r2 = r7.iterator()
            r3 = r0
        L1a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r2.next()
            zx0.k r4 = (zx0.k) r4
            java.lang.String r4 = r4.f326001a
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L2f
            goto L33
        L2f:
            int r3 = r3 + 1
            goto L1a
        L32:
            r3 = -1
        L33:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            if (r3 < 0) goto L3a
            goto L3b
        L3a:
            r2 = r1
        L3b:
            if (r2 == 0) goto L4b
            int r2 = r2.intValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r5, r2)
            goto L4c
        L4b:
            r3 = r1
        L4c:
            if (r3 != 0) goto L62
            java.lang.Object r5 = zhm.d0.d0(r7)
            zx0.k r5 = (zx0.k) r5
            if (r5 == 0) goto L61
            java.lang.String r5 = r5.f326001a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r5, r0)
        L61:
            r3 = r1
        L62:
            yhm.r r5 = new yhm.r
            r5.<init>(r6, r3, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView.d(com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView, java.lang.String, java.util.List):yhm.r");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    public static Unit e(ReactionsKeyboardView reactionsKeyboardView, e viewModel, yhm.r rVar) {
        Object obj2 = rVar.f314201a;
        Intrinsics.checkNotNullExpressionValue(obj2, "component1(...)");
        String typeId = (String) obj2;
        Pair pair = (Pair) rVar.f314202b;
        Object obj3 = rVar.f314203c;
        Intrinsics.checkNotNullExpressionValue(obj3, "component3(...)");
        List list = (List) obj3;
        if (pair == null) {
            pair = new Pair(null, 0);
        }
        String str = (String) pair.f186385a;
        int iIntValue = ((Number) pair.f186386b).intValue();
        reactionsKeyboardView.f59632s = str;
        List<k> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((k) it8.next()).f326001a);
        }
        reactionsKeyboardView.f59630q = arrayList;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        for (k kVar : list2) {
            arrayList2.add(new com.revolut.core.ui_kit.internal.views.reactionskeyboard.a(kVar.f326001a, new com.revolut.core.ui_kit.internal.views.reactionskeyboard.b(kVar.f326002b)));
        }
        reactionsKeyboardView.getCategoriesTabs().setItems(arrayList2, str);
        reactionsKeyboardView.getViewPager().setCurrentItem(iIntValue, false);
        Pair pair2 = reactionsKeyboardView.f59628n;
        if (pair2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Clause errorMessage = (Clause) pair2.f186385a;
        Clause errorAction = (Clause) pair2.f186386b;
        c cVar = reactionsKeyboardView.M;
        ?? categoryIds = reactionsKeyboardView.f59630q;
        b0 recyclerScrollListener = reactionsKeyboardView.L;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(recyclerScrollListener, "recyclerScrollListener");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(errorAction, "errorAction");
        cVar.f = new lu0.t(typeId, categoryIds, viewModel, recyclerScrollListener, errorMessage, errorAction);
        cVar.notifyDataSetChanged();
        return Unit.f186387a;
    }

    public static Unit f(ReactionsKeyboardView reactionsKeyboardView, Pair pair) {
        reactionsKeyboardView.getSearchView().setVisibility(((String) pair.f186385a).length() > 0 ? 0 : 8);
        return Unit.f186387a;
    }

    public static void g(ReactionsKeyboardView reactionsKeyboardView, int i, ValueAnimator valueAnimator) {
        reactionsKeyboardView.getWindow().setStatusBarColor(ColorUtils.blendARGB(reactionsKeyboardView.H, i, ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue()));
    }

    private final FragmentActivity getActivity() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        while (context instanceof ContextWrapper) {
            if (context instanceof FragmentActivity) {
                return (FragmentActivity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkNotNullExpressionValue(context, "getBaseContext(...)");
        }
        throw new IllegalStateException("activity is null");
    }

    private final ReactionsKeyboardBottomBarView getBottomBar() {
        return (ReactionsKeyboardBottomBarView) this.bottomBar.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getBottomBarHeightPx() {
        return ((Number) this.z.getValue()).intValue();
    }

    private final float getBottomBarHiddenTranslationPx() {
        return getBottomBarHeightPx() + this.E;
    }

    private final ifm.c getCategoriesDisposable() {
        return (ifm.c) this.categoriesDisposable.getValue(this, O[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReactionsKeyboardTabs getCategoriesTabs() {
        return (ReactionsKeyboardTabs) this.categoriesTabs.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final lu0.i getCategorySelectionHelper() {
        return (lu0.i) this.F.getValue();
    }

    private final ViewGroup getContentContainer() {
        return (ViewGroup) this.contentContainer.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDefaultSemiOpenedKeyboardHeightPx() {
        return ((Number) this.C.getValue()).intValue();
    }

    private final ReadWriteProperty getDisposableDelegate() {
        return new lu0.h(null, 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getEmojiTabsHeightPx() {
        return ((Number) this.f59636y.getValue()).intValue();
    }

    private final ViewGroup getHeader() {
        return (ViewGroup) this.header.f();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    private final float getHeaderSizeDp() {
        return this.f59631r.size() > 1 ? 92.0f : 56.0f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final AccelerateDecelerateInterpolator getInterpolator() {
        return (AccelerateDecelerateInterpolator) this.B.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getMarginTopExpandedStatePx() {
        return ((Number) this.A.getValue()).intValue();
    }

    private final NavBarWithToolbar getNavBar() {
        return (NavBarWithToolbar) this.navBar.f();
    }

    private final int getParentHeightPx() {
        ViewParent parent = getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        return ((ViewGroup) parent).getHeight();
    }

    private final ReactionsKeyboardSearchView getSearchView() {
        return (ReactionsKeyboardSearchView) this.searchView.f();
    }

    private final ViewGroup getTabsAndListContainer() {
        return (ViewGroup) this.tabsAndListContainer.f();
    }

    private final ifm.c getTypesDisposable() {
        return (ifm.c) this.typesDisposable.getValue(this, O[1]);
    }

    private final FixedTabs getTypesTabs() {
        return (FixedTabs) this.typesTabs.f();
    }

    private final NoSwipeableViewPager getViewPager() {
        return (NoSwipeableViewPager) this.viewPager.f();
    }

    private final Window getWindow() {
        Window window = getActivity().getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        return window;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public static Unit h(ReactionsKeyboardView reactionsKeyboardView, String categoryId) {
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Iterator it8 = reactionsKeyboardView.f59630q.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.f((String) it8.next(), categoryId)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            reactionsKeyboardView.getViewPager().setCurrentItem(numValueOf.intValue());
        } else {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "ReactionsKeyboardView", j6.a.q("Can't find item by categoryId = ", categoryId), null, h0Var);
        }
        return Unit.f186387a;
    }

    public static void i(ReactionsKeyboardView reactionsKeyboardView, int i, int i2, ValueAnimator valueAnimator) {
        reactionsKeyboardView.getWindow().setNavigationBarColor(ColorUtils.blendARGB(i, i2, ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue()));
    }

    public static Unit j(ReactionsKeyboardView reactionsKeyboardView, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        reactionsKeyboardView.setStateInternal(j.EXPANDED);
        return Unit.f186387a;
    }

    public static Unit k(ReactionsKeyboardView reactionsKeyboardView, String str) {
        Intrinsics.h(str);
        if (str.length() == 0) {
            reactionsKeyboardView.getSearchView().setVisibility(8);
        }
        return Unit.f186387a;
    }

    public static Unit l(ReactionsKeyboardView reactionsKeyboardView) {
        reactionsKeyboardView.getNavBar().E0();
        View currentFocus = reactionsKeyboardView.getActivity().getCurrentFocus();
        if (currentFocus != null) {
            kli.c.d(currentFocus, 0L);
        }
        return Unit.f186387a;
    }

    public static void m(ReactionsKeyboardView reactionsKeyboardView, int i, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) z9h.n.g(valueAnimator, "anim", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        reactionsKeyboardView.getWindow().setStatusBarColor(ColorUtils.blendARGB(reactionsKeyboardView.H, i, fFloatValue));
        reactionsKeyboardView.getWindow().setNavigationBarColor(ColorUtils.blendARGB(reactionsKeyboardView.I, i, fFloatValue));
    }

    public static Unit n(ReactionsKeyboardView reactionsKeyboardView) {
        reactionsKeyboardView.setStateInternal(j.EXPANDED_SEARCH);
        return Unit.f186387a;
    }

    public static Unit o(ReactionsKeyboardView reactionsKeyboardView, String typeId) {
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        reactionsKeyboardView.F(typeId);
        reactionsKeyboardView.getBottomBar().d(typeId);
        return Unit.f186387a;
    }

    public static Unit p(ReactionsKeyboardView reactionsKeyboardView, String typeId) {
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        reactionsKeyboardView.F(typeId);
        reactionsKeyboardView.getTypesTabs().i0(typeId);
        return Unit.f186387a;
    }

    public static Unit q(ReactionsKeyboardView reactionsKeyboardView, boolean z) {
        reactionsKeyboardView.getHeader().animate().setListener(null);
        ViewGroup.LayoutParams layoutParams = reactionsKeyboardView.getLayoutParams();
        layoutParams.height = -2;
        reactionsKeyboardView.setLayoutParams(layoutParams);
        ViewGroup contentContainer = reactionsKeyboardView.getContentContainer();
        ViewGroup.LayoutParams layoutParams2 = reactionsKeyboardView.getContentContainer().getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.height = -1;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        contentContainer.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams3 = reactionsKeyboardView.getHeader().getLayoutParams();
        Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).setMargins(0, 0, 0, 0);
        reactionsKeyboardView.getContentContainer().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        reactionsKeyboardView.getHeader().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        reactionsKeyboardView.setVisibility(z ? 8 : 0);
        H(reactionsKeyboardView.getNavBar());
        return Unit.f186387a;
    }

    public static Unit r(ReactionsKeyboardView reactionsKeyboardView) {
        if (reactionsKeyboardView.getState().a()) {
            InternalState internalState = reactionsKeyboardView.f59625j;
            if (internalState == null) {
                Intrinsics.r("internalState");
                throw null;
            }
            j jVar = internalState.f59638b;
            if (jVar != null) {
                reactionsKeyboardView.setStateInternal(jVar);
            }
        }
        return Unit.f186387a;
    }

    public static boolean s(ReactionsKeyboardView reactionsKeyboardView) {
        if (!reactionsKeyboardView.getState().a()) {
            reactionsKeyboardView.performClick();
            return false;
        }
        InternalState internalState = reactionsKeyboardView.f59625j;
        if (internalState == null) {
            Intrinsics.r("internalState");
            throw null;
        }
        j jVar = internalState.f59638b;
        if (jVar == null) {
            return true;
        }
        reactionsKeyboardView.setStateInternal(jVar);
        return true;
    }

    private final void setBottomSystemBarInset(int inset) {
        if (this.E == inset) {
            return;
        }
        boolean z = getBottomBar().getTranslationY() > BitmapDescriptorFactory.HUE_RED;
        this.E = inset;
        if (getBottomBar().getPaddingBottom() != inset) {
            ReactionsKeyboardBottomBarView bottomBar = getBottomBar();
            bottomBar.setPaddingRelative(bottomBar.getPaddingStart(), bottomBar.getPaddingTop(), bottomBar.getPaddingEnd(), inset);
        }
        if (z) {
            getBottomBar().setTranslationY(getBottomBarHiddenTranslationPx());
        }
    }

    private final void setCategoriesDisposable(ifm.c cVar) {
        this.categoriesDisposable.setValue(this, O[0], cVar);
    }

    private final void setStateInternal(j state) {
        InternalState internalState = this.f59625j;
        if (internalState == null) {
            internalState = null;
        }
        j jVar = internalState != null ? internalState.f59639c : null;
        j jVar2 = internalState != null ? internalState.f59638b : null;
        j jVar3 = j.HIDDEN;
        if (state == jVar3) {
            jVar2 = null;
        } else if (state == j.SEMI_OPEN) {
            jVar2 = jVar3;
        } else if (!state.a() || jVar == null || !jVar.a()) {
            jVar2 = jVar;
        }
        this.f59625j = new InternalState(jVar, jVar2, state);
        int i = p.f326009a[state.ordinal()];
        if (i == 1) {
            z(jVar);
        } else if (i == 2) {
            B(jVar);
        } else if (i == 3) {
            y(jVar);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            int parentHeightPx = getParentHeightPx();
            if (jVar == jVar3) {
                throw new IllegalStateException("You can't move to EXPANDED_SEARCH from HIDDEN state");
            }
            if (parentHeightPx <= 0) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "ReactionsKeyboardView", "parentHeight <= 0, state will not be applied", null, h0Var);
            } else if (jVar == j.SEMI_OPEN) {
                L(false);
                N(parentHeightPx, 300L);
                P(true, true);
                O(false, true);
                getViewPager().setSwipesEnabled(false);
                e eVar = this.f59627m;
                if (eVar != null) {
                    J(eVar);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "ReactionsKeyboardView", "viewModel is null, binding will not be performed", null, null, 16);
                }
            } else if (jVar == j.EXPANDED) {
                N(parentHeightPx, 150L);
                getViewPager().setSwipesEnabled(false);
                e eVar2 = this.f59627m;
                if (eVar2 != null) {
                    J(eVar2);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "ReactionsKeyboardView", "viewModel is null, binding will not be performed", null, null, 16);
                }
            } else {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iK = kli.a.k(context, 44.0f);
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK2 = ((parentHeightPx - kli.a.k(context2, getHeaderSizeDp())) - getMarginTopExpandedStatePx()) + iK;
                ViewGroup tabsAndListContainer = getTabsAndListContainer();
                ViewGroup.LayoutParams layoutParams = getTabsAndListContainer().getLayoutParams();
                Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                layoutParams.height = iK2;
                tabsAndListContainer.setLayoutParams(layoutParams);
                getTabsAndListContainer().setTranslationY(-iK);
                getCategoriesTabs().setAlpha(BitmapDescriptorFactory.HUE_RED);
                getNavBar().K0(j4.NO_ANIMATION);
                getNavBar().E0();
                View currentFocus = getActivity().getCurrentFocus();
                if (currentFocus != null) {
                    kli.c.d(currentFocus, 0L);
                }
                getViewPager().setSwipesEnabled(false);
                e eVar3 = this.f59627m;
                if (eVar3 != null) {
                    J(eVar3);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.b(rd0.c.WARNING, "ReactionsKeyboardView", "viewModel is null, binding will not be performed", null, null, 16);
                }
            }
        }
        this.G.setEnabled(state != jVar3);
        this.o.onNext(state);
    }

    private final void setTypesDisposable(ifm.c cVar) {
        this.typesDisposable.setValue(this, O[1], cVar);
    }

    public static Unit t(ReactionsKeyboardView reactionsKeyboardView, Unit it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        reactionsKeyboardView.setStateInternal(j.EXPANDED_SEARCH);
        return Unit.f186387a;
    }

    public static final boolean v(ReactionsKeyboardView reactionsKeyboardView, int i) {
        ReactionsKeyboardTabs categoriesTabs = reactionsKeyboardView.getCategoriesTabs();
        return i < categoriesTabs.getHeight() || ((double) categoriesTabs.getTranslationY()) > ((double) (-categoriesTabs.getHeight())) * 0.7d;
    }

    public static final void w(ReactionsKeyboardView reactionsKeyboardView, int i) {
        if (reactionsKeyboardView.K) {
            return;
        }
        ReactionsKeyboardBottomBarView bottomBar = reactionsKeyboardView.getBottomBar();
        bottomBar.setTranslationY(i > 0 ? Math.min(bottomBar.getTranslationY() + i, reactionsKeyboardView.getBottomBarHiddenTranslationPx()) : Math.max(bottomBar.getTranslationY() + i, BitmapDescriptorFactory.HUE_RED));
    }

    public static final void x(ReactionsKeyboardView reactionsKeyboardView, int i) {
        if (reactionsKeyboardView.J) {
            return;
        }
        ReactionsKeyboardTabs categoriesTabs = reactionsKeyboardView.getCategoriesTabs();
        categoriesTabs.setTranslationY(i > 0 ? Math.max(categoriesTabs.getTranslationY() - i, -reactionsKeyboardView.getEmojiTabsHeightPx()) : Math.min(categoriesTabs.getTranslationY() - i, BitmapDescriptorFactory.HUE_RED));
    }

    public final void A() {
        K(true);
        M(300L);
        P(true, false);
        O(false, false);
        getViewPager().setSwipesEnabled(true);
        getSearchView().setVisibility(8);
        getSearchView().c();
        this.u.onNext("");
    }

    public final void B(j jVar) {
        int i = jVar == null ? -1 : p.f326009a[jVar.ordinal()];
        if (i == 1) {
            setVisibility(0);
            D();
            P(true, false);
            O(true, false);
        } else if (i == 3) {
            K(false);
            P(true, true);
            O(true, true);
        } else if (i != 4) {
            setVisibility(0);
            D();
            P(true, false);
            O(true, false);
        } else if ((getWindow().getAttributes().softInputMode & 16) == 16) {
            H(getNavBar());
            postDelayed(new zx0.f(this, 1), 200L);
        } else {
            C();
        }
        requestFocus();
    }

    public final void C() {
        K(false);
        M(300L);
        P(true, true);
        O(true, true);
        getViewPager().setSwipesEnabled(true);
        getSearchView().setVisibility(8);
        getSearchView().c();
        this.u.onNext("");
    }

    public final void D() {
        if (getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            setLayoutParams(layoutParams);
        }
        ViewGroup contentContainer = getContentContainer();
        ViewGroup.LayoutParams layoutParams2 = getContentContainer().getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.height = -1;
        marginLayoutParams.setMargins(0, 0, 0, 0);
        contentContainer.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams3 = getHeader().getLayoutParams();
        Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).setMargins(0, 0, 0, 0);
        getContentContainer().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        getHeader().setTranslationY(BitmapDescriptorFactory.HUE_RED);
        getBackground().setAlpha(0);
        getWindow().setStatusBarColor(this.H);
        getWindow().setNavigationBarColor(0);
    }

    public final void F(String str) {
        i iVarA;
        if (str == null || str.length() <= 0) {
            i.Companion.getClass();
            iVarA = i.f224256b;
        } else {
            i.Companion.getClass();
            iVarA = od0.h.a(str);
        }
        this.f59629p.onNext(iVarA);
    }

    public final void G() {
        b bVar = this.N;
        if (bVar != null) {
            sv0.c.g((sv0.c) bVar.f226950b, false, 3);
        } else {
            setState(j.HIDDEN);
        }
    }

    public final efm.r I() {
        efm.r map = this.M.f57506b.mergeWith(this.f59633t).map(new zx0.b(new zx0.a(this, 10), 5));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void J(e eVar) {
        efm.c0 c0Var = hfm.c.f152030a;
        m70.a.p(c0Var);
        efm.r rVarDoOnNext = this.u.observeOn(c0Var).doOnNext(new zx0.b(new zx0.a(this, 8), 1));
        ihm.b retrySubject = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(retrySubject, "createDefault(...)");
        efm.r searchObservable = w.v(this.f59629p, retrySubject, new zs4.d(12)).filter(new zx0.b(new l0(4), 2)).switchMap(new zx0.b(new zp5.f(eVar, rVarDoOnNext, 19), 3)).observeOn(c0Var).doOnNext(new zx0.b(new zx0.a(this, 9), 4));
        ReactionsKeyboardSearchView searchView = getSearchView();
        Intrinsics.h(searchObservable);
        searchView.getClass();
        Intrinsics.checkNotNullParameter(searchObservable, "searchObservable");
        f itemClickSubject = this.f59633t;
        Intrinsics.checkNotNullParameter(itemClickSubject, "itemClickSubject");
        Intrinsics.checkNotNullParameter(retrySubject, "retrySubject");
        searchView.f57496m = new lu0.l(searchObservable, itemClickSubject, retrySubject);
        if (searchView.isAttachedToWindow()) {
            searchView.b(searchObservable);
        }
    }

    public final void K(boolean z) {
        yt0.q qVar = new yt0.q(2, new f1.f(this, z, 7));
        setVisibility(0);
        float height = z ? getContentContainer().getHeight() : getContentContainer().getHeight() - getSemiOpenedKeyboardHeightPx();
        getContentContainer().animate().translationY(height).setInterpolator(getInterpolator()).setDuration(300L).withLayer().start();
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        getHeader().animate().translationY(height + kli.a.k(r4, getHeaderSizeDp())).setInterpolator(getInterpolator()).setDuration(300L).withLayer().setListener(qVar).start();
        ValueAnimator duration = ValueAnimator.ofInt(255, 0).setDuration(300L);
        duration.addUpdateListener(new zx0.d(this, 1));
        duration.start();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorBlack, context);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.7f, BitmapDescriptorFactory.HUE_RED);
        valueAnimatorOfFloat.addUpdateListener(new zx0.e(this, iS, 1));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
        int i = this.I;
        int i2 = z ? i : 0;
        int iBlendARGB = ColorUtils.blendARGB(i, iS, 0.7f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new r5(this, iBlendARGB, i2, 3));
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.start();
    }

    public final void L(boolean z) {
        setVisibility(0);
        ViewParent parent = getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        int height = ((ViewGroup) parent).getHeight() - getMarginTopExpandedStatePx();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, getHeaderSizeDp());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = -1;
        setLayoutParams(layoutParams);
        ViewGroup contentContainer = getContentContainer();
        ViewGroup.LayoutParams layoutParams2 = getContentContainer().getLayoutParams();
        Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams.height = -1;
        marginLayoutParams.setMargins(0, getMarginTopExpandedStatePx() + iK, 0, 0);
        contentContainer.setLayoutParams(marginLayoutParams);
        int height2 = height - iK;
        if (!z) {
            height2 -= getContentContainer().getHeight();
        }
        float f = height2;
        getContentContainer().setTranslationY(f);
        ViewGroup.LayoutParams layoutParams3 = getHeader().getLayoutParams();
        Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).setMargins(0, getMarginTopExpandedStatePx(), 0, 0);
        getHeader().setTranslationY(f + iK);
        getContentContainer().animate().translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(getInterpolator()).setDuration(300L).withLayer().start();
        getHeader().animate().translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(getInterpolator()).setDuration(300L).withLayer().start();
        ValueAnimator duration = ValueAnimator.ofInt(0, 255).setDuration(300L);
        duration.addUpdateListener(new zx0.d(this, 0));
        duration.start();
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS = kli.a.s(R$attr.uikit_colorBlack, context2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 0.7f);
        valueAnimatorOfFloat.addUpdateListener(new zx0.e(this, iS, 0));
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.start();
    }

    public final void M(long j2) {
        yt0.q qVar = new yt0.q(2, new zx0.c(this, 3));
        getNavBar().m0(j4.FADE);
        getNavBar().i0();
        getTabsAndListContainer().animate().translationY(BitmapDescriptorFactory.HUE_RED).setInterpolator(getInterpolator()).setDuration(j2).setListener(qVar).withLayer().start();
        getCategoriesTabs().animate().alpha(1.0f).setInterpolator(getInterpolator()).setDuration(j2 / ((long) 2)).setListener(null).withLayer().start();
    }

    public final void N(int i, long j2) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iK = kli.a.k(context, 44.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK2 = ((i - kli.a.k(context2, getHeaderSizeDp())) - getMarginTopExpandedStatePx()) + iK;
        ViewGroup tabsAndListContainer = getTabsAndListContainer();
        ViewGroup.LayoutParams layoutParams = getTabsAndListContainer().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.height = iK2;
        tabsAndListContainer.setLayoutParams(layoutParams);
        getTabsAndListContainer().animate().translationY(-iK).setInterpolator(getInterpolator()).setDuration(j2).setListener(new yt0.q(2, new zx0.c(this, 1))).withLayer().start();
        getCategoriesTabs().animate().alpha(BitmapDescriptorFactory.HUE_RED).setInterpolator(getInterpolator()).setDuration(j2 / ((long) 2)).setListener(null).withLayer().start();
        getNavBar().K0(j4.FADE);
    }

    public final void O(boolean z, boolean z3) {
        ReactionsKeyboardBottomBarView bottomBar = getBottomBar();
        float bottomBarHiddenTranslationPx = z ? BitmapDescriptorFactory.HUE_RED : getBottomBarHiddenTranslationPx();
        if (this.K || bottomBar.getTranslationY() == bottomBarHiddenTranslationPx) {
            return;
        }
        if (!z3) {
            bottomBar.setTranslationY(bottomBarHiddenTranslationPx);
        } else {
            this.K = true;
            bottomBar.animate().translationY(bottomBarHiddenTranslationPx).setInterpolator(getInterpolator()).setDuration(300L).withLayer().setListener(new yt0.q(2, new zx0.c(this, 2))).start();
        }
    }

    public final void P(boolean z, boolean z3) {
        ReactionsKeyboardTabs categoriesTabs = getCategoriesTabs();
        float f = z ? BitmapDescriptorFactory.HUE_RED : -getEmojiTabsHeightPx();
        if (this.J || categoriesTabs.getTranslationY() == f) {
            return;
        }
        if (!z3) {
            categoriesTabs.setTranslationY(f);
        } else {
            this.J = true;
            categoriesTabs.animate().translationY(f).setInterpolator(getInterpolator()).setDuration(300L).withLayer().setListener(new yt0.q(2, new zx0.c(this, 0))).start();
        }
    }

    public final void Q() {
        setCategoriesDisposable(null);
        setTypesDisposable(null);
    }

    public final AnalyticsProduct getAnalyticsProduct() {
        return this.analyticsProduct;
    }

    public final j getBackState() {
        InternalState internalState = this.f59625j;
        if (internalState == null) {
            return null;
        }
        if (internalState != null) {
            return internalState.f59638b;
        }
        Intrinsics.r("internalState");
        throw null;
    }

    @Override // rv0.g
    public int getImeInsetPx() {
        return getSemiOpenedKeyboardHeightWithoutInsetsPx();
    }

    @Override // ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return true;
    }

    public final int getSemiOpenedKeyboardHeightPx() {
        Integer num = this.D;
        return (num != null ? num.intValue() : getDefaultSemiOpenedKeyboardHeightPx()) + this.E;
    }

    public final int getSemiOpenedKeyboardHeightWithoutInsetsPx() {
        Integer num = this.D;
        return num != null ? num.intValue() : getDefaultSemiOpenedKeyboardHeightPx();
    }

    @NotNull
    public final j getState() {
        InternalState internalState = this.f59625j;
        if (internalState != null) {
            return internalState.f59639c;
        }
        Intrinsics.r("internalState");
        throw null;
    }

    @Override // rv0.g
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(insets, "<this>");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<this>");
        setBottomSystemBarInset(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom);
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat2, "toWindowInsetsCompat(...)");
        int iSystemBars = WindowInsetsCompat.Type.systemBars();
        Insets insets2 = windowInsetsCompat2.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        int i = insets2.top;
        Insets insetsOf = Insets.of(windowInsetsCompat2.getSystemWindowInsetLeft(), 0, windowInsetsCompat2.getSystemWindowInsetRight(), windowInsetsCompat2.getSystemWindowInsetBottom());
        Intrinsics.checkNotNullExpressionValue(insetsOf, "of(...)");
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(windowInsetsCompat2).setSystemWindowInsets(insetsOf).setInsets(iSystemBars, Insets.of(insets2.left, 0, insets2.right, insets2.bottom)).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        WindowInsets windowInsets = windowInsetsCompatBuild.toWindowInsets();
        if (windowInsets != null) {
            insets = windowInsets;
        }
        WindowInsetsCompat windowInsetsCompat3 = WindowInsetsCompat.toWindowInsetsCompat(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat3, "toWindowInsetsCompat(...)");
        int iSystemBars2 = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets3 = windowInsetsCompat3.getInsets(iSystemBars2);
        Intrinsics.checkNotNullExpressionValue(insets3, "getInsets(...)");
        int i2 = insets3.bottom;
        Insets insetsOf2 = Insets.of(insets3.left, insets3.top, insets3.right, 0);
        Intrinsics.checkNotNullExpressionValue(insetsOf2, "of(...)");
        WindowInsets windowInsets2 = new WindowInsetsCompat.Builder(windowInsetsCompat3).setInsets(iSystemBars2, insetsOf2).build().toWindowInsets();
        if (windowInsets2 != null) {
            insets = windowInsets2;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(insets);
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVarC = getBottomBar().c();
        zx0.a aVar = new zx0.a(this, 0);
        efm.r rVarOnErrorResumeNext = fVarC.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 10)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a0(1, aVar), new a0(1, x.f326017a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        ifm.b bVar = this.v;
        w.j0(bVar, cVarSubscribe);
        efm.r rVarMergeWith = this.M.f57506b.mergeWith(this.f59633t);
        Intrinsics.checkNotNullExpressionValue(rVarMergeWith, "mergeWith(...)");
        zx0.a aVar2 = new zx0.a(this, 1);
        efm.r rVarOnErrorResumeNext2 = rVarMergeWith.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 11)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe2 = rVarOnErrorResumeNext2.subscribe(new a0(1, aVar2), new a0(1, y.f326018a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe2, "subscribe(...)");
        w.j0(bVar, cVarSubscribe2);
        f fVar = getTypesTabs().f;
        zx0.a aVar3 = new zx0.a(this, 2);
        efm.r rVarOnErrorResumeNext3 = fVar.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 12)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext3, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe3 = rVarOnErrorResumeNext3.subscribe(new a0(1, aVar3), new a0(1, zx0.z.f326019a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe3, "subscribe(...)");
        w.j0(bVar, cVarSubscribe3);
        f fVarB = getBottomBar().b();
        zx0.a aVar4 = new zx0.a(this, 3);
        efm.r rVarOnErrorResumeNext4 = fVarB.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 13)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext4, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe4 = rVarOnErrorResumeNext4.subscribe(new a0(1, aVar4), new a0(1, zx0.a0.f325979a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe4, "subscribe(...)");
        w.j0(bVar, cVarSubscribe4);
        f fVar2 = getCategoriesTabs().f57499c;
        zx0.a aVar5 = new zx0.a(this, 4);
        efm.r rVarOnErrorResumeNext5 = fVar2.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 14)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext5, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe5 = rVarOnErrorResumeNext5.subscribe(new a0(1, aVar5), new a0(1, s.f326012a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe5, "subscribe(...)");
        w.j0(bVar, cVarSubscribe5);
        f fVar3 = getNavBar().f59409p.f57337m;
        zg8.d dVar = new zg8.d(1, this.u, ihm.b.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 17);
        efm.r rVarOnErrorResumeNext6 = fVar3.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 6)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext6, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe6 = rVarOnErrorResumeNext6.subscribe(new a0(1, dVar), new a0(1, zx0.t.f326013a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe6, "subscribe(...)");
        w.j0(bVar, cVarSubscribe6);
        f fVar4 = getNavBar().f59410q;
        zx0.a aVar6 = new zx0.a(this, 5);
        efm.r rVarOnErrorResumeNext7 = fVar4.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 7)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext7, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe7 = rVarOnErrorResumeNext7.subscribe(new a0(1, aVar6), new a0(1, zx0.u.f326014a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe7, "subscribe(...)");
        w.j0(bVar, cVarSubscribe7);
        f fVar5 = getNavBar().f59409p.f57336l;
        zx0.a aVar7 = new zx0.a(this, 6);
        efm.r rVarOnErrorResumeNext8 = fVar5.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 8)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext8, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe8 = rVarOnErrorResumeNext8.subscribe(new a0(1, aVar7), new a0(1, zx0.v.f326015a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe8, "subscribe(...)");
        w.j0(bVar, cVarSubscribe8);
        efm.r rVarFilter = getNavBar().o.f57403b.filter(new zx0.b(new l0(3), 0));
        Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
        zx0.a aVar8 = new zx0.a(this, 7);
        efm.r rVarOnErrorResumeNext9 = rVarFilter.onErrorResumeNext(new xz7.f(5, new x2(new BreadcrumbException(), 9)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext9, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe9 = rVarOnErrorResumeNext9.subscribe(new a0(1, aVar8), new a0(1, zx0.w.f326016a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe9, "subscribe(...)");
        w.j0(bVar, cVarSubscribe9);
        getActivity().getOnBackPressedDispatcher().addCallback(this.G);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v.d();
        this.G.remove();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (getState() == j.SEMI_OPEN) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.resolveSize(getSemiOpenedKeyboardHeightPx(), i2), 1073741824));
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        this.f59632s = bundle.getString("STATE_KEY_CURRENT_CATEGORY_ID");
        Object stringArrayList = bundle.getStringArrayList("STATE_KEY_KEYBOARD_TYPES");
        if (stringArrayList == null) {
            stringArrayList = f0.f322471a;
        }
        this.f59631r = stringArrayList;
        InternalState internalState = (InternalState) bundle.getParcelable("STATE_KEY_KEYBOARD_STATE");
        if (internalState != null) {
            InternalState internalState2 = internalState.f59639c != j.EXPANDED_SEARCH ? internalState : null;
            if (internalState2 == null) {
                j current = j.EXPANDED;
                j jVar = internalState.f59638b;
                Intrinsics.checkNotNullParameter(current, "current");
                internalState2 = new InternalState(jVar, jVar, current);
            }
            this.f59625j = internalState2;
            j jVar2 = internalState2.f59637a;
            j jVar3 = internalState2.f59639c;
            int i = p.f326009a[jVar3.ordinal()];
            if (i == 1) {
                z(jVar2);
            } else if (i == 2) {
                B(jVar2);
            } else {
                if (i != 3) {
                    if (i == 4) {
                        throw new IllegalStateException("Keyboard can't be restored from EXPANDED_SEARCH, should use EXPANDED as fallback");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                y(jVar2);
            }
            this.o.onNext(jVar3);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        if (this.k) {
            InternalState internalState = this.f59625j;
            if (internalState == null) {
                Intrinsics.r("internalState");
                throw null;
            }
            bundle.putParcelable("STATE_KEY_KEYBOARD_STATE", internalState);
        }
        bundle.putStringArrayList("STATE_KEY_KEYBOARD_TYPES", new ArrayList<>((Collection) this.f59631r));
        bundle.putString("STATE_KEY_CURRENT_CATEGORY_ID", this.f59632s);
        return bundle;
    }

    public final void setAnalyticsProduct(AnalyticsProduct analyticsProduct) {
        this.analyticsProduct = analyticsProduct;
    }

    public final void setEmptySearchTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getSearchView().setEmptySearchTitle(title);
    }

    public final void setErrorMessage(@NotNull Clause message, @NotNull Clause action) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f59628n = new Pair(message, action);
        getSearchView().setErrorMessage(message, action);
    }

    public final void setSearchHint(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getNavBar().setHint(title);
    }

    public final void setSemiOpenedKeyboardHeightPx(int height) {
        this.D = Integer.valueOf(height);
    }

    public final void setState(@NotNull j state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state != getState()) {
            setStateInternal(state);
        }
    }

    public final void setTitle(@NotNull Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getNavBar().setToolbarTitle(title);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void setType(@NotNull String typeId) {
        Intrinsics.checkNotNullParameter(typeId, "typeId");
        if (this.f59631r.contains(typeId)) {
            getTypesTabs().i0(typeId);
            getBottomBar().d(typeId);
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "ReactionsKeyboardView", j6.a.q("Unknown typeId = ", typeId), null, null, 16);
        }
    }

    public final void y(j jVar) {
        int i = jVar == null ? -1 : p.f326009a[jVar.ordinal()];
        if (i == 1) {
            L(true);
            P(true, true);
            O(false, false);
        } else if (i == 2) {
            L(false);
            P(true, true);
            O(false, true);
        } else if (i != 4) {
            if (getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = -1;
                layoutParams.height = -1;
                setLayoutParams(layoutParams);
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iK = kli.a.k(context, getHeaderSizeDp());
            ViewGroup contentContainer = getContentContainer();
            ViewGroup.LayoutParams layoutParams2 = getContentContainer().getLayoutParams();
            Intrinsics.i(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams.height = -1;
            marginLayoutParams.setMargins(0, iK + getMarginTopExpandedStatePx(), 0, 0);
            contentContainer.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams3 = getHeader().getLayoutParams();
            Intrinsics.i(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).setMargins(0, getMarginTopExpandedStatePx(), 0, 0);
            getBackground().setAlpha(255);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorBlack, context2);
            getWindow().setStatusBarColor(ColorUtils.blendARGB(this.H, iS, 0.7f));
            getWindow().setNavigationBarColor(ColorUtils.blendARGB(this.I, iS, 0.7f));
            P(true, false);
            O(false, false);
        } else {
            M(150L);
            getViewPager().setSwipesEnabled(true);
            getSearchView().setVisibility(8);
            getSearchView().c();
            this.u.onNext("");
            H(getNavBar());
        }
        requestFocus();
    }

    public final void z(j jVar) {
        int i = jVar == null ? -1 : p.f326009a[jVar.ordinal()];
        if (i == 3) {
            K(true);
            P(true, false);
            O(false, false);
        } else {
            if (i == 4) {
                if ((getWindow().getAttributes().softInputMode & 16) != 16) {
                    A();
                    return;
                } else {
                    H(getNavBar());
                    postDelayed(new zx0.f(this, 0), 200L);
                    return;
                }
            }
            setVisibility(8);
            D();
            getWindow().setStatusBarColor(this.H);
            getWindow().setNavigationBarColor(this.I);
            P(true, false);
            O(true, false);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionsKeyboardView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}

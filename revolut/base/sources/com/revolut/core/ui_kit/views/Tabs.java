package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import aw0.v1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import es0.b0;
import es0.d0;
import ip0.o60;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx0.hc;
import mx0.ic;
import mx0.jc;
import mx0.kc;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u00032\u00070\u0004¢\u0006\u0002\b\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0007A\"id{|[B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001b\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010.\u001a\u00020\u00162\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\u0017\u00103\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00162\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b4\u00102J\u000f\u00109\u001a\u000206H\u0000¢\u0006\u0004\b7\u00108J\u000f\u0010;\u001a\u000206H\u0000¢\u0006\u0004\b:\u00108J%\u0010@\u001a\u00020\u00162\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0016\u0018\u00010<H\u0000¢\u0006\u0004\b>\u0010?J\u0015\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ#\u0010F\u001a\u00020\u00162\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0016\u0018\u00010<¢\u0006\u0004\bF\u0010?J%\u0010I\u001a\u00020\u00162\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0!2\b\u0010H\u001a\u0004\u0018\u00010&¢\u0006\u0004\bI\u0010JJ)\u0010L\u001a\u00020\u00162\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0!2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010&H\u0000¢\u0006\u0004\bK\u0010JJ'\u0010M\u001a\u00020\u00162\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0!2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010&¢\u0006\u0004\bM\u0010JJ\u0017\u0010O\u001a\u00020\u00162\u0006\u0010N\u001a\u00020/H\u0016¢\u0006\u0004\bO\u00102J/\u0010T\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u000e2\u0006\u0010Q\u001a\u0002062\u0006\u0010R\u001a\u00020/2\u0006\u0010S\u001a\u00020/H\u0016¢\u0006\u0004\bT\u0010UJ\u0011\u0010W\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bW\u0010XJ\u0011\u0010Y\u001a\u0004\u0018\u00010VH\u0002¢\u0006\u0004\bY\u0010XR$\u0010a\u001a\u0004\u0018\u00010Z8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R)\u0010h\u001a\u0010\u0012\f\u0012\n c*\u0004\u0018\u00010&0&0b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR)\u0010k\u001a\u0010\u0012\f\u0012\n c*\u0004\u0018\u00010&0&0b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010e\u001a\u0004\bj\u0010gR)\u0010n\u001a\u0010\u0012\f\u0012\n c*\u0004\u0018\u00010&0&0b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010e\u001a\u0004\bm\u0010gR\u001b\u0010s\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010e\u001a\u0004\bq\u0010rR\u001b\u0010y\u001a\u00020t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x¨\u0006}"}, d2 = {"Lcom/revolut/core/ui_kit/views/Tabs;", "Landroid/widget/FrameLayout;", "Les0/w;", "Les0/u;", "Les0/v;", "Lorg/jetbrains/annotations/NotNull;", "Les0/r;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "start", "top", "end", "bottom", "", "setPaddingRelative", "(IIII)V", "left", "right", "setPadding", "getPaddingLeft", "()I", "getPaddingRight", "getPaddingStart", "getPaddingEnd", "", "Lcom/revolut/core/ui_kit/views/q;", "getCurrentTabs$ui_kit_components_release", "()Ljava/util/List;", "getCurrentTabs", "", "getSelectedTabId$ui_kit_components_release", "()Ljava/lang/String;", "getSelectedTabId", "Lcom/revolut/core/ui_kit/views/Tabs$b;", "mode", "setLayoutMode$ui_kit_components_release", "(Lcom/revolut/core/ui_kit/views/Tabs$b;)V", "setLayoutMode", "", "enabled", "setTrailingFadingEdgeEnabled$ui_kit_components_release", "(Z)V", "setTrailingFadingEdgeEnabled", "setLeadingFadingEdgeEnabled$ui_kit_components_release", "setLeadingFadingEdgeEnabled", "", "getTrailingFadingEdgeAlpha$ui_kit_components_release", "()F", "getTrailingFadingEdgeAlpha", "getLeadingFadingEdgeAlpha$ui_kit_components_release", "getLeadingFadingEdgeAlpha", "Lkotlin/Function1;", "function", "setOnLongTabClickListener$ui_kit_components_release", "(Lkotlin/jvm/functions/Function1;)V", "setOnLongTabClickListener", "Lmx0/jc;", "gravity", "setTabsGravity", "(Lmx0/jc;)V", "onTabPositionChangedCallback", "setOnTabPositionChangedCallback", "newItems", "selectedId", "setItemsWithDiffing", "(Ljava/util/List;Ljava/lang/String;)V", "setItemsAfterReordering$ui_kit_components_release", "setItemsAfterReordering", "setItems", "value", "setReadableAreaGuidelinesEnabled", "position", "positionOffset", "updateSelectedText", "updateIndicatorPosition", "setScrollPosition", "(IFZZ)V", "Landroid/graphics/LinearGradient;", "getTrailingFadeGradient", "()Landroid/graphics/LinearGradient;", "getLeadingFadeGradient", "Landroid/os/Parcelable;", "a", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Lihm/f;", "kotlin.jvm.PlatformType", "c", "Lkotlin/Lazy;", "getFakeTabClickSubject", "()Lihm/f;", "fakeTabClickSubject", "d", "getMoreTabClickSubject", "moreTabClickSubject", "e", "getTabReselectionSubject", "tabReselectionSubject", "Landroidx/transition/Transition;", "t", "getDeleteTransition", "()Landroidx/transition/Transition;", "deleteTransition", "Lcom/revolut/core/ui_kit/views/AutoFitTabLayout;", "v", "Le8/q;", "getTabLayout$ui_kit_components_release", "()Lcom/revolut/core/ui_kit/views/AutoFitTabLayout;", "tabLayout", "Companion", "b", "mx0/ic", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Tabs extends FrameLayout implements es0.w, es0.u, es0.v, es0.r, TrackableItem, ur0.a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f58883c;
    public final Object d;
    public final Object e;
    public Function1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function1 f58884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f58885h;
    public String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f58886j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public b f58887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Paint f58888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearGradient f58889n;
    public LinearGradient o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f58890p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f58891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float f58892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float f58893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f58894t;
    public volatile boolean u;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final e8.q tabLayout;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.Tabs$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f58895a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.views.Tabs$b$b, reason: collision with other inner class name */
        public static final class C0441b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0441b f58896a = new C0441b();

            private C0441b() {
            }
        }

        private b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f58897a = new a();

            private a() {
            }
        }

        private c() {
        }
    }

    public static abstract class d {
        private d() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tabs(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final Transition getDeleteTransition() {
        return (Transition) this.f58894t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getFakeTabClickSubject() {
        return (ihm.f) this.f58883c.getValue();
    }

    private final LinearGradient getLeadingFadeGradient() {
        if (this.o == null) {
            this.o = j(true);
        }
        return this.o;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getMoreTabClickSubject() {
        return (ihm.f) this.d.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ihm.f getTabReselectionSubject() {
        return (ihm.f) this.e.getValue();
    }

    private final LinearGradient getTrailingFadeGradient() {
        if (this.f58889n == null) {
            this.f58889n = j(false);
        }
        return this.f58889n;
    }

    public static boolean l(q qVar) {
        qVar.f.getClass();
        return qVar.f59616c instanceof r;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static void p(View view, q qVar) {
        int i;
        TextView textView = (TextView) view.findViewById(R$id.tabText);
        Intrinsics.h(textView);
        textView.setVisibility(8);
        textView.setText((CharSequence) null);
        ImageView imageView = (ImageView) view.findViewById(R$id.tabIcon);
        Intrinsics.h(imageView);
        imageView.setVisibility(8);
        imageView.setImageDrawable(null);
        ImageView imageView2 = (ImageView) view.findViewById(R$id.tabEndIcon);
        Intrinsics.h(imageView2);
        imageView2.setVisibility(8);
        imageView2.setImageDrawable(null);
        ImageView imageView3 = (ImageView) view.findViewById(R$id.tabs_largeIcon);
        Intrinsics.h(imageView3);
        imageView3.setVisibility(8);
        imageView3.setImageDrawable(null);
        View viewFindViewById = (ViewStub) view.findViewById(R$id.tabs_loadingStub);
        if (viewFindViewById == null) {
            viewFindViewById = view.findViewById(R$id.tabs_loading);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        }
        viewFindViewById.setVisibility(8);
        c cVar = qVar.f59616c;
        if (cVar instanceof t) {
            q(view, ((t) cVar).f59744a);
            return;
        }
        if (cVar instanceof u) {
            u uVar = (u) cVar;
            q(view, uVar.f59745a);
            int i2 = w.f59767b[uVar.f59747c.ordinal()];
            if (i2 == 1) {
                i = R$id.tabIcon;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$id.tabEndIcon;
            }
            View viewFindViewById2 = view.findViewById(i);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            zi0.c.h((ImageView) viewFindViewById2, uVar.f59746b, true, new mw1.a(12), false);
            return;
        }
        if (cVar instanceof r) {
            yy0.j jVar = ((r) cVar).f59617a;
            View viewFindViewById3 = view.findViewById(R$id.tabs_largeIcon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            zi0.c.h((ImageView) viewFindViewById3, jVar, true, new mw1.a(11), false);
            return;
        }
        if (!(cVar instanceof c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        View viewInflate = (ViewStub) view.findViewById(R$id.tabs_loading);
        if (viewInflate == null) {
            viewInflate = ((ViewStub) view.findViewById(R$id.tabs_loadingStub)).inflate();
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        }
        viewInflate.setVisibility(0);
    }

    public static void q(View view, Clause clause) {
        TextView textView = (TextView) view.findViewById(R$id.tabText);
        Intrinsics.h(textView);
        ty0.c.b(or0.u.k(textView).b0(), clause, textView, null, null, 12);
        textView.setVisibility(0);
    }

    public static /* synthetic */ void setItems$default(Tabs tabs, List list, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        tabs.setItems(list, str);
    }

    public static /* synthetic */ void setItemsAfterReordering$ui_kit_components_release$default(Tabs tabs, List list, String str, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = null;
        }
        tabs.setItemsAfterReordering$ui_kit_components_release(list, str);
    }

    public static void u(Tabs tabs, String itemId, boolean z, boolean z3, boolean z4, int i) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        if ((i & 8) != 0) {
            z4 = false;
        }
        tabs.getClass();
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        if (Intrinsics.f(itemId, tabs.i)) {
            return;
        }
        int tabCount = tabs.getTabLayout$ui_kit_components_release().getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            b0.a aVarK = tabs.getTabLayout$ui_kit_components_release().k(i2);
            Object obj2 = aVarK != null ? aVarK.f128806a : null;
            q qVar = obj2 instanceof q ? (q) obj2 : null;
            if (Intrinsics.f(qVar != null ? qVar.f59614a : null, itemId) && !aVarK.a()) {
                if (!z) {
                    if (z3) {
                        tabs.getTabLayout$ui_kit_components_release().post(new com.google.android.material.sidesheet.b(tabs, i2, 8));
                    } else {
                        tabs.setScrollPosition(i2, BitmapDescriptorFactory.HUE_RED, true, true);
                    }
                }
                tabs.u = !z4;
                aVarK.b();
                tabs.i = itemId;
                tabs.u = false;
                return;
            }
        }
    }

    public final void A(String str) {
        Iterator it8 = this.f58885h.iterator();
        int i = 0;
        while (true) {
            if (!it8.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.f(((q) it8.next()).f59614a, str)) {
                break;
            } else {
                i++;
            }
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            b0.a aVarK = getTabLayout$ui_kit_components_release().k(numValueOf.intValue());
            if (aVarK != null) {
                aVarK.f128810h.findViewById(R$id.tabs_tabBadge).setVisibility(8);
                d0 view = aVarK.f128810h;
                Intrinsics.checkNotNullExpressionValue(view, "view");
                view.setClipChildren(true);
                view.setClipToPadding(true);
            }
        }
    }

    @Override // es0.t
    public final void a(b0.a tab2) {
        String str;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        this.i = qVar != null ? qVar.f59614a : null;
        Function1 function1 = this.f58884g;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(tab2.e));
        }
        if (this.u || (str = this.i) == null) {
            return;
        }
        this.f58882b.onNext(str);
        y(qVar != null ? qVar.f59616c : null);
    }

    @Override // es0.t
    public final void d(b0.a tab2) {
        String str;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        if (qVar == null || (str = qVar.f59614a) == null) {
            return;
        }
        getTabReselectionSubject().onNext(str);
        y(qVar.f59616c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if ((!this.f58886j && !this.k) || getWidth() <= 0) {
            super.dispatchDraw(canvas);
            return;
        }
        this.f58890p = this.f58886j ? getTrailingFadingEdgeAlpha$ui_kit_components_release() : 0.0f;
        float leadingFadingEdgeAlpha$ui_kit_components_release = this.k ? getLeadingFadingEdgeAlpha$ui_kit_components_release() : 0.0f;
        this.f58891q = leadingFadingEdgeAlpha$ui_kit_components_release;
        if (this.f58890p <= BitmapDescriptorFactory.HUE_RED && leadingFadingEdgeAlpha$ui_kit_components_release <= BitmapDescriptorFactory.HUE_RED) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSaveLayer = canvas.saveLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), null);
        super.dispatchDraw(canvas);
        float f = this.f58890p;
        Paint paint = this.f58888m;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            paint.setAlpha((int) (f * 255));
            paint.setShader(getTrailingFadeGradient());
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
        }
        float f4 = this.f58891q;
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            paint.setAlpha((int) (f4 * 255));
            paint.setShader(getLeadingFadeGradient());
            canvas.drawRect(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight(), paint);
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // es0.v
    public final void e(b0.a tab2) {
        String str;
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        if (qVar == null || (str = qVar.f59614a) == null) {
            throw new IllegalStateException("should be Tabs.Item as a TAG");
        }
        Function1 function1 = this.f;
        if (function1 != null) {
            function1.invoke(str);
        }
    }

    @Override // es0.t
    public final void f(b0.a tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
    }

    @Override // es0.u
    public final void g(b0.a tab2) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        Object obj2 = tab2.f128806a;
        q qVar = obj2 instanceof q ? (q) obj2 : null;
        if (qVar == null || !qVar.f.a()) {
            return;
        }
        getFakeTabClickSubject().onNext(qVar.f59614a);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
    public Parcelable getK() {
        return this.analyticsContext;
    }

    @NotNull
    public final List<q> getCurrentTabs$ui_kit_components_release() {
        return this.f58885h;
    }

    public final float getLeadingFadingEdgeAlpha$ui_kit_components_release() {
        return k(true);
    }

    @Override // android.view.View
    public int getPaddingEnd() {
        return getTabLayout$ui_kit_components_release().getPaddingEnd();
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        return getTabLayout$ui_kit_components_release().getPaddingLeft();
    }

    @Override // android.view.View
    public int getPaddingRight() {
        return getTabLayout$ui_kit_components_release().getPaddingRight();
    }

    @Override // android.view.View
    public int getPaddingStart() {
        return getTabLayout$ui_kit_components_release().getPaddingStart();
    }

    /* JADX INFO: renamed from: getSelectedTabId$ui_kit_components_release, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @NotNull
    public final AutoFitTabLayout getTabLayout$ui_kit_components_release() {
        return (AutoFitTabLayout) this.tabLayout.f();
    }

    public final float getTrailingFadingEdgeAlpha$ui_kit_components_release() {
        return k(false);
    }

    public final LinearGradient j(boolean z) {
        if ((getLayoutDirection() == 1) != z) {
            return new LinearGradient(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f58893s, BitmapDescriptorFactory.HUE_RED, -16777216, 0, Shader.TileMode.CLAMP);
        }
        return new LinearGradient(getWidth() - this.f58893s, BitmapDescriptorFactory.HUE_RED, getWidth(), BitmapDescriptorFactory.HUE_RED, 0, -16777216, Shader.TileMode.CLAMP);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float k(boolean r6) {
        /*
            r5 = this;
            com.revolut.core.ui_kit.views.AutoFitTabLayout r0 = r5.getTabLayout$ui_kit_components_release()
            int r0 = r0.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L34
            com.revolut.core.ui_kit.views.AutoFitTabLayout r0 = r5.getTabLayout$ui_kit_components_release()
            android.view.View r0 = r0.getChildAt(r1)
            int r0 = r0.getWidth()
            com.revolut.core.ui_kit.views.AutoFitTabLayout r2 = r5.getTabLayout$ui_kit_components_release()
            int r2 = r2.getWidth()
            int r0 = r0 - r2
            com.revolut.core.ui_kit.views.AutoFitTabLayout r2 = r5.getTabLayout$ui_kit_components_release()
            int r2 = r2.getPaddingStart()
            int r2 = r2 + r0
            com.revolut.core.ui_kit.views.AutoFitTabLayout r0 = r5.getTabLayout$ui_kit_components_release()
            int r0 = r0.getPaddingEnd()
            int r0 = r0 + r2
            if (r0 >= 0) goto L35
        L34:
            r0 = r1
        L35:
            r2 = 0
            if (r0 != 0) goto L39
            return r2
        L39:
            int r3 = r5.getLayoutDirection()
            r4 = 1
            if (r3 != r4) goto L41
            goto L42
        L41:
            r4 = r1
        L42:
            if (r4 == r6) goto L4d
            com.revolut.core.ui_kit.views.AutoFitTabLayout r6 = r5.getTabLayout$ui_kit_components_release()
            int r6 = r6.getScrollX()
            goto L5b
        L4d:
            com.revolut.core.ui_kit.views.AutoFitTabLayout r6 = r5.getTabLayout$ui_kit_components_release()
            int r6 = r6.getScrollX()
            int r0 = r0 - r6
            if (r0 >= 0) goto L59
            goto L5a
        L59:
            r1 = r0
        L5a:
            r6 = r1
        L5b:
            float r6 = (float) r6
            float r0 = r5.f58892r
            float r6 = r6 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = kotlin.ranges.f.f(r6, r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.views.Tabs.k(boolean):float");
    }

    public final b0.a m(q qVar) {
        View viewR = kotlin.jvm.internal.s.r(this, R$layout.internal_view_tabs_item);
        p(viewR, qVar);
        hc hcVar = qVar.f;
        b0.a aVarM = getTabLayout$ui_kit_components_release().m(l(qVar), qVar.d && hcVar.b() && !l(qVar));
        Intrinsics.checkNotNullExpressionValue(aVarM, "newTab(...)");
        aVarM.f = viewR;
        aVarM.c();
        v vVar = qVar.f59615b;
        boolean zB = hcVar.b();
        View view = aVarM.f;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R$id.tabText);
            ImageView imageView = (ImageView) view.findViewById(R$id.tabIcon);
            ImageView imageView2 = (ImageView) view.findViewById(R$id.tabEndIcon);
            ImageView imageView3 = (ImageView) view.findViewById(R$id.tabs_largeIcon);
            float f = zB ? 1.0f : 0.5f;
            if (textView != null) {
                textView.setAlpha(f);
            }
            if (imageView != null) {
                imageView.setAlpha(f);
            }
            if (imageView2 != null) {
                imageView2.setAlpha(f);
            }
            if (imageView3 != null) {
                imageView3.setAlpha(f);
            }
            if (vVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ColorStateList colorStateListT = kli.a.t(vVar.f59748a, context);
            if (textView != null) {
                textView.setTextColor(colorStateListT);
            }
            if (imageView != null) {
                imageView.setImageTintList(colorStateListT);
            }
            if (imageView2 != null) {
                imageView2.setImageTintList(colorStateListT);
            }
            if (imageView3 != null) {
                imageView3.setImageTintList(colorStateListT);
            }
        }
        aVarM.f128810h.setBackgroundResource(R$drawable.internal_tab_item_background_ripple);
        aVarM.f128806a = qVar;
        aVarM.f128810h.setEnabled(hcVar.a());
        return aVarM;
    }

    public final ihm.f n() {
        return getFakeTabClickSubject();
    }

    public final ihm.f o() {
        return getMoreTabClickSubject();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = parcelable instanceof Bundle ? (Bundle) parcelable : null;
        if (bundle == null) {
            return;
        }
        String string = bundle.getString("STATE_KEY_SELECTED");
        this.i = string;
        if (string != null) {
            u(this, string, false, false, false, 12);
        }
        super.onRestoreInstanceState(bundle.getParcelable("STATE_KEY_SUPER"));
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        this.f58889n = null;
        this.o = null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("STATE_KEY_SUPER", super.onSaveInstanceState());
        bundle.putString("STATE_KEY_SELECTED", this.i);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i5) {
        super.onSizeChanged(i, i2, i3, i5);
        if (i != i3) {
            this.f58889n = null;
            this.o = null;
        }
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        setBackgroundColor(i3);
    }

    public final void s(String str, List list) {
        TransitionManager.endTransitions(getTabLayout$ui_kit_components_release());
        this.u = true;
        getTabLayout$ui_kit_components_release().o();
        this.i = null;
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            q qVar = (q) it8.next();
            AutoFitTabLayout tabLayout$ui_kit_components_release = getTabLayout$ui_kit_components_release();
            tabLayout$ui_kit_components_release.b(m(qVar), tabLayout$ui_kit_components_release.d.size(), false);
        }
        this.u = false;
        x(str, list, true, true);
        this.f58885h = list;
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            q qVar2 = (q) it9.next();
            qVar2.getClass();
            A(qVar2.f59614a);
        }
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setItems(@NotNull List<q> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        if (t(newItems)) {
            x(selectedId, newItems, false, true);
        } else {
            w(selectedId, false, true);
        }
    }

    public final void setItemsAfterReordering$ui_kit_components_release(@NotNull List<q> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        if (t(newItems)) {
            x(selectedId, newItems, false, false);
        } else {
            w(selectedId, false, false);
        }
    }

    public final void setItemsWithDiffing(@NotNull List<q> newItems, String selectedId) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        if (this.f58885h.size() == newItems.size()) {
            Iterable iterableI = zhm.v.i(this.f58885h);
            if (!(iterableI instanceof Collection) || !((Collection) iterableI).isEmpty()) {
                vim.f it8 = iterableI.iterator();
                while (it8.f289625c) {
                    int iNextInt = it8.nextInt();
                    q qVar = (q) this.f58885h.get(iNextInt);
                    q qVar2 = newItems.get(iNextInt);
                    if (Intrinsics.f(qVar.f59614a, qVar2.f59614a) && l(qVar) != l(qVar2)) {
                        s(selectedId, newItems);
                        return;
                    }
                }
            }
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new ic(this.f58885h, newItems), true);
        Intrinsics.checkNotNullExpressionValue(diffResultCalculateDiff, "calculateDiff(...)");
        diffResultCalculateDiff.dispatchUpdatesTo(new kc(this, selectedId, newItems));
    }

    public final void setLayoutMode$ui_kit_components_release(@NotNull b mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        if (Intrinsics.f(this.f58887l, mode)) {
            return;
        }
        this.f58887l = mode;
        if (mode instanceof b.C0441b) {
            getTabLayout$ui_kit_components_release().setTabMode(0);
            getTabLayout$ui_kit_components_release().setTabGravity(2);
            AutoFitTabLayout tabLayout$ui_kit_components_release = getTabLayout$ui_kit_components_release();
            ViewGroup.LayoutParams layoutParams = tabLayout$ui_kit_components_release.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -2;
            tabLayout$ui_kit_components_release.setLayoutParams(layoutParams);
            return;
        }
        if (!(mode instanceof b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        getTabLayout$ui_kit_components_release().setTabMode(1);
        getTabLayout$ui_kit_components_release().setTabGravity(0);
        AutoFitTabLayout tabLayout$ui_kit_components_release2 = getTabLayout$ui_kit_components_release();
        ViewGroup.LayoutParams layoutParams2 = tabLayout$ui_kit_components_release2.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.width = -1;
        tabLayout$ui_kit_components_release2.setLayoutParams(layoutParams2);
    }

    public final void setLeadingFadingEdgeEnabled$ui_kit_components_release(boolean enabled) {
        if (this.k != enabled) {
            this.k = enabled;
            invalidate();
        }
    }

    public final void setOnLongTabClickListener$ui_kit_components_release(Function1<? super String, Unit> function) {
        this.f = function;
    }

    public final void setOnTabPositionChangedCallback(Function1<? super Integer, Unit> onTabPositionChangedCallback) {
        this.f58884g = onTabPositionChangedCallback;
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(0, top, 0, bottom);
        getTabLayout$ui_kit_components_release().setPadding(left, 0, right, 0);
    }

    @Override // android.view.View
    public void setPaddingRelative(int start, int top, int end2, int bottom) {
        super.setPaddingRelative(0, top, 0, bottom);
        getTabLayout$ui_kit_components_release().setPaddingRelative(start, 0, end2, 0);
    }

    public void setReadableAreaGuidelinesEnabled(boolean value) {
        getTabLayout$ui_kit_components_release().setReadableAreaGuidelinesEnabled(value);
    }

    @Override // es0.r
    public void setScrollPosition(int position, float positionOffset, boolean updateSelectedText, boolean updateIndicatorPosition) {
        getTabLayout$ui_kit_components_release().setScrollPosition(position, positionOffset, updateSelectedText, updateIndicatorPosition);
    }

    public final void setTabsGravity(@NotNull jc gravity) {
        int i;
        Intrinsics.checkNotNullParameter(gravity, "gravity");
        ViewGroup.LayoutParams layoutParams = getTabLayout$ui_kit_components_release().getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int i2 = w.f59766a[gravity.ordinal()];
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

    public final void setTrailingFadingEdgeEnabled$ui_kit_components_release(boolean enabled) {
        if (this.f58886j != enabled) {
            this.f58886j = enabled;
            invalidate();
        }
    }

    public final boolean t(List list) {
        boolean z = (list.size() == this.f58885h.size() && list.equals(this.f58885h)) ? false : true;
        if (z) {
            getTabLayout$ui_kit_components_release().o();
            this.i = null;
            this.u = true;
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                q qVar = (q) it8.next();
                AutoFitTabLayout tabLayout$ui_kit_components_release = getTabLayout$ui_kit_components_release();
                tabLayout$ui_kit_components_release.b(m(qVar), tabLayout$ui_kit_components_release.d.size(), false);
            }
            this.u = false;
        }
        this.f58885h = list;
        Iterator it9 = list.iterator();
        while (it9.hasNext()) {
            q qVar2 = (q) it9.next();
            qVar2.getClass();
            A(qVar2.f59614a);
        }
        return z;
    }

    public final void w(String str, boolean z, boolean z3) {
        if (str == null || str.equals(this.i)) {
            return;
        }
        u(this, str, z, z3, false, 8);
    }

    public final void x(String str, List list, boolean z, boolean z3) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.f(((q) list.get(i)).f59614a, str)) {
                w(str, z, z3);
                return;
            }
        }
        this.u = true;
        b0.a aVarK = getTabLayout$ui_kit_components_release().k(0);
        if (aVarK != null) {
            aVarK.b();
        }
        this.u = false;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public final void y(c cVar) {
        py0.c cVar2 = null;
        if (cVar != null) {
            if (cVar instanceof t) {
                cVar2 = new py0.c(((t) cVar).f59744a);
            } else if (cVar instanceof u) {
                cVar2 = new py0.c(((u) cVar).f59745a);
            } else if (!(cVar instanceof r) && !(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        jh.d.f(context).n0().a(this, this, cVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Tabs(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tabs(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58882b = v0.a.d("create(...)");
        yhm.k kVar = yhm.k.NONE;
        this.f58883c = yhm.j.c(kVar, new mw1.a(13));
        this.d = yhm.j.c(kVar, new mw1.a(14));
        this.e = yhm.j.c(kVar, new mw1.a(15));
        this.f58885h = f0.f322471a;
        this.f58887l = b.C0441b.f58896a;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f58888m = paint;
        this.f58892r = kli.a.l(context, 24.0f);
        this.f58893s = kli.a.l(context, 64.0f);
        this.f58894t = yhm.j.c(kVar, new mw1.a(16));
        this.tabLayout = kli.a.J(R$id.tabLayout, this);
        View.inflate(context, R$layout.internal_view_tabs, this);
        setClipToPadding(false);
        setClipChildren(false);
        getTabLayout$ui_kit_components_release().a(this);
        getTabLayout$ui_kit_components_release().f128790b = this;
        getTabLayout$ui_kit_components_release().f128789a = this;
        getTabLayout$ui_kit_components_release().setOnScrollChangeListener(new o60(this, 2));
        setPadding(super.getPaddingLeft(), getPaddingTop(), super.getPaddingRight(), getPaddingBottom());
        getTabLayout$ui_kit_components_release().setOverScrollMode(2);
        getTabLayout$ui_kit_components_release().setTabGravity(2);
    }

    public /* synthetic */ Tabs(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}

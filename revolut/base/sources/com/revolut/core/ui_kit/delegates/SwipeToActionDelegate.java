package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.swipelayout.SwipeToActionLayout;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.ai0;
import ip0.bi0;
import ip0.e70;
import ip0.od0;
import ip0.th0;
import ip0.uh0;
import ip0.vh0;
import ip0.wh0;
import ip0.xh0;
import ip0.yh0;
import ip0.zh0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;
import qv0.i;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \b*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0005:\t\t\u0006\n\u0007\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeToActionDelegate;", "Lqv0/i;", "IM", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "VH", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/wh;", "Lip0/zh0;", "Companion", "ip0/wh0", "SwipeAction", "com/revolut/core/ui_kit/delegates/vh", "b", "ip0/yh0", "a", "ip0/xh0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeToActionDelegate<IM extends qv0.i, VH extends RecyclerView.ViewHolder> extends BaseGroupRecyclerViewDelegate<wh, zh0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Lazy f53502j = yhm.j.b(new e70(13));
    public final koi.k d;
    public final boolean e;
    public final ihm.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f53503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f53504h;
    public final Rect i;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeToActionDelegate$SwipeAction;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SwipeAction implements qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f53506b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53507c;
        public final xh0 d;
        public final String e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f53508g;

        public SwipeAction(String id10, Image image, Clause text, xh0 actionStyle, String str, Object obj2, AnalyticsContext analyticsContext, int i) {
            actionStyle = (i & 8) != 0 ? xh0.PRIMARY : actionStyle;
            str = (i & 16) != 0 ? null : str;
            obj2 = (i & 32) != 0 ? null : obj2;
            analyticsContext = (i & 64) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(actionStyle, "actionStyle");
            this.f53505a = id10;
            this.f53506b = image;
            this.f53507c = text;
            this.d = actionStyle;
            this.e = str;
            this.f = obj2;
            this.f53508g = analyticsContext;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF53602m() {
            return this.f;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SwipeAction)) {
                return false;
            }
            SwipeAction swipeAction = (SwipeAction) obj2;
            return Intrinsics.f(this.f53505a, swipeAction.f53505a) && Intrinsics.f(this.f53506b, swipeAction.f53506b) && Intrinsics.f(this.f53507c, swipeAction.f53507c) && this.d == swipeAction.d && Intrinsics.f(this.e, swipeAction.e) && Intrinsics.f(this.f, swipeAction.f) && Intrinsics.f(this.f53508g, swipeAction.f53508g);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55166j() {
            return this.f53508g;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + p.a.a(a10.b.c(this.f53506b, this.f53505a.hashCode() * 31, 31), 31, this.f53507c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Object obj2 = this.f;
            int iHashCode3 = (iHashCode2 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53508g;
            return iHashCode3 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53508g = parcelable;
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.SwipeToActionDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static abstract class b {
        private b() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToActionDelegate(koi.k innerDelegate, boolean z) {
        super(R$layout.internal_delegate_swipe_to_action, new od0(innerDelegate, 2));
        Intrinsics.checkNotNullParameter(innerDelegate, "innerDelegate");
        this.d = innerDelegate;
        this.e = z;
        this.f = v0.a.d("create(...)");
        this.f53503g = v0.a.d("create(...)");
        this.f53504h = new Rect();
        this.i = new Rect();
    }

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
    public static void s(zh0 target, int i) {
        if (i == -1) {
            return;
        }
        ViewParent parent = target.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        vu0.e.Companion.getClass();
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Object tag2 = recyclerView.getTag(R$id.internal_swipe_item_manager_tag);
        vu0.e eVar = tag2 instanceof vu0.e ? (vu0.e) tag2 : null;
        if (eVar == null) {
            eVar = new vu0.e();
            recyclerView.setTag(R$id.internal_swipe_item_manager_tag, eVar);
        }
        boolean z = target.k;
        Intrinsics.checkNotNullParameter(target, "target");
        SwipeToActionLayout swipeToActionLayout = target.f;
        if (z) {
            if (eVar.f292146a == i) {
                swipeToActionLayout.setPendingItems();
                swipeToActionLayout.addOnLayoutChangeListener(new vu0.h(eVar, i, target, swipeToActionLayout));
            } else {
                swipeToActionLayout.a(false);
            }
        }
        int i2 = vu0.e.f292145c;
        if (swipeToActionLayout.getTag(i2) == null) {
            vu0.f swipeMemory = new vu0.f(eVar, i);
            Intrinsics.checkNotNullParameter(swipeMemory, "listener");
            swipeToActionLayout.f57614b.add(swipeMemory);
            Intrinsics.checkNotNullParameter(swipeMemory, "swipeMemory");
            vu0.g gVar = new vu0.g();
            gVar.f292150a = swipeMemory;
            swipeToActionLayout.setTag(i2, gVar);
            eVar.f292147b.add(swipeToActionLayout);
        } else {
            Object tag3 = swipeToActionLayout.getTag(i2);
            Intrinsics.i(tag3, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.swipelayout.SwipeItemManager.ValueBox");
            ((vu0.g) tag3).f292150a.f292148a = i;
        }
        target.k = false;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        zh0 zh0Var = new zh0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_swipe_to_action));
        koi.k kVar = this.d;
        SwipeToActionLayout swipeToActionLayout = zh0Var.f;
        RecyclerView.ViewHolder viewHolderG = kVar.g(swipeToActionLayout);
        if (this.e) {
            float f = ((Boolean) jo0.g.O.getValue()).booleanValue() ? 0.3f : 0.25f;
            swipeToActionLayout.setSwipeAreas$ui_kit_components_release(f, f);
        }
        yh0 yh0Var = new yh0();
        Intrinsics.checkNotNullParameter(yh0Var, "<set-?>");
        zh0Var.f167467h = yh0Var;
        Intrinsics.checkNotNullParameter(viewHolderG, "<set-?>");
        zh0Var.f167466g = viewHolderG;
        yh0 listener = zh0Var.f167467h;
        if (listener == null) {
            Intrinsics.r("swipeListener");
            throw null;
        }
        Intrinsics.checkNotNullParameter(listener, "listener");
        swipeToActionLayout.f57614b.add(listener);
        swipeToActionLayout.addView(viewHolderG.itemView);
        bi0 bi0Var = new bi0(this, zh0Var);
        Intrinsics.checkNotNullParameter(bi0Var, "<set-?>");
        zh0Var.f167468j = bi0Var;
        return zh0Var;
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List payloads) {
        qv0.k o;
        zh0 holder = (zh0) bVar;
        wh data = (wh) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        qv0.i iVar = data.f54925b;
        List<SwipeAction> list = data.f54926c;
        iVar.j(c.C1364c.f249512a);
        qv0.i iVar2 = data.f54925b;
        boolean z = iVar2 instanceof qv0.l;
        if (z) {
            ((qv0.l) iVar2).R0(data.f54932n);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof wh0) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj3 = ((wh0) arrayList.get(i2)).f167030a;
            if (obj3 != null) {
                arrayList2.add(obj3);
            }
        }
        Object objF = holder.F();
        SwipeToActionLayout swipeToActionLayout = holder.f;
        this.d.p((RecyclerView.ViewHolder) objF, iVar2, i, arrayList2);
        List listJ = nkm.y.J(nkm.y.z(zhm.d0.Q(arrayList), new ip0.za(24)));
        boolean zIsEmpty = arrayList.isEmpty();
        boolean zIsEmpty2 = listJ.isEmpty();
        Iterator it8 = listJ.iterator();
        while (it8.hasNext()) {
            zIsEmpty2 = zIsEmpty2 || ((qv0.b) it8.next()).a();
        }
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            zIsEmpty = zIsEmpty || ((wh0) it9.next()).f167032c;
        }
        Context context = holder.itemView.getContext();
        Intrinsics.h(context);
        int iK = kli.a.k(context, 4.0f);
        int i3 = -iK;
        if (zIsEmpty) {
            switch (ai0.f163455a[data.f54932n.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    View view = holder.itemView;
                    view.setPadding(view.getPaddingLeft() + iK, holder.itemView.getPaddingTop(), holder.itemView.getPaddingRight() + iK, holder.itemView.getPaddingBottom());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (zIsEmpty2) {
            qv0.l lVar2 = z ? (qv0.l) iVar2 : null;
            if (lVar2 == null || (o = lVar2.getF53464w()) == null) {
                o = qv0.k.OutOfGroup;
            }
            switch (ai0.f163455a[o.ordinal()]) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    ((RecyclerView.ViewHolder) holder.F()).itemView.setPadding(((RecyclerView.ViewHolder) holder.F()).itemView.getPaddingLeft() + i3, ((RecyclerView.ViewHolder) holder.F()).itemView.getPaddingTop(), ((RecyclerView.ViewHolder) holder.F()).itemView.getPaddingRight() + i3, ((RecyclerView.ViewHolder) holder.F()).itemView.getPaddingBottom());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (arrayList.isEmpty()) {
            swipeToActionLayout.setItems(list, vu0.s.FROM_END_TO_START);
            swipeToActionLayout.setThresholdToOpenView(BitmapDescriptorFactory.HUE_RED);
        } else {
            int size2 = arrayList.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (((wh0) arrayList.get(i5)).f167031b) {
                    swipeToActionLayout.setItems(list, vu0.s.FROM_END_TO_START);
                    r(data, holder);
                }
            }
        }
        AnimationRequest animationRequest = data.d;
        if (animationRequest == null || animationRequest.f57724a) {
            animationRequest = null;
        }
        holder.i = animationRequest;
        w(holder);
        swipeToActionLayout.setOnActionClickListener(new th0(holder, this, data));
        swipeToActionLayout.setOnLongSwipeTriggered(new th0(this, holder, data));
        yh0 yh0Var = holder.f167467h;
        if (yh0Var == null) {
            Intrinsics.r("swipeListener");
            throw null;
        }
        yh0Var.f167314a = new uh0(this, data, 0);
        if (yh0Var == null) {
            Intrinsics.r("swipeListener");
            throw null;
        }
        yh0Var.f167315b = new uh0(this, data, 1);
        r(data, holder);
        holder.k = payloads.isEmpty();
        s(holder, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(com.revolut.core.ui_kit.delegates.wh r21, ip0.zh0 r22) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.SwipeToActionDelegate.r(com.revolut.core.ui_kit.delegates.wh, ip0.zh0):void");
    }

    public final void t(SwipeToActionLayout swipeToActionLayout, wh whVar, SwipeAction swipeAction, vh0 vh0Var) {
        or0.u.k(swipeToActionLayout).n0().a(swipeToActionLayout, swipeAction, new py0.c(swipeAction.f53507c));
        this.f.onNext(new vh(swipeAction, whVar.f54925b, vh0Var));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void n(zh0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewParent parent = holder.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        s(holder, holder.getBindingAdapterPosition());
        w(holder);
        bi0 bi0Var = holder.f167468j;
        if (bi0Var == null) {
            Intrinsics.r("demoAnimationScrollListener");
            throw null;
        }
        recyclerView.addOnScrollListener(bi0Var);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        itemView.addOnLayoutChangeListener(new bx0.v(this, holder, 7));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void o(zh0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewParent parent = holder.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            bi0 bi0Var = holder.f167468j;
            if (bi0Var != null) {
                recyclerView.removeOnScrollListener(bi0Var);
            } else {
                Intrinsics.r("demoAnimationScrollListener");
                throw null;
            }
        }
    }

    public final void w(zh0 zh0Var) {
        AnimationRequest animationRequest = zh0Var.i;
        if (animationRequest == null) {
            return;
        }
        gu0.a aVar = null;
        if (animationRequest.f57724a) {
            zh0Var.i = null;
            return;
        }
        ViewParent parent = zh0Var.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null && recyclerView.getScrollState() == 0) {
            boolean zIsShown = zh0Var.itemView.isShown();
            float fMin = BitmapDescriptorFactory.HUE_RED;
            if (zIsShown) {
                ViewParent parent2 = zh0Var.itemView.getParent();
                RecyclerView recyclerView2 = parent2 instanceof RecyclerView ? (RecyclerView) parent2 : null;
                if (recyclerView2 != null) {
                    float height = zh0Var.itemView.getHeight();
                    Float fValueOf = Float.valueOf(height);
                    if (height <= BitmapDescriptorFactory.HUE_RED) {
                        fValueOf = null;
                    }
                    if (fValueOf != null) {
                        float fFloatValue = fValueOf.floatValue();
                        float width = zh0Var.itemView.getWidth();
                        Float fValueOf2 = Float.valueOf(width);
                        if (width <= BitmapDescriptorFactory.HUE_RED) {
                            fValueOf2 = null;
                        }
                        if (fValueOf2 != null) {
                            float fFloatValue2 = fValueOf2.floatValue();
                            Rect rect = this.i;
                            if (recyclerView2.getGlobalVisibleRect(rect)) {
                                rect.top = recyclerView2.getPaddingTop() + rect.top;
                                rect.bottom -= recyclerView2.getPaddingBottom();
                                View view = zh0Var.itemView;
                                Rect rect2 = this.f53504h;
                                if (view.getGlobalVisibleRect(rect2) && rect2.intersect(rect)) {
                                    fMin = Math.min(rect2.height() / fFloatValue, rect2.width() / fFloatValue2);
                                }
                            }
                        }
                    }
                }
            }
            if (fMin >= 1.0f) {
                animationRequest.f57724a = true;
                zh0Var.i = null;
                wu0.d dVar = zh0Var.f.demoController;
                dVar.getClass();
                SwipeToActionLayout swipeToActionLayout = dVar.f300049a;
                Context context = swipeToActionLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                if (jq0.a.a(context)) {
                    dVar.a();
                    swipeToActionLayout.setPendingItems();
                    if (!ViewCompat.isLaidOut(swipeToActionLayout) || swipeToActionLayout.isLayoutRequested()) {
                        aVar = new gu0.a(swipeToActionLayout, 8, dVar);
                        swipeToActionLayout.addOnLayoutChangeListener(aVar);
                    } else {
                        wu0.b bVar = new wu0.b(dVar, 1);
                        dVar.d = bVar;
                        Handler handler = dVar.f300050b;
                        Context context2 = swipeToActionLayout.getContext();
                        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                        handler.postDelayed(bVar, (long) (jq0.a.b(context2) * 1000));
                    }
                    dVar.f300051c = aVar;
                }
            }
        }
    }
}

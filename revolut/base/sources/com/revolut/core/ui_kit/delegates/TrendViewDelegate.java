package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.diagram.TrendView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.hm0;
import ip0.jm0;
import ip0.km0;
import ip0.lm0;
import ip0.ri0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004:\u0003\u0002\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TrendViewDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/jm0;", "Lip0/km0;", "", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TrendViewDelegate extends BaseRecyclerViewDelegate<jm0, km0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f53561c;
    public final ihm.b d;
    public final ihm.f e;

    public static abstract class a {

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.TrendViewDelegate$a$a, reason: collision with other inner class name */
        public static final class C0428a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0428a f53562a = new C0428a();

            private C0428a() {
            }

            @Override // com.revolut.core.ui_kit.delegates.TrendViewDelegate.a
            public final jm0 a() {
                return null;
            }
        }

        private a() {
        }

        public abstract jm0 a();
    }

    public TrendViewDelegate(long j2) {
        super(R$layout.internal_delegate_trend_view, new ri0(22));
        this.f53561c = j2;
        ihm.b bVarE = ihm.b.e(a.C0428a.f53562a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.d = bVarE;
        this.e = v0.a.d("create(...)");
    }

    public static void p(km0 km0Var, hm0 hm0Var) {
        float f;
        int i = lm0.f165227a[hm0Var.ordinal()];
        if (i == 1) {
            f = 1.0f;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 2.5f;
        }
        km0Var.f.setLineWidthDp(f);
    }

    public static void q(km0 km0Var, hw0.t tVar) {
        if (tVar instanceof hw0.s) {
            km0Var.f.setEmptyPeriod(((hw0.s) tVar).f156019a);
            return;
        }
        if (!(tVar instanceof hw0.r)) {
            if (tVar != null) {
                throw new NoWhenBranchMatchedException();
            }
            km0Var.f.setEmptyPeriod(null);
            return;
        }
        List list = ((hw0.r) tVar).f156018a;
        Context context = km0Var.itemView.getContext();
        ArrayList segments = new ArrayList(list.size());
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            hw0.l lVar = (hw0.l) list.get(i2);
            aw0.cb cbVar = lVar.e;
            float f = lVar.f156010a;
            float f4 = lVar.f156011b;
            boolean z = lVar.f156012c;
            boolean z3 = lVar.d;
            Intrinsics.h(context);
            segments.add(new ht0.e0(f, f4, z, z3, gc0.c.r(cbVar, context)));
        }
        Intrinsics.checkNotNullParameter(segments, "segments");
        List<ht0.e0> listP0 = zhm.d0.P0(segments, new ht0.d0());
        aim.e eVarB = zhm.u.b();
        float f5 = 0.0f;
        for (ht0.e0 e0Var : listP0) {
            float f6 = e0Var.f155138b;
            float f32 = f5 - 1.0E-5f;
            if (f32 <= f6) {
                eVarB.add(f32 > e0Var.f155137a ? new ht0.e0(f5, f6, e0Var.f155139c, e0Var.d, e0Var.e) : e0Var);
                f5 = e0Var.f155138b;
            }
        }
        aim.e eVarA = zhm.u.a(eVarB);
        aim.e eVarB2 = zhm.u.b();
        ListIterator listIterator = eVarA.listIterator(0);
        float f35 = 0.0f;
        while (true) {
            aim.b bVar = (aim.b) listIterator;
            if (!bVar.hasNext()) {
                break;
            }
            ht0.e0 e0Var2 = (ht0.e0) bVar.next();
            float f36 = f35 + 1.0E-5f;
            float f37 = e0Var2.f155137a;
            if (f36 < f37) {
                eVarB2.add(new ht0.e0(f35, f37, false, false, null));
            }
            f35 = e0Var2.f155138b;
        }
        if (f35 + 1.0E-5f < 1.0f) {
            eVarB2.add(new ht0.e0(f35, 1.0f, false, false, null));
        }
        ArrayList arrayList = new ArrayList();
        int size2 = eVarA.size();
        while (i < size2) {
            ht0.e0 e0Var3 = (ht0.e0) eVarA.get(i);
            i++;
            ht0.e0 e0Var4 = (ht0.e0) zhm.d0.e0(i, eVarA);
            if (e0Var4 == null || e0Var3.f155138b + 1.0E-5f < e0Var4.f155137a || !e0Var3.d || e0Var4.f155139c) {
                eVarB2.add(e0Var3);
                while (!arrayList.isEmpty()) {
                    Object objRemoveLast = arrayList.removeLast();
                    Intrinsics.checkNotNullExpressionValue(objRemoveLast, "removeLast(...)");
                    eVarB2.add(objRemoveLast);
                }
            } else {
                arrayList.add(e0Var3);
            }
        }
        km0Var.f.setColorSegments(zhm.u.a(eVarB2));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(parent.getContext()).inflate(this.f98535a, parent, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return new km0(viewInflate);
    }

    public final efm.r r() {
        efm.r rVarHide = this.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(final km0 holder, jm0 data, int i, List payloads) {
        final int i2;
        List<hw0.k> list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        LottieAnimationView lottieAnimationView = holder.f165041g;
        TrendView trendView = holder.f;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof br0.a) {
                arrayList.add(obj2);
            }
        }
        Iterator it8 = arrayList.iterator();
        final int i3 = 0;
        boolean z = false;
        while (true) {
            i2 = 1;
            if (!it8.hasNext()) {
                break;
            }
            br0.a aVar = (br0.a) it8.next();
            boolean z3 = aVar.f17869q;
            boolean z4 = aVar.f17860b;
            Boolean bool = aVar.e;
            if (z3 || bool != null) {
                uw0.i iVar = data.G;
                if (data.f164883h) {
                    iVar = null;
                }
                trendView.setDataChangeAnimationRequest(iVar);
            }
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                if (zBooleanValue) {
                    this.d.onNext(a.C0428a.f53562a);
                }
                lottieAnimationView.setVisibility(zBooleanValue ? 0 : 8);
                if (zBooleanValue) {
                    lottieAnimationView.post(new Runnable() { // from class: ip0.gm0
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    holder.f165041g.resumeAnimation();
                                    break;
                                default:
                                    holder.f165041g.resumeAnimation();
                                    break;
                            }
                        }
                    });
                }
                trendView.setVisibility(!zBooleanValue ? 0 : 8);
            }
            if (z4 && (list = data.f164881c) != null) {
                List<hw0.k> it9 = list;
                Intrinsics.checkNotNullParameter(it9, "it");
                trendView.setData(it9);
                Unit unit = Unit.f186387a;
            }
            if (aVar.f17868p) {
                trendView.setDraggableLimitData(data.f164891s);
            }
            if (aVar.f17863h || z4) {
                Pair pair = data.f164884j;
                if (pair != null) {
                    trendView.setMinMaxOverride(((Number) pair.f186385a).floatValue(), ((Number) pair.f186386b).floatValue());
                } else if (data.f164891s == null) {
                    trendView.E = false;
                    trendView.e();
                    trendView.r();
                }
            }
            if (aVar.f17864j) {
                trendView.setAdditionalChartData(data.f164887n);
            }
            if (aVar.f17862g) {
                trendView.setLines((List) data.F.getValue());
            }
            if (aVar.f17867n) {
                q(holder, data.f164890r);
            }
            if (aVar.i) {
                trendView.setYAxisBadges(data.f164886m);
            }
            if (aVar.f17859a) {
                aw0.cb cbVar = data.f164880b;
                Context context = holder.itemView.getContext();
                Intrinsics.h(context);
                trendView.setColors(gc0.c.r(cbVar, context));
            }
            Boolean bool2 = aVar.f;
            if (bool2 != null) {
                trendView.setLastPointCircle(bool2.booleanValue());
            }
            if (aVar.k) {
                trendView.setSmoother(aw0.m1.a(data.o, trendView));
            }
            if (aVar.f17865l) {
                p(holder, data.f164888p);
            }
            if (aVar.f17866m) {
                View itemView = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                or0.b.c(this, data, itemView, false, null, 28);
            }
            if (aVar.o) {
                trendView.setIntervalSelectionEnabled(data.f164885l);
            }
            if (aVar.f17870r) {
                hx7.b.v(trendView, data.f164892t);
            }
            if (aVar.f17871s) {
                trendView.setTouchEnabled(data.k);
            }
            if (aVar.f17872t) {
                data.getClass();
                trendView.setContentDescription((Clause) null);
            }
            if (aVar.u) {
                trendView.setDefaultCursorDataIndex(data.u);
            }
            z = true;
        }
        trendView.setListener(new ni(this, data));
        trendView.setDraggableLimitsListener$ui_kit_components_release(new oi(this, data));
        final km0 km0Var = !z ? holder : null;
        if (km0Var != null) {
            LottieAnimationView lottieAnimationView2 = km0Var.f165041g;
            TrendView trendView2 = km0Var.f;
            ViewGroup.LayoutParams layoutParams = km0Var.itemView.getLayoutParams();
            Context context2 = km0Var.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int i5 = data.i;
            hw0.f fVar = data.f164891s;
            boolean z6 = data.f164883h;
            layoutParams.height = kli.a.k(context2, i5);
            trendView2.setAnimationDuration(this.f53561c);
            if (!z6) {
                trendView2.setDataChangeAnimationRequest(data.G);
            }
            lottieAnimationView2.setVisibility(z6 ? 0 : 8);
            trendView2.setVisibility(!z6 ? 0 : 8);
            if (z6) {
                lottieAnimationView2.post(new Runnable() { // from class: ip0.gm0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i2) {
                            case 0:
                                km0Var.f165041g.resumeAnimation();
                                break;
                            default:
                                km0Var.f165041g.resumeAnimation();
                                break;
                        }
                    }
                });
            }
            trendView2.setIntervalSelectionEnabled(data.f164885l);
            trendView2.setTouchEnabled(data.k);
            trendView2.setContentDescription((Clause) null);
            trendView2.setDefaultCursorDataIndex(data.u);
            View itemView2 = km0Var.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
            List<hw0.k> list2 = data.f164881c;
            if (list2 != null) {
                List<hw0.k> it10 = list2;
                Intrinsics.checkNotNullParameter(it10, "it");
                trendView2.setData(it10);
                Unit unit2 = Unit.f186387a;
            }
            trendView2.setDraggableLimitData(fVar);
            trendView2.setAdditionalChartData(data.f164887n);
            trendView2.setLines((List) data.F.getValue());
            Pair pair2 = data.f164884j;
            if (pair2 != null) {
                trendView2.setMinMaxOverride(((Number) pair2.f186385a).floatValue(), ((Number) pair2.f186386b).floatValue());
            } else if (fVar == null) {
                trendView2.E = false;
                trendView2.e();
                trendView2.r();
            }
            trendView2.setYAxisBadges(data.f164886m);
            trendView2.setLastPointCircle(data.d);
            aw0.cb cbVar2 = data.f164880b;
            Context context3 = holder.itemView.getContext();
            Intrinsics.h(context3);
            trendView.setColors(gc0.c.r(cbVar2, context3));
            q(holder, data.f164890r);
            trendView2.setSmoother(aw0.m1.a(data.o, trendView2));
            hx7.b.v(trendView2, data.f164892t);
            p(holder, data.f164888p);
        }
    }
}

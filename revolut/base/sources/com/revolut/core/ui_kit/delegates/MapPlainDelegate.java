package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.fv;
import ip0.ws;
import ip0.ww;
import ip0.yw;
import ip0.zw;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0007\u0002\u0007\b\t\n\u0003\u000bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/MapPlainDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/d9;", "Lcom/revolut/core/ui_kit/delegates/y8;", "<init>", "()V", "Companion", "ip0/ww", "ip0/yw", "b", "c", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapPlainDelegate extends BaseRecyclerViewDelegate<d9, y8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52768c;
    public final ihm.f d;
    public th0.b e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f52769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f52770h;
    public final Object i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f52771j;
    public final Object k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f52772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f52773m;

    public static abstract class b {
        private b() {
        }
    }

    public static abstract class c {
        private c() {
        }
    }

    public MapPlainDelegate() {
        super(R$layout.internal_delegate_map_plain, new fv(8));
        this.f52768c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
        final int i = 0;
        this.f = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        this.f52769g = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i3 = 2;
        this.f52770h = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i5 = 3;
        this.i = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i6 = 4;
        this.f52771j = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i21 = 5;
        this.k = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i22 = 6;
        this.f52772l = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
        final int i32 = 7;
        this.f52773m = te0.w.y0(new Function0(this) { // from class: ip0.vw

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MapPlainDelegate f166901b;

            {
                this.f166901b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        if (this.f166901b.e != null) {
                            return new ai0.m();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 1:
                        if (this.f166901b.e != null) {
                            return new ai0.p();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 2:
                        if (this.f166901b.e != null) {
                            return new ai0.l();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 3:
                        if (this.f166901b.e != null) {
                            return new ai0.o();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 4:
                        if (this.f166901b.e != null) {
                            return new ai0.u();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 5:
                        if (this.f166901b.e != null) {
                            return new ai0.b();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    case 6:
                        if (this.f166901b.e != null) {
                            return new com.revolut.core.mobile_services.impl.map.a();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                    default:
                        if (this.f166901b.e != null) {
                            return new ai0.f();
                        }
                        Intrinsics.r("mapServices");
                        throw null;
                }
            }
        });
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        c cVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(holder, "holder");
        y8 y8Var = holder instanceof y8 ? (y8) holder : null;
        if (y8Var == null || !y8Var.f55630l || (cVar = y8Var.f55635r) == null) {
            return;
        }
        if (!(cVar instanceof b9)) {
            ai0.k kVar = y8Var.o;
            if (kVar != null) {
                kVar.f5155a.clear();
                return;
            } else {
                Intrinsics.r("map");
                throw null;
            }
        }
        ai0.e eVar = y8Var.f55633p;
        if (eVar == null) {
            Intrinsics.r("clusterManager");
            throw null;
        }
        eVar.b();
        eVar.c();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(y8 holder, d9 data, int i, List payloads) {
        MapPlainDelegate mapPlainDelegate;
        int iK;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ?? r3 = holder.f55629j;
        ?? r4 = holder.f55628h;
        List list = payloads;
        boolean zIsEmpty = list.isEmpty();
        boolean zIsEmpty2 = list.isEmpty();
        boolean zIsEmpty3 = list.isEmpty();
        boolean zIsEmpty4 = list.isEmpty();
        boolean zIsEmpty5 = list.isEmpty();
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof yw) {
                zIsEmpty = zIsEmpty || ((yw) next).f167361a;
                zIsEmpty2 = zIsEmpty2 || ((yw) next).f167362b;
                zIsEmpty3 = zIsEmpty3 || ((yw) next).f167363c;
                zIsEmpty4 = zIsEmpty4 || ((yw) next).d;
                if (!zIsEmpty5 && !((yw) next).e) {
                    z = false;
                }
                zIsEmpty5 = z;
            }
        }
        if (zIsEmpty) {
            holder.H(data.f54015b);
        }
        if (zIsEmpty2) {
            holder.I(data.d);
        }
        if (zIsEmpty3) {
            holder.J(data.f54016c);
        }
        if (zIsEmpty4) {
            ww wwVar = data.e;
            Object value = holder.i.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            kli.a.b((AppCompatTextView) value, wwVar != null ? wwVar.f167065a : null, ty0.f.f275450a);
            Object value2 = holder.k.getValue();
            Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
            zi0.c.g((AppCompatImageView) value2, wwVar != null ? wwVar.f167067c : null);
            Object value3 = r3.getValue();
            Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
            kli.a.e((AppCompatTextView) value3, wwVar != null ? wwVar.f167066b : null, new i4g.g(1, holder.u.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 20), null, 0, 12);
            Object value4 = r3.getValue();
            Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
            ((AppCompatTextView) value4).setMovementMethod((((wwVar != null ? wwVar.f167066b : null) instanceof aw0.fa) && (((aw0.fa) wwVar.f167066b).getD() instanceof Click)) ? ix0.c0.f169220a : null);
        }
        if (!zIsEmpty5) {
            mapPlainDelegate = this;
        } else if (data.f54020l) {
            Object value5 = r4.getValue();
            Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
            mapPlainDelegate = this;
            ((View) value5).setOnClickListener(new ws(mapPlainDelegate, data, 3));
        } else {
            mapPlainDelegate = this;
            Object value6 = r4.getValue();
            Intrinsics.checkNotNullExpressionValue(value6, "getValue(...)");
            ((View) value6).setOnClickListener(null);
            Object value7 = r4.getValue();
            Intrinsics.checkNotNullExpressionValue(value7, "getValue(...)");
            ((View) value7).setClickable(false);
        }
        Context context = holder.itemView.getContext();
        if (zw.f167543a[data.k.ordinal()] == 1) {
            iK = -1;
        } else {
            Intrinsics.h(context);
            iK = kli.a.k(context, data.k.a());
        }
        FrameLayout frameLayoutF = holder.F();
        ViewGroup.LayoutParams layoutParams = frameLayoutF.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = iK;
        frameLayoutF.setLayoutParams(marginLayoutParams);
        if (Intrinsics.f(data.f54021m, c.b.f249511a) || (data.f54021m instanceof c.a)) {
            or0.b.b(mapPlainDelegate, new c.e(qv0.h.LARGE, 2), holder.F(), false, null, null, null, 56);
            Intrinsics.h(context);
            int iK2 = kli.a.k(context, 4.0f);
            FrameLayout frameLayoutF2 = holder.F();
            ViewGroup.LayoutParams layoutParams2 = frameLayoutF2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams2.setMargins(iK2, iK2, iK2, iK2);
            frameLayoutF2.setLayoutParams(marginLayoutParams2);
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }

    @Override // koi.k
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final y8 g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        or0.u.h(parent).getClass();
        this.e = th0.g.a();
        return new y8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_map_plain), this);
    }
}

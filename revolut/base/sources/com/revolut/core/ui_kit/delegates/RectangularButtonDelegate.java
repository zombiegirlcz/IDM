package com.revolut.core.ui_kit.delegates;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.t90;
import ip0.x90;
import ip0.y90;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RectangularButtonDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/RectangularButtonDelegate$Model;", "Lip0/y90;", "<init>", "()V", "Model", "ip0/x90", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RectangularButtonDelegate extends BaseRecyclerViewDelegate<Model, y90> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53149c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/RectangularButtonDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53150a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f53151b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ResourceImage f53152c;
        public final boolean d;
        public final boolean e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f53153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public qv0.c f53154h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53155j;
        public p31.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f53156l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f53157m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f53158n;
        public final int o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f53159p;

        public Model(String listId, Clause title, ResourceImage icon, Object obj2, int i) {
            obj2 = (i & 8) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(icon, "icon");
            int i2 = R$attr.uikit_dp0;
            this.f53150a = listId;
            this.f53151b = title;
            this.f53152c = icon;
            this.d = true;
            this.e = true;
            this.f = obj2;
            this.f53153g = null;
            this.f53154h = c.d.f249513a;
            this.i = null;
            this.f53155j = null;
            this.k = null;
            this.f53156l = null;
            this.f53157m = i2;
            this.f53158n = i2;
            this.o = i2;
            this.f53159p = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new RectangularButtonDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getU() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53228a() {
            return this.f53150a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53150a, model.f53150a) && this.f53151b.equals(model.f53151b) && this.f53152c.equals(model.f53152c) && this.d == model.d && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53153g, model.f53153g) && Intrinsics.f(this.f53154h, model.f53154h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53155j, model.f53155j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f53156l, model.f53156l) && this.f53157m == model.f53157m && this.f53158n == model.f53158n && this.o == model.o && this.f53159p == model.f53159p;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getA() {
            return this.f53157m;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f53157m = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f53153g;
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(org.bouncycastle.jcajce.provider.digest.a.b(this.f53152c, p.a.b(this.f53150a.hashCode() * 31, 31, this.f53151b), 31), 31, this.d), 31, this.e);
            Object obj2 = this.f;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f53153g;
            int i = h30.l.i(this.f53154h, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.i;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53155j;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.k;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53156l;
            return Integer.hashCode(this.f53159p) + j6.a.b(this.o, j6.a.b(this.f53158n, j6.a.b(this.f53157m, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF53242w() {
            return this.i;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f53154h = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF53243x() {
            return this.f53155j;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.k = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getB() {
            return this.f53158n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getD() {
            return this.f53159p;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53158n = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getV() {
            return this.f53154h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getZ() {
            return this.f53156l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53244y() {
            return this.k;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.i = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53153g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getC() {
            return this.o;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53155j = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53156l = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new x90(!model.f53151b.equals(this.f53151b), !model.f53152c.equals(this.f53152c), model.d != this.d, model.e != this.e, or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public RectangularButtonDelegate() {
        super(R$layout.internal_delegate_rectangular_button, new t90(1));
        this.f53149c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new y90(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_rectangular_button));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v16, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(y90 holder, Model item, int i, List payloads) {
        int iD;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, item, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        boolean z = zN5;
        while (true) {
            boolean z3 = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof x90) {
                zN = zN || ((x90) next).f167114a;
                zN2 = zN2 || ((x90) next).f167115b;
                zN3 = zN3 || ((x90) next).e;
                zN4 = zN4 || ((x90) next).f167116c;
                if (!z && !((x90) next).d) {
                    z3 = false;
                }
                z = z3;
            }
        }
        if (zN) {
            kli.a.b(holder.f, item.f53151b, ty0.f.f275450a);
        }
        if (zN2) {
            zi0.c.g(holder.f167289g, item.f53152c);
        }
        if (zN3 || zN4 || z) {
            View view = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            boolean z4 = item.d;
            Rect rect = new Rect(null);
            Color solid = item.e ? new Color.Solid(R$attr.uikit_colorActionBackgroundNeutral) : new Color.Composite(R$attr.uikit_colorActionBackgroundNeutral, R$attr.uikit_colorDisabledBackground_60, ho0.a.OVERLAY);
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(item, "item");
            Intrinsics.checkNotNullParameter(view, "view");
            or0.b.a(this, item, view, z4, new dr0.i(solid), rect);
        }
        if (z) {
            float f = item.e ? 1.0f : 0.4f;
            View view2 = holder.itemView;
            Intrinsics.i(view2, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view2;
            int childCount = viewGroup.getChildCount();
            for (iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, f, iD, 1)) {
            }
        }
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        py0.c cVar = new py0.c(item.f53151b);
        boolean z6 = item.d;
        or0.m.a(itemView);
        if (z6) {
            itemView.setOnClickListener(new ip0.d6(item, cVar, holder, this, item, 8));
        } else {
            or0.u.o(itemView);
        }
    }
}

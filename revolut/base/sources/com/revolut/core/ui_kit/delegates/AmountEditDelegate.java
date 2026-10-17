package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.amount.AmountEditView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0004\u0006\u0007\u0003\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AmountEditDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/AmountEditDelegate$Model;", "Lip0/t0;", "", "Companion", "Model", "ip0/s0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AmountEditDelegate extends BaseRecyclerViewDelegate<Model, ip0.t0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function2 f51621c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f51622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f51623h;
    public final e01.a i;

    public AmountEditDelegate() {
        this(null);
    }

    public static efm.r r(efm.r rVar, ip0.t0 t0Var, Clause clause) {
        efm.r rVarDoOnNext = rVar.doOnNext(new ip0.w(new ijg.c(clause, t0Var, 23), 8));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.t0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_amount_edit));
    }

    public final void p(ip0.t0 t0Var, Model model) {
        ViewGroup.LayoutParams layoutParams = t0Var.f.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int iA = (dr0.b.o(model.f51637t) || dr0.b.p(model.u, model.f51637t)) ? com.google.android.gms.internal.mlkit_vision_face.a.a(t0Var.itemView, "getContext(...)", 8.0f) : 0;
        if (marginLayoutParams.leftMargin != iA || marginLayoutParams.topMargin != iA || marginLayoutParams.rightMargin != iA || marginLayoutParams.bottomMargin != iA) {
            marginLayoutParams.setMargins(iA, iA, iA, iA);
            t0Var.f.setLayoutParams(marginLayoutParams);
        }
        View itemView = t0Var.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.d(this, model, itemView, false, null, 28);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.t0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        AmountEditView amountEditView = holder.f;
        Function2 function2 = this.f51621c;
        if (function2 != null) {
            amountEditView.setMaskingDelegate((yz0.b) function2.invoke(data, amountEditView));
        }
        if (payloads.isEmpty()) {
            amountEditView.setEnabled(data.f51628h);
            amountEditView.setAmountType(data.f51625b);
            amountEditView.setAmountTypeImage(data.i);
            amountEditView.setAmountInput(data.f51626c);
            amountEditView.setHint(data.f, bw0.n.START);
            amountEditView.setHint(data.f51627g, bw0.n.END);
            amountEditView.setChevron(data.d);
            amountEditView.setSwitcher(data.e);
            p(holder, data);
        } else {
            for (Object obj2 : payloads) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.AmountEditDelegate.Payload");
                ip0.s0 s0Var = (ip0.s0) obj2;
                bw0.h hVar = s0Var.f166266h;
                if (s0Var.i) {
                    amountEditView.setEnabled(data.f51628h);
                }
                if (s0Var.f166262a) {
                    amountEditView.setAmountType(data.f51625b);
                }
                if (s0Var.f166263b) {
                    amountEditView.setAmountTypeImage(data.i);
                }
                if (s0Var.f166264c && (!hVar.f19183h || hVar.equals(data.f51626c))) {
                    amountEditView.setAmountInput(hVar);
                }
                if (s0Var.f) {
                    amountEditView.setHint(data.f, bw0.n.START);
                }
                if (s0Var.f166265g) {
                    amountEditView.setHint(data.f51627g, bw0.n.END);
                }
                if (s0Var.d) {
                    amountEditView.setChevron(data.d);
                }
                if (s0Var.e) {
                    amountEditView.setSwitcher(data.e);
                }
                if (s0Var.f166267j) {
                    p(holder, data);
                }
            }
        }
        amountEditView.setSuggestionsSourceId(data.f51624a);
        ix0.t tVar = amountEditView.D;
        ihm.f fVar = amountEditView.f58934h;
        this.d.a(tVar.g(), holder);
        efm.r map = amountEditView.f58932b.map(new ip0.w(new ip0.r0(data, 1), 11));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.e.a(r(map, holder, data.f51625b), holder);
        efm.r map2 = fVar.filter(new ip0.w(new im3.e(29), 12)).map(new ip0.w(new ip0.r0(data, 4), 5));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        bw0.m mVar = data.f;
        this.f.a(r(map2, holder, mVar != null ? mVar.f19188a : null), holder);
        efm.r map3 = fVar.filter(new ip0.w(new im3.e(28), 6)).map(new ip0.w(new ip0.r0(data, 0), 7));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        bw0.m mVar2 = data.f51627g;
        this.f51622g.a(r(map3, holder, mVar2 != null ? mVar2.f19188a : null), holder);
        efm.r map4 = amountEditView.f.map(new ip0.w(new ip0.r0(data, 2), 9));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.f51623h.a(r(map4, holder, null), holder);
        efm.r map5 = amountEditView.f58933g.map(new ip0.w(new ip0.r0(data, 3), 10));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        this.i.a(map5, holder);
    }

    public AmountEditDelegate(Function2 function2) {
        super(R$layout.internal_delegate_amount_edit, new ip0.c(10));
        this.f51621c = function2;
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f51622g = new e01.a();
        this.f51623h = new e01.a();
        this.i = new e01.a();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AmountEditDelegate$Model;", "Lqv0/l;", "Lqv0/n;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.n, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51625b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bw0.h f51626c;
        public final nx0.e d;
        public final nx0.g e;
        public final bw0.m f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final bw0.m f51627g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f51628h;
        public final Image i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f51629j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51630l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51631m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51632n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f51633p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f51634q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f51635r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f51636s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public qv0.c f51637t;
        public qv0.k u;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause amountType, boolean z, bw0.h amountInputModel, bw0.m mVar, bw0.m mVar2, Object obj2, CurrencyImage currencyImage, int i) {
            Object obj3 = (i & 64) != 0 ? null : obj2;
            CurrencyImage currencyImage2 = (i & 256) != 0 ? null : currencyImage;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(amountType, "amountType");
            Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
            this(listId, amountType, amountInputModel, z ? nx0.e.AMOUNT : nx0.e.NONE, nx0.g.NONE, mVar, mVar2, false, obj3, currencyImage2, 128);
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52162g() {
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.u = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new AmountEditDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55176j() {
            return this.f51629j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55172b() {
            return this.f51624a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51624a, model.f51624a) && Intrinsics.f(this.f51625b, model.f51625b) && Intrinsics.f(this.f51626c, model.f51626c) && this.d == model.d && this.e == model.e && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f51627g, model.f51627g) && this.f51628h == model.f51628h && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51629j, model.f51629j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51630l, model.f51630l) && Intrinsics.f(this.f51631m, model.f51631m) && Intrinsics.f(this.f51632n, model.f51632n) && Intrinsics.f(this.o, model.o) && this.f51633p == model.f51633p && this.f51634q == model.f51634q && this.f51635r == model.f51635r && this.f51636s == model.f51636s && Intrinsics.f(this.f51637t, model.f51637t) && this.u == model.u;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getU() {
            return this.f51633p;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getU() {
            return this.u;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51633p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55175h() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f51626c.hashCode() + p.a.a(this.f51624a.hashCode() * 31, 31, this.f51625b)) * 31)) * 31)) * 31;
            bw0.m mVar = this.f;
            int iHashCode2 = (iHashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
            bw0.m mVar2 = this.f51627g;
            int iC = j6.a.c((iHashCode2 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31, 31, this.f51628h);
            Image image = this.i;
            int iHashCode3 = (iC + (image == null ? 0 : image.hashCode())) * 31;
            Object obj2 = this.f51629j;
            int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            int iHashCode5 = (iHashCode4 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            p31.c cVar = this.f51630l;
            int iHashCode6 = (iHashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51631m;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51632n;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return this.u.hashCode() + h30.l.i(this.f51637t, j6.a.b(this.f51636s, j6.a.b(this.f51635r, j6.a.b(this.f51634q, j6.a.b(this.f51633p, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getZ() {
            return this.f51630l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51637t = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getA() {
            return this.f51631m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51632n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getV() {
            return this.f51634q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF51745x() {
            return this.f51636s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51634q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF51746y() {
            return this.f51637t;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getC() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getB() {
            return this.f51632n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51630l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF51744w() {
            return this.f51635r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51631m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            Model model = (Model) oldItem;
            return new ip0.s0(this.f51626c, !Intrinsics.f(this.f51625b, model.f51625b), !Intrinsics.f(this.i, model.i), !Intrinsics.f(this.f51626c, model.f51626c), this.d != model.d, this.e != model.e, !Intrinsics.f(this.f, model.f), !Intrinsics.f(this.f51627g, model.f51627g), this.f51628h != model.f51628h, or0.b.m(this, (qv0.l) oldItem));
        }

        public Model(String listId, Clause amountType, bw0.h amountInputModel, nx0.e chevron, nx0.g switcher, bw0.m mVar, bw0.m mVar2, boolean z, Object obj2, Image image, int i) {
            chevron = (i & 8) != 0 ? nx0.e.NONE : chevron;
            switcher = (i & 16) != 0 ? nx0.g.NONE : switcher;
            z = (i & 128) != 0 ? true : z;
            obj2 = (i & 256) != 0 ? null : obj2;
            image = (i & 1024) != 0 ? null : image;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(amountType, "amountType");
            Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
            Intrinsics.checkNotNullParameter(chevron, "chevron");
            Intrinsics.checkNotNullParameter(switcher, "switcher");
            int i2 = R$attr.uikit_dp0;
            qv0.k kVar = qv0.k.OutOfGroup;
            this.f51624a = listId;
            this.f51625b = amountType;
            this.f51626c = amountInputModel;
            this.d = chevron;
            this.e = switcher;
            this.f = mVar;
            this.f51627g = mVar2;
            this.f51628h = z;
            this.i = image;
            this.f51629j = obj2;
            this.k = null;
            this.f51630l = null;
            this.f51631m = null;
            this.f51632n = null;
            this.o = null;
            this.f51633p = i2;
            this.f51634q = i2;
            this.f51635r = i2;
            this.f51636s = i2;
            this.f51637t = c.d.f249513a;
            this.u = kVar;
        }
    }
}

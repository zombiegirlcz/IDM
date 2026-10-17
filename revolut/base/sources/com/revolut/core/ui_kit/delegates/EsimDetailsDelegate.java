package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.CutoutImageView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EsimDetailsDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/EsimDetailsDelegate$Model;", "Lip0/hg;", "<init>", "()V", "Model", "ip0/gg", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EsimDetailsDelegate extends BaseGroupRecyclerViewDelegate<Model, ip0.hg> {
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.f f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/EsimDetailsDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Lqv0/l;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem, qv0.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TagViewData f52245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final aw0.o3 f52246c;
        public final List d;
        public final boolean e;
        public int f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52247g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f52248h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f52249j;
        public Parcelable k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52250l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52251m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52252n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public qv0.c f52253p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public qv0.k f52254q;

        public Model(String listId, TagViewData tag2, aw0.o3 o3Var, List additionalDescriptions, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(tag2, "tag");
            Intrinsics.checkNotNullParameter(additionalDescriptions, "additionalDescriptions");
            qv0.k kVar = qv0.k.OutOfGroup;
            int i = R$attr.uikit_dp0;
            this.f52244a = listId;
            this.f52245b = tag2;
            this.f52246c = o3Var;
            this.d = additionalDescriptions;
            this.e = true;
            this.f = i;
            this.f52247g = i;
            this.f52248h = i;
            this.i = i;
            this.f52249j = obj2;
            this.k = parcelable;
            this.f52250l = null;
            this.f52251m = null;
            this.f52252n = null;
            this.o = null;
            this.f52253p = c.d.f249513a;
            this.f52254q = kVar;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1, reason: from getter */
        public final boolean getE() {
            return this.e;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f52254q = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new EsimDetailsDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getD() {
            return this.f52249j;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55246b() {
            return this.f52244a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52244a, model.f52244a) && Intrinsics.f(this.f52245b, model.f52245b) && Intrinsics.f(this.f52246c, model.f52246c) && Intrinsics.f(this.d, model.d) && this.e == model.e && this.f == model.f && this.f52247g == model.f52247g && this.f52248h == model.f52248h && this.i == model.i && Intrinsics.f(this.f52249j, model.f52249j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52250l, model.f52250l) && Intrinsics.f(this.f52251m, model.f52251m) && Intrinsics.f(this.f52252n, model.f52252n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f52253p, model.f52253p) && this.f52254q == model.f52254q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF55039l() {
            return this.f;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getF51942h() {
            return this.f52254q;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.k;
        }

        public final int hashCode() {
            int iHashCode = (this.f52245b.hashCode() + (this.f52244a.hashCode() * 31)) * 31;
            aw0.o3 o3Var = this.f52246c;
            int iB = j6.a.b(this.i, j6.a.b(this.f52248h, j6.a.b(this.f52247g, j6.a.b(this.f, j6.a.c(j6.a.c(p.a.d((iHashCode + (o3Var == null ? 0 : o3Var.hashCode())) * 31, 31, this.d), 31, false), 31, this.e), 31), 31), 31), 31);
            Object obj2 = this.f52249j;
            int iHashCode2 = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.k;
            int iHashCode3 = (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            p31.c cVar = this.f52250l;
            int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52251m;
            int iHashCode5 = (iHashCode4 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52252n;
            int iHashCode6 = (iHashCode5 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return this.f52254q.hashCode() + h30.l.i(this.f52253p, (iHashCode6 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55036g() {
            return this.f52250l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f52253p = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55037h() {
            return this.f52251m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52252n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55040m() {
            return this.f52247g;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getO() {
            return this.i;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52247g = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF() {
            return this.f52253p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55038j() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getI() {
            return this.f52252n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52250l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.k = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55041n() {
            return this.f52248h;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52251m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            aw0.o3 o3Var = model.f52246c;
            aw0.o3 o3Var2 = this.f52246c;
            return new ip0.gg(!Intrinsics.f(o3Var2 != null ? o3Var2.f10452b : null, o3Var != null ? o3Var.f10452b : null), !Intrinsics.f(o3Var2 != null ? o3Var2.f10451a : null, o3Var != null ? o3Var.f10451a : null), !Intrinsics.f(o3Var2 != null ? o3Var2.f10453c : null, o3Var != null ? o3Var.f10453c : null), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.f52245b, model.f52245b), false, or0.b.m(this, (qv0.l) oldItem));
        }
    }

    public EsimDetailsDelegate() {
        super(R$layout.internal_delegate_esim_details, new ip0.zf(3));
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.hg(kotlin.jvm.internal.s.r(parent, this.f58165c));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    public final void q(koi.b bVar, qv0.l lVar, int i, List list) {
        List payloads = list;
        ip0.hg holder = (ip0.hg) bVar;
        Model data = (Model) lVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.q(holder, data, i, payloads);
        AppCompatTextView appCompatTextView = holder.f164548h;
        CutoutImageView cutoutImageView = holder.i;
        AvatarView avatarView = holder.f164547g;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.gg)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        int size2 = payloads.size();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.gg ggVar = (ip0.gg) payloads.get(i3);
            zIsEmpty = zIsEmpty || ggVar.f164412a;
            z = z || ggVar.f164413b;
            z3 = z3 || ggVar.f164414c;
            z4 = z4 || ggVar.d;
            z6 = z6 || ggVar.e;
            z11 = z11 || ggVar.f;
        }
        if (zIsEmpty) {
            aw0.o3 o3Var = data.f52246c;
            if ((o3Var != null ? o3Var.f10452b : null) != null) {
                avatarView.setDefaultAvatarStyle$ui_kit_components_release(mx0.i1.SIZE_24_24);
                avatarView.setModel(o3Var.f10452b);
            }
            avatarView.setVisibility((o3Var != null ? o3Var.f10452b : null) != null ? 0 : 8);
        }
        if (z) {
            aw0.o3 o3Var2 = data.f52246c;
            kli.a.b(appCompatTextView, o3Var2 != null ? o3Var2.f10451a : null, ty0.f.f275450a);
        }
        if (z4) {
            List additionalDescriptions = data.d;
            hsa.l onLinkClick = new hsa.l(holder, 23, data, this);
            LinearLayout linearLayout = holder.f164549j;
            Intrinsics.checkNotNullParameter(additionalDescriptions, "additionalDescriptions");
            Intrinsics.checkNotNullParameter(onLinkClick, "onLinkClick");
            Context context = holder.itemView.getContext();
            while (additionalDescriptions.size() > linearLayout.getChildCount()) {
                Intrinsics.h(context);
                linearLayout.addView(new ms0.r0(context, null, 6, 0), new ViewGroup.MarginLayoutParams(-1, -2));
            }
            while (additionalDescriptions.size() < linearLayout.getChildCount()) {
                linearLayout.removeViewAt(linearLayout.getChildCount() - 1);
            }
            int i5 = 0;
            for (Object obj2 : additionalDescriptions) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    zhm.v.s();
                    throw null;
                }
                aw0.n3 n3Var = (aw0.n3) obj2;
                View childAt = linearLayout.getChildAt(i5);
                Intrinsics.i(childAt, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.EsimDetailsAdditionalDescriptionView");
                ms0.r0 r0Var = (ms0.r0) childAt;
                r0Var.setLabel(n3Var.f10431a, onLinkClick);
                r0Var.setStartImage(n3Var.f10432b);
                i5 = i6;
            }
        }
        if (z6) {
            holder.f.setContent(data.f52245b);
        }
        if (z11) {
            data.getClass();
            View view = holder.itemView;
            Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int iD = 0; iD < childCount; iD = m72.b.d(viewGroup, iD, 1.0f, iD, 1)) {
            }
        }
        boolean z12 = data.e;
        aw0.o3 o3Var3 = data.f52246c;
        if (z12) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = o3Var3 != null ? new py0.c(o3Var3.f10451a) : null;
            or0.m.a(itemView);
            itemView.setOnClickListener(new ip0.ig(data, cVar, this, data, 0));
        } else {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.u.o(itemView2);
        }
        zi0.c.h(cutoutImageView, o3Var3 != null ? o3Var3.f10453c : null, z3, new a2.a(holder, 18, data, this), false);
        r(appCompatTextView, holder, data, pd.b.j(o3Var3 != null ? Boolean.TRUE : null));
        r(cutoutImageView, holder, data, pd.b.j(o3Var3 != null ? Boolean.TRUE : null));
    }

    public final void r(View view, ip0.hg hgVar, Model model, boolean z) {
        pd.b.q(view, z);
        pd.b.h(view, z);
        if (!z) {
            or0.u.o(view);
        } else {
            aw0.o3 o3Var = model.f52246c;
            or0.u.r(view, model, o3Var != null ? o3Var.f10451a : null, new j01.c(new View[]{hgVar.f164548h, hgVar.i}, model, this.e, null, 24));
        }
    }
}

package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.ao;
import ip0.as;
import ip0.bs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseGroupRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;", "Lip0/bs;", "<init>", "()V", "Model", "ip0/as", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LargeActionButtonDelegate extends BaseGroupRecyclerViewDelegate<Model, bs> {
    public final e01.a d;

    public LargeActionButtonDelegate() {
        super(R$layout.internal_delegate_large_action_button, new akg.d(20));
        this.d = new e01.a();
    }

    public static int r(Context context, p31.c cVar, int i) {
        sq0.j jVar = cVar instanceof sq0.j ? (sq0.j) cVar : null;
        return kli.a.w(i, context) + (jVar != null ? kli.a.w(jVar.v(), context) : 0);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new bs(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_large_action_button));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseGroupRecyclerViewDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void p(bs holder, Model data, int i, List payloads) {
        Model model;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (Intrinsics.f(data.getE(), c.d.f249513a)) {
            model = data;
            super.p(holder, Model.e(model, null, 0, 0, 0, 0, 1017855), i, payloads);
            Context context = holder.itemView.getContext();
            View view = holder.itemView;
            Intrinsics.h(context);
            view.setPadding(r(context, model.getF52112m(), model.getI()), r(context, model.getK(), model.getF52108g()), r(context, model.getF52113n(), model.getF52110j()), r(context, model.getF52111l(), model.getF52109h()));
        } else {
            model = data;
            super.p(holder, model, i, payloads);
        }
        ArrayList<as> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            as asVar = obj2 instanceof as ? (as) obj2 : null;
            if (asVar != null) {
                arrayList.add(asVar);
            }
        }
        if (arrayList.isEmpty()) {
            holder.F().o(model.getF52614b());
            holder.F().setIcon(model.getF52615c());
            holder.F().setBadge(model.getD());
            holder.F().setText(model.getE());
            holder.F().setEnabled(model.getF());
            holder.F().setLoadingButtonTag(model.getF52616g());
            holder.F().setCustomE2ETestId(model.getF52617h());
        } else {
            for (as asVar2 : arrayList) {
                if (asVar2.e()) {
                    holder.F().setIcon(model.getF52615c());
                }
                if (asVar2.b()) {
                    holder.F().setBadge(model.getD());
                }
                if (asVar2.h()) {
                    holder.F().setText(model.getE());
                }
                if (asVar2.g()) {
                    holder.F().o(model.getF52614b());
                }
                if (asVar2.d()) {
                    holder.F().setEnabled(model.getF());
                }
                if (asVar2.f()) {
                    holder.F().setLoadingButtonTag(model.getF52616g());
                }
                if (asVar2.c()) {
                    holder.F().setCustomE2ETestId(model.getF52617h());
                }
            }
        }
        holder.F().setAnalyticsContext(model.getF());
        efm.r map = holder.F().o.map(new ao(23, new ip0.ad(model, 16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.d.a(map, holder);
    }

    /* JADX INFO: loaded from: classes19.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LargeActionButtonDelegate$Model;", "Lqv0/l;", "Lqv0/p;", "Lgx0/a;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.l, qv0.p, gx0.a, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LargeActionButton.ButtonStyle f52614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f52615c;
        public final NewBadgeContent d;
        public final Clause e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f52616g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f52617h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Parcelable f52618j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52619l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52620m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52621n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52622p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52623q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f52624r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f52625s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public qv0.k f52626t;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, LargeActionButton.ButtonStyle style, Image image, Clause clause, boolean z, String str, String str2, Object obj2, AnalyticsContext analyticsContext, int i) {
            boolean z3 = (i & 32) != 0 ? true : z;
            String str3 = (i & 64) != 0 ? null : str;
            String str4 = (i & 128) != 0 ? null : str2;
            Object obj3 = (i & 256) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 512) != 0 ? null : analyticsContext;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, style, image, null, clause, z3, str3, str4, obj3, analyticsContext2, 0, 0, 0, 0, 1046528);
        }

        public static Model e(Model model, jjb.g gVar, int i, int i2, int i3, int i5, int i6) {
            String listId = model.f52613a;
            LargeActionButton.ButtonStyle style = model.f52614b;
            Image image = model.f52615c;
            NewBadgeContent newBadgeContent = model.d;
            Clause clause = model.e;
            boolean z = model.f;
            String str = model.f52616g;
            String str2 = model.f52617h;
            Object obj2 = (i6 & 256) != 0 ? model.i : gVar;
            Parcelable parcelable = model.f52618j;
            Object obj3 = obj2;
            qv0.c positionInBox = model.k;
            p31.c cVar = (i6 & 2048) != 0 ? model.f52619l : null;
            p31.c cVar2 = (i6 & 4096) != 0 ? model.f52620m : null;
            p31.c cVar3 = (i6 & 8192) != 0 ? model.f52621n : null;
            p31.c cVar4 = (i6 & 16384) != 0 ? model.o : null;
            int i21 = (i6 & 32768) != 0 ? model.f52622p : i;
            int i22 = (i6 & 65536) != 0 ? model.f52623q : i2;
            int i32 = (i6 & 131072) != 0 ? model.f52624r : i3;
            int i33 = (i6 & 262144) != 0 ? model.f52625s : i5;
            qv0.k positionInGroup = model.f52626t;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            return new Model(listId, style, image, newBadgeContent, clause, z, str, str2, obj3, parcelable, positionInBox, cVar, cVar2, cVar3, cVar4, i21, i22, i32, i33, positionInGroup);
        }

        /* JADX INFO: renamed from: A, reason: from getter */
        public final String getF52616g() {
            return this.f52616g;
        }

        /* JADX INFO: renamed from: B, reason: from getter */
        public final LargeActionButton.ButtonStyle getF52614b() {
            return this.f52614b;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final Clause getE() {
            return this.e;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: C1 */
        public final boolean getF52234l() {
            return false;
        }

        @Override // qv0.l
        public final void R0(qv0.k kVar) {
            Intrinsics.checkNotNullParameter(kVar, "<set-?>");
            this.f52626t = kVar;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new LargeActionButtonDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55197h() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55194b() {
            return this.f52613a;
        }

        @Override // gx0.a
        public final py0.d d() {
            Clause clause = this.e;
            if (clause != null) {
                return new py0.c(clause);
            }
            Image image = this.f52615c;
            if (image != null) {
                return new py0.b(image);
            }
            return null;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52613a, model.f52613a) && Intrinsics.f(this.f52614b, model.f52614b) && Intrinsics.f(this.f52615c, model.f52615c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f52616g, model.f52616g) && Intrinsics.f(this.f52617h, model.f52617h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52618j, model.f52618j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52619l, model.f52619l) && Intrinsics.f(this.f52620m, model.f52620m) && Intrinsics.f(this.f52621n, model.f52621n) && Intrinsics.f(this.o, model.o) && this.f52622p == model.f52622p && this.f52623q == model.f52623q && this.f52624r == model.f52624r && this.f52625s == model.f52625s && this.f52626t == model.f52626t;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52108g() {
            return this.f52622p;
        }

        @Override // qv0.l
        /* JADX INFO: renamed from: f0, reason: from getter */
        public final qv0.k getO() {
            return this.f52626t;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52622p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f52618j;
        }

        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final Image getF52615c() {
            return this.f52615c;
        }

        public final int hashCode() {
            int iD = r6.b.d(this.f52614b, this.f52613a.hashCode() * 31, 31);
            Image image = this.f52615c;
            int iHashCode = (iD + (image == null ? 0 : image.hashCode())) * 31;
            NewBadgeContent newBadgeContent = this.d;
            int iHashCode2 = (iHashCode + (newBadgeContent == null ? 0 : newBadgeContent.hashCode())) * 31;
            Clause clause = this.e;
            int iC = j6.a.c((iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f);
            String str = this.f52616g;
            int iHashCode3 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f52617h;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Object obj2 = this.i;
            int iHashCode5 = (iHashCode4 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f52618j;
            int i = h30.l.i(this.k, (iHashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52619l;
            int iHashCode6 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52620m;
            int iHashCode7 = (iHashCode6 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52621n;
            int iHashCode8 = (iHashCode7 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return this.f52626t.hashCode() + j6.a.b(this.f52625s, j6.a.b(this.f52624r, j6.a.b(this.f52623q, j6.a.b(this.f52622p, (iHashCode8 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getK() {
            return this.f52619l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52111l() {
            return this.f52620m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52621n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52109h() {
            return this.f52623q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52110j() {
            return this.f52625s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52623q = i;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final NewBadgeContent getD() {
            return this.d;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getE() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52113n() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52112m() {
            return this.f52621n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52619l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52618j = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.f52624r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52620m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        /* JADX INFO: renamed from: x, reason: from getter */
        public final String getF52617h() {
            return this.f52617h;
        }

        /* JADX INFO: renamed from: y, reason: from getter */
        public final boolean getF() {
            return this.f;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof Model ? (Model) oldItem : null) == null) {
                return null;
            }
            return new as(!Intrinsics.f(r0.f52615c, this.f52615c), !Intrinsics.f(r0.d, this.d), !Intrinsics.f(r0.e, this.e), !Intrinsics.f(r0.f52614b, this.f52614b), ((Model) oldItem).f != this.f, !Intrinsics.f(r0.f52616g, this.f52616g), !Intrinsics.f(r0.f52617h, this.f52617h), or0.b.m(this, (qv0.l) oldItem));
        }

        public Model(String listId, LargeActionButton.ButtonStyle style, Image image, NewBadgeContent newBadgeContent, Clause clause, boolean z, String str, String str2, Object obj2, Parcelable parcelable, qv0.c positionInBox, p31.c cVar, p31.c cVar2, p31.c cVar3, p31.c cVar4, int i, int i2, int i3, int i5, qv0.k positionInGroup) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            Intrinsics.checkNotNullParameter(positionInGroup, "positionInGroup");
            this.f52613a = listId;
            this.f52614b = style;
            this.f52615c = image;
            this.d = newBadgeContent;
            this.e = clause;
            this.f = z;
            this.f52616g = str;
            this.f52617h = str2;
            this.i = obj2;
            this.f52618j = parcelable;
            this.k = positionInBox;
            this.f52619l = cVar;
            this.f52620m = cVar2;
            this.f52621n = cVar3;
            this.o = cVar4;
            this.f52622p = i;
            this.f52623q = i2;
            this.f52624r = i3;
            this.f52625s = i5;
            this.f52626t = positionInGroup;
        }

        public /* synthetic */ Model(String str, LargeActionButton.ButtonStyle buttonStyle, Image image, NewBadgeContent newBadgeContent, Clause clause, boolean z, String str2, String str3, Object obj2, Parcelable parcelable, int i, int i2, int i3, int i5, int i6) {
            this(str, buttonStyle, image, (i6 & 8) != 0 ? null : newBadgeContent, clause, z, str2, str3, obj2, parcelable, c.d.f249513a, null, null, null, null, (i6 & 32768) != 0 ? R$attr.uikit_dp0 : i, (i6 & 65536) != 0 ? R$attr.uikit_dp0 : i2, (i6 & 131072) != 0 ? R$attr.uikit_dp0 : i3, (i6 & 262144) != 0 ? R$attr.uikit_dp0 : i5, qv0.k.OutOfGroup);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, LargeActionButton.ButtonStyle style, ResourceImage resourceImage, Clause clause, boolean z, String str, Object obj2, int i, int i2, int i3, int i5, int i6) {
            boolean z3 = (i6 & 16) != 0 ? true : z;
            String str2 = (i6 & 32) != 0 ? null : str;
            Object obj3 = (i6 & 128) != 0 ? null : obj2;
            int i21 = (i6 & 512) != 0 ? R$attr.uikit_dp0 : i;
            int i22 = (i6 & 1024) != 0 ? R$attr.uikit_dp0 : i2;
            int i32 = (i6 & 2048) != 0 ? R$attr.uikit_dp0 : i3;
            int i33 = (i6 & 4096) != 0 ? R$attr.uikit_dp0 : i5;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(style, "style");
            this(listId, style, resourceImage, null, clause, z3, str2, null, obj3, null, i21, i22, i32, i33, 555016);
        }
    }
}

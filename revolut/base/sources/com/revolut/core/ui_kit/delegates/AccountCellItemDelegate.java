package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.lb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AccountCellItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/AccountCellItemDelegate$Model;", "Lip0/b;", "<init>", "()V", "Model", "ip0/a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AccountCellItemDelegate extends BaseRecyclerViewDelegate<Model, ip0.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RowDelegate f51551c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/AccountCellItemDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/c", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f51553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f51554c;
        public final Clause d;
        public final c e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Clause f51555g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final RowDelegate.Model.c f51556h;
        public final ProgressStyle i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final CircleBadgeModel f51557j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51558l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51559m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51560n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f51561p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f51562q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final int f51563r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final int f51564s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Object f51565t;
        public Parcelable u;

        public /* synthetic */ Model(String str, boolean z, Image image, Clause clause, c cVar, boolean z3, Clause clause2, RowDelegate.Model.c cVar2, ProgressStyle progressStyle, CircleBadgeModel circleBadgeModel, int i, int i2, int i3, int i5, Object obj2, Parcelable parcelable) {
            this(str, z, image, clause, cVar, z3, clause2, cVar2, progressStyle, circleBadgeModel, c.d.f249513a, null, null, null, null, i, i2, i3, i5, obj2, parcelable);
        }

        public static Model e(Model model, String str, Object obj2, AnalyticsContext analyticsContext, int i) {
            String listId = (i & 1) != 0 ? model.f51552a : str;
            boolean z = model.f51553b;
            Image image = model.f51554c;
            Clause title = model.d;
            c state = model.e;
            boolean z3 = model.f;
            Clause clause = model.f51555g;
            RowDelegate.Model.c cVar = model.f51556h;
            ProgressStyle progressStyle = model.i;
            CircleBadgeModel circleBadgeModel = model.f51557j;
            model.getClass();
            qv0.c positionInBox = model.k;
            p31.c cVar2 = model.f51558l;
            p31.c cVar3 = model.f51559m;
            p31.c cVar4 = model.f51560n;
            p31.c cVar5 = model.o;
            int i2 = model.f51561p;
            int i3 = model.f51562q;
            int i5 = model.f51563r;
            int i6 = model.f51564s;
            Object obj3 = (i & PKIFailureInfo.badCertTemplate) != 0 ? model.f51565t : obj2;
            Parcelable parcelable = (i & PKIFailureInfo.badSenderNonce) != 0 ? model.u : analyticsContext;
            model.getClass();
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            return new Model(listId, z, image, title, state, z3, clause, cVar, progressStyle, circleBadgeModel, positionInBox, cVar2, cVar3, cVar4, cVar5, i2, i3, i5, i6, obj3, parcelable);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new AccountCellItemDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f51565t;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF58134a() {
            return this.f51552a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51552a, model.f51552a) && this.f51553b == model.f51553b && Intrinsics.f(this.f51554c, model.f51554c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f51555g, model.f51555g) && Intrinsics.f(this.f51556h, model.f51556h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51557j, model.f51557j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51558l, model.f51558l) && Intrinsics.f(this.f51559m, model.f51559m) && Intrinsics.f(this.f51560n, model.f51560n) && Intrinsics.f(this.o, model.o) && this.f51561p == model.f51561p && this.f51562q == model.f51562q && this.f51563r == model.f51563r && this.f51564s == model.f51564s && Intrinsics.f(this.f51565t, model.f51565t) && Intrinsics.f(this.u, model.u);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF58142n() {
            return this.f51561p;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51561p = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF58137g() {
            return this.u;
        }

        public final int hashCode() {
            int iC = j6.a.c((this.e.hashCode() + p.a.a(a10.b.c(this.f51554c, j6.a.c(this.f51552a.hashCode() * 31, 31, this.f51553b), 31), 31, this.d)) * 31, 31, this.f);
            Clause clause = this.f51555g;
            int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
            RowDelegate.Model.c cVar = this.f51556h;
            int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
            ProgressStyle progressStyle = this.i;
            int iHashCode3 = (iHashCode2 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.f51557j;
            int i = h30.l.i(this.k, (iHashCode3 + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 961, 31);
            p31.c cVar2 = this.f51558l;
            int iHashCode4 = (i + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51559m;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51560n;
            int iHashCode6 = (iHashCode5 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            p31.c cVar5 = this.o;
            int iB = j6.a.b(this.f51564s, j6.a.b(this.f51563r, j6.a.b(this.f51562q, j6.a.b(this.f51561p, (iHashCode6 + (cVar5 == null ? 0 : cVar5.hashCode())) * 31, 31), 31), 31), 31);
            Object obj2 = this.f51565t;
            int iHashCode7 = (iB + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.u;
            return iHashCode7 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF58139j() {
            return this.f51558l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f51559m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51560n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getO() {
            return this.f51562q;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF58144q() {
            return this.f51564s;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f51562q = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getI() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF58141m() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF58140l() {
            return this.f51560n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51558l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.u = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF58143p() {
            return this.f51563r;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51559m = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.o = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            ip0.a aVar = null;
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                boolean z = model.f51553b;
                boolean z3 = !Intrinsics.f(this.e, model.e);
                boolean zF = Intrinsics.f(this.f51554c, model.f51554c);
                boolean z4 = this.f51553b;
                aVar = new ip0.a(z3, new lb0((zF && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51557j, model.f51557j) && z4 == z) ? false : true, false, !Intrinsics.f(this.d, model.d), false, false, false, !Intrinsics.f(this.f51555g, model.f51555g), false, false, false, false, !Intrinsics.f(this.f51556h, model.f51556h), this.f != model.f, z4 != z, !Intrinsics.f(this.k, model.k), false, false, false, false, false, false, false, false, false));
            }
            return aVar;
        }

        public Model(String listId, boolean z, Image image, Clause title, c state, boolean z3, Clause clause, RowDelegate.Model.c cVar, ProgressStyle progressStyle, CircleBadgeModel circleBadgeModel, qv0.c positionInBox, p31.c cVar2, p31.c cVar3, p31.c cVar4, p31.c cVar5, int i, int i2, int i3, int i5, Object obj2, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(positionInBox, "positionInBox");
            this.f51552a = listId;
            this.f51553b = z;
            this.f51554c = image;
            this.d = title;
            this.e = state;
            this.f = z3;
            this.f51555g = clause;
            this.f51556h = cVar;
            this.i = progressStyle;
            this.f51557j = circleBadgeModel;
            this.k = positionInBox;
            this.f51558l = cVar2;
            this.f51559m = cVar3;
            this.f51560n = cVar4;
            this.o = cVar5;
            this.f51561p = i;
            this.f51562q = i2;
            this.f51563r = i3;
            this.f51564s = i5;
            this.f51565t = obj2;
            this.u = parcelable;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, boolean z, Image image, Clause title, c cVar, boolean z3, Clause clause, RowDelegate.Model.c.b bVar, ProgressStyle progressStyle, Object obj2, Parcelable parcelable, int i) {
            c state = (i & 16) != 0 ? b.f53699a : cVar;
            boolean z4 = (i & 32) != 0 ? true : z3;
            CircleBadgeModel circleBadgeModel = null;
            Clause clause2 = (i & 64) != 0 ? null : clause;
            RowDelegate.Model.c.b bVar2 = (i & 128) != 0 ? null : bVar;
            ProgressStyle progressStyle2 = (i & 256) != 0 ? null : progressStyle;
            Object obj3 = (i & 2048) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 4096) != 0 ? null : parcelable;
            int i2 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, z, image, title, state, z4, clause2, bVar2, progressStyle2, circleBadgeModel, i2, i2, i2, i2, obj3, parcelable2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, boolean z, Image image, Clause title, c cVar, boolean z3, Clause clause, RowDelegate.Model.c cVar2, CircleIconBadge circleIconBadge, Object obj2, AnalyticsContext analyticsContext, int i) {
            c state = (i & 16) != 0 ? b.f53699a : cVar;
            boolean z4 = (i & 32) != 0 ? true : z3;
            Clause clause2 = (i & 64) != 0 ? null : clause;
            RowDelegate.Model.c cVar3 = (i & 128) != 0 ? null : cVar2;
            Object obj3 = (i & 2048) != 0 ? null : obj2;
            AnalyticsContext analyticsContext2 = (i & 4096) != 0 ? null : analyticsContext;
            int i2 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(state, "state");
            this(listId, z, image, title, state, z4, clause2, cVar3, null, circleIconBadge, i2, i2, i2, i2, obj3, analyticsContext2);
        }
    }

    public AccountCellItemDelegate() {
        super(R$id.internal_account_cell_item_delegate_type, new ijj.r(29));
        this.f51551c = new RowDelegate(null, null, 7);
    }

    public static void r(Model model, ip0.b bVar) {
        float f = Intrinsics.f(model.e, b.f53699a) ? 1.0f : 0.5f;
        aim.o oVarA = zhm.y0.a(new aim.o());
        View view = bVar.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (!zhm.d0.T(oVarA, childAt)) {
                childAt.setAlpha(f);
            }
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f51551c.getClass();
        return new ip0.b(RowDelegate.A(parent));
    }

    public final void p(ip0.b bVar, Model model, int i, ip0.a aVar) {
        List listC = aVar == null ? zhm.f0.f322471a : zhm.u.c(aVar.f163355b);
        zf zfVar = bVar.f;
        String str = model.f51552a;
        boolean z = model.f51553b;
        Image image = model.f51554c;
        CircleBadgeModel circleBadgeModelB = model.f51557j;
        if (circleBadgeModelB == null) {
            circleBadgeModelB = d8l.d.b(z);
        }
        RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(image, circleBadgeModelB, model.i, false, null, false, 56);
        Clause clause = model.d;
        Clause clause2 = model.f51555g;
        RowDelegate.Model.c cVar = model.f51556h;
        boolean z3 = model.f;
        af.Companion.getClass();
        this.f51551c.p(zfVar, new RowDelegate.Model(str, image40, clause, null, 0, clause2, null, null, 0, 0, cVar, z3, z ? ze.f55694a : xe.f55602a, null, null, null, null, null, null, null, model.f51565t, model.k, model.f51558l, model.f51559m, model.f51560n, model.o, model.f51561p, model.f51562q, model.f51563r, model.f51564s, model.u, 272491480, 10), i, listC);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(ip0.b holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof ip0.a)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        if (payloads.isEmpty()) {
            p(holder, data, i, null);
            r(data, holder);
            return;
        }
        int size2 = payloads.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ip0.a aVar = (ip0.a) payloads.get(i3);
            p(holder, data, i, aVar);
            if (aVar.f163354a) {
                r(data, holder);
            }
        }
    }
}

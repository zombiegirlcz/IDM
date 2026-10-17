package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CenteredAmountDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CenteredAmountDelegate$Model;", "Lip0/d9;", "Companion", "ip0/b9", "Model", "ip0/c9", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CenteredAmountDelegate extends BaseRecyclerViewDelegate<Model, ip0.d9> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function2 f51963c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f51964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f51965h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f51966j;
    public final e01.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e01.a f51967l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e01.a f51968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e01.a f51969n;
    public final e01.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e01.a f51970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e01.a f51971q;

    public static final class a {
        private a() {
        }
    }

    public CenteredAmountDelegate() {
        this(null);
    }

    public static efm.r r(efm.r rVar, ip0.d9 d9Var, Clause clause) {
        efm.r rVarDoOnNext = rVar.doOnNext(new ip0.w(new ijg.c(clause, d9Var, 27), 29));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.d9(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_amount_centered));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0173  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.d9 r20, com.revolut.core.ui_kit.delegates.CenteredAmountDelegate.Model r21, int r22, java.util.List r23) {
        /*
            Method dump skipped, instruction units count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.CenteredAmountDelegate.p(ip0.d9, com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model, int, java.util.List):void");
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CenteredAmountDelegate$Model;", "Lkoi/j;", "Lqv0/n;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements koi.j, qv0.n, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f51973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final bw0.h f51974c;
        public final mx0.f3 d;
        public final bw0.m e;
        public final bw0.m f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ip0.b9 f51975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final aw0.i3 f51976h;
        public final bw0.a i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final jo0.b f51977j;
        public final mx0.l3 k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f51978l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51979m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51980n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Object f51981p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Parcelable f51982q;

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, bw0.h amountInputModel, mx0.f3 f3Var, bw0.m mVar, bw0.m mVar2, ip0.b9 heightMode, aw0.i3 i3Var, bw0.a aVar, jo0.a aVar2, mx0.l3 l3Var, Object obj2, Parcelable parcelable, int i) {
            Clause clause2 = (i & 2) != 0 ? null : clause;
            mx0.f3 f3Var2 = (i & 8) != 0 ? null : f3Var;
            bw0.m mVar3 = (i & 16) != 0 ? null : mVar;
            bw0.m mVar4 = (i & 32) != 0 ? null : mVar2;
            aw0.i3 i3Var2 = (i & 128) != 0 ? null : i3Var;
            bw0.a aVar3 = (i & 256) != 0 ? null : aVar;
            jo0.a aVar4 = (i & 512) != 0 ? null : aVar2;
            mx0.l3 l3Var2 = (i & 1024) != 0 ? null : l3Var;
            Object obj3 = (i & 2048) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 4096) != 0 ? null : parcelable;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
            Intrinsics.checkNotNullParameter(heightMode, "heightMode");
            this(listId, clause2, amountInputModel, f3Var2, mVar3, mVar4, heightMode, i3Var2, aVar3, aVar4, l3Var2, obj3, parcelable2);
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CenteredAmountDelegate(null);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55221j() {
            return this.f51981p;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55208b() {
            return this.f51972a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51972a, model.f51972a) && Intrinsics.f(this.f51973b, model.f51973b) && Intrinsics.f(this.f51974c, model.f51974c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f51975g == model.f51975g && Intrinsics.f(this.f51976h, model.f51976h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f51977j, model.f51977j) && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f51978l, model.f51978l) && Intrinsics.f(this.f51979m, model.f51979m) && Intrinsics.f(this.f51980n, model.f51980n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51981p, model.f51981p) && Intrinsics.f(this.f51982q, model.f51982q);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f51982q;
        }

        public final int hashCode() {
            int iHashCode = this.f51972a.hashCode() * 31;
            Clause clause = this.f51973b;
            int iHashCode2 = (this.f51974c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
            mx0.f3 f3Var = this.d;
            int iHashCode3 = (iHashCode2 + (f3Var == null ? 0 : f3Var.hashCode())) * 31;
            bw0.m mVar = this.e;
            int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
            bw0.m mVar2 = this.f;
            int iHashCode5 = (this.f51975g.hashCode() + ((iHashCode4 + (mVar2 == null ? 0 : mVar2.hashCode())) * 31)) * 31;
            aw0.i3 i3Var = this.f51976h;
            int iHashCode6 = (iHashCode5 + (i3Var == null ? 0 : i3Var.f10352a.hashCode())) * 31;
            bw0.a aVar = this.i;
            int iHashCode7 = (iHashCode6 + (aVar == null ? 0 : aVar.f19172a.hashCode())) * 31;
            jo0.b bVar = this.f51977j;
            int iHashCode8 = (iHashCode7 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            mx0.l3 l3Var = this.k;
            int iHashCode9 = (iHashCode8 + (l3Var == null ? 0 : l3Var.hashCode())) * 31;
            p31.c cVar = this.f51978l;
            int iHashCode10 = (iHashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51979m;
            int iHashCode11 = (iHashCode10 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f51980n;
            int iHashCode12 = (iHashCode11 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            int iHashCode13 = (iHashCode12 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31;
            Object obj2 = this.f51981p;
            int iHashCode14 = (iHashCode13 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f51982q;
            return iHashCode14 + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getO() {
            return this.f51978l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF51599p() {
            return this.f51979m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f51980n = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF51601r() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF51600q() {
            return this.f51980n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51978l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51982q = parcelable;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51979m = cVar;
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
            return new ip0.c9(!Intrinsics.f(this.f51973b, r14.f51973b), !Intrinsics.f(this.f51974c, r14.f51974c), !Intrinsics.f(this.e, r14.e), !Intrinsics.f(this.f, r14.f), !Intrinsics.f(this.d, r14.d), this.f51975g != ((Model) oldItem).f51975g, !Intrinsics.f(this.f51976h, r14.f51976h), !Intrinsics.f(this.i, r14.i), !Intrinsics.f(this.f51977j, r14.f51977j), !Intrinsics.f(this.k, r14.k));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, bw0.h amountInputModel, mx0.f3 f3Var, bw0.m mVar, bw0.m mVar2, mx0.i3 i3Var, boolean z, boolean z3, Object obj2, Parcelable parcelable, int i) {
            ip0.b9 b9Var;
            Clause clause2 = (i & 2) != 0 ? null : clause;
            mx0.f3 f3Var2 = (i & 8) != 0 ? null : f3Var;
            bw0.m mVar3 = (i & 16) != 0 ? null : mVar;
            bw0.m mVar4 = (i & 32) != 0 ? null : mVar2;
            mx0.i3 i3Var2 = (i & 64) != 0 ? null : i3Var;
            boolean z4 = (i & 128) != 0 ? false : z;
            boolean z6 = (i & 256) == 0 ? z3 : false;
            Object obj3 = (i & 512) != 0 ? null : obj2;
            Parcelable parcelable2 = (i & 1024) != 0 ? null : parcelable;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
            if (z4) {
                b9Var = ip0.b9.MATCH_PARENT;
            } else if (!z4) {
                b9Var = ip0.b9.WRAP_CONTENT_WITH_PADDINGS;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            CenteredAmountDelegate.Companion.getClass();
            this(listId, clause2, amountInputModel, f3Var2, mVar3, mVar4, b9Var, null, null, null, (i3Var2 != null || z6) ? new mx0.j3(i3Var2, z6) : null, obj3, parcelable2, 896);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(String listId, Clause clause, bw0.h amountInputModel, mx0.f3 f3Var, bw0.m mVar, mx0.i3 i3Var, ip0.b9 heightMode, Object obj2, int i) {
            Clause clause2 = (i & 2) != 0 ? null : clause;
            mx0.f3 f3Var2 = (i & 8) != 0 ? null : f3Var;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(amountInputModel, "amountInputModel");
            Intrinsics.checkNotNullParameter(heightMode, "heightMode");
            CenteredAmountDelegate.Companion.getClass();
            this(listId, clause2, amountInputModel, f3Var2, mVar, null, heightMode, null, null, null, i3Var != null ? new mx0.j3(i3Var, false) : null, obj2, null);
        }

        public Model(String str, Clause clause, bw0.h hVar, mx0.f3 f3Var, bw0.m mVar, bw0.m mVar2, ip0.b9 b9Var, aw0.i3 i3Var, bw0.a aVar, jo0.b bVar, mx0.l3 l3Var, Object obj2, Parcelable parcelable) {
            this.f51972a = str;
            this.f51973b = clause;
            this.f51974c = hVar;
            this.d = f3Var;
            this.e = mVar;
            this.f = mVar2;
            this.f51975g = b9Var;
            this.f51976h = i3Var;
            this.i = aVar;
            this.f51977j = bVar;
            this.k = l3Var;
            this.f51978l = null;
            this.f51979m = null;
            this.f51980n = null;
            this.o = null;
            this.f51981p = obj2;
            this.f51982q = parcelable;
        }
    }

    public CenteredAmountDelegate(Function2 function2) {
        super(R$layout.internal_delegate_amount_centered, new ip0.h8(8));
        this.f51963c = function2;
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f51964g = new e01.a();
        this.f51965h = new e01.a();
        this.i = new e01.a();
        this.f51966j = new e01.a();
        this.k = new e01.a();
        this.f51967l = new e01.a();
        this.f51968m = new e01.a();
        this.f51969n = new e01.a();
        this.o = new e01.a();
        this.f51970p = new e01.a();
        this.f51971q = new e01.a();
    }
}

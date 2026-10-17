package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LimitProgressBar;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0007\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DrivingScoreDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/DrivingScoreDelegate$Model;", "Lip0/ff;", "<init>", "()V", "Model", "ip0/ef", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DrivingScoreDelegate extends BaseRecyclerViewDelegate<Model, ip0.ff> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52207c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/DrivingScoreDelegate$Model;", "Lqv0/q;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextLocalisedClause f52208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Float f52209b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextClause f52210c;
        public final ResourceImage d;
        public final CompositeClause e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52212h;
        public final int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f52213j;
        public qv0.c k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public p31.c f52214l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f52215m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f52216n;
        public p31.c o;

        public Model(TextLocalisedClause title, Float f, TextClause textClause, ResourceImage resourceImage, CompositeClause compositeClause) {
            Intrinsics.checkNotNullParameter("SMART_DRIVING_SCORE", "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            int i = R$attr.uikit_dp0;
            this.f52208a = title;
            this.f52209b = f;
            this.f52210c = textClause;
            this.d = resourceImage;
            this.e = compositeClause;
            this.f = null;
            this.f52211g = i;
            this.f52212h = i;
            this.i = i;
            this.f52213j = i;
            this.k = c.d.f249513a;
            this.f52214l = null;
            this.f52215m = null;
            this.f52216n = null;
            this.o = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new DrivingScoreDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b */
        public final String getF51671a() {
            return "SMART_DRIVING_SCORE";
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return this.f52208a.equals(model.f52208a) && this.f52209b.equals(model.f52209b) && this.f52210c.equals(model.f52210c) && this.d.equals(model.d) && this.e.equals(model.e) && Intrinsics.f(this.f, model.f) && this.f52211g == model.f52211g && this.f52212h == model.f52212h && this.i == model.i && this.f52213j == model.f52213j && Intrinsics.f(this.k, model.k) && Intrinsics.f(this.f52214l, model.f52214l) && Intrinsics.f(this.f52215m, model.f52215m) && Intrinsics.f(this.f52216n, model.f52216n) && Intrinsics.f(this.o, model.o);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF52211g() {
            return this.f52211g;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f52211g = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.f;
        }

        public final int hashCode() {
            int iC = j6.a.c(h30.l.c(this.e, org.bouncycastle.jcajce.provider.digest.a.b(this.d, ip0.v7.b((this.f52209b.hashCode() + t61.a.a(-2064085828, 31, this.f52208a)) * 31, 961, this.f52210c), 31), 31), 31, true);
            Parcelable parcelable = this.f;
            int i = h30.l.i(this.k, j6.a.b(this.f52213j, j6.a.b(this.i, j6.a.b(this.f52212h, j6.a.b(this.f52211g, (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f52214l;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52215m;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52216n;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.o;
            return iHashCode3 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52214l() {
            return this.f52214l;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.k = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52215m() {
            return this.f52215m;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52216n = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52212h() {
            return this.f52212h;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52213j() {
            return this.f52213j;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52212h = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getK() {
            return this.k;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getO() {
            return this.o;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52216n() {
            return this.f52216n;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52214l = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52215m = cVar;
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
            return new ip0.ef(!model.f52208a.equals(this.f52208a), !model.f52210c.equals(this.f52210c), !true, !model.d.equals(this.d), !model.e.equals(this.e), !Intrinsics.e(model.f52209b, this.f52209b), false, !Intrinsics.f(model.k, this.k));
        }
    }

    public DrivingScoreDelegate() {
        super(R$layout.internal_delegate_driving_score, new ip0.lb(24));
        this.f52207c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.ff(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_driving_score));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.ff holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        boolean zN6 = ue0.e.n(payloads);
        boolean zN7 = ue0.e.n(payloads);
        boolean zN8 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof ip0.ef) {
                zN = zN || ((ip0.ef) next).f164074a;
                zN2 = zN2 || ((ip0.ef) next).f164075b;
                zN3 = zN3 || ((ip0.ef) next).f164076c;
                zN4 = zN4 || ((ip0.ef) next).d;
                zN5 = zN5 || ((ip0.ef) next).e;
                zN6 = zN6 || ((ip0.ef) next).f;
                zN7 = zN7 || ((ip0.ef) next).f164077g;
                if (!zN8 && !((ip0.ef) next).f164078h) {
                    z = false;
                }
                zN8 = z;
            }
        }
        if (zN) {
            or0.b.e(this, data.f52208a, holder.f, null, 12);
        }
        if (zN2) {
            or0.b.e(this, data.f52210c, holder.f164247g, null, 12);
        }
        if (zN3) {
            data.getClass();
            or0.b.e(this, null, holder.f164248h, null, 12);
        }
        if (zN4) {
            or0.b.f(this, data.d, holder.i);
        }
        if (zN5) {
            or0.b.e(this, data.e, holder.f164249j, null, 12);
        }
        if (zN6) {
            Float f = data.f52209b;
            LimitProgressBar limitProgressBar = holder.k;
            float fFloatValue = f.floatValue();
            int i2 = R$attr.uikit_colorBlue;
            limitProgressBar.b(new ms0.o1(fFloatValue, BitmapDescriptorFactory.HUE_RED, 100.0f, i2, 0, i2, R$attr.uikit_colorGreyTone10, 8.0f, 0L, null, false, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, false, 14866));
            limitProgressBar.setLimitEnabled(true);
        }
        if (zN7) {
            data.getClass();
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            py0.c cVar = new py0.c(data.f52208a);
            or0.m.a(itemView);
            itemView.setOnClickListener(new au0.i3(data, cVar, this, data, 22));
        }
        if (zN8) {
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            or0.b.c(this, data, itemView2, false, null, 28);
        }
    }
}

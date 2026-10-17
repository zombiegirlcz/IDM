package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.views.FcaDisclaimerView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FcaDisclaimerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/FcaDisclaimerDelegate$Model;", "Lip0/uh;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FcaDisclaimerDelegate extends BaseRecyclerViewDelegate<Model, ip0.uh> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52310c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/FcaDisclaimerDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final aw0.d4 f52312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Parcelable f52313c;
        public qv0.c d;
        public p31.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f52314g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52315h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f52316j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f52317l;

        public Model(String listId, aw0.d4 content, Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(content, "content");
            int i = R$attr.uikit_dp0;
            this.f52311a = listId;
            this.f52312b = content;
            this.f52313c = parcelable;
            this.d = c.d.f249513a;
            this.e = null;
            this.f = null;
            this.f52314g = null;
            this.f52315h = null;
            this.i = i;
            this.f52316j = i;
            this.k = i;
            this.f52317l = i;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new FcaDisclaimerDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55860a() {
            return this.f52311a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52311a, model.f52311a) && Intrinsics.f(this.f52312b, model.f52312b) && Intrinsics.f(this.f52313c, model.f52313c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52314g, model.f52314g) && Intrinsics.f(this.f52315h, model.f52315h) && this.i == model.i && this.f52316j == model.f52316j && this.k == model.k && this.f52317l == model.f52317l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getD() {
            return this.f52313c;
        }

        public final int hashCode() {
            int iHashCode = (this.f52312b.hashCode() + (this.f52311a.hashCode() * 31)) * 31;
            Parcelable parcelable = this.f52313c;
            int i = h30.l.i(this.d, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.e;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f52314g;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52315h;
            return Integer.hashCode(this.f52317l) + j6.a.b(this.k, j6.a.b(this.f52316j, j6.a.b(this.i, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55865j() {
            return this.e;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.d = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getK() {
            return this.f;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52314g = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55863g() {
            return this.f52316j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getI() {
            return this.f52317l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52316j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getE() {
            return this.d;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55867m() {
            return this.f52315h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF55866l() {
            return this.f52314g;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.e = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f52313c = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55864h() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f52315h = cVar;
        }
    }

    public FcaDisclaimerDelegate() {
        super(R$id.internal_delegateFcaDisclaimer, new ip0.zf(14));
        this.f52310c = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        FcaDisclaimerView fcaDisclaimerView = new FcaDisclaimerView(context, null, 6, 0);
        fcaDisclaimerView.setId(R$id.fcaDisclaimer_textView);
        fcaDisclaimerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new ip0.uh(fcaDisclaimerView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.uh holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        FcaDisclaimerView fcaDisclaimerView = holder.f;
        this.f52310c.a(fcaDisclaimerView.f56171a, holder);
        fcaDisclaimerView.setContent(data.f52312b);
        fcaDisclaimerView.setAnalyticsContext(data.f52313c);
    }
}

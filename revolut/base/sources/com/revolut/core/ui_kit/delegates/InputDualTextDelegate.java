package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.views.InputDualTextView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao;
import ip0.hq;
import ip0.or;
import ip0.pq;
import ip0.qq;
import ip0.rq;
import ip0.tr;
import ip0.wk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0004\u0003\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputDualTextDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/InputDualTextDelegate$Model;", "Lip0/rq;", "Model", "ip0/qq", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputDualTextDelegate extends BaseRecyclerViewDelegate<Model, rq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputTextDelegate f52549c;
    public final InputTextDelegate d;
    public final e01.a e;
    public final e01.a f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputDualTextDelegate$Model;", "Lqv0/i;", "Lqv0/n;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.n, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f52550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InputTextDelegate.Model f52551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InputTextDelegate.Model f52552c;
        public final InputDualTextView.b.a d;
        public Parcelable e;
        public qv0.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f52553g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f52554h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f52555j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f52556l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f52557m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f52558n;

        public Model(String listId, InputTextDelegate.Model inputText1, InputTextDelegate.Model inputText2, InputDualTextView.b.a mode, int i) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(inputText1, "inputText1");
            Intrinsics.checkNotNullParameter(inputText2, "inputText2");
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i2 = R$attr.uikit_dp0;
            this.f52550a = listId;
            this.f52551b = inputText1;
            this.f52552c = inputText2;
            this.d = mode;
            this.e = null;
            this.f = c.d.f249513a;
            this.f52553g = null;
            this.f52554h = null;
            this.i = null;
            this.f52555j = null;
            this.k = i2;
            this.f52556l = i2;
            this.f52557m = i2;
            this.f52558n = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new InputDualTextDelegate(null, 3);
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF55862c() {
            return null;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55277b() {
            return this.f52550a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f52550a, model.f52550a) && Intrinsics.f(this.f52551b, model.f52551b) && Intrinsics.f(this.f52552c, model.f52552c) && Intrinsics.f(null, null) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f52553g, model.f52553g) && Intrinsics.f(this.f52554h, model.f52554h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f52555j, model.f52555j) && this.k == model.k && this.f52556l == model.f52556l && this.f52557m == model.f52557m && this.f52558n == model.f52558n;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.k;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.k = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final Parcelable getAnalyticsContext() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.d.f58663a.hashCode() + ((((this.f52552c.hashCode() + ((this.f52551b.hashCode() + (this.f52550a.hashCode() * 31)) * 31)) * 31) + 0) * 31)) * 961;
            Parcelable parcelable = this.e;
            int i = h30.l.i(this.f, (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f52553g;
            int iHashCode2 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f52554h;
            int iHashCode3 = (iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.i;
            int iHashCode4 = (iHashCode3 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f52555j;
            return Integer.hashCode(this.f52558n) + j6.a.b(this.f52557m, j6.a.b(this.f52556l, j6.a.b(this.k, (iHashCode4 + (cVar4 != null ? cVar4.hashCode() : 0)) * 31, 31), 31), 31);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.f52555j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.f52553g;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f52554h = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52316j() {
            return this.f52556l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52317l() {
            return this.f52558n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f52556l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getD() {
            return this.f;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52315h() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52314g() {
            return this.f52554h;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f52555j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.f52557m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f52553g = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.i = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null) {
                return null;
            }
            Object objZ = this.f52551b.z(model.f52551b);
            Intrinsics.i(objZ, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.InputTextDelegate.Payload");
            Object objZ2 = this.f52552c.z(model.f52552c);
            Intrinsics.i(objZ2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.InputTextDelegate.Payload");
            return new qq((or) objZ, (or) objZ2, !Intrinsics.f(null, null), !Intrinsics.f(this.d, model.d));
        }
    }

    public InputDualTextDelegate() {
        this(null, 3);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_input_dual_text);
        Intrinsics.i(viewR, "null cannot be cast to non-null type com.revolut.core.ui_kit.views.InputDualTextView");
        InputDualTextView inputDualTextView = (InputDualTextView) viewR;
        return new rq(inputDualTextView, new tr(inputDualTextView.getTextInput1()), new tr(inputDualTextView.getTextInput2()));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        rq rqVar = (rq) holder;
        this.f52549c.q(rqVar.f);
        this.d.q(rqVar.f166225g);
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(rq holder, Model data, int i, List payloads) {
        int iA;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        ArrayList<qq> arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            qq qqVar = next instanceof qq ? (qq) next : null;
            if (qqVar != null) {
                arrayList.add(qqVar);
            }
        }
        tr trVar = holder.f;
        InputDualTextView inputDualTextView = holder.f166226h;
        InputTextDelegate.Model model = data.f52551b;
        InputDualTextView.b.a aVar = data.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((qq) it9.next()).f166038a);
        }
        this.f52549c.p(trVar, model, i, arrayList2);
        tr trVar2 = holder.f166225g;
        InputTextDelegate.Model model2 = data.f52552c;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it10 = arrayList.iterator();
        while (it10.hasNext()) {
            arrayList3.add(((qq) it10.next()).f166039b);
        }
        this.d.p(trVar2, model2, i, arrayList3);
        int iA2 = 0;
        if (arrayList.isEmpty()) {
            inputDualTextView.setMode(aVar);
            InputDualTextView.setMergedHelperText$default(inputDualTextView, null, false, 2, null);
        } else {
            for (qq qqVar2 : arrayList) {
                if (qqVar2.d) {
                    inputDualTextView.setMode(aVar);
                }
                if (qqVar2.f166040c) {
                    InputDualTextView.setMergedHelperText$default(inputDualTextView, null, false, 2, null);
                }
            }
        }
        efm.r rVarDoOnNext = inputDualTextView.f.map(new ao(6, new pq(data, 0))).doOnNext(new ao(7, new wk(data, holder, 4)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        this.e.a(rVarDoOnNext, holder);
        efm.r map = inputDualTextView.f58662g.map(new ao(8, new pq(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f.a(map, holder);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        qv0.c cVar = data.f;
        if ((cVar instanceof c.e) || (cVar instanceof c.f)) {
            iA = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 8.0f);
        } else {
            if (!(cVar instanceof c.d) && !(cVar instanceof c.b) && !(cVar instanceof c.C1364c) && !(cVar instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            iA = 0;
        }
        qv0.c cVar2 = data.f;
        if (!(cVar2 instanceof c.C1364c) && !(cVar2 instanceof c.d)) {
            if (!(cVar2 instanceof c.e) && !(cVar2 instanceof c.f) && !(cVar2 instanceof c.b) && !(cVar2 instanceof c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            iA2 = com.google.android.gms.internal.mlkit_vision_face.a.a(itemView, "getContext(...)", 8.0f);
        }
        int i2 = iA2;
        qv0.c cVar3 = data.f;
        Context context = itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        or0.b.b(this, cVar3, itemView, false, context, null, null, 48);
        itemView.setPadding(i2, iA, i2, i2);
        super.p(holder, data, i, payloads);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputDualTextDelegate(ix6.c cVar, int i) {
        super(R$layout.internal_delegate_input_dual_text, new hq(2));
        cVar = (i & 1) != 0 ? null : cVar;
        this.f52549c = new InputTextDelegate(cVar);
        this.d = new InputTextDelegate(null);
        this.e = new e01.a();
        this.f = new e01.a();
    }
}

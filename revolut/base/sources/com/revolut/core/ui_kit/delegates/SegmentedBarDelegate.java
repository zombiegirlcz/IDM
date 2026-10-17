package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.LinearGaugeChartView;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.PercentageClause;
import com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ip0.bd0;
import ip0.cd0;
import ip0.t90;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0007\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SegmentedBarDelegate;", "Lcom/revolut/core/ui_kit/recycler/BaseBoxRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/SegmentedBarDelegate$Model;", "Lip0/cd0;", "<init>", "()V", "Companion", "Model", "ip0/bd0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SegmentedBarDelegate extends BaseBoxRecyclerViewDelegate<Model, cd0> {

    @NotNull
    private static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SegmentedBarDelegate$Model;", "Lqv0/i;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/jg", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f53294b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f53295c;
        public final Clause d;
        public Parcelable e;
        public qv0.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f53296g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53297h;
        public p31.c i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public p31.c f53298j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f53299l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f53300m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f53301n;

        public Model(String listId, ArrayList segments, PercentageClause percentageClause, PercentageClause percentageClause2, int i) {
            percentageClause = (i & 4) != 0 ? null : percentageClause;
            percentageClause2 = (i & 8) != 0 ? null : percentageClause2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(segments, "segments");
            this.f53293a = listId;
            this.f53294b = segments;
            this.f53295c = percentageClause;
            this.d = percentageClause2;
            this.e = null;
            this.f = c.d.f249513a;
            this.f53296g = null;
            this.f53297h = null;
            this.i = null;
            this.f53298j = null;
            int i2 = R$attr.uikit_dp16;
            this.k = i2;
            this.f53299l = i2;
            this.f53300m = i2;
            this.f53301n = i2;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new SegmentedBarDelegate();
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55254b() {
            return this.f53293a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53293a, model.f53293a) && this.f53294b.equals(model.f53294b) && Intrinsics.f(this.f53295c, model.f53295c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53296g, model.f53296g) && Intrinsics.f(this.f53297h, model.f53297h) && Intrinsics.f(this.i, model.i) && Intrinsics.f(this.f53298j, model.f53298j);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getF55051q() {
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
            int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f53294b, this.f53293a.hashCode() * 31, 31);
            Clause clause = this.f53295c;
            int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.d;
            int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 961;
            Parcelable parcelable = this.e;
            int i = h30.l.i(this.f, (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            p31.c cVar = this.f53296g;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f53297h;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.i;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53298j;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF55048m() {
            return this.f53298j;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF55049n() {
            return this.f53296g;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53297h = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF55052r() {
            return this.f53299l;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF55054t() {
            return this.f53301n;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53299l = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getF55047l() {
            return this.f;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF55050p() {
            return this.i;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getO() {
            return this.f53297h;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f53298j = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF55053s() {
            return this.f53300m;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f53296g = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.i = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            Model model = (Model) oldItem;
            return new bd0(!this.f53294b.equals(model.f53294b), !true, !Intrinsics.f(this.f53295c, model.f53295c), !Intrinsics.f(this.d, model.d), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    public static final class a {
        private a() {
        }
    }

    public SegmentedBarDelegate() {
        super(R$layout.internal_delegate_segmented_bar, true, new t90(22));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new cd0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_segmented_bar));
    }

    @Override // com.revolut.core.ui_kit.recycler.BaseBoxRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(cd0 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        UIKitTextView uIKitTextView = holder.f163720h;
        UIKitTextView uIKitTextView2 = holder.f163719g;
        LinearGaugeChartView linearGaugeChartView = holder.f;
        boolean zIsEmpty = payloads.isEmpty();
        boolean zIsEmpty2 = payloads.isEmpty();
        boolean zIsEmpty3 = payloads.isEmpty();
        boolean zIsEmpty4 = payloads.isEmpty();
        int size = payloads.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = payloads.get(i2);
            if (obj2 instanceof bd0) {
                zIsEmpty = zIsEmpty || ((bd0) obj2).f163583a;
                zIsEmpty2 = zIsEmpty2 || ((bd0) obj2).f163584b;
                zIsEmpty3 = zIsEmpty3 || ((bd0) obj2).f163585c;
                zIsEmpty4 = zIsEmpty4 || ((bd0) obj2).d;
            }
        }
        if (zIsEmpty) {
            ArrayList arrayList = data.f53294b;
            Context context = holder.itemView.getContext();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                jg jgVar = (jg) arrayList.get(i3);
                float f = (float) jgVar.f54336b;
                Intrinsics.h(context);
                arrayList2.add(new ms0.s1(f, kli.a.s(jgVar.f54337c, context), jgVar.d, ms0.r1.START_BETWEEN_SEGMENTS));
                i3++;
                arrayList = arrayList;
            }
            linearGaugeChartView.setModel(new com.revolut.core.ui_kit.internal.views.e(arrayList2, true, 16));
        }
        if (zIsEmpty2) {
            Iterator it8 = data.f53294b.iterator();
            int i5 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i5 = -1;
                    break;
                } else if (Intrinsics.f(((jg) it8.next()).f54335a, null)) {
                    break;
                } else {
                    i5++;
                }
            }
            linearGaugeChartView.setSelectedPosition(i5);
        }
        if (zIsEmpty3) {
            Clause clause = data.f53295c;
            ty0.c.b(or0.u.k(uIKitTextView2).b0(), clause, holder.f163719g, null, null, 12);
            uIKitTextView2.setVisibility(clause != null ? 0 : 8);
        }
        if (zIsEmpty4) {
            Clause clause2 = data.d;
            ty0.c.b(or0.u.k(uIKitTextView).b0(), clause2, holder.f163720h, null, null, 12);
            uIKitTextView.setVisibility(clause2 != null ? 0 : 8);
        }
    }
}

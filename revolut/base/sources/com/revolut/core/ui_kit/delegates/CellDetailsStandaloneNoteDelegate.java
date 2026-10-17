package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsStandaloneNoteDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/CellDetailsStandaloneNoteDelegate$Model;", "Lip0/k8;", "<init>", "()V", "Model", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsStandaloneNoteDelegate extends BaseRecyclerViewDelegate<Model, ip0.k8> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51901c;
    public final ihm.f d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsStandaloneNoteDelegate$Model;", "Lqv0/i;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/delegates/x2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.i, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f51902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f51903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f51904c;
        public final Clause d;
        public final Image e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f51905g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f51906h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f51907j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public qv0.c f51908l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public p31.c f51909m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public p31.c f51910n;
        public p31.c o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public p31.c f51911p;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static ArrayList a(List bulletListItems) {
                Intrinsics.checkNotNullParameter(bulletListItems, "bulletListItems");
                List list = bulletListItems;
                ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                int i = 0;
                for (Object obj2 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    Model model = (Model) obj2;
                    if (i == 0) {
                        model.f51906h = R$attr.uikit_dp12;
                        model.i = R$attr.uikit_dp4;
                    } else if (i == zhm.v.j(bulletListItems)) {
                        model.f51906h = R$attr.uikit_dp4;
                        model.i = R$attr.uikit_dp12;
                    } else {
                        int i3 = R$attr.uikit_dp4;
                        model.f51906h = i3;
                        model.i = i3;
                    }
                    arrayList.add(model);
                    i = i2;
                }
                return arrayList;
            }

            public static Model b(Companion companion, String listId, Clause noteStart) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(noteStart, "noteStart");
                Model model = new Model(listId, null, noteStart, null, new ResourceImage(R$drawable.uikit_icn_24_dot, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), false, null, 0, 0, 1920);
                int i = R$attr.uikit_dp4;
                model.f51906h = i;
                model.i = i;
                int i2 = R$attr.uikit_dp16;
                model.f51907j = i2;
                model.k = i2;
                return model;
            }
        }

        public Model(String listId, Object obj2, Clause noteStart, Clause clause, Image image, boolean z, AnalyticsContext analyticsContext, int i, int i2, int i3) {
            obj2 = (i3 & 2) != 0 ? null : obj2;
            clause = (i3 & 8) != 0 ? null : clause;
            image = (i3 & 16) != 0 ? null : image;
            z = (i3 & 32) != 0 ? false : z;
            analyticsContext = (i3 & 64) != 0 ? null : analyticsContext;
            i = (i3 & 128) != 0 ? R$attr.uikit_dp0 : i;
            i2 = (i3 & 256) != 0 ? R$attr.uikit_dp8 : i2;
            int i5 = R$attr.uikit_dp16;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(noteStart, "noteStart");
            this.f51902a = listId;
            this.f51903b = obj2;
            this.f51904c = noteStart;
            this.d = clause;
            this.e = image;
            this.f = z;
            this.f51905g = analyticsContext;
            this.f51906h = i;
            this.i = i2;
            this.f51907j = i5;
            this.k = i5;
            this.f51908l = c.d.f249513a;
            this.f51909m = null;
            this.f51910n = null;
            this.o = null;
            this.f51911p = null;
        }

        @Override // koi.j
        public final koi.k T1() {
            return new CellDetailsStandaloneNoteDelegate();
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.f51903b;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52438a() {
            return this.f51902a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f51902a, model.f51902a) && Intrinsics.f(this.f51903b, model.f51903b) && Intrinsics.f(this.f51904c, model.f51904c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f51905g, model.f51905g) && this.f51906h == model.f51906h && this.i == model.i && this.f51907j == model.f51907j && this.k == model.k && Intrinsics.f(this.f51908l, model.f51908l) && Intrinsics.f(this.f51909m, model.f51909m) && Intrinsics.f(this.f51910n, model.f51910n) && Intrinsics.f(this.o, model.o) && Intrinsics.f(this.f51911p, model.f51911p);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getK() {
            return this.f51906h;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.f51906h = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52443j() {
            return this.f51905g;
        }

        public final int hashCode() {
            int iHashCode = this.f51902a.hashCode() * 31;
            Object obj2 = this.f51903b;
            int iA = p.a.a((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31, 31, this.f51904c);
            Clause clause = this.d;
            int iHashCode2 = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            Image image = this.e;
            int iC = j6.a.c((iHashCode2 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f);
            Parcelable parcelable = this.f51905g;
            int i = h30.l.i(this.f51908l, j6.a.b(this.k, j6.a.b(this.f51907j, j6.a.b(this.i, j6.a.b(this.f51906h, (iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31), 31), 31), 31), 31);
            p31.c cVar = this.f51909m;
            int iHashCode3 = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f51910n;
            int iHashCode4 = (iHashCode3 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.o;
            int iHashCode5 = (iHashCode4 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f51911p;
            return iHashCode5 + (cVar4 != null ? cVar4.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getF52447p() {
            return this.f51909m;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.f51908l = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF52448q() {
            return this.f51910n;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.o = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF52444l() {
            return this.i;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF52446n() {
            return this.k;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.i = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getO() {
            return this.f51908l;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF52450s() {
            return this.f51911p;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF52449r() {
            return this.o;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.f51909m = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f51905g = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getF52445m() {
            return this.f51907j;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f51910n = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f51911p = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new x2(!Intrinsics.f(model.f51904c, this.f51904c), !Intrinsics.f(model.d, this.d), !Intrinsics.f(model.e, this.e), model.f != this.f, or0.b.l(this, model));
            }
            return null;
        }
    }

    public CellDetailsStandaloneNoteDelegate() {
        super(R$layout.internal_delegate_cell_details_standalone_note, new ip0.h8(1));
        this.f51901c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.k8(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_standalone_note));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.k8 holder, Model data, int i, List payloads) {
        CellDetailsStandaloneNoteDelegate cellDetailsStandaloneNoteDelegate;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f164976h;
        TextView textView2 = holder.f164975g;
        ImageView imageView = holder.f;
        ArrayList<x2> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof x2) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (x2 x2Var : arrayList) {
            zIsEmpty = zIsEmpty || x2Var.f55591c;
            z = z || x2Var.e;
        }
        if (zIsEmpty) {
            zi0.c.g(imageView, data.e);
        }
        boolean z3 = data.f;
        Clause clause = data.f51904c;
        Clause clause2 = data.d;
        if (z3) {
            Image image = data.e;
            py0.b bVar = image != null ? new py0.b(image) : null;
            or0.m.a(imageView);
            cellDetailsStandaloneNoteDelegate = this;
            imageView.setOnClickListener(new au0.i3(data, bVar, this, data, 15));
            or0.m.a(textView2);
            textView2.setOnClickListener(new au0.t1(data, 9, cellDetailsStandaloneNoteDelegate, data));
            kli.a.b(textView2, clause, ty0.f.f275450a);
            kli.a.b(textView, clause2, ty0.f.f275450a);
        } else {
            cellDetailsStandaloneNoteDelegate = this;
            imageView.setOnClickListener(null);
            textView2.setOnClickListener(null);
            kli.a.d(textView2, clause, data, new y2(1, 0, ihm.f.class, cellDetailsStandaloneNoteDelegate.f51901c, "onNext", "onNext(Ljava/lang/Object;)V"), 8);
            kli.a.b(textView, clause2, ty0.f.f275450a);
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(cellDetailsStandaloneNoteDelegate, data, itemView, false, null, 28);
        }
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        gq0.d[] elements = {hx7.b.f(clause), clause2 != null ? hx7.b.f(clause2) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView2);
    }
}

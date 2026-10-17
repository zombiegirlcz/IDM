package com.revolut.core.ui_kit.delegates;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.np0;
import ip0.op0;
import ip0.qn0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WidgetContainerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/WidgetContainerDelegate$Model;", "Lip0/op0;", "Companion", "Model", "ip0/np0", "a", "ip0/mp0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetContainerDelegate extends BaseRecyclerViewDelegate<Model, op0> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f53641c;
    public final tw0.x0 d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/WidgetContainerDelegate$Model;", "Lqv0/q;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model implements qv0.q, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f53642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f53643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final snd.c f53644c;
        public qv0.c d;
        public p31.c e;
        public p31.c f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public p31.c f53645g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public p31.c f53646h;
        public int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f53647j;
        public final int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f53648l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Parcelable f53649m;

        public Model(String listId, ArrayList widgets, snd.c cVar) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(widgets, "widgets");
            int i = R$attr.uikit_dp0;
            this.f53642a = listId;
            this.f53643b = widgets;
            this.f53644c = cVar;
            this.d = c.d.f249513a;
            this.e = null;
            this.f = null;
            this.f53645g = null;
            this.f53646h = null;
            this.i = i;
            this.f53647j = i;
            this.k = i;
            this.f53648l = i;
            this.f53649m = null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a */
        public final Object getF() {
            return this.f53644c;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53642a() {
            return this.f53642a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f53642a, model.f53642a) && this.f53643b.equals(model.f53643b) && this.f53644c.equals(model.f53644c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && Intrinsics.f(this.f53645g, model.f53645g) && Intrinsics.f(this.f53646h, model.f53646h) && this.i == model.i && this.f53647j == model.f53647j && this.k == model.k && this.f53648l == model.f53648l && Intrinsics.f(this.f53649m, model.f53649m);
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getI() {
            return this.i;
        }

        @Override // qv0.o
        public final void g(int i) {
            this.i = i;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF53649m() {
            return this.f53649m;
        }

        public final int hashCode() {
            int i = h30.l.i(this.d, (this.f53644c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f53643b, this.f53642a.hashCode() * 31, 31)) * 31, 31);
            p31.c cVar = this.e;
            int iHashCode = (i + (cVar == null ? 0 : cVar.hashCode())) * 31;
            p31.c cVar2 = this.f;
            int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            p31.c cVar3 = this.f53645g;
            int iHashCode3 = (iHashCode2 + (cVar3 == null ? 0 : cVar3.hashCode())) * 31;
            p31.c cVar4 = this.f53646h;
            int iB = j6.a.b(this.f53648l, j6.a.b(this.k, j6.a.b(this.f53647j, j6.a.b(this.i, (iHashCode3 + (cVar4 == null ? 0 : cVar4.hashCode())) * 31, 31), 31), 31), 31);
            Parcelable parcelable = this.f53649m;
            return iB + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // o31.c
        /* JADX INFO: renamed from: i, reason: from getter */
        public final p31.c getE() {
            return this.e;
        }

        @Override // qv0.i
        public final void j(qv0.c cVar) {
            Intrinsics.checkNotNullParameter(cVar, "<set-?>");
            this.d = cVar;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: k, reason: from getter */
        public final p31.c getF() {
            return this.f;
        }

        @Override // qv0.n
        public final void l(p31.c cVar) {
            this.f53645g = cVar;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: m, reason: from getter */
        public final int getF53647j() {
            return this.f53647j;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getF53648l() {
            return this.f53648l;
        }

        @Override // qv0.o
        public final void o(int i) {
            this.f53647j = i;
        }

        @Override // qv0.i
        /* JADX INFO: renamed from: p1, reason: from getter */
        public final qv0.c getD() {
            return this.d;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: q, reason: from getter */
        public final p31.c getF53646h() {
            return this.f53646h;
        }

        @Override // o31.c
        /* JADX INFO: renamed from: r, reason: from getter */
        public final p31.c getF53645g() {
            return this.f53645g;
        }

        @Override // o31.c
        public final void s(p31.c cVar) {
            this.e = cVar;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f53649m = parcelable;
        }

        @Override // qv0.o
        /* JADX INFO: renamed from: t, reason: from getter */
        public final int getK() {
            return this.k;
        }

        @Override // o31.c
        public final void u(p31.c cVar) {
            this.f = cVar;
        }

        @Override // qv0.n
        public final void w(p31.c cVar) {
            this.f53646h = cVar;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof Model)) {
                return null;
            }
            return new np0(!this.f53643b.equals(((Model) oldItem).f53643b), or0.b.l(this, (qv0.i) oldItem));
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.WidgetContainerDelegate$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static void a(ArrayList arrayList) {
            float f;
            Iterator it8 = arrayList.iterator();
            float fCeil = BitmapDescriptorFactory.HUE_RED;
            while (it8.hasNext()) {
                BaseDraggableWidgetDelegate.Model model = (BaseDraggableWidgetDelegate.Model) it8.next();
                int i = nj.f54523a[model.getI().ordinal()];
                if (i == 1) {
                    f = 0.5f;
                } else if (i == 2) {
                    f = 1.0f;
                } else {
                    if (i != 3) {
                        if (i == 4) {
                            throw new IllegalStateException("WidgetContainerDelegate doesn't support DYNAMIC widget size");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    f = 2.0f;
                }
                fCeil += f;
                if (model.getI() != op0.q.SMALL) {
                    fCeil = (float) Math.ceil(fCeil);
                }
            }
            rim.d.c(fCeil);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetContainerDelegate(List delegates) {
        super(R$id.internal_widget_container_delegate, new qn0(11));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f53641c = delegates;
        this.d = new tw0.x0();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        z4l.j jVar = new z4l.j(7, this.f53641c, false);
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setId(R$id.internal_widget_container_delegate_recycler);
        recyclerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        recyclerView.setAdapter(jVar);
        tw0.x0.a(this.d, recyclerView, jVar, false, null, 20);
        return new op0(recyclerView);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(op0 holder, Model data, int i, List payloads) {
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
            if (!(payloads.get(i2) instanceof np0)) {
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
        for (int i3 = 0; i3 < size2; i3++) {
            zIsEmpty = zIsEmpty || ((np0) payloads.get(i3)).f165557a;
        }
        if (zIsEmpty) {
            RecyclerView.Adapter adapter = holder.f.getAdapter();
            Intrinsics.i(adapter, "null cannot be cast to non-null type com.revolut.rxdiffadapter.RxDiffAdapter");
            ((z4l.j) adapter).c(data.f53643b);
        }
    }
}

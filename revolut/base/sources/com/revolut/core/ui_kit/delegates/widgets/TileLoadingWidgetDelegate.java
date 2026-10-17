package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.IconsTileWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TileLoadingWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/TileLoadingWidgetDelegate$Model;", "Lop0/n4;", "<init>", "()V", "Model", "op0/m4", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TileLoadingWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.n4> {
    public TileLoadingWidgetDelegate() {
        super(R$layout.internal_delegate_widget_tile_loading, new op0.v3(11));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.n4 n4Var = new op0.n4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_tile_loading));
        p(n4Var, false);
        return n4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.n4 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        Clause clause = data.f55247c;
        boolean zN = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof op0.p2) {
                zN = (zN != 0 || ((op0.p2) next).f227378b) ? 1 : 0;
            }
        }
        if (zN != 0) {
            kli.a.b(holder.k, clause, ty0.f.f275450a);
            holder.f227362l.setVisibility(clause != null ? 8 : 0);
        }
        holder.F(data.d);
        ifk.b.r(holder.f227361j);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/TileLoadingWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55246b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f55247c;
        public final op0.q d;
        public Parcelable e;
        public op0.r f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final py0.c f55248g;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.TileLoadingWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(Companion companion, String listId, int i) {
                companion.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                return new Model(listId, (Clause) null, op0.q.MEDIUM);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Model(int i, Clause clause, String listId) {
            clause = (i & 2) != 0 ? null : clause;
            Intrinsics.checkNotNullParameter(listId, "listId");
            this(listId, clause, op0.q.SMALL);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getE() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52014a() {
            return this.f55246b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55248g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55246b, model.f55246b) && Intrinsics.f(this.f55247c, model.f55247c) && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52024q() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = this.f55246b.hashCode() * 31;
            Clause clause = this.f55247c;
            int iB = okl.m.b(this.d, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
            Parcelable parcelable = this.e;
            return this.f.hashCode() + ((iB + (parcelable != null ? parcelable.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getK() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if ((oldItem instanceof IconsTileWidgetDelegate.Model ? (IconsTileWidgetDelegate.Model) oldItem : null) != null) {
                return new op0.m4(!Intrinsics.f(this.f55247c, r3.f55173c));
            }
            return null;
        }

        public Model(String str, Clause clause, op0.q qVar) {
            op0.r rVar = op0.r.SEEN;
            this.f55246b = str;
            this.f55247c = clause;
            this.d = qVar;
            this.e = null;
            this.f = rVar;
            this.f55248g = clause != null ? new py0.c(clause) : null;
        }
    }
}

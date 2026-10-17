package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.MapPlainDelegate;
import com.revolut.core.ui_kit.delegates.d9;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.y8;
import com.revolut.core.ui_kit.delegates.z8;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/MapWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/MapWidgetDelegate$Model;", "Lop0/b3;", "<init>", "()V", "Model", "op0/z2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.b3> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MapPlainDelegate f55193h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/MapWidgetDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d9 f55195c;
        public final Object d;
        public final op0.q e;
        public Parcelable f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public op0.r f55196g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Object f55197h;
        public final py0.c i;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.MapWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static Model a(String listId, TextLocalisedClause title, z8 mapConfig, boolean z, MapPlainDelegate.c markers, AnalyticsContext analyticsContext, zn.b bVar) {
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(mapConfig, "mapConfig");
                Intrinsics.checkNotNullParameter(markers, "markers");
                return new Model(listId, new d9("id", mapConfig, z, markers, null, null, yv0.j.MATCH_PARENT, false, 1008), yh5.b.a(title), op0.q.MEDIUM, analyticsContext, bVar);
            }
        }

        public Model(String str, d9 d9Var, Clause clause, op0.q qVar, Parcelable parcelable, Object obj2) {
            op0.r rVar = op0.r.SEEN;
            this.f55194b = str;
            this.f55195c = d9Var;
            this.d = clause;
            this.e = qVar;
            this.f = parcelable;
            this.f55196g = rVar;
            this.f55197h = obj2;
            this.i = new py0.c(clause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF() {
            return this.f55196g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55196g = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF55191g() {
            return this.f55197h;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55189b() {
            return this.f55194b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.i;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55194b, model.f55194b) && Intrinsics.f(this.f55195c, model.f55195c) && Intrinsics.f(this.d, model.d) && this.e == model.e && Intrinsics.f(this.f, model.f) && this.f55196g == model.f55196g && Intrinsics.f(this.f55197h, model.f55197h);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getE() {
            return this.f;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.e, p.a.b((this.f55195c.hashCode() + (this.f55194b.hashCode() * 31)) * 31, 31, this.d), 31);
            Parcelable parcelable = this.f;
            int iC = okl.m.c(this.f55196g, (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            Object obj2 = this.f55197h;
            return iC + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getD() {
            return this.e;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.z2(!Intrinsics.f(this.f55195c, model.f55195c), this.e != model.e, !Intrinsics.f(this.d, model.d));
            }
            return null;
        }
    }

    public MapWidgetDelegate() {
        super(R$layout.internal_delegate_widget_map, new op0.v0(23));
        this.f55193h = new MapPlainDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.b3 b3Var = new op0.b3(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_map), this.f55193h);
        p(b3Var, true);
        return b3Var;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.b3 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f227189j;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof op0.z2) {
                zN = zN || ((op0.z2) next).f227511c;
                zN2 = zN2 || ((op0.z2) next).f227509a;
                if (!zN3 && !((op0.z2) next).f227510b) {
                    z = false;
                }
                zN3 = z;
            }
        }
        if (zN) {
            kli.a.b(textView, data.d, ty0.f.f275450a);
        }
        if (zN3) {
            op0.q qVar = data.e;
            holder.F(qVar);
            int i2 = op0.c3.f227209a[qVar.ordinal()];
            if (i2 == 1) {
                textView.setVisibility(8);
            } else {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalArgumentException(qVar + " widget size is not supported");
                }
                textView.setVisibility(0);
            }
        }
        if (zN2) {
            y8 y8Var = holder.k;
            d9 d9Var = data.f55195c;
            Object obj2 = y8Var.e;
            if (obj2 == null) {
                obj2 = Unit.f186387a;
            }
            this.f55193h.p(y8Var, d9Var, 0, zhm.v.l(d9Var.z(obj2)));
        }
    }
}

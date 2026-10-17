package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/MapLoadingWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/MapLoadingWidgetDelegate$Model;", "Lop0/x2;", "<init>", "()V", "Model", "op0/v2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MapLoadingWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.x2> {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \b2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tJ\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/MapLoadingWidgetDelegate$Model;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p, tw0.y {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f55190c;
        public final op0.q d;
        public Parcelable e;
        public op0.r f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Object f55191g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final py0.c f55192h;

        /* JADX INFO: renamed from: com.revolut.core.ui_kit.delegates.widgets.MapLoadingWidgetDelegate$Model$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }
        }

        public Model(String str, Clause clause, op0.q qVar, Parcelable parcelable, Object obj2) {
            op0.r rVar = op0.r.SEEN;
            this.f55189b = str;
            this.f55190c = clause;
            this.d = qVar;
            this.e = parcelable;
            this.f = rVar;
            this.f55191g = obj2;
            this.f55192h = new py0.c(clause);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF54983r() {
            return this.f;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF54982q() {
            return this.f55191g;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF52302a() {
            return this.f55189b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getO() {
            return this.f55192h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55189b, model.f55189b) && Intrinsics.f(this.f55190c, model.f55190c) && this.d == model.d && Intrinsics.f(this.e, model.e) && this.f == model.f && Intrinsics.f(this.f55191g, model.f55191g);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF52303b() {
            return this.e;
        }

        public final int hashCode() {
            int iB = okl.m.b(this.d, p.a.b(this.f55189b.hashCode() * 31, 31, this.f55190c), 31);
            Parcelable parcelable = this.e;
            int iC = okl.m.c(this.f, (iB + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31);
            Object obj2 = this.f55191g;
            return iC + (obj2 != null ? obj2.hashCode() : 0);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF54980n() {
            return this.d;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.e = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.v2(this.d != model.d, !Intrinsics.f(this.f55190c, model.f55190c));
            }
            return null;
        }
    }

    public MapLoadingWidgetDelegate() {
        super(R$layout.internal_delegate_widget_map_loading, new op0.v0(22));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.x2 x2Var = new op0.x2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_map_loading));
        p(x2Var, false);
        return x2Var;
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.x2 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f227476j;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            boolean z = true;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof op0.v2) {
                zN = zN || ((op0.v2) next).f227457b;
                if (!zN2 && !((op0.v2) next).f227456a) {
                    z = false;
                }
                zN2 = z;
            }
        }
        if (zN) {
            kli.a.b(textView, data.f55190c, ty0.f.f275450a);
        }
        if (zN2) {
            op0.q qVar = data.d;
            holder.F(qVar);
            int i2 = op0.y2.f227487a[qVar.ordinal()];
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
        ifk.b.r(holder.k);
    }
}

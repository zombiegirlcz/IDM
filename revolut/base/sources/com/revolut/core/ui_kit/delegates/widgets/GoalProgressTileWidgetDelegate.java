package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.internal.views.ResizableTileHeaderView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressTileWidgetDelegate$Model;", "Lop0/x1;", "<init>", "()V", "Model", "op0/w1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GoalProgressTileWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.x1> {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/GoalProgressTileWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit/delegates/widgets/a1", "com/revolut/core/ui_kit/delegates/widgets/b1", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a1 f55140c;
        public final b1 d;
        public Parcelable e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public op0.r f55141g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final py0.c f55142h;
        public final op0.q i;

        /* JADX WARN: Type inference failed for: r4v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        public Model(String listId, a1 header, b1 progress, jkb.e eVar, int i) {
            eVar = (i & 16) != 0 ? null : eVar;
            op0.r widgetState = op0.r.SEEN;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(progress, "progress");
            Intrinsics.checkNotNullParameter(widgetState, "widgetState");
            this.f55139b = listId;
            this.f55140c = header;
            this.d = progress;
            this.e = null;
            this.f = eVar;
            this.f55141g = widgetState;
            this.f55142h = new py0.c(header.f55287a);
            this.i = op0.q.SMALL;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55257h() {
            return this.f55141g;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55141g = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getE() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF53837a() {
            return this.f55139b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF54970q() {
            return this.f55142h;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55139b, model.f55139b) && Intrinsics.f(this.f55140c, model.f55140c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55141g == model.f55141g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF() {
            return this.e;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.f55140c.hashCode() + (this.f55139b.hashCode() * 31)) * 31)) * 31;
            Parcelable parcelable = this.e;
            int iHashCode2 = (iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.f;
            return this.f55141g.hashCode() + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getI() {
            return this.i;
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
                return new op0.w1(!Intrinsics.f(this.f55140c, model.f55140c), !Intrinsics.f(this.d, model.d), this.i != model.i);
            }
            return null;
        }
    }

    public GoalProgressTileWidgetDelegate() {
        super(R$layout.internal_delegate_widget_goal_progress_tile, new op0.v0(13));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.x1 x1Var = new op0.x1(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_goal_progress_tile));
        p(x1Var, true);
        return x1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void p(op0.x1 holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        b1 b1Var = data.d;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof op0.w1)) {
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
        boolean z = zIsEmpty;
        boolean z3 = z;
        for (int i3 = 0; i3 < size2; i3++) {
            op0.w1 w1Var = (op0.w1) payloads.get(i3);
            zIsEmpty = zIsEmpty || w1Var.f227463a;
            z = z || w1Var.f227465c;
            z3 = z3 || w1Var.f227464b;
        }
        if (zIsEmpty) {
            ResizableTileHeaderView resizableTileHeaderView = holder.f227474j;
            a1 a1Var = data.f55140c;
            resizableTileHeaderView.setTitle(a1Var.f55287a);
            resizableTileHeaderView.setTopLabel(a1Var.f55288b);
            resizableTileHeaderView.setBottomSubtitle(a1Var.f55289c);
        }
        if (z) {
            holder.F(data.i);
        }
        if (z3) {
            kli.a.b(holder.f227475l, b1Var.f55298a, ty0.f.f275450a);
            long j2 = b1Var.f55300c;
            holder.k.setProgress(j2 > 0 ? rim.d.c((b1Var.f55299b / j2) * 100) : 0);
        }
    }
}

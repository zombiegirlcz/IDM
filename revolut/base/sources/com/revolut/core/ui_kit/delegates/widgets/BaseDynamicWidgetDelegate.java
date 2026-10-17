package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import au0.x5;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.Model;
import com.revolut.core.ui_kit.delegates.widgets.m;
import com.revolut.core.ui_kit.internal.views.navbar.ConstraintHeaderLayout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.recyclerkit.UIKitRecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \u0006*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005:\f\u0007\b\t\n\u000b\f\r\u000e\u000f\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$Model;", "T", "Lcom/revolut/core/ui_kit/delegates/widgets/m;", "VH", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Companion", "BigHeaderModel", "op0/s", "op0/v", "op0/u", "BigHeaderDelegate", "BigHeaderLoadingDelegate", "op0/y", "op0/w", "op0/t", "Model", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseDynamicWidgetDelegate<T extends Model, VH extends m> extends BaseDraggableWidgetDelegate<T, VH> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f54990h;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$BigHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$BigHeaderModel;", "Lcom/revolut/core/ui_kit/delegates/widgets/k;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BigHeaderDelegate extends BaseRecyclerViewDelegate<BigHeaderModel, k> {
        public BigHeaderDelegate() {
            super(R$layout.internal_delegate_rows_widget_big_header, new ood.g0(17));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            k kVar = new k(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_rows_widget_big_header));
            tx0.k0 k0Var = tx0.k0.SMALL;
            ConstraintHeaderLayout constraintHeaderLayout = kVar.f;
            constraintHeaderLayout.setTitleStyle(k0Var);
            constraintHeaderLayout.setSecondDescriptionTextStyle(au0.e0.SECONDARY);
            constraintHeaderLayout.setDescriptionEndAnchor$ui_kit_components_release(au0.t.PARENT);
            return kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
        /* JADX WARN: Type inference failed for: r13v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v12, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void p(com.revolut.core.ui_kit.delegates.widgets.k r12, com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.BigHeaderModel r13, int r14, java.util.List r15) {
            /*
                Method dump skipped, instruction units count: 259
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate.BigHeaderDelegate.p(com.revolut.core.ui_kit.delegates.widgets.k, com.revolut.core.ui_kit.delegates.widgets.BaseDynamicWidgetDelegate$BigHeaderModel, int, java.util.List):void");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$BigHeaderLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lop0/s;", "Lcom/revolut/core/ui_kit/delegates/widgets/l;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BigHeaderLoadingDelegate extends BaseRecyclerViewDelegate<op0.s, l> {
        public BigHeaderLoadingDelegate() {
            super(R$layout.internal_delegate_rows_widget_big_header_loading, new ood.g0(18));
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return new l(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_rows_widget_big_header_loading));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v3 */
        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(l holder, op0.s data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            ShimmerFrameLayout shimmerFrameLayout = holder.f;
            boolean zN = ue0.e.n(payloads);
            Iterator it8 = payloads.iterator();
            ?? r56 = zN;
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                Object next = it8.next();
                if (next instanceof op0.u) {
                    zN = zN || ((op0.u) next).f227436a;
                    r56 = (r56 != 0 || ((op0.u) next).f227437b) ? 1 : 0;
                }
            }
            if (zN) {
                kli.a.b(holder.f55409g, data.f227407a, ty0.f.f275450a);
            }
            if (r56 != 0) {
                shimmerFrameLayout.setVisibility(data.f227408b ? 0 : 8);
            }
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.b(this, c.C1364c.f249512a, itemView, false, null, null, null, 56);
            ifk.b.r(shimmerFrameLayout);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$BigHeaderModel;", "Lkoi/j;", "Lqv0/p;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BigHeaderModel implements koi.j, qv0.p, TrackableItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f54992b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f54993c;
        public final op0.t d;
        public final boolean e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Parcelable f54994g;

        public BigHeaderModel(String listId, Clause title, op0.t tVar, boolean z, Object obj2, int i) {
            z = (i & 8) != 0 ? true : z;
            obj2 = (i & 16) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Clause clauseA = z ? yh5.b.a(title) : title;
            Intrinsics.i(clauseA, "null cannot be cast to non-null type com.revolut.core.ui_kit.models.Clause");
            this.f54991a = listId;
            this.f54992b = clauseA;
            this.f54993c = title;
            this.d = tVar;
            this.e = z;
            this.f = obj2;
            this.f54994g = null;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getF() {
            return this.f;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55268b() {
            return this.f54991a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BigHeaderModel)) {
                return false;
            }
            BigHeaderModel bigHeaderModel = (BigHeaderModel) obj2;
            return Intrinsics.f(this.f54991a, bigHeaderModel.f54991a) && Intrinsics.f(this.f54992b, bigHeaderModel.f54992b) && Intrinsics.f(this.f54993c, bigHeaderModel.f54993c) && Intrinsics.f(this.d, bigHeaderModel.d) && this.e == bigHeaderModel.e && Intrinsics.f(this.f, bigHeaderModel.f) && Intrinsics.f(this.f54994g, bigHeaderModel.f54994g);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55273l() {
            return this.f54994g;
        }

        public final int hashCode() {
            int iA = p.a.a(p.a.a(this.f54991a.hashCode() * 31, 31, this.f54992b), 31, this.f54993c);
            op0.t tVar = this.d;
            int iC = j6.a.c((iA + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.e);
            Object obj2 = this.f;
            int iHashCode = (iC + (obj2 == null ? 0 : obj2.hashCode())) * 31;
            Parcelable parcelable = this.f54994g;
            return iHashCode + (parcelable != null ? parcelable.hashCode() : 0);
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f54994g = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            if (!(oldItem instanceof BigHeaderModel)) {
                return null;
            }
            BigHeaderModel bigHeaderModel = (BigHeaderModel) oldItem;
            op0.t tVar = bigHeaderModel.d;
            boolean z = !Intrinsics.f(bigHeaderModel.f54992b, this.f54992b);
            op0.t tVar2 = this.d;
            boolean z3 = (Intrinsics.f(tVar, tVar2) && bigHeaderModel.e == this.e) ? false : true;
            if (!(tVar instanceof op0.t)) {
                tVar = null;
            }
            String str = tVar != null ? tVar.f227418c : null;
            if (!(tVar2 instanceof op0.t)) {
                tVar2 = null;
            }
            return new op0.v(z, z3, !Intrinsics.f(str, tVar2 != null ? tVar2.f227418c : null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/BaseDynamicWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f54995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Parcelable f54996c;
        public final boolean d;

        public Model(String listId, List items, op0.q widgetSize, Parcelable parcelable, boolean z) {
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(widgetSize, "widgetSize");
            this.f54995b = items;
            this.f54996c = parcelable;
            this.d = z;
        }

        /* JADX INFO: renamed from: E */
        public abstract List getF();

        /* JADX INFO: renamed from: F */
        public abstract boolean getF55226g();

        /* JADX INFO: renamed from: H, reason: from getter */
        public boolean getK() {
            return this.d;
        }

        @Override // tw0.y
        /* JADX INFO: renamed from: e */
        public final boolean getF55088h() {
            return getF55226g();
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p */
        public abstract op0.q getK();

        @Override // koi.j
        public Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model == null || getF55226g() != model.getF55226g()) {
                return null;
            }
            return new op0.w(!Intrinsics.f(getF(), model.getF()), getK() != model.getK());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDynamicWidgetDelegate(int i, Function2 rule) {
        super(i, rule);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f54990h = 2;
    }

    public abstract boolean s(koi.j jVar);

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void t(m holder, Model data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 >= size) {
                break;
            }
            Object obj2 = payloads.get(i2);
            if (obj2 instanceof op0.w) {
                zN = zN || ((op0.w) obj2).f227460a;
                if (!zN2 && !((op0.w) obj2).f227461b) {
                    z = false;
                }
                zN2 = z;
            }
            i2++;
        }
        if (zN2) {
            holder.F(data.getK());
            holder.J(data.getK());
        }
        if (zN) {
            List items = data.getF();
            Intrinsics.checkNotNullParameter(items, "items");
            ((z4l.j) holder.f55426q.getValue()).c(items);
            UIKitRecyclerView uIKitRecyclerView = holder.f55425p;
            OneShotPreDrawListener.add(uIKitRecyclerView, new x5(uIKitRecyclerView, holder, 25));
        }
        if (zN || zN2) {
            List f = data.getF();
            int size2 = f.size();
            int i3 = 0;
            for (int i5 = 0; i5 < size2; i5++) {
                if (s((koi.j) f.get(i5))) {
                    i3++;
                }
            }
            holder.f55423m = i3 > this.f54990h;
        }
        holder.f227373h.setWholeWidgetClickable(data.getK());
    }
}

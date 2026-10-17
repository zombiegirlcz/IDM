package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0007\u0003\u0007\b\t\n\u000b\fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/SimpleTileWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/SimpleTileWidgetDelegate$Model;", "Lop0/f4;", "<init>", "()V", "Companion", "com/revolut/core/ui_kit/delegates/widgets/z3", "com/revolut/core/ui_kit/delegates/widgets/h4", "com/revolut/core/ui_kit/delegates/widgets/a4", "Model", "op0/e4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleTileWidgetDelegate extends BaseDraggableWidgetDelegate<Model, op0.f4> {

    @NotNull
    private static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u00072\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\b\t\nJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/SimpleTileWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Lqv0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "com/revolut/core/ui_kit/delegates/widgets/f4", "com/revolut/core/ui_kit/delegates/widgets/g4", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Model extends BaseDraggableWidgetDelegate.Model implements qv0.p {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f55232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f55233c;
        public final Clause d;
        public final Object e;
        public final f4 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final op0.q f55234g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Parcelable f55235h;
        public final Object i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public op0.r f55236j;
        public final py0.c k;

        public Model(String listId, Clause title, Clause topLabel, Clause clause, f4 f4Var, Object obj2, int i) {
            clause = (i & 8) != 0 ? null : clause;
            obj2 = (i & 64) != 0 ? null : obj2;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(topLabel, "topLabel");
            op0.q qVar = op0.q.SMALL;
            op0.r rVar = op0.r.SEEN;
            this.f55232b = listId;
            this.f55233c = title;
            this.d = clause;
            this.e = topLabel;
            this.f = f4Var;
            this.f55234g = qVar;
            this.f55235h = null;
            this.i = obj2;
            this.f55236j = rVar;
            this.k = new py0.c(title);
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        /* JADX INFO: renamed from: C, reason: from getter */
        public final op0.r getF55236j() {
            return this.f55236j;
        }

        @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate.Model
        public final void D(op0.r rVar) {
            Intrinsics.checkNotNullParameter(rVar, "<set-?>");
            this.f55236j = rVar;
        }

        @Override // qv0.p
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getI() {
            return this.i;
        }

        @Override // koi.j
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF55232b() {
            return this.f55232b;
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: d */
        public final py0.d getF55210g() {
            return this.k;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Model)) {
                return false;
            }
            Model model = (Model) obj2;
            return Intrinsics.f(this.f55232b, model.f55232b) && Intrinsics.f(this.f55233c, model.f55233c) && Intrinsics.f(this.d, model.d) && Intrinsics.f(this.e, model.e) && Intrinsics.f(this.f, model.f) && this.f55234g == model.f55234g && Intrinsics.f(this.f55235h, model.f55235h) && Intrinsics.f(this.i, model.i) && this.f55236j == model.f55236j;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public final Parcelable getF55235h() {
            return this.f55235h;
        }

        public final int hashCode() {
            int iB = p.a.b(this.f55232b.hashCode() * 31, 31, this.f55233c);
            Clause clause = this.d;
            int iB2 = p.a.b((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
            f4 f4Var = this.f;
            int iB3 = okl.m.b(this.f55234g, (iB2 + (f4Var == null ? 0 : f4Var.hashCode())) * 31, 31);
            Parcelable parcelable = this.f55235h;
            int iHashCode = (iB3 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
            Object obj2 = this.i;
            return this.f55236j.hashCode() + ((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // gx0.c
        /* JADX INFO: renamed from: p, reason: from getter */
        public final op0.q getF55234g() {
            return this.f55234g;
        }

        @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
        public final void setAnalyticsContext(Parcelable parcelable) {
            this.f55235h = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                return new op0.e4(!Intrinsics.f(this.f55233c, model.f55233c), !Intrinsics.f(this.d, model.d), !Intrinsics.f(this.e, model.e), !Intrinsics.f(this.f, model.f), this.f55234g != model.f55234g);
            }
            return null;
        }
    }

    public static final class a {
        private a() {
        }
    }

    public SimpleTileWidgetDelegate() {
        super(R$layout.internal_delegate_widget_simple_tile, new op0.v3(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        op0.f4 f4Var = new op0.f4(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_simple_tile));
        p(f4Var, true);
        return f4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bf  */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r2v31, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View, com.revolut.core.ui_kit.internal.views.SmallActionButton] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(op0.f4 r29, com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate.Model r30, int r31, java.util.List r32) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate.p(op0.f4, com.revolut.core.ui_kit.delegates.widgets.SimpleTileWidgetDelegate$Model, int, java.util.List):void");
    }
}

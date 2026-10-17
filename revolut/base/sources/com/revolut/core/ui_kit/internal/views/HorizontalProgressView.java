package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kx7.o0;
import ms0.c1;
import ms0.d1;
import ms0.t0;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class HorizontalProgressView extends RecyclerView {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f56188c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StepDelegate f56189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z4l.j f56190b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/HorizontalProgressView$StepDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/internal/views/d;", "Lcom/revolut/core/ui_kit/internal/views/c;", "<init>", "()V", "com/revolut/core/ui_kit/internal/views/b", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class StepDelegate extends BaseRecyclerViewDelegate<d, c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ihm.f f56191c;

        public StepDelegate() {
            super(R$id.internal_horizontal_progress_view_delegate_type, new mqg.a(9));
            this.f56191c = v0.a.d("create(...)");
        }

        @Override // koi.k
        public final RecyclerView.ViewHolder g(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new c(new t0(context, null, 0, 14));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v6, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r11v9, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
        @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
        public final void p(c holder, d data, int i, List payloads) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(payloads, "payloads");
            super.p(holder, data, i, payloads);
            t0 t0Var = holder.f;
            int size = payloads.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (!(payloads.get(i2) instanceof b)) {
                    payloads = null;
                    break;
                }
                i2++;
            }
            List list = payloads;
            boolean z = list == null || list.isEmpty();
            boolean z3 = list == null || list.isEmpty();
            boolean z4 = list == null || list.isEmpty();
            boolean z6 = list == null || list.isEmpty();
            boolean z11 = list == null || list.isEmpty();
            boolean z12 = list == null || list.isEmpty();
            if (payloads != null) {
                for (b bVar : payloads) {
                    z = z || bVar.f56512a;
                    z3 = z3 || bVar.f56513b;
                    z4 = z4 || bVar.f56514c;
                    z6 = z6 || bVar.d;
                    z11 = z11 || bVar.e;
                    z12 = z12 || bVar.f;
                }
            }
            if (z || z3) {
                t0Var.setTitle(data.f56873b, data.f56874c);
            }
            if (z4) {
                t0Var.setSubtitle(data.d);
            }
            if (z6) {
                t0Var.setState(data.e);
            }
            if (z11) {
                t0Var.setGravity(data.f);
            }
            data.getClass();
            or0.m.a(t0Var);
            u.o(t0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final r c() {
        ihm.f fVar = this.f56189a.f56191c;
        d1 d1Var = d1.f;
        r map = fVar.map(new o0(12));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.Adapter adapter) {
        throw new UnsupportedOperationException("Unsupported adapter " + adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        throw new UnsupportedOperationException("Unsupported layout manager " + layoutManager);
    }

    public final void setSteps(@NotNull List<d> steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f56190b.c(steps);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalProgressView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        StepDelegate stepDelegate = new StepDelegate();
        this.f56189a = stepDelegate;
        z4l.j jVar = new z4l.j(7, zhm.u.c(stepDelegate), false);
        this.f56190b = jVar;
        super.setLayoutManager(new c1(this));
        super.setAdapter(jVar);
        setNestedScrollingEnabled(false);
        setItemAnimator(null);
    }

    public /* synthetic */ HorizontalProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R$attr.recyclerViewStyle);
    }
}

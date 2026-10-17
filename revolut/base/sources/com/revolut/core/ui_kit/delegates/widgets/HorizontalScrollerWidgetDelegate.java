package com.revolut.core.ui_kit.delegates.widgets;

import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u00042\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0006\u0005\u0006\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate;", "Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate$Model;", "Lcom/revolut/core/ui_kit/delegates/widgets/i2;", "Companion", "op0/l2", "Model", "op0/i2", "a", "op0/k2", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class HorizontalScrollerWidgetDelegate extends BaseDraggableWidgetDelegate<Model, i2> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f55162h;
    public final op0.i2 i;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/widgets/HorizontalScrollerWidgetDelegate$Model;", "Lkoi/j;", "Lcom/revolut/core/ui_kit/delegates/widgets/BaseDraggableWidgetDelegate$Model;", "Ltw0/y;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Model extends BaseDraggableWidgetDelegate.Model implements tw0.y {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Parcelable f55163b;

        public Model() {
            this(0);
        }

        /* JADX INFO: renamed from: E */
        public abstract boolean getF55087g();

        public abstract List F();

        /* JADX INFO: renamed from: G */
        public abstract Clause getE();

        /* JADX INFO: renamed from: getAnalyticsContext, reason: from getter */
        public Parcelable getF51681q() {
            return this.f55163b;
        }

        public void setAnalyticsContext(Parcelable parcelable) {
            this.f55163b = parcelable;
        }

        @Override // koi.j
        public final Object z(Object oldItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Model model = oldItem instanceof Model ? (Model) oldItem : null;
            if (model != null) {
                qv0.i iVar = (qv0.i) zhm.d0.d0(F());
                Class<?> cls = iVar != null ? iVar.getClass() : null;
                qv0.i iVar2 = (qv0.i) zhm.d0.d0(((Model) oldItem).F());
                if (Intrinsics.f(cls, iVar2 != null ? iVar2.getClass() : null)) {
                    return new op0.l2(!Intrinsics.f(F(), model.F()), getK() != model.getK());
                }
            }
            return null;
        }

        public Model(int i) {
            this.f55163b = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalScrollerWidgetDelegate(int i, Function2 rule) {
        super(i, rule);
        Intrinsics.checkNotNullParameter(rule, "rule");
        this.f55162h = 24.0f;
        this.i = op0.i2.MATCH_PARENT;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        List listS = s();
        i2 i2Var = new i2(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_widget_horizontal_scroller), listS, new ood.k(this, listS, 11));
        p(i2Var, true);
        return i2Var;
    }

    public abstract List s();

    /* JADX INFO: renamed from: t, reason: from getter */
    public float getF55162h() {
        return this.f55162h;
    }

    public Integer u() {
        return null;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public op0.i2 getF55085j() {
        return this.i;
    }

    public abstract efm.r w(List list, Function0 function0);

    /* JADX WARN: Removed duplicated region for block: B:56:0x0127 A[PHI: r10
      0x0127: PHI (r10v1 int) = (r10v0 int), (r10v0 int), (r10v2 int) binds: [B:71:0x0159, B:62:0x013c, B:55:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    @Override // com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.widgets.i2 r33, com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.Model r34, int r35, java.util.List r36) {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate.p(com.revolut.core.ui_kit.delegates.widgets.i2, com.revolut.core.ui_kit.delegates.widgets.HorizontalScrollerWidgetDelegate$Model, int, java.util.List):void");
    }
}

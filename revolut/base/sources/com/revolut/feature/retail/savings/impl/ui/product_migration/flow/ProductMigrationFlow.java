package com.revolut.feature.retail.savings.impl.ui.product_migration.flow;

import a0.d;
import aii.q;
import anb.i;
import anb.n;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlow;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlowContract$InputData;
import com.revolut.kompot.common.R$id;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mpb.b;
import mpb.c;
import te0.w;
import ue0.e;
import vc.s;
import yki.f;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/savings/impl/ui/product_migration/flow/ProductMigrationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProductMigrationFlow extends ViewController<q> implements f {
    public static final /* synthetic */ KProperty[] R = {o0.f186429a.j(new h0(ProductMigrationFlow.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/FlowAnimatedBackgroundBinding;", 0))};
    public final ProductMigrationFlowContract$InputData K;
    public final int L;
    public final int M;
    public final h N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public ProductMigrationFlow(ProductMigrationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.flow_animated_background;
        this.M = R$style.UiKitTheme_TransparentCompat;
        this.N = s.t(this, b.f);
        final int i = 0;
        this.O = w.y0(new Function0(this) { // from class: mpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductMigrationFlow f207782b;

            {
                this.f207782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ProductMigrationFlow productMigrationFlow = this.f207782b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = ProductMigrationFlow.R;
                        phm.a aVar = (phm.a) e.j(productMigrationFlow.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProductMigrationFlowContract$InputData productMigrationFlowContract$InputData = productMigrationFlow.K;
                        productMigrationFlowContract$InputData.getClass();
                        return new i(nVar, productMigrationFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductMigrationFlow.R;
                        return (c) ((i) productMigrationFlow.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = ProductMigrationFlow.R;
                        return czi.c.d(R$id.container, 4, null, productMigrationFlow, (c) productMigrationFlow.P.getValue());
                }
            }
        });
        final int i2 = 1;
        this.P = w.y0(new Function0(this) { // from class: mpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductMigrationFlow f207782b;

            {
                this.f207782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ProductMigrationFlow productMigrationFlow = this.f207782b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductMigrationFlow.R;
                        phm.a aVar = (phm.a) e.j(productMigrationFlow.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProductMigrationFlowContract$InputData productMigrationFlowContract$InputData = productMigrationFlow.K;
                        productMigrationFlowContract$InputData.getClass();
                        return new i(nVar, productMigrationFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductMigrationFlow.R;
                        return (c) ((i) productMigrationFlow.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = ProductMigrationFlow.R;
                        return czi.c.d(R$id.container, 4, null, productMigrationFlow, (c) productMigrationFlow.P.getValue());
                }
            }
        });
        final int i3 = 2;
        this.Q = w.y0(new Function0(this) { // from class: mpb.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ProductMigrationFlow f207782b;

            {
                this.f207782b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                ProductMigrationFlow productMigrationFlow = this.f207782b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = ProductMigrationFlow.R;
                        phm.a aVar = (phm.a) e.j(productMigrationFlow.m2()).a().get(nib.c.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", nib.c.class, " is not found"));
                        }
                        n nVar = ((n) aVar2.b()).F;
                        ProductMigrationFlowContract$InputData productMigrationFlowContract$InputData = productMigrationFlow.K;
                        productMigrationFlowContract$InputData.getClass();
                        return new i(nVar, productMigrationFlowContract$InputData);
                    case 1:
                        KProperty[] kPropertyArr2 = ProductMigrationFlow.R;
                        return (c) ((i) productMigrationFlow.O.getValue()).d.get();
                    default:
                        KProperty[] kPropertyArr3 = ProductMigrationFlow.R;
                        return czi.c.d(R$id.container, 4, null, productMigrationFlow, (c) productMigrationFlow.P.getValue());
                }
            }
        });
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getR() {
        return Integer.valueOf(this.M);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (c) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.N.getValue(this, R[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((jii.a) value).f174492b.setBackgroundType(AnimatedBackgroundType.SAVINGS.f51489a);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.Q.getValue();
    }
}

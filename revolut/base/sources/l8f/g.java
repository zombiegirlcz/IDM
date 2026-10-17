package l8f;

import com.revolut.feature.trading.managed_portfolios.impl.ui.select_template.simple_template.template_risk_level.TemplateRiskLevelControllerExtensionContract$InputData;
import i6f.u0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends u0 implements vki.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final emc.e f192981m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TemplateRiskLevelControllerExtensionContract$InputData f192982n;
    public final vki.a o;

    public g(emc.e templatesInteractor, TemplateRiskLevelControllerExtensionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f192981m = templatesInteractor;
        this.f192982n = inputData;
        this.o = pyd.c.a(this, new b(null, inputData.f91482b, inputData.f91483c));
    }

    @Override // yji.n
    public final void H2() {
        n.l2(this, this.f192981m.a(this.f192982n.f91481a), null, new l1g.e(this, (Continuation) null, 12), 3);
    }

    @Override // vki.b
    public final cam.f getState() {
        return this.o;
    }
}

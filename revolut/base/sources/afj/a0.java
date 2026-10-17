package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection.EsimMobilePlanNumberSelectionFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class a0 implements xki.c, qkj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberSelectionFlowContract$InputData f4108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f4110c = this;
    public final e4m.e d = e4m.b.b(new a0b.c(this, 19));

    public a0(b bVar, EsimMobilePlanNumberSelectionFlowContract$InputData esimMobilePlanNumberSelectionFlowContract$InputData) {
        this.f4109b = bVar;
        this.f4108a = esimMobilePlanNumberSelectionFlowContract$InputData;
    }

    @Override // qkj.a
    public final g2 B() {
        return new g2(this.f4109b, this.f4110c, 2);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

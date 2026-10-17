package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_transfer_confirmation.dynamic_form.EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 implements xki.c, jlj.a, ukj.a, llj.a, wlj.a, hlj.a, ujj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData f4169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f4171c = this;
    public final e4m.e d;

    public b0(b bVar, EsimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData) {
        this.f4170b = bVar;
        this.f4169a = esimMobilePlanNumberTransferConfirmationDynamicFormFlowContract$InputData;
        this.d = e4m.b.b(new a0b.a(bVar, this, 9));
    }

    @Override // ujj.a
    public final u1 N() {
        return new u1(this.f4170b, this.f4171c, 4);
    }

    @Override // jlj.a
    public final w2 b() {
        return new w2(this.f4170b, this.f4171c, 0);
    }

    @Override // hlj.a
    public final s2 c() {
        return new s2(this.f4170b, this.f4171c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // llj.a
    public final u2 j() {
        return new u2(this.f4170b, this.f4171c, 1);
    }

    @Override // wlj.a
    public final y2 q() {
        return new y2(this.f4170b, this.f4171c, 1);
    }

    @Override // ukj.a
    public final s1 s() {
        return new s1(this.f4170b, this.f4171c, 0);
    }
}

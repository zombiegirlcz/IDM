package o8c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b6c.a f222991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q7c.g f222992b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nkl.b f222993c;
    public final xjl.i d;
    public final rdc.b e;

    public a(b6c.a paymentsInteractor, q7c.g paymentMethodsInteractor, nkl.b revolutSsoFlowsFactory, xjl.i revolutSsoFlowConfigurationInteractor, rdc.b errorReasonToClauseMapper) {
        Intrinsics.checkNotNullParameter(paymentsInteractor, "paymentsInteractor");
        Intrinsics.checkNotNullParameter(paymentMethodsInteractor, "paymentMethodsInteractor");
        Intrinsics.checkNotNullParameter(revolutSsoFlowsFactory, "revolutSsoFlowsFactory");
        Intrinsics.checkNotNullParameter(revolutSsoFlowConfigurationInteractor, "revolutSsoFlowConfigurationInteractor");
        Intrinsics.checkNotNullParameter(errorReasonToClauseMapper, "errorReasonToClauseMapper");
        this.f222991a = paymentsInteractor;
        this.f222992b = paymentMethodsInteractor;
        this.f222993c = revolutSsoFlowsFactory;
        this.d = revolutSsoFlowConfigurationInteractor;
        this.e = errorReasonToClauseMapper;
    }

    public final j a() {
        return new j(this.f222991a, this.f222992b, this.f222993c, this.d, this.e);
    }
}

package com.revolut.feature.junior.account_activation.impl.ui.flow.deeplink;

import cu8.r0;
import d8l.d;
import eul.f;
import f2i.x;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends h implements f68.b {
    public final AccountActivationDeeplinkFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final q58.a f76661p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hj8.a f76662q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r0 f76663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f76664s;

    public c(AccountActivationDeeplinkFlowContract$InputData inputData, q58.a accountActivationInteractor, hj8.a juniorProfileInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(accountActivationInteractor, "accountActivationInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.o = inputData;
        this.f76661p = accountActivationInteractor;
        this.f76662q = juniorProfileInteractor;
        this.f76663r = kycRequiredActionTransformer;
        this.f76664s = d.a(this, new f(this, 17));
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new x(1, this, c.class, "handleInitialisationError", "handleInitialisationError(Ljava/lang/Throwable;)Z", 0, 5));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f76664s;
    }
}

package a68;

import cu8.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements q58.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q58.a f1571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f1572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f1573c;

    public i(q58.a accountActivationInteractor, hj8.a juniorProfileInteractor, r0 kycRequiredActionTransformer) {
        Intrinsics.checkNotNullParameter(accountActivationInteractor, "accountActivationInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        this.f1571a = accountActivationInteractor;
        this.f1572b = juniorProfileInteractor;
        this.f1573c = kycRequiredActionTransformer;
    }
}

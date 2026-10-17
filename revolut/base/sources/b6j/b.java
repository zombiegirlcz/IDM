package b6j;

import akl.s1;
import b4b.z;
import cu8.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import wd6.e;
import z5j.d;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f12843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f12844m;

    public b(r0 kycRequiredActionTransformer, d orderFlowCommandProvider) {
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(orderFlowCommandProvider, "orderFlowCommandProvider");
        this.f12843l = kycRequiredActionTransformer;
        this.f12844m = orderFlowCommandProvider;
    }

    @Override // b6j.a
    public final void Z2(e exchangeMode, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        V2(new s1(this, exchangeMode, currency, (Continuation) null, 27), new z(this, 19));
    }
}

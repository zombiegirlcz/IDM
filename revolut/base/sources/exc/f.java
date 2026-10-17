package exc;

import com.revolut.feature.select.payment.api.models.IntroScreenConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public IntroScreenConfiguration u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.select.payment.impl.ui.flow.a f130384w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f130385x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.revolut.feature.select.payment.impl.ui.flow.a aVar, gim.c cVar) {
        super(cVar);
        this.f130384w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f130385x |= Integer.MIN_VALUE;
        return this.f130384w.K2(null, this);
    }
}

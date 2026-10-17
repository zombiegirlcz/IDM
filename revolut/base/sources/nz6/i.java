package nz6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.c {
    public Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f220963w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.freelancer.impl.ui.onboarding.flow.b f220964x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f220965y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.feature.freelancer.impl.ui.onboarding.flow.b bVar, Continuation continuation) {
        super(continuation);
        this.f220964x = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f220963w = obj2;
        this.f220965y |= Integer.MIN_VALUE;
        return com.revolut.feature.freelancer.impl.ui.onboarding.flow.b.J2(this.f220964x, this);
    }
}

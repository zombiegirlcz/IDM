package fq;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class i extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.appwidget_core.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f137152w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.revolut.appwidget_core.a aVar, Continuation continuation) {
        super(continuation);
        this.v = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f137152w |= Integer.MIN_VALUE;
        return this.v.provideGlance(null, null, this);
    }
}

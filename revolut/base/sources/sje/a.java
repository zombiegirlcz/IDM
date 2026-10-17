package sje;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ sij.c f263709w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f263709w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f263709w.emit(null, this);
    }
}

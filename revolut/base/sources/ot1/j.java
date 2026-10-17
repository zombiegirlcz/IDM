package ot1;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ood.x f229406w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ood.x xVar, Continuation continuation) {
        super(continuation);
        this.f229406w = xVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f229406w.emit(null, this);
    }
}

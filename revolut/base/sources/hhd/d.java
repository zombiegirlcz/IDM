package hhd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f152388w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f152388w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152388w.emit(null, this);
    }
}

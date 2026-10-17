package hhd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f152387w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f152387w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f152387w.emit(null, this);
    }
}

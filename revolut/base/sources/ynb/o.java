package ynb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f315415w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, Continuation continuation) {
        super(continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f315415w |= Integer.MIN_VALUE;
        return this.v.m3(null, this);
    }
}

package ynb;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.c {
    public sib.a u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f315401w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f315402x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r rVar, Continuation continuation) {
        super(continuation);
        this.f315401w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f315402x |= Integer.MIN_VALUE;
        return this.f315401w.e3(null, null, this);
    }
}

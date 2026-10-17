package no;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class h2 extends gim.c {
    public ho.t u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ald.e f217782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f217783x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(ald.e eVar, Continuation continuation) {
        super(continuation);
        this.f217782w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f217783x |= Integer.MIN_VALUE;
        return this.f217782w.a(null, this);
    }
}

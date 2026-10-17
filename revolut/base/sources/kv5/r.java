package kv5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class r extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ klj.e f189978w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(klj.e eVar, Continuation continuation) {
        super(continuation);
        this.f189978w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f189978w.emit(null, this);
    }
}

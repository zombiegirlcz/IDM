package fwj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public o0j.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f138682w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f138683x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Continuation continuation) {
        super(continuation);
        this.f138682w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f138683x |= Integer.MIN_VALUE;
        return this.f138682w.h(null, this);
    }
}

package kv;

import cxe.t;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes16.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f189900w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(t tVar, Continuation continuation) {
        super(continuation);
        this.f189900w = tVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f189900w.emit(null, this);
    }
}

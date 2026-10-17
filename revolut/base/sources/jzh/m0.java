package jzh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i52.l f179841w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(i52.l lVar, Continuation continuation) {
        super(continuation);
        this.f179841w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f179841w.emit(null, this);
    }
}

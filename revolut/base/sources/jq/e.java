package jq;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes17.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ jhd.d f177332w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(jhd.d dVar, Continuation continuation) {
        super(continuation);
        this.f177332w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f177332w.emit(null, this);
    }
}

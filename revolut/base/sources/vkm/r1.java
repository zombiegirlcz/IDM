package vkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes13.dex */
public final class r1 extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ akg.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f290111w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(akg.m mVar, Continuation continuation) {
        super(continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f290111w |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}

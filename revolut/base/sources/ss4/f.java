package ss4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ spb.f f265273w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(spb.f fVar, Continuation continuation) {
        super(continuation);
        this.f265273w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f265273w.emit(null, this);
    }
}

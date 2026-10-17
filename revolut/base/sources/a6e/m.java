package a6e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.c {
    public sfe.s u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f1636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1637x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(s sVar, Continuation continuation) {
        super(continuation);
        this.f1636w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f1637x |= Integer.MIN_VALUE;
        return this.f1636w.d3(null, this);
    }
}

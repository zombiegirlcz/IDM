package n5k;

import k5k.t;

/* JADX INFO: loaded from: classes11.dex */
public final class i extends gim.c {
    public t u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f212636w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f212637x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, gim.c cVar) {
        super(cVar);
        this.f212636w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f212637x |= Integer.MIN_VALUE;
        return this.f212636w.f3(null, this);
    }
}

package hie;

import mp.p;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f152600w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f152601x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(p pVar, gim.c cVar) {
        super(cVar);
        this.f152600w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f152601x |= Integer.MIN_VALUE;
        return this.f152600w.h(null, this);
    }
}

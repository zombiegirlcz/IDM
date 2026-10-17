package c9k;

import mp.p;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f22505w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f22506x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, gim.c cVar) {
        super(cVar);
        this.f22505w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f22506x |= Integer.MIN_VALUE;
        return this.f22505w.o(null, this);
    }
}

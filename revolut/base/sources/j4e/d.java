package j4e;

import mp.p;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f171376w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p pVar, gim.c cVar) {
        super(cVar);
        this.v = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f171376w |= Integer.MIN_VALUE;
        return p.d(this.v, this);
    }
}

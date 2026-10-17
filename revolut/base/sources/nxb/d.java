package nxb;

import m1c.v0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends gim.c {
    public final /* synthetic */ e A;
    public int B;
    public v0 u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f220545w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f220546x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f220547y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.A = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.a(null, 0L, this);
    }
}

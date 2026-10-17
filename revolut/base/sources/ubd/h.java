package ubd;

import lcd.j;

/* JADX INFO: loaded from: classes7.dex */
public final class h extends gim.c {
    public long A;
    public /* synthetic */ Object B;
    public final /* synthetic */ i C;
    public int D;
    public String u;
    public sbd.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f278834w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f278835x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public j f278836y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.C = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.h(null, 0L, null, null, null, this);
    }
}

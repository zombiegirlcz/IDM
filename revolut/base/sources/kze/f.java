package kze;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f191106w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f191107x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, gim.c cVar) {
        super(cVar);
        this.f191106w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f191107x |= Integer.MIN_VALUE;
        return i.I2(this.f191106w, null, this);
    }
}

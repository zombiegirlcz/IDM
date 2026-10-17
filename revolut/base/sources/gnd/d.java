package gnd;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends gim.c {
    public String u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f144960w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f144961x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f144962y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f144962y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f144961x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f144962y.i(null, false, this);
    }
}

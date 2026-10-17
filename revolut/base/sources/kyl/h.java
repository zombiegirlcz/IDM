package kyl;

/* JADX INFO: loaded from: classes12.dex */
public final class h extends gim.c {
    public String u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f191021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f191022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f191023y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, gim.c cVar) {
        super(cVar);
        this.f191023y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191022x = obj2;
        this.z |= Integer.MIN_VALUE;
        return i.a(this.f191023y, null, this);
    }
}

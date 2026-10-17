package kyl;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public hlm.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f191012w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f191013x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f191014y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, gim.c cVar) {
        super(cVar);
        this.f191013x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f191012w = obj2;
        this.f191014y |= Integer.MIN_VALUE;
        return this.f191013x.b(this);
    }
}

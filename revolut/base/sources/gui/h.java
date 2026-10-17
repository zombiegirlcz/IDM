package gui;

/* JADX INFO: loaded from: classes10.dex */
public final class h extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f146952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f146953x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f146952w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f146953x |= Integer.MIN_VALUE;
        return j.Z2(this.f146952w, null, this);
    }
}

package ey5;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.c {
    public j u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f130575w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f130576x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, gim.c cVar) {
        super(cVar);
        this.f130575w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f130576x |= Integer.MIN_VALUE;
        return j.g3(this.f130575w, null, this);
    }
}

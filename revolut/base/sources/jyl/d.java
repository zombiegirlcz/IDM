package jyl;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends gim.c {
    public hlm.c u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f179524w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179525x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, gim.c cVar) {
        super(cVar);
        this.f179524w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179525x |= Integer.MIN_VALUE;
        return this.f179524w.a(this);
    }
}

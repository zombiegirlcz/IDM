package lz3;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public it3.d u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f200913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f200914x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f200913w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f200914x |= Integer.MIN_VALUE;
        return this.f200913w.a(null, this);
    }
}

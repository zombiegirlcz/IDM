package elf;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.c {
    public nr2.b u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f127334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f127335x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, gim.c cVar) {
        super(cVar);
        this.f127334w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f127335x |= Integer.MIN_VALUE;
        return this.f127334w.c3(null, this);
    }
}

package opf;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 extends gim.c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k7i.i f227617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227618x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(k7i.i iVar, gim.c cVar) {
        super(cVar);
        this.f227617w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f227618x |= Integer.MIN_VALUE;
        return this.f227617w.l(null, this);
    }
}

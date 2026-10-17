package di3;

/* JADX INFO: loaded from: classes21.dex */
public final class s extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f114902w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f114903x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f114904y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, gim.c cVar) {
        super(cVar);
        this.f114903x = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f114902w = obj2;
        this.f114904y |= Integer.MIN_VALUE;
        return this.f114903x.i(null, null, this);
    }
}

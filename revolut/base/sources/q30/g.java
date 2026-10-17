package q30;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f241754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h f241755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f241756y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f241755x = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f241754w = obj2;
        this.f241756y |= Integer.MIN_VALUE;
        return h.b(this.f241755x, null, null, this);
    }
}

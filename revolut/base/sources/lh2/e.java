package lh2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public jf0.c u;
    public Boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f195149w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ i f195150x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f195151y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, gim.c cVar) {
        super(cVar);
        this.f195150x = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f195149w = obj2;
        this.f195151y |= Integer.MIN_VALUE;
        return this.f195150x.b(null, this);
    }
}

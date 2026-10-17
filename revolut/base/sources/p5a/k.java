package p5a;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends gim.c {
    public gz9.c u;
    public dj0.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l f233075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233076y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, gim.c cVar) {
        super(cVar);
        this.f233075x = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233074w = obj2;
        this.f233076y |= Integer.MIN_VALUE;
        return this.f233075x.h(null, null, this);
    }
}

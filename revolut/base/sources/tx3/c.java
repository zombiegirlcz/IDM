package tx3;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public String u;
    public d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f275323w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f275324x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f275325y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f275324x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f275323w = obj2;
        this.f275325y |= Integer.MIN_VALUE;
        return this.f275324x.a(null, this);
    }
}

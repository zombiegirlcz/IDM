package p6k;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public j60.a u;
    public i6k.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f233341w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ c f233342x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f233343y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f233342x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f233341w = obj2;
        this.f233343y |= Integer.MIN_VALUE;
        return this.f233342x.i(null, null, this);
    }
}

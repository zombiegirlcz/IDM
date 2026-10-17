package eh3;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.c {
    public vii.b u;
    public twg.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f125709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ twg.c f125710x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f125711y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(twg.c cVar, gim.c cVar2) {
        super(cVar2);
        this.f125710x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f125709w = obj2;
        this.f125711y |= Integer.MIN_VALUE;
        return this.f125710x.C(null, this);
    }
}

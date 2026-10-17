package yb5;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f312196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f312197x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f312198y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f312198y = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f312197x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f312198y.f(null, null, this);
    }
}

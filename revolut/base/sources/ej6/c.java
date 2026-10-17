package ej6;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public String u;
    public wsg.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f126723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f126724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f126725y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f126725y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f126724x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f126725y.b(null, this);
    }
}

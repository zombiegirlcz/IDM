package vr4;

/* JADX INFO: loaded from: classes22.dex */
public final class r extends gim.c {
    public int A;
    public String u;
    public io3.l v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dj0.d f291496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public wi0.b f291497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f291498y;
    public final /* synthetic */ s z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.z = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f291498y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, null, this);
    }
}

package vr4;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public String u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f291474w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f291475x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f291476y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, gim.c cVar) {
        super(cVar);
        this.f291476y = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f291475x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f291476y.b(null, null, this);
    }
}

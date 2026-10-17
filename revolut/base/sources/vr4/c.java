package vr4;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f291471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f291472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f291473y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, gim.c cVar) {
        super(cVar);
        this.f291472x = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f291471w = obj2;
        this.f291473y |= Integer.MIN_VALUE;
        return this.f291472x.a(null, null, 0, null, null, this);
    }
}

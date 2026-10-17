package cwa;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public boolean u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f109578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f109579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f109580y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, gim.c cVar) {
        super(cVar);
        this.f109579x = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f109578w = obj2;
        this.f109580y |= Integer.MIN_VALUE;
        return this.f109579x.b(this);
    }
}

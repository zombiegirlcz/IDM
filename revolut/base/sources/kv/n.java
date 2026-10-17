package kv;

/* JADX INFO: loaded from: classes16.dex */
public final class n extends gim.c {
    public boolean u;
    public j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Throwable f189901w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f189902x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ p f189903y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, gim.c cVar) {
        super(cVar);
        this.f189903y = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f189902x = obj2;
        this.z |= Integer.MIN_VALUE;
        return p.c(this.f189903y, false, null, this);
    }
}

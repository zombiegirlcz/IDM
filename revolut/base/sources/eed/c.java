package eed;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.c {
    public lcd.i u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f125177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f125178x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f125177w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f125178x |= Integer.MIN_VALUE;
        return this.f125177w.b(null, this);
    }
}

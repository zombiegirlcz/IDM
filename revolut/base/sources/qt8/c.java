package qt8;

import my8.a0;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public a0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f249016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f249017x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f249016w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f249017x |= Integer.MIN_VALUE;
        return this.f249016w.f(null, this);
    }
}

package ok5;

import zm3.l;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.c {
    public l u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f225900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f225901x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f225900w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f225901x |= Integer.MIN_VALUE;
        return d.e3(this.f225900w, null, this);
    }
}

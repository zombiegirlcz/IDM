package on8;

import gim.c;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kgm.c f226914w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f226915x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kgm.c cVar, c cVar2) {
        super(cVar2);
        this.f226914w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f226915x |= Integer.MIN_VALUE;
        return this.f226914w.k(null, this);
    }
}

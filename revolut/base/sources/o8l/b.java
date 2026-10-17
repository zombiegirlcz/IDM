package o8l;

import j8l.k;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.c {
    public k u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f223043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f223044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f223043w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f223044x |= Integer.MIN_VALUE;
        return this.f223043w.b(null, this);
    }
}

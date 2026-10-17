package fq;

import p01.u;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends gim.c {
    public u u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.appwidget_core.a f137157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f137158x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.revolut.appwidget_core.a aVar, gim.c cVar) {
        super(cVar);
        this.f137157w = aVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f137158x |= Integer.MIN_VALUE;
        return com.revolut.appwidget_core.a.b(this.f137157w, null, null, this);
    }
}

package ydm;

import io.ktor.client.engine.HttpClientEngine;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends gim.c {
    public Object u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ HttpClientEngine f312711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f312712x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HttpClientEngine httpClientEngine, gim.c cVar) {
        super(cVar);
        this.f312711w = httpClientEngine;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f312712x |= Integer.MIN_VALUE;
        return HttpClientEngine.O5(this.f312711w, null, this);
    }
}

package jhe;

import ahe.w0;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends gim.c {
    public w0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w f174240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f174241x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, gim.c cVar) {
        super(cVar);
        this.f174240w = wVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f174241x |= Integer.MIN_VALUE;
        return this.f174240w.e(this);
    }
}

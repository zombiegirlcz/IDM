package gd4;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends gim.c {
    public h1 u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f143067w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f143068x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f143069y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, gim.c cVar2) {
        super(cVar2);
        this.f143069y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f143068x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f143069y.a(null, null, null, this);
    }
}

package olb;

import ncd.h;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.c {
    public h u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f226365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f226366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f226367y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f226366x = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f226365w = obj2;
        this.f226367y |= Integer.MIN_VALUE;
        return this.f226366x.m(null, false, this);
    }
}

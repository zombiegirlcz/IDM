package eqj;

import lzi.h;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public h u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f128472w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f128473x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f128474y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f128474y = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f128473x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f128474y.g(null, false, false, this);
    }
}

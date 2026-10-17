package wl3;

import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends gim.c {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f298383w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f298384x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l f298385y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, gim.c cVar) {
        super(cVar);
        this.f298385y = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298384x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f298385y.a(this);
    }
}

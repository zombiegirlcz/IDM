package f84;

import ft3.h1;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends gim.c {
    public uw3.a u;
    public h1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k f132726w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f132727x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f132728y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, gim.c cVar) {
        super(cVar);
        this.f132728y = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132727x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f132728y.c(this);
    }
}

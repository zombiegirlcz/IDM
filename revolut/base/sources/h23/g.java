package h23;

import do3.n;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends gim.c {
    public int A;
    public e13.a u;
    public n v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f148637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f148638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f148639y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f148639y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, this);
    }
}

package ii4;

import hs3.u1;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.c {
    public q u;
    public u1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f161566w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f161567x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f161568y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, gim.c cVar) {
        super(cVar);
        this.f161568y = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f161567x = obj2;
        this.z |= Integer.MIN_VALUE;
        return z.b(this.f161568y, null, null, null, null, false, this);
    }
}

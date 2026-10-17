package qq3;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ i B;
    public int C;
    public Set u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f248477w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f248478x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f248479y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, gim.c cVar) {
        super(cVar);
        this.B = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return this.B.b(null, this);
    }
}

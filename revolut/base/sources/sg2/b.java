package sg2;

import gim.c;
import kgm.i;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public final /* synthetic */ i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f262583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, c cVar) {
        super(cVar);
        this.v = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f262583w |= Integer.MIN_VALUE;
        return this.v.s(null, null, this);
    }
}

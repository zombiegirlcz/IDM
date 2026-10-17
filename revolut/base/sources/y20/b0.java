package y20;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 extends gim.c {
    public r10.q A;
    public u10.q B;
    public u10.q C;
    public u10.q D;
    public /* synthetic */ Object E;
    public final /* synthetic */ uvl.c F;
    public int G;
    public t u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Map f310451w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f310452x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public u10.h f310453y;
    public p z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.F = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.E = obj2;
        this.G |= Integer.MIN_VALUE;
        return uvl.c.e(this.F, null, null, null, null, this);
    }
}

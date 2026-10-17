package m6i;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends gim.c {
    public int A;
    public List u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f203135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public xi0.b f203136x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f203137y;
    public final /* synthetic */ hd.r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(hd.r rVar, gim.c cVar) {
        super(cVar);
        this.z = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f203137y = obj2;
        this.A |= Integer.MIN_VALUE;
        return hd.r.j(this.z, null, null, this);
    }
}

package n4d;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends gim.c {
    public List u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f212368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f212369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ r0 f212370y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r0 r0Var, gim.c cVar) {
        super(cVar);
        this.f212370y = r0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f212369x = obj2;
        this.z |= Integer.MIN_VALUE;
        return r0.b(this.f212370y, null, this);
    }
}

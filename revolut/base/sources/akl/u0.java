package akl;

import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class u0 extends gim.c {
    public int A;
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f6097w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6098x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f6099y;
    public final /* synthetic */ e1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(e1 e1Var, gim.c cVar) {
        super(cVar);
        this.z = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f6099y = obj2;
        this.A |= Integer.MIN_VALUE;
        return e1.b(this.z, null, this);
    }
}

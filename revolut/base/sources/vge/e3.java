package vge;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class e3 extends gim.c {
    public final /* synthetic */ t3 A;
    public int B;
    public Collection u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f288891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f288892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f288893y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(t3 t3Var, gim.c cVar) {
        super(cVar);
        this.A = t3Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.h(this);
    }
}

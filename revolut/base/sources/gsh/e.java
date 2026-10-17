package gsh;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.c {
    public int A;
    public int B;
    public boolean C;
    public /* synthetic */ Object D;
    public final /* synthetic */ n E;
    public int F;
    public Set u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f146471w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f146472x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f146473y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n nVar, gim.c cVar) {
        super(cVar);
        this.E = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.D = obj2;
        this.F |= Integer.MIN_VALUE;
        return n.a(this.E, this);
    }
}

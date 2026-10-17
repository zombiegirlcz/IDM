package y20;

import java.util.Iterator;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends gim.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ uvl.c B;
    public int C;
    public i u;
    public u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r10.q f310563w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f310564x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a f310565y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(uvl.c cVar, gim.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.A = obj2;
        this.C |= Integer.MIN_VALUE;
        return uvl.c.b(this.B, null, null, this);
    }
}

package ayf;

import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.c {
    public Iterator u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f11167w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n f11168x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11169y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n nVar, gim.c cVar) {
        super(cVar);
        this.f11168x = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f11167w = obj2;
        this.f11169y |= Integer.MIN_VALUE;
        return n.c(this.f11168x, this);
    }
}

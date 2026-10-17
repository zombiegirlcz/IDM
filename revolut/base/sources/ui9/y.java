package ui9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class y extends gim.c {
    public Iterator u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280360w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f280361x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ z f280362y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, gim.c cVar) {
        super(cVar);
        this.f280362y = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f280361x = obj2;
        this.z |= Integer.MIN_VALUE;
        return z.a(this.f280362y, null, this);
    }
}

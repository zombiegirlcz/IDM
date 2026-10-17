package fy1;

import java.util.Iterator;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.c {
    public String u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f138862w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f138863x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f138864y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, gim.c cVar) {
        super(cVar);
        this.f138863x = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f138862w = obj2;
        this.f138864y |= Integer.MIN_VALUE;
        return this.f138863x.e(null, this);
    }
}

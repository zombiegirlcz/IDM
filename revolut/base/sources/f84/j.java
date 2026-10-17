package f84;

import cv3.u;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.c {
    public u u;
    public bu3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f132733w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k f132734x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f132735y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.f132734x = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f132733w = obj2;
        this.f132735y |= Integer.MIN_VALUE;
        return this.f132734x.i(null, null, this);
    }
}

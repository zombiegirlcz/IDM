package ji4;

import gim.c;
import ii4.g0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends c {
    public g0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f174344w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f174345x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f174344w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f174345x |= Integer.MIN_VALUE;
        return this.f174344w.b(null, this);
    }
}

package eqk;

import gim.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f128482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f128483x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f128482w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f128483x |= Integer.MIN_VALUE;
        return this.f128482w.a(this);
    }
}

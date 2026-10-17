package ps1;

import gim.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f239385w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f239386x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f239385w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f239386x |= Integer.MIN_VALUE;
        return this.f239385w.a(null, this);
    }
}

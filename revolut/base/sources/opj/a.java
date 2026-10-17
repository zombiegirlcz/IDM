package opj;

import gim.c;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f227685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227686x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f227685w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f227686x |= Integer.MIN_VALUE;
        return this.f227685w.a(null, null, this);
    }
}

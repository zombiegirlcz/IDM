package k3c;

import d3c.d0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.c {
    public String u;
    public d0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f180664w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p f180665x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f180666y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, gim.c cVar) {
        super(cVar);
        this.f180665x = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f180664w = obj2;
        this.f180666y |= Integer.MIN_VALUE;
        return this.f180665x.b(null, null, this);
    }
}

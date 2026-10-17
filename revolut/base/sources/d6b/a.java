package d6b;

import gim.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    public String u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f111479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f111480x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f111479w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f111480x |= Integer.MIN_VALUE;
        return this.f111479w.a(null, this);
    }
}

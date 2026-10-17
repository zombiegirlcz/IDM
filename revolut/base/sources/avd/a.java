package avd;

import gim.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {
    public boolean u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f10008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10009x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, c cVar) {
        super(cVar);
        this.f10008w = bVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f10009x |= Integer.MIN_VALUE;
        return this.f10008w.b(false, this);
    }
}

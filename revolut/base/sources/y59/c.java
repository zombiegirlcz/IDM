package y59;

import mii.p;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public p u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f311009w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f311010x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f311009w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f311010x |= Integer.MIN_VALUE;
        return this.f311009w.b(null, this);
    }
}

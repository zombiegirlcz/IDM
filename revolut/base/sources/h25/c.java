package h25;

import grl.r2;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public r2 u;
    public it3.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f148699w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f148700x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f148701y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, gim.c cVar) {
        super(cVar);
        this.f148700x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f148699w = obj2;
        this.f148701y |= Integer.MIN_VALUE;
        return e.e3(this.f148700x, null, null, this);
    }
}

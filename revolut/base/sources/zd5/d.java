package zd5;

import j8l.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends gim.c {
    public h u;
    public boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f321312w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f321313x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f321314y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f321313x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f321312w = obj2;
        this.f321314y |= Integer.MIN_VALUE;
        return this.f321313x.a(null, null, false, this);
    }
}

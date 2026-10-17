package vsj;

import usj.b0;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public String u;
    public b0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f291832w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f291833x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f291834y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f291833x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f291832w = obj2;
        this.f291834y |= Integer.MIN_VALUE;
        return this.f291833x.j(null, null, this);
    }
}

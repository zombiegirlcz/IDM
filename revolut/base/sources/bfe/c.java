package bfe;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends gim.c {
    public Function1 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ d C;
    public int D;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f14973y;
    public Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.C = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return this.C.c(0, 0L, null, null, this);
    }
}

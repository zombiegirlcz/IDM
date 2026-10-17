package nw3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.c {
    public int A;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f219758w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Function1 f219759x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f219760y;
    public final /* synthetic */ d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.z = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f219760y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.d(0, 0L, null, this);
    }
}

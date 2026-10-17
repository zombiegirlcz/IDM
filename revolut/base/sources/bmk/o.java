package bmk;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public hha.d u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f16880w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ q f16881x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f16882y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(q qVar, gim.c cVar) {
        super(cVar);
        this.f16881x = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f16880w = obj2;
        this.f16882y |= Integer.MIN_VALUE;
        return this.f16881x.Z2(null, null, this);
    }
}

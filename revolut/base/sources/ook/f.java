package ook;

import hd.r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends gim.c {
    public Function2 A;
    public /* synthetic */ Object B;
    public final /* synthetic */ r C;
    public int D;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f227146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f227147x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f227148y;
    public Function1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, gim.c cVar) {
        super(cVar);
        this.C = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.B = obj2;
        this.D |= Integer.MIN_VALUE;
        return r.i(this.C, 0, null, null, this);
    }
}

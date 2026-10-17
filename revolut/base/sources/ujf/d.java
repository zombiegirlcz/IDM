package ujf;

import kotlin.jvm.functions.Function1;
import tof.a3;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public final /* synthetic */ h A;
    public int B;
    public a3 u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f280612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f280613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f280614y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, gim.c cVar) {
        super(cVar);
        this.A = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.z = obj2;
        this.B |= Integer.MIN_VALUE;
        return this.A.c(null, null, this);
    }
}

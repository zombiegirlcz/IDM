package te8;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends gim.c {
    public int A;
    public long u;
    public Function1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Function2 f270085w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Function2 f270086x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f270087y;
    public final /* synthetic */ y z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.z = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f270087y = obj2;
        this.A |= Integer.MIN_VALUE;
        return y.a(this.z, 0L, null, null, null, this);
    }
}

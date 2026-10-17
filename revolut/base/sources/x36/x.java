package x36;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends gim.c {
    public Function1 u;
    public hlm.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f302685w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f302686x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f302687y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, gim.c cVar) {
        super(cVar);
        this.f302686x = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f302685w = obj2;
        this.f302687y |= Integer.MIN_VALUE;
        return y.K2(this.f302686x, null, this);
    }
}

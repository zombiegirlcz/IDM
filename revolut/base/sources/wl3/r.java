package wl3;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class r extends gim.c {
    public Function1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f298399w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f298400x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, gim.c cVar) {
        super(cVar);
        this.f298399w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f298400x |= Integer.MIN_VALUE;
        return this.f298399w.c(null, this);
    }
}

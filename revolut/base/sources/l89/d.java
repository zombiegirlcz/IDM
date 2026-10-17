package l89;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public Function1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f192811w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f192812x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f192811w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f192812x |= Integer.MIN_VALUE;
        return this.f192811w.a(null, this);
    }
}

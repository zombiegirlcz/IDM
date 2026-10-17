package vjk;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public Function0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f289798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f289799x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, gim.c cVar) {
        super(cVar);
        this.f289798w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f289799x |= Integer.MIN_VALUE;
        return d.b3(this.f289798w, null, null, null, this);
    }
}

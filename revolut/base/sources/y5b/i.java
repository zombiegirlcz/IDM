package y5b;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class i extends gim.c {
    public Function1 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f311043w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f311044x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, gim.c cVar) {
        super(cVar);
        this.f311043w = jVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f311044x |= Integer.MIN_VALUE;
        return j.a(this.f311043w, null, null, this);
    }
}

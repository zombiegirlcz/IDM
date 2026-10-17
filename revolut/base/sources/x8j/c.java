package x8j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x4k.e f303423w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x4k.e eVar, Continuation continuation) {
        super(continuation);
        this.f303423w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303423w.emit(null, this);
    }
}

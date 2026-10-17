package x6e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x4k.e f303077w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(x4k.e eVar, Continuation continuation) {
        super(continuation);
        this.f303077w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303077w.emit(null, this);
    }
}

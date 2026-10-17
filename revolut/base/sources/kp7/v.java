package kp7;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ klj.e f188199w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(klj.e eVar, Continuation continuation) {
        super(continuation);
        this.f188199w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f188199w.emit(null, this);
    }
}

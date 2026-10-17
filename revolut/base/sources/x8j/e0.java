package x8j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x4k.e f303430w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(x4k.e eVar, Continuation continuation) {
        super(continuation);
        this.f303430w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303430w.emit(null, this);
    }
}

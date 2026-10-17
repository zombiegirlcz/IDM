package x8j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class d0 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f303428w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(r rVar, Continuation continuation) {
        super(continuation);
        this.f303428w = rVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f303428w.emit(null, this);
    }
}

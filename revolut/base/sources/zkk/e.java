package zkk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ zj6.d f323064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zj6.d dVar, Continuation continuation) {
        super(continuation);
        this.f323064w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f323064w.emit(null, this);
    }
}

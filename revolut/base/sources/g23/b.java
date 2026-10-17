package g23;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ fod.i f139772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(fod.i iVar, Continuation continuation) {
        super(continuation);
        this.f139772w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f139772w.emit(null, this);
    }
}

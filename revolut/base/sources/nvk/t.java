package nvk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class t extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ntf.q f219735w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ntf.q qVar, Continuation continuation) {
        super(continuation);
        this.f219735w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f219735w.emit(null, this);
    }
}

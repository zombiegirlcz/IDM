package dwi;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class w extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f120467w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v vVar, Continuation continuation) {
        super(continuation);
        this.f120467w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f120467w.emit(null, this);
    }
}

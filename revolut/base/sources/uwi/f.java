package uwi;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ urd.m f283672w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(urd.m mVar, Continuation continuation) {
        super(continuation);
        this.f283672w = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f283672w.emit(null, this);
    }
}

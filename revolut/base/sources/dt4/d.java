package dt4;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dk9.g f117363w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dk9.g gVar, Continuation continuation) {
        super(continuation);
        this.f117363w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f117363w.emit(null, this);
    }
}

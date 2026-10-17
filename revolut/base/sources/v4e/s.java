package v4e;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ uxh.c f286064w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(uxh.c cVar, Continuation continuation) {
        super(continuation);
        this.f286064w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f286064w.emit(null, this);
    }
}

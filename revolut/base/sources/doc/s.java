package doc;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class s extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dc0.c f116517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dc0.c cVar, Continuation continuation) {
        super(continuation);
        this.f116517w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f116517w.emit(null, this);
    }
}

package is2;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class v extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ img.c f168106w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(img.c cVar, Continuation continuation) {
        super(continuation);
        this.f168106w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f168106w.emit(null, this);
    }
}

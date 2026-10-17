package d9j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d6e.d f112394w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d6e.d dVar, Continuation continuation) {
        super(continuation);
        this.f112394w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f112394w.emit(null, this);
    }
}

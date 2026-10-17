package gjh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g9d.e f144293w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g9d.e eVar, Continuation continuation) {
        super(continuation);
        this.f144293w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144293w.emit(null, this);
    }
}

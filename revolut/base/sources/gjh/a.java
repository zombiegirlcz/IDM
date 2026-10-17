package gjh;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g9d.e f144292w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g9d.e eVar, Continuation continuation) {
        super(continuation);
        this.f144292w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f144292w.emit(null, this);
    }
}

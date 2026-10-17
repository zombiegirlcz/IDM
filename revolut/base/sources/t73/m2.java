package t73;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class m2 extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f268494w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(v vVar, Continuation continuation) {
        super(continuation);
        this.f268494w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f268494w.emit(null, this);
    }
}

package ho6;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ hg4.i f154228w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(hg4.i iVar, Continuation continuation) {
        super(continuation);
        this.f154228w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f154228w.emit(null, this);
    }
}

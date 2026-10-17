package njj;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class o extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f216583w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(i iVar, Continuation continuation) {
        super(continuation);
        this.f216583w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f216583w.emit(null, this);
    }
}

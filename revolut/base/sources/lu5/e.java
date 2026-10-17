package lu5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ im9.k f200027w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(im9.k kVar, Continuation continuation) {
        super(continuation);
        this.f200027w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f200027w.emit(null, this);
    }
}

package ktk;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ klj.e f189561w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(klj.e eVar, Continuation continuation) {
        super(continuation);
        this.f189561w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f189561w.emit(null, this);
    }
}

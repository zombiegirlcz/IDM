package nj5;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c2d.f f216372w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(c2d.f fVar, Continuation continuation) {
        super(continuation);
        this.f216372w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f216372w.emit(null, this);
    }
}

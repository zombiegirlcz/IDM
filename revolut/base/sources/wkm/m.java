package wkm;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes14.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ ks0.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f298321w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ks0.m mVar, Continuation continuation) {
        super(continuation);
        this.v = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f298321w |= Integer.MIN_VALUE;
        return this.v.emit(null, this);
    }
}

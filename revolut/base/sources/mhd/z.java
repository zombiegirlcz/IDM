package mhd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ f f205542w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f fVar, Continuation continuation) {
        super(continuation);
        this.f205542w = fVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f205542w.emit(null, this);
    }
}

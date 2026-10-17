package qe0;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f245032w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f245033x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f245034y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(continuation);
        this.f245032w = nVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f245032w.emit(null, this);
    }
}

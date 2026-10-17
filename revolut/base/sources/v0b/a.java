package v0b;

import kotlin.coroutines.Continuation;
import u97.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f284772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, Continuation continuation) {
        super(continuation);
        this.f284772w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f284772w.emit(null, this);
    }
}

package xfd;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ x4k.e f305237w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x4k.e eVar, Continuation continuation) {
        super(continuation);
        this.f305237w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f305237w.emit(null, this);
    }
}

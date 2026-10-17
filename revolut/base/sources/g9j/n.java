package g9j;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class n extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g9d.e f141928w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g9d.e eVar, Continuation continuation) {
        super(continuation);
        this.f141928w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f141928w.emit(null, this);
    }
}

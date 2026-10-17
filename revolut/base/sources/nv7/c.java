package nv7;

import kotlin.coroutines.Continuation;
import ntf.q;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f219541w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(q qVar, Continuation continuation) {
        super(continuation);
        this.f219541w = qVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f219541w.emit(null, this);
    }
}

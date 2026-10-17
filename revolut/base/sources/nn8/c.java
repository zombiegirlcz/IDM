package nn8;

import kotlin.coroutines.Continuation;
import njj.i;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f217481w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, Continuation continuation) {
        super(continuation);
        this.f217481w = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f217481w.emit(null, this);
    }
}

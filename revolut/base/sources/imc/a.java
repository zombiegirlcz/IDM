package imc;

import gim.c;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i8c.c f162345w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i8c.c cVar, Continuation continuation) {
        super(continuation);
        this.f162345w = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f162345w.emit(null, this);
    }
}

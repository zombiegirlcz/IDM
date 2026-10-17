package clb;

import c65.h;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f24968w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(h hVar, Continuation continuation) {
        super(continuation);
        this.f24968w = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f24968w.emit(null, this);
    }
}

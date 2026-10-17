package cia;

import ble.e1;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e1 f24433w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e1 e1Var, Continuation continuation) {
        super(continuation);
        this.f24433w = e1Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f24433w.emit(null, this);
    }
}

package zw5;

import kotlin.coroutines.Continuation;
import vch.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u0 f325743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(u0 u0Var, Continuation continuation) {
        super(continuation);
        this.f325743w = u0Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f325743w.emit(null, this);
    }
}

package kld;

import kkf.h9;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h9 f185424w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h9 h9Var, Continuation continuation) {
        super(continuation);
        this.f185424w = h9Var;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f185424w.emit(null, this);
    }
}

package wy5;

import gim.c;
import kotlin.coroutines.Continuation;
import wv2.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f301092w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, Continuation continuation) {
        super(continuation);
        this.f301092w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f301092w.emit(null, this);
    }
}

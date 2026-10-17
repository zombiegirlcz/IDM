package vga;

import kotlin.coroutines.Continuation;
import v6e.p;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f288811w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, Continuation continuation) {
        super(continuation);
        this.f288811w = pVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f288811w.emit(null, this);
    }
}

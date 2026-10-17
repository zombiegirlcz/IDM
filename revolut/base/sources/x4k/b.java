package x4k;

import kotlin.coroutines.Continuation;
import wv2.l;

/* JADX INFO: loaded from: classes11.dex */
public final class b extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f302881w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l lVar, Continuation continuation) {
        super(continuation);
        this.f302881w = lVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f302881w.emit(null, this);
    }
}

package i5b;

import i4b.y;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f158801w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(y yVar, Continuation continuation) {
        super(continuation);
        this.f158801w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158801w.emit(null, this);
    }
}

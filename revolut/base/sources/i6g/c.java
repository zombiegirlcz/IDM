package i6g;

import i4b.y;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ y f158994w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(y yVar, Continuation continuation) {
        super(continuation);
        this.f158994w = yVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f158994w.emit(null, this);
    }
}

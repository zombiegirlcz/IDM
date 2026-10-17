package g9d;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g27.d f141532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g27.d dVar, Continuation continuation) {
        super(continuation);
        this.f141532w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f141532w.emit(null, this);
    }
}

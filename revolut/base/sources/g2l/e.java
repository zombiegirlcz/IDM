package g2l;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g27.d f140137w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g27.d dVar, Continuation continuation) {
        super(continuation);
        this.f140137w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f140137w.emit(null, this);
    }
}

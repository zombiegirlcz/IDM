package ook;

import im9.k;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f227145w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, Continuation continuation) {
        super(continuation);
        this.f227145w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f227145w.emit(null, this);
    }
}

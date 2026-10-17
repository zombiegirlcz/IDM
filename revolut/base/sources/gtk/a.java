package gtk;

import god.k;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f146623w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(k kVar, Continuation continuation) {
        super(continuation);
        this.f146623w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f146623w.emit(null, this);
    }
}

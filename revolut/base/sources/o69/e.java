package o69;

import im9.k;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k f222526w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, Continuation continuation) {
        super(continuation);
        this.f222526w = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f222526w.emit(null, this);
    }
}

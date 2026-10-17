package eah;

import dwi.v;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f124251w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, Continuation continuation) {
        super(continuation);
        this.f124251w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f124251w.emit(null, this);
    }
}

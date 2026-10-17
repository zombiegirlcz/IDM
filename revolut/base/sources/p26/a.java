package p26;

import kotlin.coroutines.Continuation;
import nvk.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f232077w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v vVar, Continuation continuation) {
        super(continuation);
        this.f232077w = vVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f232077w.emit(null, this);
    }
}

package ag5;

import a9j.s;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends gim.c {
    public /* synthetic */ Object u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f4786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s sVar, Continuation continuation) {
        super(continuation);
        this.f4786w = sVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.v |= Integer.MIN_VALUE;
        return this.f4786w.emit(null, this);
    }
}

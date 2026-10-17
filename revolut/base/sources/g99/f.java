package g99;

import g0c.o;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.c {
    public /* synthetic */ Object u;
    public final /* synthetic */ o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f141514w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, Continuation continuation) {
        super(continuation);
        this.v = oVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.u = obj2;
        this.f141514w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}

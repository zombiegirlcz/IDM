package wl3;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.c {
    public List u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f298391w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ uvl.c f298392x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f298393y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uvl.c cVar, Continuation continuation) {
        super(continuation);
        this.f298392x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f298391w = obj2;
        this.f298393y |= Integer.MIN_VALUE;
        return this.f298392x.q(null, this);
    }
}

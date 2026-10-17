package u3c;

import d3c.c0;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.c {
    public c0 u;
    public long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f276911w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ sij.c f276912x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f276913y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(sij.c cVar, Continuation continuation) {
        super(continuation);
        this.f276912x = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f276911w = obj2;
        this.f276913y |= Integer.MIN_VALUE;
        return this.f276912x.a(null, this);
    }
}

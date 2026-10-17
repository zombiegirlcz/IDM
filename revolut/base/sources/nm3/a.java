package nm3;

import gim.c;
import jpc.e;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends c {
    public lm3.a u;
    public vm3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f217160w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f217161x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f217162y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, c cVar) {
        super(cVar);
        this.f217161x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f217160w = obj2;
        this.f217162y |= Integer.MIN_VALUE;
        return this.f217161x.W(null, this);
    }
}

package k09;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.c {
    public Function0 u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f179986w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179987x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, gim.c cVar) {
        super(cVar);
        this.f179986w = gVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f179987x |= Integer.MIN_VALUE;
        return this.f179986w.b3(null, this);
    }
}

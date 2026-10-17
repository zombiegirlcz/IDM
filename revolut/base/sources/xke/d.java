package xke;

import com.revolut.kompot.common.transition.ZoomTarget;

/* JADX INFO: loaded from: classes8.dex */
public final class d extends gim.c {
    public eel.c u;
    public ZoomTarget v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f306665w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f306666x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f306667y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f306666x = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f306665w = obj2;
        this.f306667y |= Integer.MIN_VALUE;
        return this.f306666x.b(null, null, this);
    }
}

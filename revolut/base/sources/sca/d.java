package sca;

import com.revolut.kompot.bridge.navigation.KompotDestination;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.c {
    public KompotDestination u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f261694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f261695x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, gim.c cVar) {
        super(cVar);
        this.f261694w = eVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f261695x |= Integer.MIN_VALUE;
        return this.f261694w.e(null, this);
    }
}

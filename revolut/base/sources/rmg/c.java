package rmg;

import com.revolut.feature.slot_manager.api.model.SlotContext;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.c {
    public SlotContext u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ kge.d f255314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f255315x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kge.d dVar, gim.c cVar) {
        super(cVar);
        this.f255314w = dVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f255315x |= Integer.MIN_VALUE;
        return this.f255314w.n(this);
    }
}

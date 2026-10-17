package rmg;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import jid.z;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends gim.c {
    public SlotContext u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f255318w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f255319x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(z zVar, gim.c cVar) {
        super(cVar);
        this.f255318w = zVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.v = obj2;
        this.f255319x |= Integer.MIN_VALUE;
        return this.f255318w.m(this);
    }
}

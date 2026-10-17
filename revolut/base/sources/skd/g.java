package skd;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import ekd.n0;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends gim.c {
    public SlotContext u;
    public n0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public akd.a f263829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f263830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f263831y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, gim.c cVar) {
        super(cVar);
        this.f263831y = iVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f263830x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f263831y.j(null, null, null, this);
    }
}

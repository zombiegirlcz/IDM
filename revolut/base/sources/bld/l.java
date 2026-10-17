package bld;

import com.revolut.feature.slot_manager.api.model.SlotContext;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends gim.c {
    public int A;
    public fkd.f u;
    public SlotContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f16542w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16543x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f16544y;
    public final /* synthetic */ m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, gim.c cVar) {
        super(cVar);
        this.z = mVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f16544y = obj2;
        this.A |= Integer.MIN_VALUE;
        return m.a(this.z, null, 0, null, this);
    }
}

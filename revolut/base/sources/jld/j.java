package jld;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import fkd.x;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.c {
    public int A;
    public x u;
    public SlotContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public yo6.e f175723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f175724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f175725y;
    public final /* synthetic */ k z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, gim.c cVar) {
        super(cVar);
        this.z = kVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f175725y = obj2;
        this.A |= Integer.MIN_VALUE;
        return k.a(this.z, null, null, null, this);
    }
}

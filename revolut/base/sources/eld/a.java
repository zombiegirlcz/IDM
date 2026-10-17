package eld;

import com.revolut.feature.slot_manager.api.model.SlotContext;
import gim.c;
import lkd.d;
import lkd.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {
    public SlotContext u;
    public j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d f127287w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f127288x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ twg.c f127289y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(twg.c cVar, c cVar2) {
        super(cVar2);
        this.f127289y = cVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f127288x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f127289y.Y(null, null, null, this);
    }
}

package pbk;

import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.plan_gifting.impl.ui.flows.receiver.PlanGiftingReceiverFlowContract$InputData;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agk.a f234722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanGiftingReceiverFlowContract$InputData f234723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f234724c;
    public final c d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234725g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234726h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f234727j;
    public final e4m.e k;

    public c(b bVar, agk.a aVar, PlanGiftingReceiverFlowContract$InputData planGiftingReceiverFlowContract$InputData) {
        this.f234724c = bVar;
        this.f234722a = aVar;
        this.f234723b = planGiftingReceiverFlowContract$InputData;
        int i = 8;
        this.e = e4m.b.b(new pa6.f(bVar, this, 2, i));
        this.f = e4m.b.b(new pa6.f(bVar, this, 3, i));
        this.f234725g = e4m.b.b(new pa6.f(bVar, this, 4, i));
        this.f234726h = e4m.b.b(new pa6.f(bVar, this, 1, i));
        this.i = e4m.b.b(new pa6.f(bVar, this, 5, i));
        this.f234727j = e4m.b.b(new pa6.f(bVar, this, 0, i));
        this.k = e4m.b.b(new pa6.f(bVar, this, 6, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.copyOf((Collection) this.f234727j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

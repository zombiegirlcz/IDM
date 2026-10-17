package iwb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.giftcards.impl.ui.flow.home.RevPointsGiftcardsHomePagerFlowContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements xki.c, wwb.b, cxb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsGiftcardsHomePagerFlowContract$InputData f169031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f169032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f169033c = this;
    public final e4m.e d;

    public h(e eVar, RevPointsGiftcardsHomePagerFlowContract$InputData revPointsGiftcardsHomePagerFlowContract$InputData) {
        this.f169032b = eVar;
        this.f169031a = revPointsGiftcardsHomePagerFlowContract$InputData;
        this.d = e4m.b.b(new hc2.r(eVar, this, 28));
    }

    @Override // wwb.b
    public final wwb.a b() {
        return new l(this.f169032b, this.f169033c);
    }

    @Override // cxb.a
    public final o c() {
        return new o(this.f169032b, this.f169033c);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}

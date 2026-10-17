package pbk;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.plan_gifting.impl.ui.screens.receiver.intro.PlanGiftingReceiverIntroScreenContract$InputData;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanGiftingReceiverIntroScreenContract$InputData f234728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f234729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f234730c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f234731g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f234732h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f234733j;

    public d(b bVar, c cVar, hck.a aVar, ViewController viewController, PlanGiftingReceiverIntroScreenContract$InputData planGiftingReceiverIntroScreenContract$InputData) {
        this.f234729b = bVar;
        this.f234728a = planGiftingReceiverIntroScreenContract$InputData;
        this.f234730c = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.d = e4m.b.b(new pa6.f(bVar, this, 2, i));
        this.e = e4m.b.b(new pa6.f(bVar, this, 1, i));
        this.f = e4m.b.b(new pa6.f(bVar, this, 0, i));
        this.f234731g = e4m.b.b(new pa6.f(bVar, this, 4, i));
        this.f234732h = e4m.b.b(new pa6.f(bVar, this, 3, i));
        this.i = e4m.b.b(new pa6.f(bVar, this, 6, i));
        this.f234733j = e4m.b.b(new pa6.f(bVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f234732h.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

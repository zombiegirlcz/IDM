package r7d;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation.SubscriptionCancellationScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class v implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubscriptionCancellationScreenContract$InputData.RecurrentPayment f252181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f252182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f252183c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f252184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f252185h;

    public v(l lVar, t tVar, BaseScreen baseScreen, SubscriptionCancellationScreenContract$InputData.RecurrentPayment recurrentPayment) {
        this.f252182b = lVar;
        this.f252181a = recurrentPayment;
        this.f252183c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 29;
        this.d = e4m.b.b(new ppd.j(lVar, tVar, this, 2, i));
        this.e = e4m.b.b(new ppd.j(lVar, tVar, this, 1, i));
        this.f = e4m.b.b(new ppd.j(lVar, tVar, this, 0, i));
        this.f252184g = e4m.b.b(new ppd.j(lVar, tVar, this, 4, i));
        this.f252185h = e4m.b.b(new ppd.j(lVar, tVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

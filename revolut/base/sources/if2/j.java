package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.upi.impl.flow.intent_payment.screen.review.UpiIntentPaymentReviewScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiIntentPaymentReviewScreenContract$InputData f160875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f160876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160877c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f160878g;

    public j(f fVar, i iVar, ViewController viewController, UpiIntentPaymentReviewScreenContract$InputData upiIntentPaymentReviewScreenContract$InputData) {
        this.f160876b = fVar;
        this.f160875a = upiIntentPaymentReviewScreenContract$InputData;
        this.f160877c = e4m.b.b(e4m.c.a(viewController));
        int i = 13;
        this.d = e4m.b.b(new i72.j(this, 2, i));
        this.e = e4m.b.b(new i72.j(this, 1, i));
        this.f = e4m.b.b(new i72.j(this, 0, i));
        this.f160878g = e4m.b.b(new i72.j(this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}

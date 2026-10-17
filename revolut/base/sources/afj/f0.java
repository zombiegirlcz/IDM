package afj;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer_confirmation.pac.number_transfer_confirmation.EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData f4236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f4238c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public f0(b bVar, e0 e0Var, ViewController viewController, EsimMobilePlanPacNumberTransferConfirmationScreenContract$InputData esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData) {
        this.f4237b = bVar;
        this.f4236a = esimMobilePlanPacNumberTransferConfirmationScreenContract$InputData;
        this.f4238c = e4m.b.b(new a1e.c(bVar, this, 1, 20));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.e = e4m.b.b(new a1e.c(bVar, this, 2, i));
        this.f = e4m.b.b(new a1e.c(bVar, this, 0, i));
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

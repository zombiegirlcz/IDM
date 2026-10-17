package me4;

import a82.r;
import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input.MoneyInputControllerContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes22.dex */
public final class p extends oki.h implements e {
    public final MoneyInputControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f204612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f204613q;

    public p(MoneyInputControllerContract$InputData inputData, w80.b amountFormatter, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f204612p = amountFormatter;
        this.f204613q = mra.d.b(this, new f(new dj0.d(0L, inputData.f68025b.e)), stateMapper, null, false, 12);
    }

    public final void I2(k event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j;
        l lVar = l.f204607a;
        if (z) {
            C2(lVar);
            return;
        }
        if (event instanceof g) {
            C2(lVar);
            return;
        }
        boolean z3 = event instanceof h;
        y yVar = this.f204613q;
        if (z3) {
            C2(new m(((f) ((j2) yVar.f22677a).getValue()).f204602a));
        } else {
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(yVar, new r(this.f204612p.b(((i) event).f204605a, this.o.f68025b.e.f306286a), 24));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f204613q;
    }
}

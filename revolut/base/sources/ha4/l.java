package ha4;

import cli.y;
import com.revolut.feature.credit.application.plugins.impl.ui.down_payment_source.details.DownPaymentSourceDetailsControllerContract$InputData;
import e4k.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends oki.h implements dli.b {
    public final DownPaymentSourceDetailsControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f150449p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f150450q;

    public l(DownPaymentSourceDetailsControllerContract$InputData inputData, w80.b amountFormatter, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f150449p = amountFormatter;
        oy3.a aVar = inputData.f67607a;
        List list = inputData.f67608b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new j(new dj0.d(0L, this.o.f67607a.d.f115083b), (String) it8.next()));
        }
        this.f150450q = mra.d.b(this, new d(aVar, arrayList), stateMapper, null, false, 12);
    }

    public final void I2(h event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof g) {
            B2();
            return;
        }
        boolean z = event instanceof f;
        y yVar = this.f150450q;
        if (!z) {
            if (!(event instanceof e)) {
                throw new NoWhenBranchMatchedException();
            }
            C2(new i(((d) ((j2) yVar.f22677a).getValue()).f150438b));
        } else {
            f fVar = (f) event;
            H2(yVar, new m0(fVar, this.f150449p.b(fVar.f150441b, this.o.f67607a.d.f115083b.f306286a), 5));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f150450q;
    }
}

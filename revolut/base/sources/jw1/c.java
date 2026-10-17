package jw1;

import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlowContract$State;
import com.revolut.feature.apm.breb.impl.ui.qr_request.BrebQrRequestFlowContract$Step;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreenContract$InputData;
import com.revolut.kompot.common.ModalDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kw1.e;
import oki.h;
import ow1.j;
import ow1.k;
import ow1.m;
import vkm.j2;
import yki.l;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178920a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f178921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.breb.impl.ui.qr_request.a f178922c;

    public /* synthetic */ c(com.revolut.feature.apm.breb.impl.ui.qr_request.a aVar, l lVar) {
        this.f178922c = aVar;
        this.f178921b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object value;
        Object value2;
        switch (this.f178920a) {
            case 0:
                m output = (m) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof j;
                com.revolut.feature.apm.breb.impl.ui.qr_request.a aVar = this.f178922c;
                l lVar = this.f178921b;
                if (z) {
                    h.t2(aVar, lVar, BrebQrRequestFlowContract$Step.Amount.f61753a, true, null, false, 12);
                } else if (output instanceof ow1.l) {
                    j2 j2Var = aVar.f61757q;
                    do {
                        value = j2Var.getValue();
                    } while (!j2Var.h(value, new BrebQrRequestScreenContract$InputData(((BrebQrRequestFlowContract$State) ((j2) aVar.f61756p.f22677a).getValue()).f61751a, null)));
                } else {
                    if (!(output instanceof k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.w2(lVar, BrebQrRequestFlowContract$Step.KeySelection.f61754a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            default:
                e result = (e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                this.f178921b.e(true);
                com.revolut.feature.apm.breb.impl.ui.qr_request.a aVar2 = this.f178922c;
                j2 j2Var2 = aVar2.f61757q;
                do {
                    value2 = j2Var2.getValue();
                } while (!j2Var2.h(value2, new BrebQrRequestScreenContract$InputData(((BrebQrRequestFlowContract$State) ((j2) aVar2.f61756p.f22677a).getValue()).f61751a, result.f190202a)));
                return Unit.f186387a;
        }
    }

    public /* synthetic */ c(l lVar, com.revolut.feature.apm.breb.impl.ui.qr_request.a aVar) {
        this.f178921b = lVar;
        this.f178922c = aVar;
    }
}

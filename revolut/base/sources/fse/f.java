package fse;

import android.net.Uri;
import cli.y;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import com.revolut.feature.three_ds_verification.impl.ui.merchant_redirect.screen.MerchantRedirectDialogControllerContract$InputData;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements b {
    public final y o;

    public f(g stateMapper, MerchantRedirectDialogControllerContract$InputData inputData, r10.a urlInteractor) throws Throwable {
        Object objA;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(urlInteractor, "urlInteractor");
        ThreeDSTransaction threeDSTransaction = inputData.f90404a;
        Uri uriG = ((f80.b) ((f80.a) urlInteractor.f250812b)).g(threeDSTransaction.f60543p);
        boolean zBooleanValue = false;
        if (uriG != null) {
            try {
                try {
                    m.Companion companion = m.INSTANCE;
                    try {
                        objA = Boolean.valueOf(((n80.d) urlInteractor.f250811a).a(null, uriG, f0.f322471a));
                    } catch (CancellationException e) {
                        throw e;
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            Boolean bool = (Boolean) (objA instanceof n ? null : objA);
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        this.o = mra.d.b(this, new c(threeDSTransaction, zBooleanValue), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.o;
    }
}

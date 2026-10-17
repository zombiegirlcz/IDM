package tz1;

import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.api.product.ApmProductComplete;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sy1.g f275731a;

    public b(sy1.g apmPendingPaymentsInteractor) {
        Intrinsics.checkNotNullParameter(apmPendingPaymentsInteractor, "apmPendingPaymentsInteractor");
        this.f275731a = apmPendingPaymentsInteractor;
    }

    public final Object a(ApmProduct apmProduct, gim.c cVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.INFO, "APM-PUSH", "Checking Pending Payments: " + apmProduct, null, null, 16);
        return apmProduct instanceof ApmProductComplete ? this.f275731a.b((ApmProductComplete) apmProduct, cVar) : Boolean.FALSE;
    }
}

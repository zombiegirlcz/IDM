package bh9;

import cli.y;
import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends oki.h implements f {

    @NotNull
    public static final r Companion = new r();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jg9.g f15284p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wo1.b f15285q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf9.a f15286r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ep1.b f15287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final wj0.a f15288t;
    public final gte.a u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f15289w;

    public t(a3e.u stateMapper, b inputData, jg9.g formExtension, wo1.b billsInteractor, sf9.a controllerDialogProvider, ep1.b billsDialogProvider, wj0.a idempotencyKeyHolder, gte.a featureToggleInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(formExtension, "formExtension");
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(controllerDialogProvider, "controllerDialogProvider");
        Intrinsics.checkNotNullParameter(billsDialogProvider, "billsDialogProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f15284p = formExtension;
        this.f15285q = billsInteractor;
        this.f15286r = controllerDialogProvider;
        this.f15287s = billsDialogProvider;
        this.f15288t = idempotencyKeyHolder;
        this.u = featureToggleInteractor;
        this.v = userInteractor;
        this.f15289w = mra.d.b(this, new a(inputData.f15270b, i.LOADING, null, null, f0.f322471a, r0.g()), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f15288t.a("BILL_TAPI_IDEMPOTENCY_KEY");
        ax9.d dVar = new ax9.d(1, this, t.class, "handleFieldsFetchError", "handleFieldsFetchError(Ljava/lang/Throwable;)Z", 0, 18);
        Continuation continuation = null;
        l2(new s(this, continuation, 0), dVar);
        l2(new s(this, continuation, 1), new yi5.b(26));
    }

    public final h I2(BillFormField billFormField) {
        h hVar = (h) ((a) ((j2) this.f15289w.f22677a).getValue()).f.get(billFormField.f61274a);
        if (hVar != null) {
            if (hVar.f15277a.length() <= 0) {
                hVar = null;
            }
            if (hVar != null) {
                return hVar;
            }
        }
        String str = billFormField.i;
        if (str == null) {
            str = "";
        }
        return new h(str, null);
    }

    public final void J2() {
        l2(new s(this, null, 2), new ax9.d(1, this, t.class, "handleConfirmationError", "handleConfirmationError(Ljava/lang/Throwable;)Z", 0, 19));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f15289w;
    }
}

package n8k;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$Details$ByMoneyRequest;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.payments.core.R$string;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferData;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer.PaymentLinksTransferResultDialogFactory$SuccessPayload;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m0;
import nii.m1;
import nii.n1;
import nii.u1;
import nii.y0;
import y7k.w;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends n implements f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f213507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p7k.b f213508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final cpf.c f213509n;

    public g(e dialogFactory, p7k.b paymentLinkNavigationProvider, cpf.c transferResultHandlerExtension) {
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        Intrinsics.checkNotNullParameter(paymentLinkNavigationProvider, "paymentLinkNavigationProvider");
        Intrinsics.checkNotNullParameter(transferResultHandlerExtension, "transferResultHandlerExtension");
        this.f213507l = dialogFactory;
        this.f213508m = paymentLinkNavigationProvider;
        this.f213509n = transferResultHandlerExtension;
    }

    public final m0 Z2(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "error");
        e eVar = this.f213507l;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = eVar.f213506b.a(throwable);
        y0 y0VarA = serverErrorA != null ? eVar.f213505a.a(serverErrorA.f51362a) : null;
        if (y0VarA != null) {
            return y0VarA.f216244b;
        }
        return null;
    }

    public final j0 b3(k creationResult, PaymentLinksTransferData transferData) {
        Intrinsics.checkNotNullParameter(creationResult, "creationResult");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        if (creationResult instanceof i) {
            return null;
        }
        if (!(creationResult instanceof h) && !(creationResult instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        dj0.d dVar = transferData.f102239j;
        PaymentLinksTransferResultDialogFactory$SuccessPayload payload = new PaymentLinksTransferResultDialogFactory$SuccessPayload(dVar, transferData.f);
        this.f213507l.getClass();
        Intrinsics.checkNotNullParameter(payload, "payload");
        j0 configuration = new j0((Clause) new TextLocalisedClause(R$string.payments_payment_link_success_message, u.c(new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) payload, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4086);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return configuration;
    }

    public final void c3(n1 n1Var, k creationResult, Function1 screenResultCallback) {
        FeatureCommand featureCommandA;
        Intrinsics.checkNotNullParameter(creationResult, "creationResult");
        Intrinsics.checkNotNullParameter(screenResultCallback, "screenResultCallback");
        boolean z = creationResult instanceof i;
        if (z) {
            i iVar = (i) creationResult;
            screenResultCallback.invoke(new w(iVar.f213511a, iVar.f213512b));
            return;
        }
        boolean z3 = creationResult instanceof h;
        if (!z3 && !(creationResult instanceof j)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!(n1Var instanceof l1) && !(n1Var instanceof k1)) {
            if (n1Var != null && !(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalStateException illegalStateException = new IllegalStateException(com.revolut.data.database.models.openbanking.d.s("Dialog Result has unexpected type: ", n1Var));
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return;
        }
        if (z3) {
            featureCommandA = new FeatureCommand(new MoneyRequestFeatureConfig$Details$ByMoneyRequest(((h) creationResult).f213510a, null));
        } else {
            if (!(creationResult instanceof j)) {
                if (!z) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Should be handled with screen result");
            }
            featureCommandA = this.f213508m.a(((j) creationResult).f213513a.f60547a);
        }
        A2(new BridgeDestination(com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), featureCommandA)));
    }
}

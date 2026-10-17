package sx8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import pfm.z;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements ym.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3l.a f266373a;

    public e(g3l.a statusDialogViewConfigurationDispatcher) {
        Intrinsics.checkNotNullParameter(statusDialogViewConfigurationDispatcher, "statusDialogViewConfigurationDispatcher");
        this.f266373a = statusDialogViewConfigurationDispatcher;
    }

    @Override // ym.c
    public final d0 g3(ym.b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        if (!(loadingData.f314823a instanceof f)) {
            ufm.b bVarM = d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        if (!loadingData.f314824b) {
            ufm.b bVarM2 = d0.m(Boolean.TRUE);
            Intrinsics.checkNotNullExpressionValue(bVarM2, "just(...)");
            return bVarM2;
        }
        z zVarD = this.f266373a.c0(new StatusViewConfiguration.LoadingIndefinite(764, new TextLocalisedClause(R$string.kyc_poa_upload_in_progress, null, null, 14), "status_dialog_loading_id")).D(Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }
}

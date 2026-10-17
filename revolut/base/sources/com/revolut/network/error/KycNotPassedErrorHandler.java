package com.revolut.network.error;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ks8.l;
import mt8.a;
import org.jetbrains.annotations.NotNull;
import sri.m;
import v60.e;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revolut/network/error/KycNotPassedErrorHandler;", "Lcom/revolut/network/error/AbstractErrorHandler;", "Lsri/m;", "navigator", "Lks8/l;", "kycPromptNaviCommandFactory", "Lv60/e;", "serverErrorsProvider", "Lmt8/a;", "kycFeatureToggleProvider", "<init>", "(Lsri/m;Lks8/l;Lv60/e;Lmt8/a;)V", "Lcom/revolut/core/error/data/model/ServerError;", "serverError", "", "isApplicable", "(Lcom/revolut/core/error/data/model/ServerError;)Z", "", "apply", "(Lcom/revolut/core/error/data/model/ServerError;)V", "Lks8/l;", "Lv60/e;", "Lmt8/a;", "app_retail_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycNotPassedErrorHandler extends AbstractErrorHandler {

    @NotNull
    private final a kycFeatureToggleProvider;

    @NotNull
    private final l kycPromptNaviCommandFactory;

    @NotNull
    private final e serverErrorsProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycNotPassedErrorHandler(m mVar, @NotNull l kycPromptNaviCommandFactory, @NotNull e serverErrorsProvider, @NotNull a kycFeatureToggleProvider) {
        super(mVar);
        Intrinsics.checkNotNullParameter(kycPromptNaviCommandFactory, "kycPromptNaviCommandFactory");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        this.kycPromptNaviCommandFactory = kycPromptNaviCommandFactory;
        this.serverErrorsProvider = serverErrorsProvider;
        this.kycFeatureToggleProvider = kycFeatureToggleProvider;
    }

    @Override // com.revolut.network.error.AbstractErrorHandler
    public void apply(@NotNull ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        String strA = ((ao0.a) this.serverErrorsProvider).a(serverError.getF51362a(), v60.a.SERVER).a();
        m navigator = getNavigator();
        if (navigator != null) {
            l lVar = this.kycPromptNaviCommandFactory;
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(strA, (List) null, (Clause) null, false, 30);
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.identity_action_verify, null, null, 14);
            CompositeCommand compositeCommandC = com.revolut.retail.core.navigation.a.c(new FinishCommand(null, null, null, 7), new FeatureCommand(new KycFeatureConfig.InitKyc(null, ((pt8.a) this.kycFeatureToggleProvider).a(), 15)));
            k9 k9Var = k9.KYC;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            navigator.c(((com.revolut.feature.kyc.impl.e) lVar).a(textLocalisedClause, null, "3D003", textLocalisedClause2, null, compositeCommandC, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var)));
        }
    }

    @Override // com.revolut.network.error.AbstractErrorHandler
    public boolean isApplicable(@NotNull ServerError serverError) {
        Intrinsics.checkNotNullParameter(serverError, "serverError");
        return serverError.getF51362a() == 9999;
    }
}

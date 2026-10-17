package com.revolut.feature.onboarding.impl.onboarding.kyc;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.kyc.api.KycContract$Requirement;
import com.revolut.feature.kyc.api.model.KycFinalCommand;
import com.revolut.feature.kyc.api.navigation.KycFeatureConfig;
import com.revolut.feature.onboarding.impl.onboarding.kyc.KycWrapperScreenContract$InputData;
import com.revolut.retail.core.navigation.DummyCommand;
import grl.k9;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import my8.r;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yt8.e;
import zh9.u0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h {

    @NotNull
    public static final gb9.a Companion = new gb9.a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final List f78456p = v.k(9003, 9009);
    public final KycWrapperScreenContract$InputData o;

    public b(KycWrapperScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
    }

    public static KycFeatureConfig.StartKyc I2(int i, wi0.b bVar, String str, Set set, boolean z, r rVar, KycContract$Requirement kycContract$Requirement, e eVar) {
        KycFinalCommand.Success success = new KycFinalCommand.Success(DummyCommand.f98635a);
        k9 value = frl.a.k;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        Intrinsics.checkNotNullParameter(value, "value");
        return new KycFeatureConfig.StartKyc(success, bVar, z, Integer.valueOf(i), kycContract$Requirement, false, new AnalyticsProduct.Retail(value), rVar, gt8.a.UPLOADING_DONE, str, eVar, null, null, true, set, 24608);
    }

    @Override // yji.l
    public final void I1() {
        if (this.f226127l) {
            return;
        }
        KycWrapperScreenContract$InputData kycWrapperScreenContract$InputData = this.o;
        if (kycWrapperScreenContract$InputData instanceof KycWrapperScreenContract$InputData.DocumentKyc) {
            KycWrapperScreenContract$InputData.DocumentKyc documentKyc = (KycWrapperScreenContract$InputData.DocumentKyc) kycWrapperScreenContract$InputData;
            C1(u0.c(I2(9003, documentKyc.f78450a, documentKyc.f78452c, documentKyc.e, true, r.DEFAULT, documentKyc.f78451b, documentKyc.d)));
            return;
        }
        if (!(kycWrapperScreenContract$InputData instanceof KycWrapperScreenContract$InputData.DocumentId)) {
            throw new NoWhenBranchMatchedException();
        }
        KycWrapperScreenContract$InputData.DocumentId documentId = (KycWrapperScreenContract$InputData.DocumentId) kycWrapperScreenContract$InputData;
        C1(u0.c(I2(9009, documentId.f78448a, null, h0.f322473a, false, r.DOCUMENT_ID, documentId.f78449b, null)));
    }
}

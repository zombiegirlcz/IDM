package com.revolut.feature.onboarding.impl.onboarding.kyc;

import android.content.Intent;
import android.os.Bundle;
import com.revolut.feature.onboarding.impl.onboarding.kyc.a;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/feature/onboarding/impl/onboarding/kyc/KycWrapperScreen;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lcom/revolut/feature/onboarding/impl/onboarding/kyc/a;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class KycWrapperScreen extends SimpleViewController<a> {
    public final int N;
    public final b O;

    public KycWrapperScreen(KycWrapperScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = R$layout.screen_transparent;
        this.O = new b(inputData);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return this.O;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        Bundle extras;
        Set<String> setKeySet;
        b bVar = this.O;
        bVar.getClass();
        if (b.f78456p.contains(Integer.valueOf(i))) {
            bVar.C2(i2 == -1 ? (intent == null || (extras = intent.getExtras()) == null || (setKeySet = extras.keySet()) == null || !setKeySet.contains("KYC_FLOW_SKIP")) ? a.b.f78454a : a.c.f78455a : a.C0516a.f78453a);
        }
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }
}

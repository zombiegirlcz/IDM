package com.revolut.feature.onboarding.impl.revolut_card_ready;

import android.os.Bundle;
import android.os.Parcelable;
import com.bumptech.glide.c;
import com.google.android.gms.internal.mlkit_vision_face.a;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity;
import com.revolut.feature.blue_prompt.fullscreen.BluePromptContract$Configuration;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import sc9.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/onboarding/impl/revolut_card_ready/RevolutCardReadyActivity;", "Lcom/revolut/feature/blue_prompt/fullscreen/BluePromptActivity;", "", "Lno/m;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutCardReadyActivity extends BluePromptActivity {
    @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity, nri.b, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getO() {
        AnalyticsProduct e = ((BluePromptContract$Configuration) G0()).getE();
        if (e != null) {
            return e;
        }
        k9 k9Var = k9.Cards;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return a.h(k9Var, "value", k9Var);
    }

    @Override // com.revolut.feature.blue_prompt.fullscreen.BluePromptActivity
    public final ns2.a Z0(Bundle bundle, BluePromptContract$Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        b bVar = ((b) c.l(this).b(null, getF85962s0())).e;
        Parcelable f64311b = configuration.getF64311b();
        Intrinsics.i(f64311b, "null cannot be cast to non-null type com.revolut.feature.onboarding.impl.revolut_card_ready.RevolutCardReadyContract.Configuration");
        return new sc9.a(bVar, e.g(this, bundle, null), (RevolutCardReadyContract$Configuration) f64311b);
    }
}

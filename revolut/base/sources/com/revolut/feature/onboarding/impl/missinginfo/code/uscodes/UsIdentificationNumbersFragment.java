package com.revolut.feature.onboarding.impl.missinginfo.code.uscodes;

import android.os.Bundle;
import ca9.c;
import ca9.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.api.missinginfo.code.uscodes.UsIdentificationNumbersContract$Configuration;
import com.revolut.feature.onboarding.impl.missinginfo.inputfield.MissingFieldFragment;
import jb3.l;
import kotlin.Metadata;
import y99.g0;
import y99.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/missinginfo/code/uscodes/UsIdentificationNumbersFragment;", "Lcom/revolut/feature/onboarding/impl/missinginfo/inputfield/MissingFieldFragment;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UsIdentificationNumbersFragment extends MissingFieldFragment {
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        UsIdentificationNumbersContract$Configuration usIdentificationNumbersContract$Configuration = (UsIdentificationNumbersContract$Configuration) B();
        if (usIdentificationNumbersContract$Configuration != null) {
            return usIdentificationNumbersContract$Configuration.f78181c;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        UsIdentificationNumbersContract$Configuration usIdentificationNumbersContract$Configuration = (UsIdentificationNumbersContract$Configuration) A();
        g0 g0Var = (g0) ((i) ((c) ((e) l.q(this))).f22543b.f22564j.get());
        g0Var.f311781l.getValue(g0Var, g0.f311775p[10]).set(Boolean.valueOf(usIdentificationNumbersContract$Configuration.f78179a));
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        return (ba9.c) ((c) ((e) l.q(this))).B.get();
    }
}

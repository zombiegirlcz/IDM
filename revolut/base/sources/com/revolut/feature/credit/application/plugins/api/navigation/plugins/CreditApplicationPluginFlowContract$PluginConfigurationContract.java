package com.revolut.feature.credit.application.plugins.api.navigation.plugins;

import android.os.Parcelable;
import ft3.h1;
import ft3.j1;
import grl.r2;
import kotlin.Metadata;
import kp0.w0;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/api/navigation/plugins/CreditApplicationPluginFlowContract$PluginConfigurationContract", "Landroid/os/Parcelable;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditApplicationPluginFlowContract$PluginConfigurationContract extends Parcelable {
    /* JADX INFO: renamed from: O0 */
    CreditApplicationPluginFlowContract$Configuration getF68133a();

    default r2 P9() {
        return getF68133a().f66893c;
    }

    default j1 R2() {
        return getF68133a().d;
    }

    default h1 a9() {
        return w0.F(getF68133a());
    }

    default String k8() {
        return getF68133a().f66892b;
    }
}

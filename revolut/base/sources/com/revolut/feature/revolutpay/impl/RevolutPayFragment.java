package com.revolut.feature.revolutpay.impl;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlow;
import com.revolut.feature.revolutpay.impl.external.ui.flow.root.RevolutPayRootFlowContract$InputData;
import com.revolut.kompot.entry_point.fragment.KompotFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vji.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/RevolutPayFragment;", "Lcom/revolut/kompot/entry_point/fragment/KompotFragment;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RevolutPayFragment extends KompotFragment {
    @Override // com.revolut.kompot.entry_point.fragment.KompotFragment
    public final b z() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Intent intent = fragmentActivityRequireActivity.getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        ComponentName callingActivity = fragmentActivityRequireActivity.getCallingActivity();
        return new b(new RevolutPayRootFlow(new RevolutPayRootFlowContract$InputData(intent, callingActivity != null ? callingActivity.getPackageName() : null, fragmentActivityRequireActivity.getCallingPackage(), Build.VERSION.SDK_INT >= 35 ? fragmentActivityRequireActivity.getLaunchedFromPackage() : null)), null, false, 30);
    }
}

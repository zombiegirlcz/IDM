package com.onfido.android.sdk.capture.core.config;

import androidx.core.os.BundleKt;
import com.onfido.android.sdk.capture.core.config.Flow;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import com.onfido.android.sdk.capture.ui.BaseFragment;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/onfido/android/sdk/capture/core/config/FlowFragment;", "Lcom/onfido/android/sdk/capture/ui/BaseFragment;", "()V", "layoutRes", "", "(I)V", "finishFlow", "", "result", "Lcom/onfido/android/sdk/capture/core/config/Flow$Result;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class FlowFragment extends BaseFragment {

    @NotNull
    public static final String REQUEST_KEY = "request";

    public FlowFragment() {
    }

    public final void finishFlow(@NotNull Flow.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        getParentFragmentManager().setFragmentResult("request", BundleKt.bundleOf(new Pair("request", result)));
    }

    public FlowFragment(int i) {
        super(i);
    }
}

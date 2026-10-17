package com.onfido.android.sdk.capture.core;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import cmc.d;
import com.onfido.android.sdk.FlowConfig;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.core.config.Flow;
import com.onfido.android.sdk.capture.core.config.OnfidoNewConfig;
import com.onfido.android.sdk.capture.core.di.OnfidoComponent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.d0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0001H\u0002J\u001a\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/core/OnfidoFragment;", "Landroidx/fragment/app/Fragment;", "()V", "currentFlow", "Lcom/onfido/android/sdk/capture/core/config/Flow;", "currentFlowIndex", "", "onfidoComponent", "Lcom/onfido/android/sdk/capture/core/di/OnfidoComponent;", "getOnfidoComponent", "()Lcom/onfido/android/sdk/capture/core/di/OnfidoComponent;", "onfidoComponent$delegate", "Lkotlin/Lazy;", "results", "", "Lcom/onfido/android/sdk/capture/core/config/Flow$Result;", "viewModel", "Lcom/onfido/android/sdk/capture/core/OnfidoViewModel;", "getViewModel", "()Lcom/onfido/android/sdk/capture/core/OnfidoViewModel;", "setViewModel", "(Lcom/onfido/android/sdk/capture/core/OnfidoViewModel;)V", "getNextFlow", "navigateTo", "", "fragment", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class OnfidoFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private Flow currentFlow;
    private int currentFlowIndex;

    /* JADX INFO: renamed from: onfidoComponent$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy onfidoComponent;

    @NotNull
    private final List<Flow.Result> results;
    public OnfidoViewModel viewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/onfido/android/sdk/capture/core/OnfidoFragment$Companion;", "", "()V", "newInstance", "Lcom/onfido/android/sdk/capture/core/OnfidoFragment;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final OnfidoFragment newInstance() {
            return new OnfidoFragment();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public OnfidoFragment() {
        super(R.layout.onfido_fragment);
        this.currentFlowIndex = -1;
        this.results = new ArrayList();
        this.onfidoComponent = j.b(new OnfidoFragment$onfidoComponent$2(this));
    }

    private final Flow getNextFlow() {
        FlowConfig flowConfig = getViewModel().getFlowConfig();
        Intrinsics.i(flowConfig, "null cannot be cast to non-null type com.onfido.android.sdk.capture.core.config.OnfidoNewConfig");
        List<Flow> flows = ((OnfidoNewConfig) flowConfig).getFlows();
        int i = this.currentFlowIndex + 1;
        this.currentFlowIndex = i;
        Flow flow = (Flow) d0.e0(i, flows);
        this.currentFlow = flow;
        return flow;
    }

    private final OnfidoComponent getOnfidoComponent() {
        return (OnfidoComponent) this.onfidoComponent.getValue();
    }

    private final void navigateTo(Fragment fragment) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.replace(R.id.container, fragment);
        fragmentTransactionBeginTransaction.commit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$0(OnfidoFragment this$0, String str, Bundle result) {
        List<Flow> followUpFlows;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(str, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(result, "result");
        Flow.Result result2 = (Flow.Result) result.getParcelable("request");
        if (result2 != null) {
            this$0.results.add(result2);
        }
        Flow flow = this$0.currentFlow;
        Flow flow2 = (flow == null || (followUpFlows = flow.getFollowUpFlows()) == null) ? null : (Flow) d0.d0(followUpFlows);
        if (flow2 != null) {
            this$0.currentFlow = null;
            this$0.navigateTo(flow2.createFragment(result2));
            return;
        }
        Flow nextFlow = this$0.getNextFlow();
        if (nextFlow != null) {
            this$0.navigateTo(Flow.createFragment$default(nextFlow, null, 1, null));
            return;
        }
        Intent intentPutExtra = new Intent().putExtra("result", new OnfidoResult(this$0.results, true));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        this$0.requireActivity().setResult(-1, intentPutExtra);
        this$0.requireActivity().finish();
    }

    @NotNull
    public final OnfidoViewModel getViewModel() {
        OnfidoViewModel onfidoViewModel = this.viewModel;
        if (onfidoViewModel != null) {
            return onfidoViewModel;
        }
        Intrinsics.r("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        getOnfidoComponent().inject$onfido_capture_sdk_core_release(this);
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            Flow nextFlow = getNextFlow();
            getChildFragmentManager().setFragmentResultListener("request", this, new d(this, 16));
            if (nextFlow != null) {
                navigateTo(Flow.createFragment$default(nextFlow, null, 1, null));
            }
        }
    }

    public final void setViewModel(@NotNull OnfidoViewModel onfidoViewModel) {
        Intrinsics.checkNotNullParameter(onfidoViewModel, "<set-?>");
        this.viewModel = onfidoViewModel;
    }
}

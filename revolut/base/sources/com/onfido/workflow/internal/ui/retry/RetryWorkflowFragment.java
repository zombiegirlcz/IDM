package com.onfido.workflow.internal.ui.retry;

import abm.f;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.R;
import com.onfido.android.sdk.capture.databinding.OnfidoWorkflowRetryFragmentBinding;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowViewDescriptor;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.c9;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/onfido/workflow/internal/ui/retry/RetryWorkflowFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "ql/a", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RetryWorkflowFragment extends Fragment {

    @NotNull
    public static final ql.a Companion = new ql.a();

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Lazy f50202a0;

    public RetryWorkflowFragment() {
        super(R.layout.onfido_workflow_retry_fragment);
        this.f50202a0 = j.b(new f(this, 5));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        OnfidoWorkflowRetryFragmentBinding onfidoWorkflowRetryFragmentBindingBind = OnfidoWorkflowRetryFragmentBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(onfidoWorkflowRetryFragmentBindingBind, "bind(...)");
        RetryWorkflowViewDescriptor.Texts texts = z().f50204b;
        if (texts == null || (string = texts.f50208a) == null) {
            string = getString(z().f50203a.f50205a);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        RetryWorkflowViewDescriptor.Texts texts2 = z().f50204b;
        if (texts2 == null || (string2 = texts2.f50209b) == null) {
            string2 = getString(z().f50203a.f50206b);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        RetryWorkflowViewDescriptor.Texts texts3 = z().f50204b;
        if (texts3 == null || (string3 = texts3.f50210c) == null) {
            string3 = getString(z().f50203a.f50207c);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        }
        onfidoWorkflowRetryFragmentBindingBind.title.setText(string);
        onfidoWorkflowRetryFragmentBindingBind.description.setText(string2);
        onfidoWorkflowRetryFragmentBindingBind.retryButton.setText(string3);
        onfidoWorkflowRetryFragmentBindingBind.retryButton.setOnClickListener(new c9(this, 10));
    }

    public final RetryWorkflowViewDescriptor z() {
        return (RetryWorkflowViewDescriptor) this.f50202a0.getValue();
    }
}

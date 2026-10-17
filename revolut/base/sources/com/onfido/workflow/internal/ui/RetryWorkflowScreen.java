package com.onfido.workflow.internal.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.onfido.android.sdk.capture.internal.navigation.Screen;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowFragment;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowViewDescriptor;
import kl.b;
import kl.k;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/onfido/workflow/internal/ui/RetryWorkflowScreen;", "Lcom/onfido/android/sdk/capture/internal/navigation/Screen;", "Companion", "kl/k", "onfido-workflow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class RetryWorkflowScreen implements Screen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RetryWorkflowViewDescriptor f50198a;

    @NotNull
    public static final k Companion = new k();

    @NotNull
    public static final Parcelable.Creator<RetryWorkflowScreen> CREATOR = new b(9);

    public RetryWorkflowScreen(RetryWorkflowViewDescriptor retryWorkflowViewDescriptor) {
        Intrinsics.checkNotNullParameter(retryWorkflowViewDescriptor, "retryWorkflowViewDescriptor");
        this.f50198a = retryWorkflowViewDescriptor;
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final Fragment createFragment() {
        RetryWorkflowFragment.Companion.getClass();
        Intrinsics.checkNotNullParameter("request_key_retry_workflow", "requestKey");
        RetryWorkflowViewDescriptor workflowRetryViewDescriptor = this.f50198a;
        Intrinsics.checkNotNullParameter(workflowRetryViewDescriptor, "workflowRetryViewDescriptor");
        RetryWorkflowFragment retryWorkflowFragment = new RetryWorkflowFragment();
        retryWorkflowFragment.setArguments(BundleKt.bundleOf(new Pair("key_descriptor", workflowRetryViewDescriptor), new Pair("retry_workflow_request_key", "request_key_retry_workflow")));
        return retryWorkflowFragment;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RetryWorkflowScreen) && Intrinsics.f(this.f50198a, ((RetryWorkflowScreen) obj2).f50198a);
    }

    public final int hashCode() {
        return this.f50198a.hashCode();
    }

    @Override // com.onfido.android.sdk.capture.internal.navigation.Screen
    public final String screenKey() {
        return Screen.DefaultImpls.screenKey(this);
    }

    public final String toString() {
        return "RetryWorkflowScreen(retryWorkflowViewDescriptor=" + this.f50198a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        this.f50198a.writeToParcel(out, i);
    }
}

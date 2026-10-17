package b0;

import androidx.camera.core.RetryPolicy;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class j implements RetryPolicy {
    @Override // androidx.camera.core.RetryPolicy
    public final RetryPolicy.RetryConfig onRetryDecisionRequested(RetryPolicy.ExecutionState executionState) {
        return RetryPolicy.lambda$static$0(executionState);
    }
}

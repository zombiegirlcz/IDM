package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.RetryPolicy;
import androidx.camera.core.impl.CameraValidator;

/* JADX INFO: loaded from: classes15.dex */
public final class CameraProviderExecutionState implements RetryPolicy.ExecutionState {
    private final int mAttemptCount;
    private final Throwable mCause;
    private final int mStatus;
    private final long mTaskExecutedTimeInMillis;

    public CameraProviderExecutionState(long j2, int i, Throwable th10) {
        this.mTaskExecutedTimeInMillis = SystemClock.elapsedRealtime() - j2;
        this.mAttemptCount = i;
        if (th10 instanceof CameraValidator.CameraIdListIncorrectException) {
            this.mStatus = 2;
            this.mCause = th10;
            return;
        }
        if (!(th10 instanceof InitializationException)) {
            this.mStatus = 0;
            this.mCause = th10;
            return;
        }
        Throwable cause = th10.getCause();
        th10 = cause != null ? cause : th10;
        this.mCause = th10;
        if (th10 instanceof CameraUnavailableException) {
            this.mStatus = 2;
        } else if (th10 instanceof IllegalArgumentException) {
            this.mStatus = 1;
        } else {
            this.mStatus = 0;
        }
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public Throwable getCause() {
        return this.mCause;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public long getExecutedTimeInMillis() {
        return this.mTaskExecutedTimeInMillis;
    }

    @Override // androidx.camera.core.RetryPolicy.ExecutionState
    public int getStatus() {
        return this.mStatus;
    }
}

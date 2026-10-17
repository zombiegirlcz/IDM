package androidx.camera.video;

import androidx.camera.core.impl.utils.CloseGuardHelper;
import androidx.core.util.Preconditions;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes15.dex */
public final class Recording implements AutoCloseable {
    private final CloseGuardHelper mCloseGuard;
    private final AtomicBoolean mIsClosed;
    private final boolean mIsPersistent;
    private final OutputOptions mOutputOptions;
    private final Recorder mRecorder;
    private final long mRecordingId;

    public Recording(Recorder recorder, long j2, OutputOptions outputOptions, boolean z, boolean z3) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.mIsClosed = atomicBoolean;
        CloseGuardHelper closeGuardHelperCreate = CloseGuardHelper.create();
        this.mCloseGuard = closeGuardHelperCreate;
        this.mRecorder = recorder;
        this.mRecordingId = j2;
        this.mOutputOptions = outputOptions;
        this.mIsPersistent = z;
        if (z3) {
            atomicBoolean.set(true);
        } else {
            closeGuardHelperCreate.open("stop");
        }
    }

    public static Recording createFinalizedFrom(PendingRecording pendingRecording, long j2) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j2, pendingRecording.getOutputOptions(), pendingRecording.getIsPersistent(), true);
    }

    public static Recording from(PendingRecording pendingRecording, long j2) {
        Preconditions.checkNotNull(pendingRecording, "The given PendingRecording cannot be null.");
        return new Recording(pendingRecording.getRecorder(), j2, pendingRecording.getOutputOptions(), pendingRecording.getIsPersistent(), false);
    }

    private void stopWithError(int i, Throwable th10) throws Throwable {
        this.mCloseGuard.close();
        if (this.mIsClosed.getAndSet(true)) {
            return;
        }
        this.mRecorder.stop(this, i, th10);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Throwable {
        stopWithError(0, null);
    }

    public void finalize() throws Throwable {
        try {
            this.mCloseGuard.warnIfOpen();
            stopWithError(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    public OutputOptions getOutputOptions() {
        return this.mOutputOptions;
    }

    public long getRecordingId() {
        return this.mRecordingId;
    }

    public void pause() {
        if (this.mIsClosed.get()) {
            throw new IllegalStateException("The recording has been stopped.");
        }
        this.mRecorder.pause(this);
    }

    public void stop() throws Throwable {
        close();
    }
}

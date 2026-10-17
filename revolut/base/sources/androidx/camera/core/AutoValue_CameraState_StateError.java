package androidx.camera.core;

import androidx.camera.core.CameraState;

/* JADX INFO: loaded from: classes15.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {
    private final Throwable cause;
    private final int code;

    public AutoValue_CameraState_StateError(int i, Throwable th10) {
        this.code = i;
        this.cause = th10;
    }

    public boolean equals(Object obj2) {
        Throwable th10;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof CameraState.StateError) {
            CameraState.StateError stateError = (CameraState.StateError) obj2;
            if (this.code == stateError.getCode() && ((th10 = this.cause) != null ? th10.equals(stateError.getCause()) : stateError.getCause() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public Throwable getCause() {
        return this.cause;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public int getCode() {
        return this.code;
    }

    public int hashCode() {
        int i = (this.code ^ 1000003) * 1000003;
        Throwable th10 = this.cause;
        return i ^ (th10 == null ? 0 : th10.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.code + ", cause=" + this.cause + "}";
    }
}

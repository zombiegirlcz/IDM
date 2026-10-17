package androidx.camera.core;

/* JADX INFO: loaded from: classes15.dex */
public abstract class CameraState {

    public enum ErrorType {
        RECOVERABLE,
        CRITICAL
    }

    public static abstract class StateError {
        public static StateError create(int i) {
            return create(i, null);
        }

        public abstract Throwable getCause();

        public abstract int getCode();

        public ErrorType getType() {
            int code = getCode();
            return (code == 2 || code == 1 || code == 3) ? ErrorType.RECOVERABLE : ErrorType.CRITICAL;
        }

        public static StateError create(int i, Throwable th10) {
            return new AutoValue_CameraState_StateError(i, th10);
        }
    }

    public enum Type {
        PENDING_OPEN,
        OPENING,
        OPEN,
        CLOSING,
        CLOSED
    }

    public static CameraState create(Type type, StateError stateError) {
        return new AutoValue_CameraState(type, stateError);
    }

    public abstract StateError getError();

    public abstract Type getType();
}

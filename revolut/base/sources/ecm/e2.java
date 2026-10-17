package ecm;

import com.google.common.base.Charsets;

/* JADX INFO: loaded from: classes13.dex */
public enum e2 {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);

    private final int value;
    private final byte[] valueAscii;

    e2(int i) {
        this.value = i;
        this.valueAscii = Integer.toString(i).getBytes(Charsets.US_ASCII);
    }

    public static byte[] a(e2 e2Var) {
        return e2Var.valueAscii;
    }

    public final g2 b() {
        return (g2) g2.d.get(this.value);
    }

    public final int c() {
        return this.value;
    }
}

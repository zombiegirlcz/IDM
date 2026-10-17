package xf;

import com.google.protobuf.a1;
import com.google.protobuf.b1;

/* JADX INFO: loaded from: classes17.dex */
public enum e0 implements a1 {
    NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
    GENERIC_CLIENT_ERROR(1);

    public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
    public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
    private static final b1 internalValueMap = new b0(1);
    private final int value;

    e0(int i) {
        this.value = i;
    }

    public static e0 a(int i) {
        if (i == 0) {
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GENERIC_CLIENT_ERROR;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        return this.value;
    }
}

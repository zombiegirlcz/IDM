package xf;

import com.google.protobuf.a1;
import com.google.protobuf.b1;

/* JADX INFO: loaded from: classes17.dex */
public enum x0 implements a1 {
    SOURCE_UNKNOWN(0),
    FL_LEGACY_V1(1);

    public static final int FL_LEGACY_V1_VALUE = 1;
    public static final int SOURCE_UNKNOWN_VALUE = 0;
    private static final b1 internalValueMap = new b0(2);
    private final int value;

    x0(int i) {
        this.value = i;
    }

    public static x0 a(int i) {
        if (i == 0) {
            return SOURCE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return FL_LEGACY_V1;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        return this.value;
    }
}

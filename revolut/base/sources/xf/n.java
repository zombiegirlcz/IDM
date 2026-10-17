package xf;

import com.google.protobuf.a1;
import com.google.protobuf.b1;

/* JADX INFO: loaded from: classes.dex */
public enum n implements a1 {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final b1 internalValueMap = new l(0);
    private final int value;

    n(int i) {
        this.value = i;
    }

    public static n a(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        return this.value;
    }
}

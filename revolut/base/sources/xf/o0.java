package xf;

import com.google.protobuf.a1;
import com.google.protobuf.b1;

/* JADX INFO: loaded from: classes.dex */
public enum o0 implements a1 {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final b1 internalValueMap = new l(2);
    private final int value;

    o0(int i) {
        this.value = i;
    }

    public static o0 a(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    @Override // com.google.protobuf.a1
    public final int getNumber() {
        return this.value;
    }
}

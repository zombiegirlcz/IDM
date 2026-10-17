package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum LayoutProto$DimensionType implements Internal.EnumLite {
    UNKNOWN_DIMENSION_TYPE(0),
    EXACT(1),
    WRAP(2),
    FILL(3),
    EXPAND(4),
    UNRECOGNIZED(-1);

    public static final int EXACT_VALUE = 1;
    public static final int EXPAND_VALUE = 4;
    public static final int FILL_VALUE = 3;
    public static final int UNKNOWN_DIMENSION_TYPE_VALUE = 0;
    public static final int WRAP_VALUE = 2;
    private static final Internal.EnumLiteMap<LayoutProto$DimensionType> internalValueMap = new Internal.EnumLiteMap<LayoutProto$DimensionType>() { // from class: androidx.glance.appwidget.proto.LayoutProto$DimensionType.1
    };
    private final int value;

    LayoutProto$DimensionType(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

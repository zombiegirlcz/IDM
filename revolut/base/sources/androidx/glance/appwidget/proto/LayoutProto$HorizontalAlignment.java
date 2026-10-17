package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum LayoutProto$HorizontalAlignment implements Internal.EnumLite {
    UNSPECIFIED_HORIZONTAL_ALIGNMENT(0),
    START(1),
    CENTER_HORIZONTALLY(2),
    END(3),
    UNRECOGNIZED(-1);

    public static final int CENTER_HORIZONTALLY_VALUE = 2;
    public static final int END_VALUE = 3;
    public static final int START_VALUE = 1;
    public static final int UNSPECIFIED_HORIZONTAL_ALIGNMENT_VALUE = 0;
    private static final Internal.EnumLiteMap<LayoutProto$HorizontalAlignment> internalValueMap = new Internal.EnumLiteMap<LayoutProto$HorizontalAlignment>() { // from class: androidx.glance.appwidget.proto.LayoutProto$HorizontalAlignment.1
    };
    private final int value;

    LayoutProto$HorizontalAlignment(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

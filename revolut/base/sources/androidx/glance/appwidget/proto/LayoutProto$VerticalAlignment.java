package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum LayoutProto$VerticalAlignment implements Internal.EnumLite {
    UNSPECIFIED_VERTICAL_ALIGNMENT(0),
    TOP(1),
    CENTER_VERTICALLY(2),
    BOTTOM(3),
    UNRECOGNIZED(-1);

    public static final int BOTTOM_VALUE = 3;
    public static final int CENTER_VERTICALLY_VALUE = 2;
    public static final int TOP_VALUE = 1;
    public static final int UNSPECIFIED_VERTICAL_ALIGNMENT_VALUE = 0;
    private static final Internal.EnumLiteMap<LayoutProto$VerticalAlignment> internalValueMap = new Internal.EnumLiteMap<LayoutProto$VerticalAlignment>() { // from class: androidx.glance.appwidget.proto.LayoutProto$VerticalAlignment.1
    };
    private final int value;

    LayoutProto$VerticalAlignment(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

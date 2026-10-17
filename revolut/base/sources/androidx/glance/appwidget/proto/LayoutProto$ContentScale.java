package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum LayoutProto$ContentScale implements Internal.EnumLite {
    UNSPECIFIED_CONTENT_SCALE(0),
    FIT(1),
    CROP(2),
    FILL_BOUNDS(3),
    UNRECOGNIZED(-1);

    public static final int CROP_VALUE = 2;
    public static final int FILL_BOUNDS_VALUE = 3;
    public static final int FIT_VALUE = 1;
    public static final int UNSPECIFIED_CONTENT_SCALE_VALUE = 0;
    private static final Internal.EnumLiteMap<LayoutProto$ContentScale> internalValueMap = new Internal.EnumLiteMap<LayoutProto$ContentScale>() { // from class: androidx.glance.appwidget.proto.LayoutProto$ContentScale.1
    };
    private final int value;

    LayoutProto$ContentScale(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

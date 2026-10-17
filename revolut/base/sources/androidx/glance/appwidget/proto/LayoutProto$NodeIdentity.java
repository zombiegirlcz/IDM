package androidx.glance.appwidget.proto;

import androidx.glance.appwidget.protobuf.Internal;

/* JADX INFO: loaded from: classes15.dex */
public enum LayoutProto$NodeIdentity implements Internal.EnumLite {
    DEFAULT_IDENTITY(0),
    BACKGROUND_NODE(1),
    UNRECOGNIZED(-1);

    public static final int BACKGROUND_NODE_VALUE = 1;
    public static final int DEFAULT_IDENTITY_VALUE = 0;
    private static final Internal.EnumLiteMap<LayoutProto$NodeIdentity> internalValueMap = new Internal.EnumLiteMap<LayoutProto$NodeIdentity>() { // from class: androidx.glance.appwidget.proto.LayoutProto$NodeIdentity.1
    };
    private final int value;

    LayoutProto$NodeIdentity(int i) {
        this.value = i;
    }

    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

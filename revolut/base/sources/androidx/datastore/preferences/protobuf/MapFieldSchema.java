package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
interface MapFieldSchema {
    Map<?, ?> forMapData(Object obj2);

    MapEntryLite.Metadata<?, ?> forMapMetadata(Object obj2);

    Map<?, ?> forMutableMapData(Object obj2);

    int getSerializedSize(int i, Object obj2, Object obj3);

    boolean isImmutable(Object obj2);

    Object mergeFrom(Object obj2, Object obj3);

    Object newMapField(Object obj2);

    Object toImmutable(Object obj2);
}

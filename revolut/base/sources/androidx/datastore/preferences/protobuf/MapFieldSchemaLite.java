package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.MapEntryLite;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class MapFieldSchemaLite implements MapFieldSchema {
    private static <K, V> int getSerializedSizeLite(int i, Object obj2, Object obj3) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        MapEntryLite mapEntryLite = (MapEntryLite) obj3;
        int iComputeMessageSize = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry<K, V> entry : mapFieldLite.entrySet()) {
            iComputeMessageSize += mapEntryLite.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    private static <K, V> MapFieldLite<K, V> mergeFromLite(Object obj2, Object obj3) {
        MapFieldLite<K, V> mapFieldLiteMutableCopy = (MapFieldLite) obj2;
        MapFieldLite<K, V> mapFieldLite = (MapFieldLite) obj3;
        if (!mapFieldLite.isEmpty()) {
            if (!mapFieldLiteMutableCopy.isMutable()) {
                mapFieldLiteMutableCopy = mapFieldLiteMutableCopy.mutableCopy();
            }
            mapFieldLiteMutableCopy.mergeFrom(mapFieldLite);
        }
        return mapFieldLiteMutableCopy;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Map<?, ?> forMapData(Object obj2) {
        return (MapFieldLite) obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public MapEntryLite.Metadata<?, ?> forMapMetadata(Object obj2) {
        return ((MapEntryLite) obj2).getMetadata();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Map<?, ?> forMutableMapData(Object obj2) {
        return (MapFieldLite) obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public int getSerializedSize(int i, Object obj2, Object obj3) {
        return getSerializedSizeLite(i, obj2, obj3);
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public boolean isImmutable(Object obj2) {
        return !((MapFieldLite) obj2).isMutable();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Object mergeFrom(Object obj2, Object obj3) {
        return mergeFromLite(obj2, obj3);
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Object newMapField(Object obj2) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.MapFieldSchema
    public Object toImmutable(Object obj2) {
        ((MapFieldLite) obj2).makeImmutable();
        return obj2;
    }
}

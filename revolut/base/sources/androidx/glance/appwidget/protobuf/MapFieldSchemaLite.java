package androidx.glance.appwidget.protobuf;

import a10.b;
import androidx.glance.appwidget.protobuf.MapEntryLite;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
class MapFieldSchemaLite implements MapFieldSchema {
    private static <K, V> int getSerializedSizeLite(int i, Object obj2, Object obj3) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj2;
        if (obj3 != null) {
            throw new ClassCastException();
        }
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        Iterator<Map.Entry<K, V>> it8 = mapFieldLite.entrySet().iterator();
        if (!it8.hasNext()) {
            return 0;
        }
        Map.Entry<K, V> next = it8.next();
        next.getKey();
        next.getValue();
        throw null;
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

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public Map<?, ?> forMapData(Object obj2) {
        return (MapFieldLite) obj2;
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public MapEntryLite.Metadata<?, ?> forMapMetadata(Object obj2) {
        throw b.m(obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public Map<?, ?> forMutableMapData(Object obj2) {
        return (MapFieldLite) obj2;
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public int getSerializedSize(int i, Object obj2, Object obj3) {
        return getSerializedSizeLite(i, obj2, obj3);
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public boolean isImmutable(Object obj2) {
        return !((MapFieldLite) obj2).isMutable();
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public Object mergeFrom(Object obj2, Object obj3) {
        return mergeFromLite(obj2, obj3);
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public Object newMapField(Object obj2) {
        return MapFieldLite.emptyMapField().mutableCopy();
    }

    @Override // androidx.glance.appwidget.protobuf.MapFieldSchema
    public Object toImmutable(Object obj2) {
        ((MapFieldLite) obj2).makeImmutable();
        return obj2;
    }
}

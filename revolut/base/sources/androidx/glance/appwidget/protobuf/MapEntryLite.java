package androidx.glance.appwidget.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes15.dex */
public abstract class MapEntryLite<K, V> {

    public static class Metadata<K, V> {
    }

    public static <K, V> int computeSerializedSize(Metadata<K, V> metadata, K k, V v) {
        throw null;
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, Metadata<K, V> metadata, K k, V v) throws IOException {
        throw null;
    }
}

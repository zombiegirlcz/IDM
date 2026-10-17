package androidx.glance.appwidget.protobuf;

import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
abstract class ExtensionSchema<T> {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i);

    public abstract FieldSet<T> getExtensions(Object obj2);

    public abstract FieldSet<T> getMutableExtensions(Object obj2);

    public abstract boolean hasExtensions(MessageLite messageLite);

    public abstract void makeImmutable(Object obj2);

    public abstract <UT, UB> UB parseExtension(Object obj2, Reader reader, Object obj3, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet, UB ub4, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    public abstract void parseMessageSetItem(ByteString byteString, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<T> fieldSet) throws IOException;

    public abstract void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException;
}

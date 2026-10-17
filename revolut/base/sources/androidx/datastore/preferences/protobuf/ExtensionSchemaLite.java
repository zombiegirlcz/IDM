package androidx.datastore.preferences.protobuf;

import a0.d;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ExtensionSchemaLite extends ExtensionSchema<Object> {
    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public int extensionNumber(Map.Entry<?, ?> entry) {
        d.B(entry.getKey());
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
        return null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public FieldSet<Object> getExtensions(Object obj2) {
        d.B(obj2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public FieldSet<Object> getMutableExtensions(Object obj2) {
        d.B(obj2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public boolean hasExtensions(MessageLite messageLite) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public void makeImmutable(Object obj2) {
        getExtensions(obj2).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public <UT, UB> UB parseExtension(Object obj2, Reader reader, Object obj3, ExtensionRegistryLite extensionRegistryLite, FieldSet<Object> fieldSet, UB ub4, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
        d.B(obj3);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public void parseLengthPrefixedMessageSetItem(Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<Object> fieldSet) throws IOException {
        d.B(obj2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public void parseMessageSetItem(ByteString byteString, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<Object> fieldSet) throws IOException {
        d.B(obj2);
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.ExtensionSchema
    public void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        d.B(entry.getKey());
        throw null;
    }
}

package androidx.glance.appwidget.protobuf;

import a10.b;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
final class ExtensionSchemaLite extends ExtensionSchema<Object> {
    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public int extensionNumber(Map.Entry<?, ?> entry) {
        entry.getKey().getClass();
        throw new ClassCastException();
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
        return null;
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public FieldSet<Object> getExtensions(Object obj2) {
        throw b.m(obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public FieldSet<Object> getMutableExtensions(Object obj2) {
        throw b.m(obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public boolean hasExtensions(MessageLite messageLite) {
        return false;
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public void makeImmutable(Object obj2) {
        getExtensions(obj2).makeImmutable();
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public <UT, UB> UB parseExtension(Object obj2, Reader reader, Object obj3, ExtensionRegistryLite extensionRegistryLite, FieldSet<Object> fieldSet, UB ub4, UnknownFieldSchema<UT, UB> unknownFieldSchema) throws IOException {
        throw b.m(obj3);
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public void parseLengthPrefixedMessageSetItem(Reader reader, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<Object> fieldSet) throws IOException {
        throw b.m(obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public void parseMessageSetItem(ByteString byteString, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet<Object> fieldSet) throws IOException {
        throw b.m(obj2);
    }

    @Override // androidx.glance.appwidget.protobuf.ExtensionSchema
    public void serializeExtension(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        entry.getKey().getClass();
        throw new ClassCastException();
    }
}

package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public Object newInstance(Object obj2) {
        return ((GeneratedMessageLite) obj2).newMutableInstance();
    }
}

package androidx.glance.appwidget.protobuf;

/* JADX INFO: loaded from: classes15.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // androidx.glance.appwidget.protobuf.NewInstanceSchema
    public Object newInstance(Object obj2) {
        return ((GeneratedMessageLite) obj2).newMutableInstance();
    }
}

package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
interface Schema<T> {
    boolean equals(T t2, T t3);

    int getSerializedSize(T t2);

    int hashCode(T t2);

    boolean isInitialized(T t2);

    void makeImmutable(T t2);

    void mergeFrom(T t2, Reader reader, ExtensionRegistryLite extensionRegistryLite) throws IOException;

    void mergeFrom(T t2, T t3);

    T newInstance();

    void writeTo(T t2, Writer writer) throws IOException;
}

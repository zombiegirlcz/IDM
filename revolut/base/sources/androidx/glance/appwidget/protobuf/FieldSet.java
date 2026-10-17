package androidx.glance.appwidget.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
abstract class FieldSet<T> {
    public abstract Iterator<Map.Entry<T, Object>> descendingIterator();

    public abstract boolean equals(Object obj2);

    public abstract int getMessageSetSerializedSize();

    public abstract int getSerializedSize();

    public abstract int hashCode();

    public abstract boolean isEmpty();

    public abstract boolean isInitialized();

    public abstract Iterator<Map.Entry<T, Object>> iterator();

    public abstract void makeImmutable();

    public abstract void mergeFrom(FieldSet<T> fieldSet);
}

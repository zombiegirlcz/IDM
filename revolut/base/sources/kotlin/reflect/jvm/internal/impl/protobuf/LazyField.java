package kotlin.reflect.jvm.internal.impl.protobuf;

/* JADX INFO: loaded from: classes13.dex */
public class LazyField extends LazyFieldLite {
    public boolean equals(Object obj2) {
        return getValue().equals(obj2);
    }

    public MessageLite getValue() {
        return getValue(null);
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return getValue().toString();
    }
}

package vjm;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map.Entry f289826a;

    public b(Map.Entry entry) {
        this.f289826a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f289826a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.f289826a.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj2) {
        if (obj2 instanceof MessageLite) {
            return ((LazyField) this.f289826a.getValue()).setValue((MessageLite) obj2);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

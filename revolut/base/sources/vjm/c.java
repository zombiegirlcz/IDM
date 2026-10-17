package vjm;

import java.util.Iterator;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyField;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f289827a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f289827a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f289827a.next();
        return entry.getValue() instanceof LazyField ? new b(entry) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f289827a.remove();
    }
}

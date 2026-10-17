package aim;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a extends zhm.j {
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj2) {
        if (!(obj2 instanceof Map.Entry)) {
            return false;
        }
        Map.Entry element = (Map.Entry) obj2;
        Intrinsics.checkNotNullParameter(element, "element");
        return containsEntry(element);
    }

    public abstract boolean containsEntry(Map.Entry entry);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj2) {
        if (obj2 instanceof Map.Entry) {
            return remove((Map.Entry) obj2);
        }
        return false;
    }

    public /* bridge */ boolean remove(Map.Entry entry) {
        return super.remove((Object) entry);
    }
}

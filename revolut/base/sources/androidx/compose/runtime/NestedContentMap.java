package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.ObjectList;
import androidx.compose.runtime.collection.MultiValueMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\u000b2\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/NestedContentMap;", "", "<init>", "()V", "", "clear", "Landroidx/compose/runtime/MovableContent;", "key", "Landroidx/compose/runtime/NestedMovableContent;", "removeLast", "(Landroidx/compose/runtime/MovableContent;)Landroidx/compose/runtime/NestedMovableContent;", "", "contains", "(Landroidx/compose/runtime/MovableContent;)Z", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "usedContainer", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "Landroidx/compose/runtime/collection/MultiValueMap;", "contentMap", "Landroidx/collection/MutableScatterMap;", "containerMap", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class NestedContentMap {

    @NotNull
    private final MutableScatterMap<Object, Object> contentMap = MultiValueMap.m1677constructorimpl$default(null, 1, null);

    @NotNull
    private final MutableScatterMap<Object, Object> containerMap = MultiValueMap.m1677constructorimpl$default(null, 1, null);

    public final void clear() {
        MultiValueMap.m1675clearimpl(this.contentMap);
        MultiValueMap.m1675clearimpl(this.containerMap);
    }

    public final boolean contains(@NotNull MovableContent<Object> key) {
        return MultiValueMap.m1678containsimpl(this.contentMap, key);
    }

    public final NestedMovableContent removeLast(@NotNull MovableContent<Object> key) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m1684removeLastimpl(this.contentMap, key);
        if (MultiValueMap.m1681isEmptyimpl(this.contentMap)) {
            MultiValueMap.m1675clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void usedContainer(@NotNull MovableContentStateReference reference) {
        Object obj2 = this.containerMap.get(reference);
        if (obj2 != null) {
            if (!(obj2 instanceof MutableObjectList)) {
                throw new ClassCastException();
            }
            ObjectList objectList = (ObjectList) obj2;
            Object[] objArr = objectList.content;
            if (objectList._size <= 0) {
                return;
            }
            Intrinsics.i(objArr[0], "null cannot be cast to non-null type V of androidx.compose.runtime.collection.MultiValueMap");
            throw new ClassCastException();
        }
    }
}

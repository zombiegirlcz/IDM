package kotlin.reflect.jvm.internal.impl.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayMap f187857a;

    public AttributeArrayOwner() {
        EmptyArrayMap arrayMap = EmptyArrayMap.INSTANCE;
        Intrinsics.i(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.f187857a = arrayMap;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final ArrayMap a() {
        return this.f187857a;
    }

    public final String c(ArrayMap arrayMap, int i, String str) {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Race condition happened, the size of ArrayMap is " + i + " but it isn't an `" + str + '`');
        sb6.append('\n');
        StringBuilder sb9 = new StringBuilder("Type: ");
        sb9.append(arrayMap.getClass());
        sb6.append(sb9.toString());
        sb6.append('\n');
        StringBuilder sb10 = new StringBuilder();
        Map<String, Integer> mapAllValuesThreadUnsafeForRendering = b().allValuesThreadUnsafeForRendering();
        sb10.append("[\n");
        ArrayList arrayList = new ArrayList(w.t(arrayMap, 10));
        int i2 = 0;
        for (T t2 : arrayMap) {
            int i3 = i2 + 1;
            T t3 = null;
            if (i2 < 0) {
                v.s();
                throw null;
            }
            Iterator<T> it8 = mapAllValuesThreadUnsafeForRendering.entrySet().iterator();
            while (true) {
                if (it8.hasNext()) {
                    T next = it8.next();
                    if (((Number) ((Map.Entry) next).getValue()).intValue() == i2) {
                        t3 = next;
                        break;
                    }
                }
            }
            sb10.append("  " + ((Map.Entry) t3) + '[' + i2 + "]: " + t2);
            sb10.append('\n');
            arrayList.add(sb10);
            i2 = i3;
        }
        sb6.append("Content: " + j6.a.u(sb10, "]", '\n'));
        sb6.append('\n');
        return sb6.toString();
    }
}

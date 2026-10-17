package sk0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import tk0.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    private a() {
    }

    public static b a(g key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return new b(key.getId(), value);
    }

    public static boolean b(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if ((value instanceof Double) || (value instanceof String) || (value instanceof Boolean)) {
            return true;
        }
        boolean z = value instanceof List;
        if (z) {
            if (((List) value).isEmpty()) {
                return true;
            }
            Iterable iterable = (Iterable) value;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return true;
            }
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                if (!(it8.next() instanceof Double)) {
                }
            }
            return true;
        }
        if (z) {
            if (((List) value).isEmpty()) {
                return true;
            }
            Iterable iterable2 = (Iterable) value;
            if ((iterable2 instanceof Collection) && ((Collection) iterable2).isEmpty()) {
                return true;
            }
            Iterator it9 = iterable2.iterator();
            while (it9.hasNext()) {
                if (!(it9.next() instanceof String)) {
                }
            }
            return true;
        }
        if (z) {
            if (((List) value).isEmpty()) {
                return true;
            }
            Iterable iterable3 = (Iterable) value;
            if ((iterable3 instanceof Collection) && ((Collection) iterable3).isEmpty()) {
                return true;
            }
            Iterator it10 = iterable3.iterator();
            while (it10.hasNext()) {
                if (!(it10.next() instanceof Boolean)) {
                }
            }
            return true;
        }
        if (!(value instanceof Map)) {
            return false;
        }
        Map map = (Map) value;
        if (map.isEmpty() || map.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!(entry.getKey() instanceof String) || !(entry.getValue() instanceof String)) {
                return false;
            }
        }
        return true;
    }
}

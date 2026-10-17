package izl;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f169893a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f169894b = new LinkedHashMap();

    public final Object a(Object obj2) {
        LinkedHashMap linkedHashMap = this.f169893a;
        Object obj3 = linkedHashMap.get(obj2);
        if (obj3 == null) {
            return null;
        }
        if (Intrinsics.f(linkedHashMap.get(obj2), obj2)) {
            return obj2;
        }
        Object objA = a(obj3);
        if (objA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        linkedHashMap.put(obj2, objA);
        return linkedHashMap.get(obj2);
    }

    public final void b(Object obj2, Object obj3) {
        Object objA;
        Object objA2 = a(obj2);
        if (objA2 == null || (objA = a(obj3)) == null || objA2.equals(objA)) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f169894b;
        Integer num = (Integer) linkedHashMap.get(objA2);
        if (num == null) {
            throw new IllegalStateException("Size A unknown");
        }
        int iIntValue = num.intValue();
        Integer num2 = (Integer) linkedHashMap.get(objA);
        if (num2 == null) {
            throw new IllegalStateException("Size B unknown");
        }
        int iIntValue2 = num2.intValue();
        int i = iIntValue + iIntValue2;
        LinkedHashMap linkedHashMap2 = this.f169893a;
        if (iIntValue > iIntValue2) {
            linkedHashMap.remove(objA);
            linkedHashMap2.put(objA, objA2);
            linkedHashMap.put(objA2, Integer.valueOf(i));
        } else {
            linkedHashMap.remove(objA2);
            linkedHashMap2.put(objA2, objA);
            linkedHashMap.put(objA, Integer.valueOf(i));
        }
    }
}

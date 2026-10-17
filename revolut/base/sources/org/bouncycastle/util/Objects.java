package org.bouncycastle.util;

/* JADX INFO: loaded from: classes14.dex */
public class Objects {
    public static boolean areEqual(Object obj2, Object obj3) {
        if (obj2 != obj3) {
            return (obj2 == null || obj3 == null || !obj2.equals(obj3)) ? false : true;
        }
        return true;
    }

    public static int hashCode(Object obj2) {
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }
}

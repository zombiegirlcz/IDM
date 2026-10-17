package a1m;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a {
    public static final Object a(a aVar, Object obj2, String str, Object... objArr) {
        aVar.getClass();
        Class<?> cls = obj2.getClass();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return cls.getMethod(str, null).invoke(obj2, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    public static final Object b(a aVar, String str, String str2, Class[] clsArr, Object... objArr) throws ClassNotFoundException {
        aVar.getClass();
        Class<?> classObject = Class.forName(str);
        Intrinsics.checkNotNullExpressionValue(classObject, "classObject");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        return classObject.getMethod(str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(null, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}

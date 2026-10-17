package gim;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import r10.r;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {
    public static final StackTraceElement a(a continuation) {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        d dVar = (d) continuation.getClass().getAnnotation(d.class);
        String str = null;
        if (dVar == null || dVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = continuation.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(continuation);
            Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? dVar.l()[iIntValue] : -1;
        f.f144228a.getClass();
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        r rVar = f.f144230c;
        r rVar2 = f.f144229b;
        if (rVar == null) {
            try {
                r rVar3 = new r(Class.class.getDeclaredMethod("getModule", null), continuation.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), continuation.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f144230c = rVar3;
                rVar = rVar3;
            } catch (Exception unused2) {
                f.f144230c = rVar2;
                rVar = rVar2;
            }
        }
        if (rVar != rVar2 && (method = (Method) rVar.f250851a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = (Method) rVar.f250852b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) rVar.f250853c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = dVar.c();
        } else {
            strC = str + '/' + dVar.c();
        }
        return new StackTraceElement(strC, dVar.m(), dVar.f(), i);
    }
}

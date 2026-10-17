package yim;

import ajm.i;
import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import wim.k;
import zim.o2;
import zim.u;
import zim.u1;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean a(u1 u1Var) {
        Intrinsics.checkNotNullParameter(u1Var, "<this>");
        if (u1Var instanceof k) {
            Field fieldA = b.a(u1Var);
            if (!(fieldA != null ? fieldA.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(u1Var, "<this>");
            Method methodB = b.b(u1Var.getGetter());
            if (!(methodB != null ? methodB.isAccessible() : true)) {
                return false;
            }
            k kVar = (k) u1Var;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            Method methodB2 = b.b(kVar.getSetter());
            if (!(methodB2 != null ? methodB2.isAccessible() : true)) {
                return false;
            }
        } else {
            Field fieldA2 = b.a(u1Var);
            if (!(fieldA2 != null ? fieldA2.isAccessible() : true)) {
                return false;
            }
            Intrinsics.checkNotNullParameter(u1Var, "<this>");
            Method methodB3 = b.b(u1Var.getGetter());
            if (!(methodB3 != null ? methodB3.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }

    public static final void b(KCallable kCallable) {
        i iVarC;
        i iVarG;
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        if (kCallable instanceof k) {
            KProperty kProperty = (KProperty) kCallable;
            Field fieldA = b.a(kProperty);
            if (fieldA != null) {
                fieldA.setAccessible(true);
            }
            Intrinsics.checkNotNullParameter(kProperty, "<this>");
            Method methodB = b.b(kProperty.getGetter());
            if (methodB != null) {
                methodB.setAccessible(true);
            }
            k kVar = (k) kCallable;
            Intrinsics.checkNotNullParameter(kVar, "<this>");
            Method methodB2 = b.b(kVar.getSetter());
            if (methodB2 != null) {
                methodB2.setAccessible(true);
                return;
            }
            return;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field fieldA2 = b.a(kProperty2);
            if (fieldA2 != null) {
                fieldA2.setAccessible(true);
            }
            Intrinsics.checkNotNullParameter(kProperty2, "<this>");
            Method methodB3 = b.b(kProperty2.getGetter());
            if (methodB3 != null) {
                methodB3.setAccessible(true);
                return;
            }
            return;
        }
        if (kCallable instanceof KProperty.Getter) {
            Field fieldA3 = b.a(((KProperty.Getter) kCallable).a());
            if (fieldA3 != null) {
                fieldA3.setAccessible(true);
            }
            Method methodB4 = b.b((KFunction) kCallable);
            if (methodB4 != null) {
                methodB4.setAccessible(true);
                return;
            }
            return;
        }
        if (kCallable instanceof wim.d) {
            Field fieldA4 = b.a(((wim.d) kCallable).a());
            if (fieldA4 != null) {
                fieldA4.setAccessible(true);
            }
            Method methodB5 = b.b((KFunction) kCallable);
            if (methodB5 != null) {
                methodB5.setAccessible(true);
                return;
            }
            return;
        }
        if (!(kCallable instanceof KFunction)) {
            throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
        KFunction kFunction = (KFunction) kCallable;
        Method methodB6 = b.b(kFunction);
        if (methodB6 != null) {
            methodB6.setAccessible(true);
        }
        u uVarA = o2.a(kCallable);
        Object objB = (uVarA == null || (iVarG = uVarA.g()) == null) ? null : iVarG.b();
        AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Intrinsics.checkNotNullParameter(kFunction, "<this>");
        u uVarA2 = o2.a(kFunction);
        Member memberB = (uVarA2 == null || (iVarC = uVarA2.c()) == null) ? null : iVarC.b();
        Constructor constructor = memberB instanceof Constructor ? (Constructor) memberB : null;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
    }
}

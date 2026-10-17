package yim;

import ajm.i;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import wim.z;
import zim.o2;
import zim.u;
import zim.u1;

/* JADX INFO: loaded from: classes14.dex */
public abstract class b {
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlin.Lazy] */
    public static final Field a(KProperty kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "<this>");
        u1 u1VarC = o2.c(kProperty);
        if (u1VarC != null) {
            return (Field) u1VarC.f322710l.getValue();
        }
        return null;
    }

    public static final Method b(KFunction kFunction) {
        i iVarC;
        Intrinsics.checkNotNullParameter(kFunction, "<this>");
        u uVarA = o2.a(kFunction);
        Member memberB = (uVarA == null || (iVarC = uVarA.c()) == null) ? null : iVarC.b();
        if (memberB instanceof Method) {
            return (Method) memberB;
        }
        return null;
    }

    public static final Type c(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        return z.d(kType);
    }
}

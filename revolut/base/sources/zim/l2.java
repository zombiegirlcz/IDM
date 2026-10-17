package zim;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt;

/* JADX INFO: loaded from: classes14.dex */
public abstract class l2 {
    public static void a(StringBuilder sb6, KCallable kCallable) throws IOException {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        List parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : parameters) {
            if (((d1) ((wim.m) obj2)).f322623c == wim.l.CONTEXT) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        zhm.d0.j0(arrayList, sb6, null, "context(", ") ", c.k, 50);
    }

    public static void b(String str, StringBuilder sb6) {
        Name nameIdentifier = Name.identifier(str);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        sb6.append(RenderingUtilsKt.render(nameIdentifier));
    }

    public static void c(StringBuilder sb6, KCallable kCallable) {
        Object objInvoke = ((u) kCallable).f322704b.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objInvoke) {
            wim.l lVar = ((d1) ((wim.m) obj2)).f322623c;
            if (lVar == wim.l.INSTANCE || lVar == wim.l.EXTENSION_RECEIVER) {
                arrayList.add(obj2);
            }
        }
        wim.m mVar = (wim.m) zhm.d0.e0(0, arrayList);
        if (mVar != null) {
            sb6.append(g(((d1) mVar).d()));
            sb6.append(".");
            Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
        }
        wim.m mVar2 = (wim.m) zhm.d0.e0(1, arrayList);
        if (mVar2 != null) {
            sb6.append("(");
            Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
            sb6.append(g(((d1) mVar2).d()));
            sb6.append(".");
            Intrinsics.checkNotNullExpressionValue(sb6, "append(...)");
            sb6.append(")");
        }
    }

    public static String d(n0 lambda) throws IOException {
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        StringBuilder sb6 = new StringBuilder();
        Intrinsics.checkNotNullParameter(lambda, "<this>");
        Iterator it8 = lambda.getParameters().iterator();
        Object obj2 = null;
        boolean z = false;
        Object obj3 = null;
        while (true) {
            if (it8.hasNext()) {
                Object next = it8.next();
                if (((d1) ((wim.m) next)).f322623c == wim.l.EXTENSION_RECEIVER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj3 = next;
                }
            } else if (z) {
                obj2 = obj3;
            }
        }
        wim.m mVar = (wim.m) obj2;
        if (mVar != null) {
            sb6.append(g(((d1) mVar).d()));
            sb6.append(".");
        }
        zhm.d0.j0(czi.c.w(lambda), sb6, ", ", "(", ")", c.f322609m, 48);
        sb6.append(" -> ");
        sb6.append(g(lambda.getReturnType()));
        return sb6.toString();
    }

    public static String e(KProperty property) throws IOException {
        Intrinsics.checkNotNullParameter(property, "property");
        StringBuilder sb6 = new StringBuilder();
        a(sb6, property);
        sb6.append(property instanceof wim.k ? "var " : "val ");
        c(sb6, property);
        b(property.getName(), sb6);
        sb6.append(": ");
        sb6.append(g(property.getReturnType()));
        return sb6.toString();
    }

    public static void f(StringBuilder sb6, KClass kClass, FqNameUnsafe fqNameUnsafe, List list, boolean z) throws IOException {
        if (kClass.getTypeParameters().size() >= list.size() || nim.a.o(kClass).getDeclaringClass() == null) {
            sb6.append(RenderingUtilsKt.render(fqNameUnsafe));
        } else {
            Class<?> declaringClass = nim.a.o(kClass).getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            f(sb6, nim.a.r(declaringClass), fqNameUnsafe.parent(), zhm.d0.V(list, kClass.getTypeParameters().size()), false);
            sb6.append(".");
            sb6.append(RenderingUtilsKt.render(fqNameUnsafe.shortName()));
        }
        h(sb6, zhm.d0.V0(list, kClass.getTypeParameters().size()), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String g(kotlin.reflect.KType r14) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zim.l2.g(kotlin.reflect.KType):java.lang.String");
    }

    public static void h(StringBuilder sb6, List list, boolean z) throws IOException {
        StringBuilder sb9;
        if (list.isEmpty()) {
            sb9 = sb6;
        } else {
            sb9 = sb6;
            zhm.d0.j0(list, sb9, null, "<", ">", null, 114);
        }
        if (z) {
            sb9.append("?");
        }
    }
}

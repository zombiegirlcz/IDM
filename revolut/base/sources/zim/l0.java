package zim;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import sgm.e3;

/* JADX INFO: loaded from: classes13.dex */
public abstract class l0 implements kotlin.jvm.internal.j {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Regex f322659a = new Regex("<v#(\\d+)>");

    public static void b(ArrayList arrayList, List list, boolean z) {
        Class cls;
        cls = DefaultConstructorMarker.class;
        if (Intrinsics.f(zhm.d0.o0(list), cls)) {
            list = list.subList(0, list.size() - 1);
        }
        arrayList.addAll(list);
        int size = (list.size() + 31) / 32;
        for (int i = 0; i < size; i++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    public static Method r(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class<?> clsTryLoadClass;
        Method methodR;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodV = v(cls, str, clsArr, cls2);
        if (methodV != null) {
            return methodV;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodR = r(superclass, str, clsArr, cls2, z)) != null) {
            return methodR;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        Intrinsics.checkNotNullExpressionValue(interfaces, "getInterfaces(...)");
        for (Class<?> cls3 : interfaces) {
            Intrinsics.h(cls3);
            Method methodR2 = r(cls3, str, clsArr, cls2, z);
            if (methodR2 != null) {
                return methodR2;
            }
            if (z && (clsTryLoadClass = ReflectJavaClassFinderKt.tryLoadClass(ReflectClassUtilKt.getSafeClassLoader(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodV2 = v(clsTryLoadClass, str, clsArr, cls2);
                if (methodV2 != null) {
                    return methodV2;
                }
            }
        }
        return null;
    }

    public static Constructor u(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method v(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.f(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.f(method.getName(), str) && Intrinsics.f(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method c(String name, String desc, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.f(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(getF186423a());
        }
        e3 e3VarS = s(desc, true);
        b(arrayList, e3VarS.d(), false);
        Class clsP = p();
        String strR = a0.d.r(name, "$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsE = e3VarS.e();
        Intrinsics.h(clsE);
        return r(clsP, strR, clsArr, clsE, z);
    }

    public final Method d(String name, String desc) {
        Method methodR;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.f(name, "<init>")) {
            return null;
        }
        e3 e3VarS = s(desc, true);
        Class[] clsArr = (Class[]) e3VarS.d().toArray(new Class[0]);
        Class clsE = e3VarS.e();
        Intrinsics.h(clsE);
        Method methodR2 = r(p(), name, clsArr, clsE, false);
        if (methodR2 != null) {
            return methodR2;
        }
        if (!p().isInterface() || (methodR = r(Object.class, name, clsArr, clsE, false)) == null) {
            return null;
        }
        return methodR;
    }

    public abstract Collection g();

    public abstract Collection j(Name name);

    public abstract PropertyDescriptor n(int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection o(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r8, zim.j0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            zim.k0 r0 = new zim.k0
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope.DefaultImpls.getContributedDescriptors$default(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L4e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility r6 = kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.INVISIBLE_FAKE
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.a(r4)
            if (r4 == 0) goto L4e
            kotlin.Unit r4 = kotlin.Unit.f186387a
            java.lang.Object r3 = r3.accept(r0, r4)
            zim.u r3 = (zim.u) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = zhm.d0.d1(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zim.l0.o(kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, zim.j0):java.util.Collection");
    }

    public Class p() {
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(getF186423a());
        return wrapperByPrimitive == null ? getF186423a() : wrapperByPrimitive;
    }

    public abstract Collection q(Name name);

    public final e3 s(String str, boolean z) {
        int iS;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (kotlin.text.d0.K("VZCBSIFJD", cCharAt)) {
                iS = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
                }
                iS = kotlin.text.d0.S(str, ';', i, 4) + 1;
            }
            arrayList.add(t(i, iS, str));
            i = iS;
        }
        return new e3(arrayList, z ? t(i + 1, str.length(), str) : null);
    }

    public final Class t(int i, int i2, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(getF186423a());
            String strSubstring = str.substring(i + 1, i2 - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Class<?> clsLoadClass = safeClassLoader.loadClass(kotlin.text.a0.E(strSubstring, '/', CoreConstants.DOT));
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsT = t(i + 1, i2, str);
            FqName fqName = o2.f322677a;
            Intrinsics.checkNotNullParameter(clsT, "<this>");
            return Array.newInstance((Class<?>) clsT, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new KotlinReflectionInternalError("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}

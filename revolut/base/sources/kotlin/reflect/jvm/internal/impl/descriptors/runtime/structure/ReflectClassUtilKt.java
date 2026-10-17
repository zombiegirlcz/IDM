package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.a0;
import nim.a;
import nkm.t;
import nkm.y;
import oim.b;
import oim.c;
import oim.d;
import oim.e;
import oim.f;
import oim.g;
import oim.h;
import oim.i;
import oim.j;
import oim.k;
import oim.l;
import oim.m;
import oim.n;
import oim.o;
import oim.p;
import oim.q;
import oim.r;
import oim.s;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class ReflectClassUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f186699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f186700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f186701c;
    public static final Map d;

    static {
        p0 p0Var = o0.f186429a;
        int i = 0;
        List listK = v.k(p0Var.b(Boolean.TYPE), p0Var.b(Byte.TYPE), p0Var.b(Character.TYPE), p0Var.b(Double.TYPE), p0Var.b(Float.TYPE), p0Var.b(Integer.TYPE), p0Var.b(Long.TYPE), p0Var.b(Short.TYPE));
        f186699a = listK;
        List<KClass> list = listK;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (KClass kClass : list) {
            arrayList.add(new Pair(a.p(kClass), a.q(kClass)));
        }
        f186700b = r0.t(arrayList);
        List<KClass> list2 = f186699a;
        ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
        for (KClass kClass2 : list2) {
            arrayList2.add(new Pair(a.q(kClass2), a.p(kClass2)));
        }
        f186701c = r0.t(arrayList2);
        List listK2 = v.k(Function0.class, Function1.class, Function2.class, Function3.class, n.class, o.class, p.class, q.class, r.class, s.class, oim.a.class, b.class, c.class, d.class, e.class, f.class, g.class, h.class, i.class, j.class, k.class, l.class, m.class);
        ArrayList arrayList3 = new ArrayList(w.t(listK2, 10));
        for (Object obj2 : listK2) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            arrayList3.add(new Pair((Class) obj2, Integer.valueOf(i)));
            i = i2;
        }
        d = r0.t(arrayList3);
    }

    @NotNull
    public static final ClassId getClassId(@NotNull Class<?> cls) {
        ClassId classId;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (cls.isPrimitive()) {
            throw new IllegalArgumentException(a0.d.l(cls, "Can't compute ClassId for primitive type: "));
        }
        if (cls.isArray()) {
            throw new IllegalArgumentException(a0.d.l(cls, "Can't compute ClassId for array type: "));
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null) {
            String simpleName = cls.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            if (simpleName.length() != 0) {
                Class<?> declaringClass = cls.getDeclaringClass();
                if (declaringClass != null && (classId = getClassId(declaringClass)) != null) {
                    Name nameIdentifier = Name.identifier(cls.getSimpleName());
                    Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                    ClassId classIdCreateNestedClassId = classId.createNestedClassId(nameIdentifier);
                    if (classIdCreateNestedClassId != null) {
                        return classIdCreateNestedClassId;
                    }
                }
                ClassId.Companion companion = ClassId.Companion;
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return companion.topLevel(new FqName(name));
            }
        }
        String name2 = cls.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        FqName fqName = new FqName(name2);
        return new ClassId(fqName.parent(), FqName.Companion.topLevel(fqName.shortName()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final String getDesc(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                String name = cls.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return a0.E(name, CoreConstants.DOT, '/');
            }
            StringBuilder sb6 = new StringBuilder("L");
            String name2 = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            sb6.append(a0.E(name2, CoreConstants.DOT, '/'));
            sb6.append(';');
            return sb6.toString();
        }
        String name3 = cls.getName();
        switch (name3.hashCode()) {
            case -1325958191:
                if (name3.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name3.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name3.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name3.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name3.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name3.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name3.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name3.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name3.equals("short")) {
                    return "S";
                }
                break;
        }
        throw new IllegalArgumentException(a0.d.l(cls, "Unsupported primitive type: "));
    }

    public static final Integer getFunctionClassArity(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Integer) d.get(cls);
    }

    @NotNull
    public static final List<Type> getParameterizedTypeArguments(@NotNull Type type) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        if (!(type instanceof ParameterizedType)) {
            return f0.f322471a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() != null) {
            return y.J(y.s(t.g(type, hjm.b.f152834b), hjm.b.f152835c));
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        return kotlin.collections.d.v0(actualTypeArguments);
    }

    public static final Class<?> getPrimitiveByWrapper(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) f186700b.get(cls);
    }

    @NotNull
    public static final ClassLoader getSafeClassLoader(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        Intrinsics.checkNotNullExpressionValue(systemClassLoader, "getSystemClassLoader(...)");
        return systemClassLoader;
    }

    public static final Class<?> getWrapperByPrimitive(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return (Class) f186701c.get(cls);
    }

    public static final boolean isEnumClassOrSpecializedEnumEntryClass(@NotNull Class<?> cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return Enum.class.isAssignableFrom(cls);
    }
}

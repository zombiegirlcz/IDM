package wim;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.sequences.Sequence;
import wim.a0;
import zhm.d0;
import zim.c2;
import zim.h2;

/* JADX INFO: loaded from: classes13.dex */
public abstract class z {
    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            String name = cls.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            return name;
        }
        Sequence sequenceG = nkm.t.g(type, y.f);
        return ((Class) nkm.y.v(sequenceG)).getName() + kotlin.text.a0.C("[]", nkm.y.j(sequenceG));
    }

    public static final Type b(KType kType, boolean z) {
        c classifier = kType.getClassifier();
        if (classifier instanceof r) {
            return new w((r) classifier);
        }
        if (!(classifier instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) classifier;
        Class clsP = z ? nim.a.p(kClass) : nim.a.o(kClass);
        List arguments = kType.getArguments();
        if (arguments.isEmpty()) {
            return clsP;
        }
        if (!clsP.isArray()) {
            return c(clsP, arguments);
        }
        if (clsP.getComponentType().isPrimitive()) {
            return clsP;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) d0.M0(arguments);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        t tVar = kTypeProjection.f186455a;
        KType kType2 = kTypeProjection.f186456b;
        int i = tVar == null ? -1 : x.f297950a[tVar.ordinal()];
        if (i == -1 || i == 1) {
            return clsP;
        }
        if (i != 2 && i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.h(kType2);
        Type typeB = b(kType2, false);
        return typeB instanceof Class ? clsP : new a(typeB);
    }

    public static final v c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
            Iterator it8 = list2.iterator();
            while (it8.hasNext()) {
                arrayList.add(e((KTypeProjection) it8.next()));
            }
            return new v(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(zhm.w.t(list3, 10));
            Iterator it9 = list3.iterator();
            while (it9.hasNext()) {
                arrayList2.add(e((KTypeProjection) it9.next()));
            }
            return new v(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        v vVarC = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(zhm.w.t(listSubList, 10));
        Iterator it10 = listSubList.iterator();
        while (it10.hasNext()) {
            arrayList3.add(e((KTypeProjection) it10.next()));
        }
        return new v(cls, vVarC, arrayList3);
    }

    public static final Type d(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        if (kType instanceof kotlin.jvm.internal.t) {
            h2 h2Var = ((c2) ((kotlin.jvm.internal.t) kType)).f322617c;
            Type type = h2Var != null ? (Type) h2Var.invoke() : null;
            if (type != null) {
                return type;
            }
        }
        return b(kType, false);
    }

    public static final Type e(KTypeProjection kTypeProjection) {
        t tVar = kTypeProjection.f186455a;
        if (tVar == null) {
            a0.INSTANCE.getClass();
            return a0.Companion.a();
        }
        KType kType = kTypeProjection.f186456b;
        Intrinsics.h(kType);
        int i = x.f297950a[tVar.ordinal()];
        if (i == 1) {
            return new a0(null, b(kType, true));
        }
        if (i == 2) {
            return b(kType, true);
        }
        if (i == 3) {
            return new a0(b(kType, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}

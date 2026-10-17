package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import a0.d;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.internal.mlkit_vision_face.a;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.name.StandardClassIds;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.a0;
import kotlin.text.d0;
import kotlin.text.z;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class JavaToKotlinClassMap {

    @NotNull
    public static final JavaToKotlinClassMap INSTANCE = new JavaToKotlinClassMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f186488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f186489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f186490c;
    public static final String d;
    public static final ClassId e;
    public static final FqName f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ClassId f186491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashMap f186492h;
    public static final HashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashMap f186493j;
    public static final HashMap k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f186494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final HashMap f186495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f186496n;

    public static final class PlatformMutabilityMapping {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClassId f186497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClassId f186498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ClassId f186499c;

        public PlatformMutabilityMapping(@NotNull ClassId javaClass, @NotNull ClassId kotlinReadOnly, @NotNull ClassId kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.f186497a = javaClass;
            this.f186498b = kotlinReadOnly;
            this.f186499c = kotlinMutable;
        }

        @NotNull
        public final ClassId component1() {
            return this.f186497a;
        }

        @NotNull
        public final ClassId component2() {
            return this.f186498b;
        }

        @NotNull
        public final ClassId component3() {
            return this.f186499c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PlatformMutabilityMapping)) {
                return false;
            }
            PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj2;
            return Intrinsics.f(this.f186497a, platformMutabilityMapping.f186497a) && Intrinsics.f(this.f186498b, platformMutabilityMapping.f186498b) && Intrinsics.f(this.f186499c, platformMutabilityMapping.f186499c);
        }

        @NotNull
        public final ClassId getJavaClass() {
            return this.f186497a;
        }

        public int hashCode() {
            return this.f186499c.hashCode() + ((this.f186498b.hashCode() + (this.f186497a.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f186497a + ", kotlinReadOnly=" + this.f186498b + ", kotlinMutable=" + this.f186499c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    static {
        StringBuilder sb6 = new StringBuilder();
        FunctionTypeKind.Function function = FunctionTypeKind.Function.INSTANCE;
        sb6.append(function.getPackageFqName());
        sb6.append(CoreConstants.DOT);
        sb6.append(function.getClassNamePrefix());
        f186488a = sb6.toString();
        StringBuilder sb9 = new StringBuilder();
        FunctionTypeKind.KFunction kFunction = FunctionTypeKind.KFunction.INSTANCE;
        sb9.append(kFunction.getPackageFqName());
        sb9.append(CoreConstants.DOT);
        sb9.append(kFunction.getClassNamePrefix());
        f186489b = sb9.toString();
        StringBuilder sb10 = new StringBuilder();
        FunctionTypeKind.SuspendFunction suspendFunction = FunctionTypeKind.SuspendFunction.INSTANCE;
        sb10.append(suspendFunction.getPackageFqName());
        sb10.append(CoreConstants.DOT);
        sb10.append(suspendFunction.getClassNamePrefix());
        f186490c = sb10.toString();
        StringBuilder sb11 = new StringBuilder();
        FunctionTypeKind.KSuspendFunction kSuspendFunction = FunctionTypeKind.KSuspendFunction.INSTANCE;
        sb11.append(kSuspendFunction.getPackageFqName());
        sb11.append(CoreConstants.DOT);
        sb11.append(kSuspendFunction.getClassNamePrefix());
        d = sb11.toString();
        ClassId.Companion companion = ClassId.Companion;
        ClassId classId = companion.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        e = classId;
        f = classId.asSingleFqName();
        StandardClassIds standardClassIds = StandardClassIds.INSTANCE;
        f186491g = standardClassIds.getKFunction();
        standardClassIds.getKClass();
        c(Class.class);
        f186492h = new HashMap();
        i = new HashMap();
        f186493j = new HashMap();
        k = new HashMap();
        f186494l = new HashMap();
        f186495m = new HashMap();
        ClassId classId2 = companion.topLevel(StandardNames.FqNames.iterable);
        PlatformMutabilityMapping platformMutabilityMapping = new PlatformMutabilityMapping(c(Iterable.class), classId2, new ClassId(classId2.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterable, classId2.getPackageFqName()), false));
        ClassId classId3 = companion.topLevel(StandardNames.FqNames.iterator);
        PlatformMutabilityMapping platformMutabilityMapping2 = new PlatformMutabilityMapping(c(Iterator.class), classId3, new ClassId(classId3.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableIterator, classId3.getPackageFqName()), false));
        ClassId classId4 = companion.topLevel(StandardNames.FqNames.collection);
        PlatformMutabilityMapping platformMutabilityMapping3 = new PlatformMutabilityMapping(c(Collection.class), classId4, new ClassId(classId4.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableCollection, classId4.getPackageFqName()), false));
        ClassId classId5 = companion.topLevel(StandardNames.FqNames.list);
        PlatformMutabilityMapping platformMutabilityMapping4 = new PlatformMutabilityMapping(c(List.class), classId5, new ClassId(classId5.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableList, classId5.getPackageFqName()), false));
        ClassId classId6 = companion.topLevel(StandardNames.FqNames.set);
        PlatformMutabilityMapping platformMutabilityMapping5 = new PlatformMutabilityMapping(c(Set.class), classId6, new ClassId(classId6.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableSet, classId6.getPackageFqName()), false));
        ClassId classId7 = companion.topLevel(StandardNames.FqNames.listIterator);
        PlatformMutabilityMapping platformMutabilityMapping6 = new PlatformMutabilityMapping(c(ListIterator.class), classId7, new ClassId(classId7.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableListIterator, classId7.getPackageFqName()), false));
        FqName fqName = StandardNames.FqNames.map;
        ClassId classId8 = companion.topLevel(fqName);
        PlatformMutabilityMapping platformMutabilityMapping7 = new PlatformMutabilityMapping(c(Map.class), classId8, new ClassId(classId8.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMap, classId8.getPackageFqName()), false));
        ClassId classIdCreateNestedClassId = companion.topLevel(fqName).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        List<PlatformMutabilityMapping> listK = v.k(platformMutabilityMapping, platformMutabilityMapping2, platformMutabilityMapping3, platformMutabilityMapping4, platformMutabilityMapping5, platformMutabilityMapping6, platformMutabilityMapping7, new PlatformMutabilityMapping(c(Map.Entry.class), classIdCreateNestedClassId, new ClassId(classIdCreateNestedClassId.getPackageFqName(), FqNamesUtilKt.tail(StandardNames.FqNames.mutableMapEntry, classIdCreateNestedClassId.getPackageFqName()), false)));
        f186496n = listK;
        b(Object.class, StandardNames.FqNames.any);
        b(String.class, StandardNames.FqNames.string);
        b(CharSequence.class, StandardNames.FqNames.charSequence);
        a(c(Throwable.class), companion.topLevel(StandardNames.FqNames.throwable));
        b(Cloneable.class, StandardNames.FqNames.cloneable);
        b(Number.class, StandardNames.FqNames.number);
        a(c(Comparable.class), companion.topLevel(StandardNames.FqNames.comparable));
        b(Enum.class, StandardNames.FqNames._enum);
        a(c(Annotation.class), companion.topLevel(StandardNames.FqNames.annotation));
        for (PlatformMutabilityMapping platformMutabilityMapping8 : listK) {
            INSTANCE.getClass();
            ClassId classIdComponent1 = platformMutabilityMapping8.component1();
            ClassId classIdComponent2 = platformMutabilityMapping8.component2();
            ClassId classIdComponent3 = platformMutabilityMapping8.component3();
            a(classIdComponent1, classIdComponent2);
            i.put(classIdComponent3.asSingleFqName().toUnsafe(), classIdComponent1);
            f186494l.put(classIdComponent3, classIdComponent2);
            f186495m.put(classIdComponent2, classIdComponent3);
            FqName fqNameAsSingleFqName = classIdComponent2.asSingleFqName();
            FqName fqNameAsSingleFqName2 = classIdComponent3.asSingleFqName();
            f186493j.put(classIdComponent3.asSingleFqName().toUnsafe(), fqNameAsSingleFqName);
            k.put(fqNameAsSingleFqName.toUnsafe(), fqNameAsSingleFqName2);
        }
        for (JvmPrimitiveType jvmPrimitiveType : JvmPrimitiveType.values()) {
            JavaToKotlinClassMap javaToKotlinClassMap = INSTANCE;
            ClassId.Companion companion2 = ClassId.Companion;
            FqName wrapperFqName = jvmPrimitiveType.getWrapperFqName();
            Intrinsics.checkNotNullExpressionValue(wrapperFqName, "getWrapperFqName(...)");
            ClassId classId9 = companion2.topLevel(wrapperFqName);
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "getPrimitiveType(...)");
            ClassId classId10 = companion2.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            javaToKotlinClassMap.getClass();
            a(classId9, classId10);
        }
        for (ClassId classId11 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId12 = ClassId.Companion.topLevel(new FqName("kotlin.jvm.internal." + classId11.getShortClassName().asString() + "CompanionObject"));
            ClassId classIdCreateNestedClassId2 = classId11.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            javaToKotlinClassMap2.getClass();
            a(classId12, classIdCreateNestedClassId2);
        }
        for (int i2 = 0; i2 < 23; i2++) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            ClassId classId13 = ClassId.Companion.topLevel(new FqName(d.n("kotlin.jvm.functions.Function", i2)));
            ClassId functionClassId = StandardNames.getFunctionClassId(i2);
            javaToKotlinClassMap3.getClass();
            a(classId13, functionClassId);
            i.put(new FqName(a.s(new StringBuilder(), f186489b, i2)).toUnsafe(), f186491g);
        }
        for (int i3 = 0; i3 < 22; i3++) {
            FunctionTypeKind.KSuspendFunction kSuspendFunction2 = FunctionTypeKind.KSuspendFunction.INSTANCE;
            String str = kSuspendFunction2.getPackageFqName() + CoreConstants.DOT + kSuspendFunction2.getClassNamePrefix();
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            FqName fqName2 = new FqName(p.a.o(str, i3));
            ClassId classId14 = f186491g;
            javaToKotlinClassMap4.getClass();
            i.put(fqName2.toUnsafe(), classId14);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName fqName3 = new FqName("kotlin.concurrent.atomics.AtomicInt");
        javaToKotlinClassMap5.getClass();
        ClassId classIdC = c(AtomicInteger.class);
        HashMap map = i;
        map.put(fqName3.toUnsafe(), classIdC);
        map.put(new FqName("kotlin.concurrent.atomics.AtomicLong").toUnsafe(), c(AtomicLong.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicBoolean").toUnsafe(), c(AtomicBoolean.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicReference").toUnsafe(), c(AtomicReference.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicIntArray").toUnsafe(), c(AtomicIntegerArray.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicLongArray").toUnsafe(), c(AtomicLongArray.class));
        map.put(new FqName("kotlin.concurrent.atomics.AtomicArray").toUnsafe(), c(AtomicReferenceArray.class));
        map.put(StandardNames.FqNames.nothing.toSafe().toUnsafe(), c(Void.class));
    }

    public static void a(ClassId classId, ClassId classId2) {
        f186492h.put(classId.asSingleFqName().toUnsafe(), classId2);
        i.put(classId2.asSingleFqName().toUnsafe(), classId);
    }

    public static void b(Class cls, FqNameUnsafe fqNameUnsafe) {
        a(c(cls), ClassId.Companion.topLevel(fqNameUnsafe.toSafe()));
    }

    public static ClassId c(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId.Companion companion = ClassId.Companion;
            String canonicalName = cls.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
            return companion.topLevel(new FqName(canonicalName));
        }
        ClassId classIdC = c(declaringClass);
        Name nameIdentifier = Name.identifier(cls.getSimpleName());
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return classIdC.createNestedClassId(nameIdentifier);
    }

    public static boolean d(FqNameUnsafe fqNameUnsafe, String str) {
        Integer numM;
        String strAsString = fqNameUnsafe.asString();
        if (a0.H(strAsString, str, false)) {
            String strSubstring = strAsString.substring(str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (!d0.r0('0', strSubstring) && (numM = z.m(strSubstring)) != null && numM.intValue() >= 23) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final FqName getFUNCTION_N_FQ_NAME() {
        return f;
    }

    @NotNull
    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return f186496n;
    }

    public final boolean isMutable(FqNameUnsafe fqNameUnsafe) {
        return f186493j.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(FqNameUnsafe fqNameUnsafe) {
        return k.containsKey(fqNameUnsafe);
    }

    public final ClassId mapJavaToKotlin(@NotNull FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return (ClassId) f186492h.get(fqName.toUnsafe());
    }

    public final ClassId mapKotlinToJava(@NotNull FqNameUnsafe kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        return (d(kotlinFqName, f186488a) || d(kotlinFqName, f186490c)) ? e : (d(kotlinFqName, f186489b) || d(kotlinFqName, d)) ? f186491g : (ClassId) i.get(kotlinFqName);
    }

    public final FqName mutableToReadOnly(FqNameUnsafe fqNameUnsafe) {
        return (FqName) f186493j.get(fqNameUnsafe);
    }

    public final FqName readOnlyToMutable(FqNameUnsafe fqNameUnsafe) {
        return (FqName) k.get(fqNameUnsafe);
    }
}

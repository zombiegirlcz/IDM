package kotlin.reflect.jvm.internal.impl.name;

import a0.d;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class StandardClassIds {
    public static final ClassId A;
    public static final ClassId B;
    public static final ClassId C;
    public static final ClassId D;
    public static final Object E;
    public static final Object F;

    @NotNull
    public static final StandardClassIds INSTANCE = new StandardClassIds();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f187472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FqName f187473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final FqName f187474c;
    public static final FqName d;
    public static final FqName e;
    public static final FqName f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final FqName f187475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final FqName f187476h;
    public static final ClassId i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ClassId f187477j;
    public static final ClassId k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ClassId f187478l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ClassId f187479m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ClassId f187480n;
    public static final ClassId o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ClassId f187481p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ClassId f187482q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ClassId f187483r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ClassId f187484s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ClassId f187485t;
    public static final ClassId u;
    public static final ClassId v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f187486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Map f187487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Set f187488y;
    public static final Map z;

    static {
        FqName fqName = new FqName("kotlin");
        f187472a = fqName;
        FqName fqNameY = d.y("reflect", "identifier(...)", fqName);
        f187473b = fqNameY;
        Name nameIdentifier = Name.identifier("experimental");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        fqName.child(nameIdentifier);
        Name nameIdentifier2 = Name.identifier("collections");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        FqName fqNameChild = fqName.child(nameIdentifier2);
        f187474c = fqNameChild;
        Name nameIdentifier3 = Name.identifier("sequences");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        fqName.child(nameIdentifier3);
        Name nameIdentifier4 = Name.identifier("ranges");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        FqName fqNameChild2 = fqName.child(nameIdentifier4);
        d = fqNameChild2;
        FqName fqNameY2 = d.y("jvm", "identifier(...)", fqName);
        Name nameIdentifier5 = Name.identifier("js");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        fqName.child(nameIdentifier5);
        Name nameIdentifier6 = Name.identifier("annotations");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        FqName fqNameChild3 = fqName.child(nameIdentifier6);
        Name nameIdentifier7 = Name.identifier("jvm");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        fqNameChild3.child(nameIdentifier7);
        Name nameIdentifier8 = Name.identifier("internal");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        fqNameY2.child(nameIdentifier8);
        Name nameIdentifier9 = Name.identifier("functions");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        fqNameY2.child(nameIdentifier9);
        Name nameIdentifier10 = Name.identifier("annotation");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        FqName fqNameChild4 = fqName.child(nameIdentifier10);
        e = fqNameChild4;
        FqName fqNameY3 = d.y("internal", "identifier(...)", fqName);
        Name nameIdentifier11 = Name.identifier("ir");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        fqNameY3.child(nameIdentifier11);
        Name nameIdentifier12 = Name.identifier("coroutines");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        FqName fqNameChild5 = fqName.child(nameIdentifier12);
        f = fqNameChild5;
        Name nameIdentifier13 = Name.identifier("intrinsics");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        fqNameChild5.child(nameIdentifier13);
        Name nameIdentifier14 = Name.identifier("enums");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        f187475g = fqName.child(nameIdentifier14);
        Name nameIdentifier15 = Name.identifier("contracts");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        fqName.child(nameIdentifier15);
        Name nameIdentifier16 = Name.identifier("concurrent");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        FqName fqNameY4 = d.y("atomics", "identifier(...)", fqName.child(nameIdentifier16));
        f187476h = fqNameY4;
        Name nameIdentifier17 = Name.identifier("test");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        fqName.child(nameIdentifier17);
        Name nameIdentifier18 = Name.identifier("text");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier18, "identifier(...)");
        fqName.child(nameIdentifier18);
        FqName[] elements = {fqName, fqNameChild, fqNameChild2, fqNameChild4};
        Intrinsics.checkNotNullParameter(elements, "elements");
        kotlin.collections.d.y0(elements);
        FqName[] elements2 = {fqName, fqNameChild, fqNameChild2, fqNameChild4, fqNameY, fqNameY3, fqNameChild5, fqNameY4};
        Intrinsics.checkNotNullParameter(elements2, "elements");
        kotlin.collections.d.y0(elements2);
        StandardClassIdsKt.access$baseId("Nothing");
        i = StandardClassIdsKt.access$baseId("Unit");
        f187477j = StandardClassIdsKt.access$baseId("Any");
        k = StandardClassIdsKt.access$baseId("Enum");
        StandardClassIdsKt.access$baseId("Annotation");
        f187478l = StandardClassIdsKt.access$baseId("Array");
        ClassId classIdAccess$baseId = StandardClassIdsKt.access$baseId("Boolean");
        f187479m = classIdAccess$baseId;
        ClassId classIdAccess$baseId2 = StandardClassIdsKt.access$baseId("Char");
        ClassId classIdAccess$baseId3 = StandardClassIdsKt.access$baseId("Byte");
        ClassId classIdAccess$baseId4 = StandardClassIdsKt.access$baseId("Short");
        ClassId classIdAccess$baseId5 = StandardClassIdsKt.access$baseId("Int");
        f187480n = classIdAccess$baseId5;
        ClassId classIdAccess$baseId6 = StandardClassIdsKt.access$baseId("Long");
        o = classIdAccess$baseId6;
        ClassId classIdAccess$baseId7 = StandardClassIdsKt.access$baseId("Float");
        ClassId classIdAccess$baseId8 = StandardClassIdsKt.access$baseId("Double");
        f187481p = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId3);
        f187482q = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId4);
        f187483r = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId5);
        f187484s = StandardClassIdsKt.access$unsignedId(classIdAccess$baseId6);
        StandardClassIdsKt.access$baseId("CharSequence");
        f187485t = StandardClassIdsKt.access$baseId("String");
        StandardClassIdsKt.access$baseId("Throwable");
        StandardClassIdsKt.access$baseId("Cloneable");
        StandardClassIdsKt.access$reflectId("KProperty");
        StandardClassIdsKt.access$reflectId("KMutableProperty");
        StandardClassIdsKt.access$reflectId("KProperty0");
        StandardClassIdsKt.access$reflectId("KMutableProperty0");
        StandardClassIdsKt.access$reflectId("KProperty1");
        StandardClassIdsKt.access$reflectId("KMutableProperty1");
        StandardClassIdsKt.access$reflectId("KProperty2");
        StandardClassIdsKt.access$reflectId("KMutableProperty2");
        u = StandardClassIdsKt.access$reflectId("KFunction");
        v = StandardClassIdsKt.access$reflectId("KClass");
        StandardClassIdsKt.access$reflectId("KCallable");
        StandardClassIdsKt.access$reflectId("KType");
        StandardClassIdsKt.access$baseId("Comparable");
        StandardClassIdsKt.access$baseId("Number");
        StandardClassIdsKt.access$baseId("Function");
        ClassId[] elements3 = {classIdAccess$baseId, classIdAccess$baseId2, classIdAccess$baseId3, classIdAccess$baseId4, classIdAccess$baseId5, classIdAccess$baseId6, classIdAccess$baseId7, classIdAccess$baseId8};
        Intrinsics.checkNotNullParameter(elements3, "elements");
        Set setY0 = kotlin.collections.d.y0(elements3);
        f187486w = setY0;
        ClassId[] elements4 = {classIdAccess$baseId3, classIdAccess$baseId4, classIdAccess$baseId5, classIdAccess$baseId6};
        Intrinsics.checkNotNullParameter(elements4, "elements");
        kotlin.collections.d.y0(elements4);
        Set set = setY0;
        int iB = q0.b(w.t(set, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Object obj2 : set) {
            linkedHashMap.put(obj2, StandardClassIdsKt.access$primitiveArrayId(((ClassId) obj2).getShortClassName()));
        }
        f187487x = StandardClassIdsKt.access$inverseMap(linkedHashMap);
        ClassId[] elements5 = {f187481p, f187482q, f187483r, f187484s};
        Intrinsics.checkNotNullParameter(elements5, "elements");
        Set setY02 = kotlin.collections.d.y0(elements5);
        f187488y = setY02;
        Set set2 = setY02;
        int iB2 = q0.b(w.t(set2, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2 >= 16 ? iB2 : 16);
        for (Object obj3 : set2) {
            linkedHashMap2.put(obj3, StandardClassIdsKt.access$primitiveArrayId(((ClassId) obj3).getShortClassName()));
        }
        z = StandardClassIdsKt.access$inverseMap(linkedHashMap2);
        Set set3 = f187486w;
        Set set4 = f187488y;
        LinkedHashSet linkedHashSetL = a1.l(set3, set4);
        ClassId classId = f187485t;
        a1.m(linkedHashSetL, classId);
        StandardClassIdsKt.access$coroutinesId("Continuation");
        StandardClassIdsKt.access$collectionsId("Iterator");
        StandardClassIdsKt.access$collectionsId("Iterable");
        StandardClassIdsKt.access$collectionsId("Collection");
        StandardClassIdsKt.access$collectionsId("List");
        StandardClassIdsKt.access$collectionsId("ListIterator");
        StandardClassIdsKt.access$collectionsId("Set");
        ClassId classIdAccess$collectionsId = StandardClassIdsKt.access$collectionsId("Map");
        StandardClassIdsKt.access$collectionsId("AbstractMap");
        StandardClassIdsKt.access$collectionsId("MutableIterator");
        StandardClassIdsKt.access$collectionsId("CharIterator");
        StandardClassIdsKt.access$collectionsId("MutableIterable");
        StandardClassIdsKt.access$collectionsId("MutableCollection");
        A = StandardClassIdsKt.access$collectionsId("MutableList");
        StandardClassIdsKt.access$collectionsId("MutableListIterator");
        B = StandardClassIdsKt.access$collectionsId("MutableSet");
        ClassId classIdAccess$collectionsId2 = StandardClassIdsKt.access$collectionsId("MutableMap");
        C = classIdAccess$collectionsId2;
        Name nameIdentifier19 = Name.identifier("Entry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier19, "identifier(...)");
        classIdAccess$collectionsId.createNestedClassId(nameIdentifier19);
        Name nameIdentifier20 = Name.identifier("MutableEntry");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier20, "identifier(...)");
        classIdAccess$collectionsId2.createNestedClassId(nameIdentifier20);
        StandardClassIdsKt.access$baseId("Result");
        StandardClassIdsKt.access$rangesId("IntRange");
        StandardClassIdsKt.access$rangesId("LongRange");
        StandardClassIdsKt.access$rangesId("CharRange");
        StandardClassIdsKt.access$annotationId("AnnotationRetention");
        StandardClassIdsKt.access$annotationId("AnnotationTarget");
        StandardClassIdsKt.access$baseId("DeprecationLevel");
        D = StandardClassIdsKt.access$enumsId("EnumEntries");
        ClassId classIdAccess$atomicsId = StandardClassIdsKt.access$atomicsId("AtomicBoolean");
        ClassId classIdAccess$atomicsId2 = StandardClassIdsKt.access$atomicsId("AtomicInt");
        ClassId classIdAccess$atomicsId3 = StandardClassIdsKt.access$atomicsId("AtomicLong");
        StandardClassIdsKt.access$atomicsId("AtomicReference");
        Pair pair = new Pair(f187479m, classIdAccess$atomicsId);
        ClassId classId2 = f187480n;
        Pair pair2 = new Pair(classId2, classIdAccess$atomicsId2);
        ClassId classId3 = o;
        E = r0.k(pair, pair2, new Pair(classId3, classIdAccess$atomicsId3));
        StandardClassIdsKt.access$atomicsId("AtomicArray");
        F = r0.k(new Pair(classId2, StandardClassIdsKt.access$atomicsId("AtomicIntArray")), new Pair(classId3, StandardClassIdsKt.access$atomicsId("AtomicLongArray")));
        a1.m(a1.m(a1.m(a1.m(a1.l(set3, set4), classId), i), f187477j), k);
    }

    @NotNull
    public final ClassId getArray() {
        return f187478l;
    }

    @NotNull
    public final FqName getBASE_ANNOTATION_PACKAGE() {
        return e;
    }

    @NotNull
    public final FqName getBASE_COLLECTIONS_PACKAGE() {
        return f187474c;
    }

    @NotNull
    public final FqName getBASE_CONCURRENT_ATOMICS_PACKAGE() {
        return f187476h;
    }

    @NotNull
    public final FqName getBASE_COROUTINES_PACKAGE() {
        return f;
    }

    @NotNull
    public final FqName getBASE_ENUMS_PACKAGE() {
        return f187475g;
    }

    @NotNull
    public final FqName getBASE_KOTLIN_PACKAGE() {
        return f187472a;
    }

    @NotNull
    public final FqName getBASE_RANGES_PACKAGE() {
        return d;
    }

    @NotNull
    public final FqName getBASE_REFLECT_PACKAGE() {
        return f187473b;
    }

    @NotNull
    public final ClassId getEnumEntries() {
        return D;
    }

    @NotNull
    public final ClassId getKClass() {
        return v;
    }

    @NotNull
    public final ClassId getKFunction() {
        return u;
    }

    @NotNull
    public final ClassId getMutableList() {
        return A;
    }

    @NotNull
    public final ClassId getMutableMap() {
        return C;
    }

    @NotNull
    public final ClassId getMutableSet() {
        return B;
    }
}

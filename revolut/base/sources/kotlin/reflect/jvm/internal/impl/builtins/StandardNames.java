package kotlin.reflect.jvm.internal.impl.builtins;

import a0.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class StandardNames {

    @NotNull
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name BACKING_FIELD;

    @NotNull
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;

    @NotNull
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;

    @NotNull
    public static final Name BUILT_INS_PACKAGE_NAME;

    @NotNull
    public static final Name CHAR_CODE;

    @NotNull
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName CONCURRENT_ATOMICS_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName CONCURRENT_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME;

    @NotNull
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name COROUTINE_SUSPENDED_NAME;

    @NotNull
    public static final String DATA_CLASS_COMPONENT_PREFIX;

    @NotNull
    public static final Name DATA_CLASS_COPY;

    @NotNull
    public static final Name DEFAULT_VALUE_PARAMETER;

    @NotNull
    public static final FqName DYNAMIC_FQ_NAME;

    @NotNull
    public static final Name ENUM_ENTRIES;

    @NotNull
    public static final Name ENUM_VALUES;

    @NotNull
    public static final Name ENUM_VALUE_OF;

    @NotNull
    public static final Name EQUALS_NAME;

    @NotNull
    public static final Name HASHCODE_NAME;

    @NotNull
    public static final Name IMPLICIT_LAMBDA_PARAMETER_NAME;

    @NotNull
    public static final StandardNames INSTANCE = new StandardNames();

    @NotNull
    public static final FqName KOTLIN_INTERNAL_FQ_NAME;

    @NotNull
    public static final FqName KOTLIN_REFLECT_FQ_NAME;

    @NotNull
    public static final Name MAIN;

    @NotNull
    public static final Name NAME;

    @NotNull
    public static final Name NEXT_CHAR;

    @NotNull
    public static final List<String> PREFIXES;

    @NotNull
    public static final FqName RANGES_PACKAGE_FQ_NAME;

    @NotNull
    public static final FqName RESULT_FQ_NAME;

    @NotNull
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    @NotNull
    public static final Name TO_STRING_NAME;

    public static final class FqNames {

        @NotNull
        public static final FqName accessibleLateinitPropertyLiteral;

        @NotNull
        public static final FqName annotation;

        @NotNull
        public static final FqName annotationRetention;

        @NotNull
        public static final FqName annotationTarget;

        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;

        @NotNull
        public static final FqName atomicArray;

        @NotNull
        public static final FqName atomicBoolean;

        @NotNull
        public static final FqName atomicInt;

        @NotNull
        public static final FqName atomicIntArray;

        @NotNull
        public static final FqName atomicLong;

        @NotNull
        public static final FqName atomicLongArray;

        @NotNull
        public static final FqName atomicReference;

        @NotNull
        public static final FqName collection;

        @NotNull
        public static final FqName contextFunctionTypeParams;

        @NotNull
        public static final FqName deprecated;

        @NotNull
        public static final FqName deprecatedSinceKotlin;

        @NotNull
        public static final FqName deprecationLevel;

        @NotNull
        public static final FqName extensionFunctionType;

        @NotNull
        public static final FqNameUnsafe findAssociatedObject;

        @NotNull
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;

        @NotNull
        public static final FqNameUnsafe intRange;

        @NotNull
        public static final FqName iterable;

        @NotNull
        public static final FqName iterator;

        @NotNull
        public static final FqNameUnsafe kCallable;

        @NotNull
        public static final FqNameUnsafe kClass;

        @NotNull
        public static final FqNameUnsafe kDeclarationContainer;

        @NotNull
        public static final FqNameUnsafe kMutableProperty0;

        @NotNull
        public static final FqNameUnsafe kMutableProperty1;

        @NotNull
        public static final FqNameUnsafe kMutableProperty2;

        @NotNull
        public static final FqNameUnsafe kMutablePropertyFqName;

        @NotNull
        public static final ClassId kProperty;

        @NotNull
        public static final FqNameUnsafe kProperty0;

        @NotNull
        public static final FqNameUnsafe kProperty1;

        @NotNull
        public static final FqNameUnsafe kProperty2;

        @NotNull
        public static final FqNameUnsafe kPropertyFqName;

        @NotNull
        public static final FqNameUnsafe kType;

        @NotNull
        public static final FqName list;

        @NotNull
        public static final FqName listIterator;

        @NotNull
        public static final FqNameUnsafe longRange;

        @NotNull
        public static final FqName map;

        @NotNull
        public static final FqName mapEntry;

        @NotNull
        public static final FqName mustBeDocumented;

        @NotNull
        public static final FqName mutableCollection;

        @NotNull
        public static final FqName mutableIterable;

        @NotNull
        public static final FqName mutableIterator;

        @NotNull
        public static final FqName mutableList;

        @NotNull
        public static final FqName mutableListIterator;

        @NotNull
        public static final FqName mutableMap;

        @NotNull
        public static final FqName mutableMapEntry;

        @NotNull
        public static final FqName mutableSet;

        @NotNull
        public static final FqName parameterName;

        @NotNull
        public static final ClassId parameterNameClassId;

        @NotNull
        public static final FqName platformDependent;

        @NotNull
        public static final ClassId platformDependentClassId;

        @NotNull
        public static final Set<Name> primitiveArrayTypeShortNames;

        @NotNull
        public static final Set<Name> primitiveTypeShortNames;

        @NotNull
        public static final FqName publishedApi;

        @NotNull
        public static final FqName repeatable;

        @NotNull
        public static final ClassId repeatableClassId;

        @NotNull
        public static final FqName replaceWith;

        @NotNull
        public static final FqName retention;

        @NotNull
        public static final ClassId retentionClassId;

        @NotNull
        public static final FqName set;

        @NotNull
        public static final FqName target;

        @NotNull
        public static final ClassId targetClassId;

        @NotNull
        public static final ClassId uByte;

        @NotNull
        public static final FqName uByteArrayFqName;

        @NotNull
        public static final FqName uByteFqName;

        @NotNull
        public static final ClassId uInt;

        @NotNull
        public static final FqName uIntArrayFqName;

        @NotNull
        public static final FqName uIntFqName;

        @NotNull
        public static final ClassId uLong;

        @NotNull
        public static final FqName uLongArrayFqName;

        @NotNull
        public static final FqName uLongFqName;

        @NotNull
        public static final ClassId uShort;

        @NotNull
        public static final FqName uShortArrayFqName;

        @NotNull
        public static final FqName uShortFqName;

        @NotNull
        public static final FqName unsafeVariance;

        @NotNull
        public static final FqNames INSTANCE = new FqNames();

        @NotNull
        public static final FqNameUnsafe any = e("Any");

        @NotNull
        public static final FqNameUnsafe nothing = e("Nothing");

        @NotNull
        public static final FqNameUnsafe cloneable = e("Cloneable");

        @NotNull
        public static final FqName suppress = d("Suppress");

        @NotNull
        public static final FqNameUnsafe unit = e("Unit");

        @NotNull
        public static final FqNameUnsafe charSequence = e("CharSequence");

        @NotNull
        public static final FqNameUnsafe string = e("String");

        @NotNull
        public static final FqNameUnsafe array = e("Array");

        @NotNull
        public static final FqNameUnsafe _boolean = e("Boolean");

        @NotNull
        public static final FqNameUnsafe _char = e("Char");

        @NotNull
        public static final FqNameUnsafe _byte = e("Byte");

        @NotNull
        public static final FqNameUnsafe _short = e("Short");

        @NotNull
        public static final FqNameUnsafe _int = e("Int");

        @NotNull
        public static final FqNameUnsafe _long = e("Long");

        @NotNull
        public static final FqNameUnsafe _float = e("Float");

        @NotNull
        public static final FqNameUnsafe _double = e("Double");

        @NotNull
        public static final FqNameUnsafe number = e("Number");

        @NotNull
        public static final FqNameUnsafe _enum = e("Enum");

        @NotNull
        public static final FqNameUnsafe functionSupertype = e("Function");

        @NotNull
        public static final FqName throwable = d("Throwable");

        @NotNull
        public static final FqName comparable = d("Comparable");

        static {
            FqName fqName = StandardNames.RANGES_PACKAGE_FQ_NAME;
            Name nameIdentifier = Name.identifier("IntRange");
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            intRange = fqName.child(nameIdentifier).toUnsafe();
            Name nameIdentifier2 = Name.identifier("LongRange");
            Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
            longRange = fqName.child(nameIdentifier2).toUnsafe();
            deprecated = d("Deprecated");
            deprecatedSinceKotlin = d("DeprecatedSinceKotlin");
            deprecationLevel = d("DeprecationLevel");
            replaceWith = d("ReplaceWith");
            extensionFunctionType = d("ExtensionFunctionType");
            contextFunctionTypeParams = d("ContextFunctionTypeParams");
            FqName fqNameD = d("ParameterName");
            parameterName = fqNameD;
            ClassId.Companion companion = ClassId.Companion;
            parameterNameClassId = companion.topLevel(fqNameD);
            annotation = d("Annotation");
            FqName fqNameA = a("Target");
            target = fqNameA;
            targetClassId = companion.topLevel(fqNameA);
            annotationTarget = a("AnnotationTarget");
            annotationRetention = a("AnnotationRetention");
            FqName fqNameA2 = a("Retention");
            retention = fqNameA2;
            retentionClassId = companion.topLevel(fqNameA2);
            FqName fqNameA3 = a("Repeatable");
            repeatable = fqNameA3;
            repeatableClassId = companion.topLevel(fqNameA3);
            mustBeDocumented = a("MustBeDocumented");
            unsafeVariance = d("UnsafeVariance");
            publishedApi = d("PublishedApi");
            accessibleLateinitPropertyLiteral = d.y("AccessibleLateinitPropertyLiteral", "identifier(...)", StandardNames.KOTLIN_INTERNAL_FQ_NAME);
            FqName fqName2 = new FqName("kotlin.internal.PlatformDependent");
            platformDependent = fqName2;
            platformDependentClassId = companion.topLevel(fqName2);
            iterator = b("Iterator");
            iterable = b("Iterable");
            collection = b("Collection");
            list = b("List");
            listIterator = b("ListIterator");
            set = b("Set");
            FqName fqNameB = b("Map");
            map = fqNameB;
            mapEntry = d.y("Entry", "identifier(...)", fqNameB);
            mutableIterator = b("MutableIterator");
            mutableIterable = b("MutableIterable");
            mutableCollection = b("MutableCollection");
            mutableList = b("MutableList");
            mutableListIterator = b("MutableListIterator");
            mutableSet = b("MutableSet");
            FqName fqNameB2 = b("MutableMap");
            mutableMap = fqNameB2;
            mutableMapEntry = d.y("MutableEntry", "identifier(...)", fqNameB2);
            kClass = reflect("KClass");
            kType = reflect("KType");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe fqNameUnsafeReflect = reflect("KProperty");
            kPropertyFqName = fqNameUnsafeReflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            kProperty = companion.topLevel(fqNameUnsafeReflect.toSafe());
            kDeclarationContainer = reflect("KDeclarationContainer");
            findAssociatedObject = reflect("findAssociatedObject");
            FqName fqNameD2 = d("UByte");
            uByteFqName = fqNameD2;
            FqName fqNameD3 = d("UShort");
            uShortFqName = fqNameD3;
            FqName fqNameD4 = d("UInt");
            uIntFqName = fqNameD4;
            FqName fqNameD5 = d("ULong");
            uLongFqName = fqNameD5;
            uByte = companion.topLevel(fqNameD2);
            uShort = companion.topLevel(fqNameD3);
            uInt = companion.topLevel(fqNameD4);
            uLong = companion.topLevel(fqNameD5);
            uByteArrayFqName = d("UByteArray");
            uShortArrayFqName = d("UShortArray");
            uIntArrayFqName = d("UIntArray");
            uLongArrayFqName = d("ULongArray");
            atomicInt = c("AtomicInt");
            atomicLong = c("AtomicLong");
            atomicBoolean = c("AtomicBoolean");
            atomicReference = c("AtomicReference");
            atomicIntArray = c("AtomicIntArray");
            atomicLongArray = c("AtomicLongArray");
            atomicArray = c("AtomicArray");
            HashSet hashSetNewHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = hashSetNewHashSetWithExpectedSize;
            HashSet hashSetNewHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType2 : PrimitiveType.values()) {
                hashSetNewHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = hashSetNewHashSetWithExpectedSize2;
            HashMap mapNewHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType3 : PrimitiveType.values()) {
                FqNames fqNames = INSTANCE;
                String strAsString = primitiveType3.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                fqNames.getClass();
                mapNewHashMapWithExpectedSize.put(e(strAsString), primitiveType3);
            }
            fqNameToPrimitiveType = mapNewHashMapWithExpectedSize;
            HashMap mapNewHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            for (PrimitiveType primitiveType4 : PrimitiveType.values()) {
                FqNames fqNames2 = INSTANCE;
                String strAsString2 = primitiveType4.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
                fqNames2.getClass();
                mapNewHashMapWithExpectedSize2.put(e(strAsString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = mapNewHashMapWithExpectedSize2;
        }

        public static FqName a(String str) {
            return d.y(str, "identifier(...)", StandardNames.ANNOTATION_PACKAGE_FQ_NAME);
        }

        public static FqName b(String str) {
            return d.y(str, "identifier(...)", StandardNames.COLLECTIONS_PACKAGE_FQ_NAME);
        }

        public static FqName c(String str) {
            return d.y(str, "identifier(...)", StandardNames.CONCURRENT_ATOMICS_PACKAGE_FQ_NAME);
        }

        public static FqName d(String str) {
            return d.y(str, "identifier(...)", StandardNames.BUILT_INS_PACKAGE_FQ_NAME);
        }

        public static FqNameUnsafe e(String str) {
            return d(str).toUnsafe();
        }

        @NotNull
        public static final FqNameUnsafe reflect(@NotNull String simpleName) {
            Intrinsics.checkNotNullParameter(simpleName, "simpleName");
            FqName fqName = StandardNames.KOTLIN_REFLECT_FQ_NAME;
            Name nameIdentifier = Name.identifier(simpleName);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return fqName.child(nameIdentifier).toUnsafe();
        }
    }

    static {
        Name nameIdentifier = Name.identifier("field");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        BACKING_FIELD = nameIdentifier;
        Name nameIdentifier2 = Name.identifier("value");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        DEFAULT_VALUE_PARAMETER = nameIdentifier2;
        Name nameIdentifier3 = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier3, "identifier(...)");
        ENUM_VALUES = nameIdentifier3;
        Name nameIdentifier4 = Name.identifier("entries");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier4, "identifier(...)");
        ENUM_ENTRIES = nameIdentifier4;
        Name nameIdentifier5 = Name.identifier("valueOf");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier5, "identifier(...)");
        ENUM_VALUE_OF = nameIdentifier5;
        Name nameIdentifier6 = Name.identifier("copy");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier6, "identifier(...)");
        DATA_CLASS_COPY = nameIdentifier6;
        DATA_CLASS_COMPONENT_PREFIX = "component";
        Name nameIdentifier7 = Name.identifier("hashCode");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier7, "identifier(...)");
        HASHCODE_NAME = nameIdentifier7;
        Name nameIdentifier8 = Name.identifier("toString");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier8, "identifier(...)");
        TO_STRING_NAME = nameIdentifier8;
        Name nameIdentifier9 = Name.identifier("equals");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier9, "identifier(...)");
        EQUALS_NAME = nameIdentifier9;
        Name nameIdentifier10 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier10, "identifier(...)");
        CHAR_CODE = nameIdentifier10;
        Name nameIdentifier11 = Name.identifier("name");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier11, "identifier(...)");
        NAME = nameIdentifier11;
        Name nameIdentifier12 = Name.identifier("main");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier12, "identifier(...)");
        MAIN = nameIdentifier12;
        Name nameIdentifier13 = Name.identifier("nextChar");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier13, "identifier(...)");
        NEXT_CHAR = nameIdentifier13;
        Name nameIdentifier14 = Name.identifier("it");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier14, "identifier(...)");
        IMPLICIT_LAMBDA_PARAMETER_NAME = nameIdentifier14;
        Name nameIdentifier15 = Name.identifier("count");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier15, "identifier(...)");
        CONTEXT_FUNCTION_TYPE_PARAMETER_COUNT_NAME = nameIdentifier15;
        DYNAMIC_FQ_NAME = new FqName("<dynamic>");
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        Name nameIdentifier16 = Name.identifier("COROUTINE_SUSPENDED");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier16, "identifier(...)");
        COROUTINE_SUSPENDED_NAME = nameIdentifier16;
        CONTINUATION_INTERFACE_FQ_NAME = d.y("Continuation", "identifier(...)", fqName);
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = v.k("KProperty", "KMutableProperty", "KFunction", "KSuspendFunction");
        Name nameIdentifier17 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(nameIdentifier17, "identifier(...)");
        BUILT_INS_PACKAGE_NAME = nameIdentifier17;
        FqName fqName3 = FqName.Companion.topLevel(nameIdentifier17);
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName fqNameY = d.y("annotation", "identifier(...)", fqName3);
        ANNOTATION_PACKAGE_FQ_NAME = fqNameY;
        FqName fqNameY2 = d.y("collections", "identifier(...)", fqName3);
        COLLECTIONS_PACKAGE_FQ_NAME = fqNameY2;
        FqName fqNameY3 = d.y("ranges", "identifier(...)", fqName3);
        RANGES_PACKAGE_FQ_NAME = fqNameY3;
        TEXT_PACKAGE_FQ_NAME = d.y("text", "identifier(...)", fqName3);
        FqName fqNameY4 = d.y("internal", "identifier(...)", fqName3);
        KOTLIN_INTERNAL_FQ_NAME = fqNameY4;
        FqName fqNameY5 = d.y("concurrent", "identifier(...)", fqName3);
        CONCURRENT_PACKAGE_FQ_NAME = fqNameY5;
        FqName fqNameY6 = d.y("atomics", "identifier(...)", fqNameY5);
        CONCURRENT_ATOMICS_PACKAGE_FQ_NAME = fqNameY6;
        new FqName("error.NonExistentClass");
        FqName[] elements = {fqName3, fqNameY2, fqNameY3, fqNameY, fqName2, fqNameY4, fqName, fqNameY6};
        Intrinsics.checkNotNullParameter(elements, "elements");
        BUILT_INS_PACKAGE_FQ_NAMES = kotlin.collections.d.y0(elements);
    }

    @NotNull
    public static final ClassId getFunctionClassId(int i) {
        FqName fqName = BUILT_INS_PACKAGE_FQ_NAME;
        Name nameIdentifier = Name.identifier(getFunctionName(i));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        return new ClassId(fqName, nameIdentifier);
    }

    @NotNull
    public static final String getFunctionName(int i) {
        return d.n("Function", i);
    }

    @NotNull
    public static final FqName getPrimitiveFqName(@NotNull PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        return BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
    }

    @NotNull
    public static final String getSuspendFunctionName(int i) {
        return FunctionTypeKind.SuspendFunction.INSTANCE.getClassNamePrefix() + i;
    }

    public static final boolean isPrimitiveArray(@NotNull FqNameUnsafe arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null;
    }
}

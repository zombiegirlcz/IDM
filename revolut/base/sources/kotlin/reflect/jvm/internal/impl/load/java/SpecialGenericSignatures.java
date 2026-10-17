package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.a1;
import zhm.d0;
import zhm.q0;
import zhm.r0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public class SpecialGenericSignatures {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f186904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f186905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f186906c;
    public static final LinkedHashMap d;
    public static final Set e;
    public static final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Companion.NameAndSignature f186907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f186908h;
    public static final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f186909j;
    public static final LinkedHashMap k;

    public static final class Companion {

        public static final class NameAndSignature {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f186910a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Name f186911b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final String f186912c;
            public final String d;
            public final String e;

            public NameAndSignature(@NotNull String classInternalName, @NotNull Name name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                this.f186910a = classInternalName;
                this.f186911b = name;
                this.f186912c = parameters;
                this.d = returnType;
                this.e = SignatureBuildingComponents.INSTANCE.signature(classInternalName, name + CoreConstants.LEFT_PARENTHESIS_CHAR + parameters + CoreConstants.RIGHT_PARENTHESIS_CHAR + returnType);
            }

            public static /* synthetic */ NameAndSignature copy$default(NameAndSignature nameAndSignature, String str, Name name, String str2, String str3, int i, Object obj2) {
                if ((i & 1) != 0) {
                    str = nameAndSignature.f186910a;
                }
                if ((i & 2) != 0) {
                    name = nameAndSignature.f186911b;
                }
                if ((i & 4) != 0) {
                    str2 = nameAndSignature.f186912c;
                }
                if ((i & 8) != 0) {
                    str3 = nameAndSignature.d;
                }
                return nameAndSignature.copy(str, name, str2, str3);
            }

            @NotNull
            public final NameAndSignature copy(@NotNull String classInternalName, @NotNull Name name, @NotNull String parameters, @NotNull String returnType) {
                Intrinsics.checkNotNullParameter(classInternalName, "classInternalName");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(parameters, "parameters");
                Intrinsics.checkNotNullParameter(returnType, "returnType");
                return new NameAndSignature(classInternalName, name, parameters, returnType);
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof NameAndSignature)) {
                    return false;
                }
                NameAndSignature nameAndSignature = (NameAndSignature) obj2;
                return Intrinsics.f(this.f186910a, nameAndSignature.f186910a) && Intrinsics.f(this.f186911b, nameAndSignature.f186911b) && Intrinsics.f(this.f186912c, nameAndSignature.f186912c) && Intrinsics.f(this.d, nameAndSignature.d);
            }

            @NotNull
            public final Name getName() {
                return this.f186911b;
            }

            @NotNull
            public final String getSignature() {
                return this.e;
            }

            public int hashCode() {
                return this.d.hashCode() + p.a.c((this.f186911b.hashCode() + (this.f186910a.hashCode() * 31)) * 31, 31, this.f186912c);
            }

            @NotNull
            public String toString() {
                StringBuilder sb6 = new StringBuilder("NameAndSignature(classInternalName=");
                sb6.append(this.f186910a);
                sb6.append(", name=");
                sb6.append(this.f186911b);
                sb6.append(", parameters=");
                sb6.append(this.f186912c);
                sb6.append(", returnType=");
                return j6.a.u(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final NameAndSignature access$method(Companion companion, String str, String str2, String str3, String str4) {
            companion.getClass();
            Name nameIdentifier = Name.identifier(str2);
            Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
            return new NameAndSignature(str, nameIdentifier, str3, str4);
        }

        public final Name getBuiltinFunctionNamesByJvmName(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP().get(name);
        }

        @NotNull
        public final List<String> getERASED_COLLECTION_PARAMETER_SIGNATURES() {
            return SpecialGenericSignatures.f186905b;
        }

        @NotNull
        public final Set<Name> getERASED_VALUE_PARAMETERS_SHORT_NAMES() {
            return SpecialGenericSignatures.e;
        }

        @NotNull
        public final Set<String> getERASED_VALUE_PARAMETERS_SIGNATURES() {
            return SpecialGenericSignatures.f;
        }

        @NotNull
        public final Map<Name, Name> getJVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP() {
            return SpecialGenericSignatures.k;
        }

        @NotNull
        public final Set<Name> getORIGINAL_SHORT_NAMES() {
            return SpecialGenericSignatures.f186909j;
        }

        @NotNull
        public final NameAndSignature getREMOVE_AT_NAME_AND_SIGNATURE() {
            return SpecialGenericSignatures.f186907g;
        }

        @NotNull
        public final Map<String, TypeSafeBarrierDescription> getSIGNATURE_TO_DEFAULT_VALUES_MAP() {
            return SpecialGenericSignatures.d;
        }

        @NotNull
        public final Map<String, Name> getSIGNATURE_TO_JVM_REPRESENTATION_NAME() {
            return SpecialGenericSignatures.i;
        }

        public final boolean getSameAsRenamedInJvmBuiltin(@NotNull Name name) {
            Intrinsics.checkNotNullParameter(name, "<this>");
            return getORIGINAL_SHORT_NAMES().contains(name);
        }

        @NotNull
        public final SpecialSignatureInfo getSpecialSignatureInfo(@NotNull String builtinSignature) {
            Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
            return getERASED_COLLECTION_PARAMETER_SIGNATURES().contains(builtinSignature) ? SpecialSignatureInfo.ONE_COLLECTION_PARAMETER : ((TypeSafeBarrierDescription) r0.h(builtinSignature, getSIGNATURE_TO_DEFAULT_VALUES_MAP())) == TypeSafeBarrierDescription.NULL ? SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SpecialSignatureInfo {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SpecialSignatureInfo[] $VALUES;
        public static final SpecialSignatureInfo OBJECT_PARAMETER_GENERIC;
        public static final SpecialSignatureInfo OBJECT_PARAMETER_NON_GENERIC;
        public static final SpecialSignatureInfo ONE_COLLECTION_PARAMETER;
        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        static {
            SpecialSignatureInfo specialSignatureInfo = new SpecialSignatureInfo(0, "ONE_COLLECTION_PARAMETER", false, "Ljava/util/Collection<+Ljava/lang/Object;>;");
            ONE_COLLECTION_PARAMETER = specialSignatureInfo;
            SpecialSignatureInfo specialSignatureInfo2 = new SpecialSignatureInfo(1, "OBJECT_PARAMETER_NON_GENERIC", true, null);
            OBJECT_PARAMETER_NON_GENERIC = specialSignatureInfo2;
            SpecialSignatureInfo specialSignatureInfo3 = new SpecialSignatureInfo(2, "OBJECT_PARAMETER_GENERIC", true, "Ljava/lang/Object;");
            OBJECT_PARAMETER_GENERIC = specialSignatureInfo3;
            SpecialSignatureInfo[] specialSignatureInfoArr = {specialSignatureInfo, specialSignatureInfo2, specialSignatureInfo3};
            $VALUES = specialSignatureInfoArr;
            $ENTRIES = s.n(specialSignatureInfoArr);
        }

        public SpecialSignatureInfo(int i, String str, boolean z, String str2) {
            this.valueParametersSignature = str2;
            this.isObjectReplacedWithTypeParameter = z;
        }

        public static SpecialSignatureInfo valueOf(String str) {
            return (SpecialSignatureInfo) Enum.valueOf(SpecialSignatureInfo.class, str);
        }

        public static SpecialSignatureInfo[] values() {
            return (SpecialSignatureInfo[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TypeSafeBarrierDescription {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TypeSafeBarrierDescription[] $VALUES;
        public static final TypeSafeBarrierDescription FALSE;
        public static final TypeSafeBarrierDescription INDEX;
        public static final TypeSafeBarrierDescription MAP_GET_OR_DEFAULT;
        public static final TypeSafeBarrierDescription NULL;
        private final Object defaultValue;

        static {
            DefaultConstructorMarker defaultConstructorMarker = null;
            TypeSafeBarrierDescription typeSafeBarrierDescription = new TypeSafeBarrierDescription("NULL", 0, null);
            NULL = typeSafeBarrierDescription;
            TypeSafeBarrierDescription typeSafeBarrierDescription2 = new TypeSafeBarrierDescription("INDEX", 1, -1);
            INDEX = typeSafeBarrierDescription2;
            TypeSafeBarrierDescription typeSafeBarrierDescription3 = new TypeSafeBarrierDescription("FALSE", 2, Boolean.FALSE);
            FALSE = typeSafeBarrierDescription3;
            a aVar = new a("MAP_GET_OR_DEFAULT", 3, defaultConstructorMarker, defaultConstructorMarker);
            MAP_GET_OR_DEFAULT = aVar;
            TypeSafeBarrierDescription[] typeSafeBarrierDescriptionArr = {typeSafeBarrierDescription, typeSafeBarrierDescription2, typeSafeBarrierDescription3, aVar};
            $VALUES = typeSafeBarrierDescriptionArr;
            $ENTRIES = s.n(typeSafeBarrierDescriptionArr);
        }

        public /* synthetic */ TypeSafeBarrierDescription(String str, int i, Object obj2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, obj2);
        }

        public static TypeSafeBarrierDescription valueOf(String str) {
            return (TypeSafeBarrierDescription) Enum.valueOf(TypeSafeBarrierDescription.class, str);
        }

        public static TypeSafeBarrierDescription[] values() {
            return (TypeSafeBarrierDescription[]) $VALUES.clone();
        }

        public TypeSafeBarrierDescription(String str, int i, Object obj2) {
            this.defaultValue = obj2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, java.util.Map] */
    static {
        String[] elements = {"containsAll", "removeAll", "retainAll"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<String> setY0 = d.y0(elements);
        ArrayList arrayList = new ArrayList(w.t(setY0, 10));
        for (String str : setY0) {
            Companion companion = Companion;
            String desc = JvmPrimitiveType.BOOLEAN.getDesc();
            Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
            arrayList.add(Companion.access$method(companion, "java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        f186904a = arrayList;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((Companion.NameAndSignature) it8.next()).getSignature());
        }
        f186905b = arrayList2;
        ArrayList arrayList3 = f186904a;
        ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            arrayList4.add(((Companion.NameAndSignature) it9.next()).getName().asString());
        }
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.INSTANCE;
        Companion companion2 = Companion;
        String strJavaUtil = signatureBuildingComponents.javaUtil("Collection");
        JvmPrimitiveType jvmPrimitiveType = JvmPrimitiveType.BOOLEAN;
        String desc2 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc2, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method = Companion.access$method(companion2, strJavaUtil, "contains", "Ljava/lang/Object;", desc2);
        TypeSafeBarrierDescription typeSafeBarrierDescription = TypeSafeBarrierDescription.FALSE;
        Pair pair = new Pair(nameAndSignatureAccess$method, typeSafeBarrierDescription);
        String strJavaUtil2 = signatureBuildingComponents.javaUtil("Collection");
        String desc3 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc3, "getDesc(...)");
        Pair pair2 = new Pair(Companion.access$method(companion2, strJavaUtil2, "remove", "Ljava/lang/Object;", desc3), typeSafeBarrierDescription);
        String strJavaUtil3 = signatureBuildingComponents.javaUtil("Map");
        String desc4 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc4, "getDesc(...)");
        Pair pair3 = new Pair(Companion.access$method(companion2, strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), typeSafeBarrierDescription);
        String strJavaUtil4 = signatureBuildingComponents.javaUtil("Map");
        String desc5 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc5, "getDesc(...)");
        Pair pair4 = new Pair(Companion.access$method(companion2, strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), typeSafeBarrierDescription);
        String strJavaUtil5 = signatureBuildingComponents.javaUtil("Map");
        String desc6 = jvmPrimitiveType.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc6, "getDesc(...)");
        Pair pair5 = new Pair(Companion.access$method(companion2, strJavaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), typeSafeBarrierDescription);
        Pair pair6 = new Pair(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), TypeSafeBarrierDescription.MAP_GET_OR_DEFAULT);
        Companion.NameAndSignature nameAndSignatureAccess$method2 = Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        TypeSafeBarrierDescription typeSafeBarrierDescription2 = TypeSafeBarrierDescription.NULL;
        Pair pair7 = new Pair(nameAndSignatureAccess$method2, typeSafeBarrierDescription2);
        Pair pair8 = new Pair(Companion.access$method(companion2, signatureBuildingComponents.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), typeSafeBarrierDescription2);
        String strJavaUtil6 = signatureBuildingComponents.javaUtil("List");
        JvmPrimitiveType jvmPrimitiveType2 = JvmPrimitiveType.INT;
        String desc7 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc7, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method3 = Companion.access$method(companion2, strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7);
        TypeSafeBarrierDescription typeSafeBarrierDescription3 = TypeSafeBarrierDescription.INDEX;
        Pair pair9 = new Pair(nameAndSignatureAccess$method3, typeSafeBarrierDescription3);
        String strJavaUtil7 = signatureBuildingComponents.javaUtil("List");
        String desc8 = jvmPrimitiveType2.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc8, "getDesc(...)");
        Map mapK = r0.k(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(Companion.access$method(companion2, strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), typeSafeBarrierDescription3));
        f186906c = mapK;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(mapK.size()));
        for (Map.Entry entry : mapK.entrySet()) {
            linkedHashMap.put(((Companion.NameAndSignature) entry.getKey()).getSignature(), entry.getValue());
        }
        d = linkedHashMap;
        LinkedHashSet linkedHashSetL = a1.l(f186906c.keySet(), f186904a);
        ArrayList arrayList5 = new ArrayList(w.t(linkedHashSetL, 10));
        Iterator it10 = linkedHashSetL.iterator();
        while (it10.hasNext()) {
            arrayList5.add(((Companion.NameAndSignature) it10.next()).getName());
        }
        e = d0.i1(arrayList5);
        ArrayList arrayList6 = new ArrayList(w.t(linkedHashSetL, 10));
        Iterator it11 = linkedHashSetL.iterator();
        while (it11.hasNext()) {
            arrayList6.add(((Companion.NameAndSignature) it11.next()).getSignature());
        }
        f = d0.i1(arrayList6);
        Companion companion3 = Companion;
        JvmPrimitiveType jvmPrimitiveType3 = JvmPrimitiveType.INT;
        String desc9 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc9, "getDesc(...)");
        Companion.NameAndSignature nameAndSignatureAccess$method4 = Companion.access$method(companion3, "java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        f186907g = nameAndSignatureAccess$method4;
        SignatureBuildingComponents signatureBuildingComponents2 = SignatureBuildingComponents.INSTANCE;
        String strJavaLang = signatureBuildingComponents2.javaLang("Number");
        String desc10 = JvmPrimitiveType.BYTE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc10, "getDesc(...)");
        Pair pair10 = new Pair(Companion.access$method(companion3, strJavaLang, "toByte", "", desc10), Name.identifier("byteValue"));
        String strJavaLang2 = signatureBuildingComponents2.javaLang("Number");
        String desc11 = JvmPrimitiveType.SHORT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc11, "getDesc(...)");
        Pair pair11 = new Pair(Companion.access$method(companion3, strJavaLang2, "toShort", "", desc11), Name.identifier("shortValue"));
        String strJavaLang3 = signatureBuildingComponents2.javaLang("Number");
        String desc12 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc12, "getDesc(...)");
        Pair pair12 = new Pair(Companion.access$method(companion3, strJavaLang3, "toInt", "", desc12), Name.identifier("intValue"));
        String strJavaLang4 = signatureBuildingComponents2.javaLang("Number");
        String desc13 = JvmPrimitiveType.LONG.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc13, "getDesc(...)");
        Pair pair13 = new Pair(Companion.access$method(companion3, strJavaLang4, "toLong", "", desc13), Name.identifier("longValue"));
        String strJavaLang5 = signatureBuildingComponents2.javaLang("Number");
        String desc14 = JvmPrimitiveType.FLOAT.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc14, "getDesc(...)");
        Pair pair14 = new Pair(Companion.access$method(companion3, strJavaLang5, "toFloat", "", desc14), Name.identifier("floatValue"));
        String strJavaLang6 = signatureBuildingComponents2.javaLang("Number");
        String desc15 = JvmPrimitiveType.DOUBLE.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc15, "getDesc(...)");
        Pair pair15 = new Pair(Companion.access$method(companion3, strJavaLang6, "toDouble", "", desc15), Name.identifier("doubleValue"));
        Pair pair16 = new Pair(nameAndSignatureAccess$method4, Name.identifier("remove"));
        String strJavaLang7 = signatureBuildingComponents2.javaLang("CharSequence");
        String desc16 = jvmPrimitiveType3.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc16, "getDesc(...)");
        String desc17 = JvmPrimitiveType.CHAR.getDesc();
        Intrinsics.checkNotNullExpressionValue(desc17, "getDesc(...)");
        Map mapK2 = r0.k(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(Companion.access$method(companion3, strJavaLang7, "get", desc16, desc17), Name.identifier("charAt")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "load", "", "I"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "store", "I", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "exchange", "I", "I"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "fetchAndAdd", "I", "I"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicInteger"), "addAndFetch", "I", "I"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "load", "", "J"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "store", "J", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "exchange", "J", "J"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "fetchAndAdd", "J", "J"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLong"), "addAndFetch", "J", "J"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "load", "", "Z"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "store", "Z", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicBoolean"), "exchange", "Z", "Z"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "load", "", "Ljava/lang/Object;"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "store", "Ljava/lang/Object;", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "loadAt", "I", "I"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "storeAt", "II", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "exchangeAt", "II", "I"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), Name.identifier("compareAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "loadAt", "I", "J"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "storeAt", "IJ", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "exchangeAt", "IJ", "J"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), Name.identifier("compareAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), Name.identifier("getAndAdd")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), Name.identifier("addAndGet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), Name.identifier("get")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), Name.identifier("set")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), Name.identifier("getAndSet")), new Pair(Companion.access$method(companion3, signatureBuildingComponents2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), Name.identifier("compareAndSet")));
        f186908h = mapK2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(mapK2.size()));
        for (Map.Entry entry2 : mapK2.entrySet()) {
            linkedHashMap2.put(((Companion.NameAndSignature) entry2.getKey()).getSignature(), entry2.getValue());
        }
        i = linkedHashMap2;
        ?? r06 = f186908h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r06.entrySet()) {
            linkedHashSet.add(Companion.NameAndSignature.copy$default((Companion.NameAndSignature) entry3.getKey(), null, (Name) entry3.getValue(), null, null, 13, null).getSignature());
        }
        Set setKeySet = f186908h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it12 = setKeySet.iterator();
        while (it12.hasNext()) {
            hashSet.add(((Companion.NameAndSignature) it12.next()).getName());
        }
        f186909j = hashSet;
        Set<Map.Entry> setEntrySet = f186908h.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(w.t(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((Companion.NameAndSignature) entry4.getKey()).getName(), entry4.getValue()));
        }
        int iB = q0.b(w.t(arrayList7, 10));
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((Name) pair17.f186386b, (Name) pair17.f186385a);
        }
        k = linkedHashMap3;
    }
}

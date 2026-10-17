package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.d0;
import zhm.r0;
import zhm.u;
import zhm.v;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class KotlinTarget {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ KotlinTarget[] $VALUES;

    @NotNull
    private static final Set<KotlinTarget> ALL_TARGET_SET;
    public static final KotlinTarget ANNOTATION_CLASS;

    @NotNull
    private static final List<KotlinTarget> ANNOTATION_CLASS_LIST;
    public static final KotlinTarget ANONYMOUS_FUNCTION;
    public static final KotlinTarget BACKING_FIELD;
    public static final KotlinTarget CLASS;

    @NotNull
    private static final List<KotlinTarget> CLASS_LIST;
    public static final KotlinTarget CLASS_ONLY;
    public static final KotlinTarget COMPANION_OBJECT;

    @NotNull
    private static final List<KotlinTarget> COMPANION_OBJECT_LIST;
    public static final KotlinTarget CONSTRUCTOR;

    @NotNull
    public static final Companion Companion;

    @NotNull
    private static final Set<KotlinTarget> DEFAULT_TARGET_SET;
    public static final KotlinTarget DESTRUCTURING_DECLARATION;
    public static final KotlinTarget ENUM_CLASS;
    public static final KotlinTarget ENUM_ENTRY;

    @NotNull
    private static final List<KotlinTarget> ENUM_ENTRY_LIST;

    @NotNull
    private static final List<KotlinTarget> ENUM_LIST;
    public static final KotlinTarget EXPRESSION;
    public static final KotlinTarget FIELD;
    public static final KotlinTarget FILE;

    @NotNull
    private static final List<KotlinTarget> FILE_LIST;
    public static final KotlinTarget FUNCTION;

    @NotNull
    private static final List<KotlinTarget> FUNCTION_LIST;
    public static final KotlinTarget INITIALIZER;
    public static final KotlinTarget INTERFACE;

    @NotNull
    private static final List<KotlinTarget> INTERFACE_LIST;
    public static final KotlinTarget LAMBDA_EXPRESSION;
    public static final KotlinTarget LOCAL_CLASS;

    @NotNull
    private static final List<KotlinTarget> LOCAL_CLASS_LIST;
    public static final KotlinTarget LOCAL_FUNCTION;
    public static final KotlinTarget LOCAL_VARIABLE;
    public static final KotlinTarget MEMBER_FUNCTION;
    public static final KotlinTarget MEMBER_PROPERTY;
    public static final KotlinTarget MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final KotlinTarget MEMBER_PROPERTY_WITH_BACKING_FIELD;
    public static final KotlinTarget MEMBER_PROPERTY_WITH_DELEGATE;
    public static final KotlinTarget OBJECT;

    @NotNull
    private static final List<KotlinTarget> OBJECT_LIST;
    public static final KotlinTarget OBJECT_LITERAL;
    public static final KotlinTarget PROPERTY;
    public static final KotlinTarget PROPERTY_GETTER;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_GETTER_LIST;
    public static final KotlinTarget PROPERTY_PARAMETER;
    public static final KotlinTarget PROPERTY_SETTER;

    @NotNull
    private static final List<KotlinTarget> PROPERTY_SETTER_LIST;
    public static final KotlinTarget STANDALONE_OBJECT;
    public static final KotlinTarget STAR_PROJECTION;
    public static final KotlinTarget TOP_LEVEL_FUNCTION;
    public static final KotlinTarget TOP_LEVEL_PROPERTY;
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE;
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD;
    public static final KotlinTarget TOP_LEVEL_PROPERTY_WITH_DELEGATE;
    public static final KotlinTarget TYPE;
    public static final KotlinTarget TYPEALIAS;
    public static final KotlinTarget TYPE_PARAMETER;
    public static final KotlinTarget TYPE_PROJECTION;

    @NotNull
    private static final Map<AnnotationUseSiteTarget, KotlinTarget> USE_SITE_MAPPING;
    public static final KotlinTarget VALUE_PARAMETER;

    @NotNull
    private static final HashMap<String, KotlinTarget> map;

    @NotNull
    private final String description;
    private final boolean isDefault;

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget$Companion] */
    static {
        KotlinTarget kotlinTarget = new KotlinTarget(0, "CLASS", true, "class");
        CLASS = kotlinTarget;
        KotlinTarget kotlinTarget2 = new KotlinTarget(1, "ANNOTATION_CLASS", true, "annotation class");
        ANNOTATION_CLASS = kotlinTarget2;
        KotlinTarget kotlinTarget3 = new KotlinTarget(2, "TYPE_PARAMETER", false, "type parameter");
        TYPE_PARAMETER = kotlinTarget3;
        KotlinTarget kotlinTarget4 = new KotlinTarget(3, "PROPERTY", true, "property");
        PROPERTY = kotlinTarget4;
        KotlinTarget kotlinTarget5 = new KotlinTarget(4, "FIELD", true, "field");
        FIELD = kotlinTarget5;
        KotlinTarget kotlinTarget6 = new KotlinTarget(5, "LOCAL_VARIABLE", true, "local variable");
        LOCAL_VARIABLE = kotlinTarget6;
        KotlinTarget kotlinTarget7 = new KotlinTarget(6, "VALUE_PARAMETER", true, "value parameter");
        VALUE_PARAMETER = kotlinTarget7;
        KotlinTarget kotlinTarget8 = new KotlinTarget(7, "CONSTRUCTOR", true, "constructor");
        CONSTRUCTOR = kotlinTarget8;
        KotlinTarget kotlinTarget9 = new KotlinTarget(8, "FUNCTION", true, "function");
        FUNCTION = kotlinTarget9;
        KotlinTarget kotlinTarget10 = new KotlinTarget(9, "PROPERTY_GETTER", true, "getter");
        PROPERTY_GETTER = kotlinTarget10;
        KotlinTarget kotlinTarget11 = new KotlinTarget(10, "PROPERTY_SETTER", true, "setter");
        PROPERTY_SETTER = kotlinTarget11;
        KotlinTarget kotlinTarget12 = new KotlinTarget(11, "TYPE", false, "type usage");
        TYPE = kotlinTarget12;
        KotlinTarget kotlinTarget13 = new KotlinTarget(12, "EXPRESSION", false, "expression");
        EXPRESSION = kotlinTarget13;
        KotlinTarget kotlinTarget14 = new KotlinTarget(13, "FILE", false, "file");
        FILE = kotlinTarget14;
        KotlinTarget kotlinTarget15 = new KotlinTarget(14, "TYPEALIAS", false, "typealias");
        TYPEALIAS = kotlinTarget15;
        KotlinTarget kotlinTarget16 = new KotlinTarget(15, "TYPE_PROJECTION", false, "type projection");
        TYPE_PROJECTION = kotlinTarget16;
        KotlinTarget kotlinTarget17 = new KotlinTarget(16, "STAR_PROJECTION", false, "star projection");
        STAR_PROJECTION = kotlinTarget17;
        KotlinTarget kotlinTarget18 = new KotlinTarget(17, "PROPERTY_PARAMETER", false, "property constructor parameter");
        PROPERTY_PARAMETER = kotlinTarget18;
        KotlinTarget kotlinTarget19 = new KotlinTarget(18, "CLASS_ONLY", false, "class");
        CLASS_ONLY = kotlinTarget19;
        KotlinTarget kotlinTarget20 = new KotlinTarget(19, "OBJECT", false, "object");
        OBJECT = kotlinTarget20;
        KotlinTarget kotlinTarget21 = new KotlinTarget(20, "STANDALONE_OBJECT", false, "standalone object");
        STANDALONE_OBJECT = kotlinTarget21;
        KotlinTarget kotlinTarget22 = new KotlinTarget(21, "COMPANION_OBJECT", false, "companion object");
        COMPANION_OBJECT = kotlinTarget22;
        KotlinTarget kotlinTarget23 = new KotlinTarget(22, "INTERFACE", false, "interface");
        INTERFACE = kotlinTarget23;
        KotlinTarget kotlinTarget24 = new KotlinTarget(23, "ENUM_CLASS", false, "enum class");
        ENUM_CLASS = kotlinTarget24;
        KotlinTarget kotlinTarget25 = new KotlinTarget(24, "ENUM_ENTRY", false, "enum entry");
        ENUM_ENTRY = kotlinTarget25;
        KotlinTarget kotlinTarget26 = new KotlinTarget(25, "LOCAL_CLASS", false, "local class");
        LOCAL_CLASS = kotlinTarget26;
        KotlinTarget kotlinTarget27 = new KotlinTarget(26, "LOCAL_FUNCTION", false, "local function");
        LOCAL_FUNCTION = kotlinTarget27;
        KotlinTarget kotlinTarget28 = new KotlinTarget(27, "MEMBER_FUNCTION", false, "member function");
        MEMBER_FUNCTION = kotlinTarget28;
        KotlinTarget kotlinTarget29 = new KotlinTarget(28, "TOP_LEVEL_FUNCTION", false, "top level function");
        TOP_LEVEL_FUNCTION = kotlinTarget29;
        KotlinTarget kotlinTarget30 = new KotlinTarget(29, "MEMBER_PROPERTY", false, "member property");
        MEMBER_PROPERTY = kotlinTarget30;
        KotlinTarget kotlinTarget31 = new KotlinTarget(30, "MEMBER_PROPERTY_WITH_BACKING_FIELD", false, "member property with backing field");
        MEMBER_PROPERTY_WITH_BACKING_FIELD = kotlinTarget31;
        KotlinTarget kotlinTarget32 = new KotlinTarget(31, "MEMBER_PROPERTY_WITH_DELEGATE", false, "member property with delegate");
        MEMBER_PROPERTY_WITH_DELEGATE = kotlinTarget32;
        KotlinTarget kotlinTarget33 = new KotlinTarget(32, "MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", false, "member property without backing field or delegate");
        MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = kotlinTarget33;
        KotlinTarget kotlinTarget34 = new KotlinTarget(33, "TOP_LEVEL_PROPERTY", false, "top level property");
        TOP_LEVEL_PROPERTY = kotlinTarget34;
        KotlinTarget kotlinTarget35 = new KotlinTarget(34, "TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD", false, "top level property with backing field");
        TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD = kotlinTarget35;
        KotlinTarget kotlinTarget36 = new KotlinTarget(35, "TOP_LEVEL_PROPERTY_WITH_DELEGATE", false, "top level property with delegate");
        TOP_LEVEL_PROPERTY_WITH_DELEGATE = kotlinTarget36;
        KotlinTarget kotlinTarget37 = new KotlinTarget(36, "TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE", false, "top level property without backing field or delegate");
        TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE = kotlinTarget37;
        KotlinTarget kotlinTarget38 = new KotlinTarget(37, "BACKING_FIELD", true, "backing field");
        BACKING_FIELD = kotlinTarget38;
        KotlinTarget kotlinTarget39 = new KotlinTarget(38, "INITIALIZER", false, "initializer");
        INITIALIZER = kotlinTarget39;
        KotlinTarget kotlinTarget40 = new KotlinTarget(39, "DESTRUCTURING_DECLARATION", false, "destructuring declaration");
        DESTRUCTURING_DECLARATION = kotlinTarget40;
        KotlinTarget kotlinTarget41 = new KotlinTarget(40, "LAMBDA_EXPRESSION", false, "lambda expression");
        LAMBDA_EXPRESSION = kotlinTarget41;
        KotlinTarget kotlinTarget42 = new KotlinTarget(41, "ANONYMOUS_FUNCTION", false, "anonymous function");
        ANONYMOUS_FUNCTION = kotlinTarget42;
        KotlinTarget kotlinTarget43 = new KotlinTarget(42, "OBJECT_LITERAL", false, "object literal");
        OBJECT_LITERAL = kotlinTarget43;
        KotlinTarget[] kotlinTargetArr = {kotlinTarget, kotlinTarget2, kotlinTarget3, kotlinTarget4, kotlinTarget5, kotlinTarget6, kotlinTarget7, kotlinTarget8, kotlinTarget9, kotlinTarget10, kotlinTarget11, kotlinTarget12, kotlinTarget13, kotlinTarget14, kotlinTarget15, kotlinTarget16, kotlinTarget17, kotlinTarget18, kotlinTarget19, kotlinTarget20, kotlinTarget21, kotlinTarget22, kotlinTarget23, kotlinTarget24, kotlinTarget25, kotlinTarget26, kotlinTarget27, kotlinTarget28, kotlinTarget29, kotlinTarget30, kotlinTarget31, kotlinTarget32, kotlinTarget33, kotlinTarget34, kotlinTarget35, kotlinTarget36, kotlinTarget37, kotlinTarget38, kotlinTarget39, kotlinTarget40, kotlinTarget41, kotlinTarget42, kotlinTarget43};
        $VALUES = kotlinTargetArr;
        $ENTRIES = s.n(kotlinTargetArr);
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget.Companion
        };
        map = new HashMap<>();
        for (KotlinTarget kotlinTarget44 : getEntries()) {
            map.put(kotlinTarget44.name(), kotlinTarget44);
        }
        EnumEntries entries = getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : entries) {
            if (((KotlinTarget) obj2).isDefault) {
                arrayList.add(obj2);
            }
        }
        DEFAULT_TARGET_SET = d0.i1(arrayList);
        ALL_TARGET_SET = d0.i1(getEntries());
        KotlinTarget kotlinTarget45 = ANNOTATION_CLASS;
        KotlinTarget kotlinTarget46 = CLASS;
        ANNOTATION_CLASS_LIST = v.k(kotlinTarget45, kotlinTarget46);
        LOCAL_CLASS_LIST = v.k(LOCAL_CLASS, kotlinTarget46);
        CLASS_LIST = v.k(CLASS_ONLY, kotlinTarget46);
        KotlinTarget kotlinTarget47 = COMPANION_OBJECT;
        KotlinTarget kotlinTarget48 = OBJECT;
        COMPANION_OBJECT_LIST = v.k(kotlinTarget47, kotlinTarget48, kotlinTarget46);
        OBJECT_LIST = v.k(STANDALONE_OBJECT, kotlinTarget48, kotlinTarget46);
        INTERFACE_LIST = v.k(INTERFACE, kotlinTarget46);
        ENUM_LIST = v.k(ENUM_CLASS, kotlinTarget46);
        KotlinTarget kotlinTarget49 = ENUM_ENTRY;
        KotlinTarget kotlinTarget50 = PROPERTY;
        KotlinTarget kotlinTarget51 = FIELD;
        ENUM_ENTRY_LIST = v.k(kotlinTarget49, kotlinTarget50, kotlinTarget51);
        KotlinTarget kotlinTarget52 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = u.c(kotlinTarget52);
        KotlinTarget kotlinTarget53 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = u.c(kotlinTarget53);
        FUNCTION_LIST = u.c(FUNCTION);
        KotlinTarget kotlinTarget54 = FILE;
        FILE_LIST = u.c(kotlinTarget54);
        AnnotationUseSiteTarget annotationUseSiteTarget = AnnotationUseSiteTarget.CONSTRUCTOR_PARAMETER;
        KotlinTarget kotlinTarget55 = VALUE_PARAMETER;
        USE_SITE_MAPPING = r0.k(new Pair(annotationUseSiteTarget, kotlinTarget55), new Pair(AnnotationUseSiteTarget.FIELD, kotlinTarget51), new Pair(AnnotationUseSiteTarget.PROPERTY, kotlinTarget50), new Pair(AnnotationUseSiteTarget.FILE, kotlinTarget54), new Pair(AnnotationUseSiteTarget.PROPERTY_GETTER, kotlinTarget53), new Pair(AnnotationUseSiteTarget.PROPERTY_SETTER, kotlinTarget52), new Pair(AnnotationUseSiteTarget.RECEIVER, kotlinTarget55), new Pair(AnnotationUseSiteTarget.SETTER_PARAMETER, kotlinTarget55), new Pair(AnnotationUseSiteTarget.PROPERTY_DELEGATE_FIELD, kotlinTarget51));
    }

    public KotlinTarget(int i, String str, boolean z, String str2) {
        this.description = str2;
        this.isDefault = z;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static KotlinTarget valueOf(String str) {
        return (KotlinTarget) Enum.valueOf(KotlinTarget.class, str);
    }

    public static KotlinTarget[] values() {
        return (KotlinTarget[]) $VALUES.clone();
    }
}

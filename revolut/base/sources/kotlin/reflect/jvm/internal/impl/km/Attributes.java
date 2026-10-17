package kotlin.reflect.jvm.internal.impl.km;

import ijm.b;
import ijm.c;
import ijm.d;
import ijm.e;
import ijm.f;
import ijm.g;
import ijm.h;
import ijm.i;
import ijm.j;
import ijm.k;
import ijm.l;
import ijm.m;
import ijm.n;
import ijm.o;
import ijm.p;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.z;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.km.internal.BooleanFlagDelegate;
import kotlin.reflect.jvm.internal.impl.km.internal.EnumFlagDelegate;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagDelegatesImplKt;
import kotlin.reflect.jvm.internal.impl.km.internal.FlagImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import org.jetbrains.annotations.NotNull;
import v0.a;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class Attributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f186731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumFlagDelegate f186732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumFlagDelegate f186733c;
    public static final BooleanFlagDelegate d;
    public static final BooleanFlagDelegate e;
    public static final BooleanFlagDelegate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final BooleanFlagDelegate f186734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final BooleanFlagDelegate f186735h;
    public static final BooleanFlagDelegate i;

    static {
        z zVar = new z(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1);
        p0 p0Var = o0.f186429a;
        f186731a = new KProperty[]{p0Var.f(zVar), a.s(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1, p0Var), a.s(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, p0Var), a.s(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1, p0Var), a.s(Attributes.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1, p0Var), a.s(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Modality;", 1, p0Var), a.s(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/metadata/Visibility;", 1, p0Var), a.s(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/metadata/ClassKind;", 1, p0Var), a.s(Attributes.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1, p0Var), a.s(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/metadata/Visibility;", 1, p0Var), a.s(Attributes.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1, p0Var), a.s(Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1, p0Var), a.s(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/MemberKind;", 1, p0Var), a.s(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Visibility;", 1, p0Var), a.s(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/metadata/Modality;", 1, p0Var), a.s(Attributes.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1, p0Var), a.s(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Visibility;", 1, p0Var), a.s(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/Modality;", 1, p0Var), a.s(Attributes.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/metadata/MemberKind;", 1, p0Var), a.s(Attributes.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1, p0Var), a.s(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Visibility;", 1, p0Var), a.s(Attributes.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/metadata/Modality;", 1, p0Var), a.s(Attributes.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, p0Var), a.s(Attributes.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, p0Var), a.s(Attributes.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1, p0Var), a.s(Attributes.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1, p0Var), a.s(Attributes.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1, p0Var), a.s(Attributes.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1, p0Var), a.s(Attributes.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1, p0Var), a.s(Attributes.class, "visibility", "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/metadata/Visibility;", 1, p0Var), a.s(Attributes.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1, p0Var), a.s(Attributes.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1, p0Var), a.s(Attributes.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1, p0Var), a.s(Attributes.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1, p0Var), a.s(Attributes.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1, p0Var)};
        Flags.BooleanFlagField HAS_ANNOTATIONS = Flags.HAS_ANNOTATIONS;
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.constructorBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.propertyAccessorBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.valueParameterBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        Intrinsics.checkNotNullExpressionValue(HAS_ANNOTATIONS, "HAS_ANNOTATIONS");
        FlagDelegatesImplKt.typeAliasBooleanFlag(new FlagImpl(HAS_ANNOTATIONS));
        f186732b = FlagDelegatesImplKt.modalityDelegate(i.f);
        FlagDelegatesImplKt.visibilityDelegate(o.f);
        e eVar = e.f;
        Flags.FlagField<ProtoBuf.Class.Kind> CLASS_KIND = Flags.CLASS_KIND;
        Intrinsics.checkNotNullExpressionValue(CLASS_KIND, "CLASS_KIND");
        EnumEntries entries = ClassKind.getEntries();
        EnumEntries entries2 = ClassKind.getEntries();
        ArrayList arrayList = new ArrayList(w.t(entries2, 10));
        Iterator<E> it8 = entries2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ClassKind) it8.next()).getFlag$kotlin_metadata());
        }
        f186733c = new EnumFlagDelegate(eVar, CLASS_KIND, entries, arrayList);
        Flags.BooleanFlagField IS_INNER = Flags.IS_INNER;
        Intrinsics.checkNotNullExpressionValue(IS_INNER, "IS_INNER");
        d = FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(IS_INNER));
        Flags.BooleanFlagField IS_DATA = Flags.IS_DATA;
        Intrinsics.checkNotNullExpressionValue(IS_DATA, "IS_DATA");
        e = FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(IS_DATA));
        Flags.BooleanFlagField IS_EXTERNAL_CLASS = Flags.IS_EXTERNAL_CLASS;
        Intrinsics.checkNotNullExpressionValue(IS_EXTERNAL_CLASS, "IS_EXTERNAL_CLASS");
        FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(IS_EXTERNAL_CLASS));
        Flags.BooleanFlagField IS_EXPECT_CLASS = Flags.IS_EXPECT_CLASS;
        Intrinsics.checkNotNullExpressionValue(IS_EXPECT_CLASS, "IS_EXPECT_CLASS");
        FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(IS_EXPECT_CLASS));
        Flags.BooleanFlagField IS_VALUE_CLASS = Flags.IS_VALUE_CLASS;
        Intrinsics.checkNotNullExpressionValue(IS_VALUE_CLASS, "IS_VALUE_CLASS");
        f = FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(IS_VALUE_CLASS));
        Flags.BooleanFlagField IS_FUN_INTERFACE = Flags.IS_FUN_INTERFACE;
        Intrinsics.checkNotNullExpressionValue(IS_FUN_INTERFACE, "IS_FUN_INTERFACE");
        f186734g = FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(IS_FUN_INTERFACE));
        Flags.BooleanFlagField HAS_ENUM_ENTRIES = Flags.HAS_ENUM_ENTRIES;
        Intrinsics.checkNotNullExpressionValue(HAS_ENUM_ENTRIES, "HAS_ENUM_ENTRIES");
        FlagDelegatesImplKt.classBooleanFlag(new FlagImpl(HAS_ENUM_ENTRIES));
        FlagDelegatesImplKt.visibilityDelegate(p.f);
        Flags.BooleanFlagField IS_SECONDARY = Flags.IS_SECONDARY;
        Intrinsics.checkNotNullExpressionValue(IS_SECONDARY, "IS_SECONDARY");
        FlagDelegatesImplKt.constructorBooleanFlag(new FlagImpl(IS_SECONDARY));
        Flags.BooleanFlagField IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
        Intrinsics.checkNotNullExpressionValue(IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES, "IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES");
        FlagDelegatesImplKt.constructorBooleanFlag(new FlagImpl(IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES));
        FlagDelegatesImplKt.memberKindDelegate(f.f);
        FlagDelegatesImplKt.visibilityDelegate(k.f);
        FlagDelegatesImplKt.modalityDelegate(j.f);
        Flags.BooleanFlagField IS_OPERATOR = Flags.IS_OPERATOR;
        Intrinsics.checkNotNullExpressionValue(IS_OPERATOR, "IS_OPERATOR");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_OPERATOR));
        Flags.BooleanFlagField IS_INFIX = Flags.IS_INFIX;
        Intrinsics.checkNotNullExpressionValue(IS_INFIX, "IS_INFIX");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_INFIX));
        Flags.BooleanFlagField IS_INLINE = Flags.IS_INLINE;
        Intrinsics.checkNotNullExpressionValue(IS_INLINE, "IS_INLINE");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_INLINE));
        Flags.BooleanFlagField IS_TAILREC = Flags.IS_TAILREC;
        Intrinsics.checkNotNullExpressionValue(IS_TAILREC, "IS_TAILREC");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_TAILREC));
        Flags.BooleanFlagField IS_EXTERNAL_FUNCTION = Flags.IS_EXTERNAL_FUNCTION;
        Intrinsics.checkNotNullExpressionValue(IS_EXTERNAL_FUNCTION, "IS_EXTERNAL_FUNCTION");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_EXTERNAL_FUNCTION));
        Flags.BooleanFlagField IS_SUSPEND = Flags.IS_SUSPEND;
        Intrinsics.checkNotNullExpressionValue(IS_SUSPEND, "IS_SUSPEND");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_SUSPEND));
        Flags.BooleanFlagField IS_EXPECT_FUNCTION = Flags.IS_EXPECT_FUNCTION;
        Intrinsics.checkNotNullExpressionValue(IS_EXPECT_FUNCTION, "IS_EXPECT_FUNCTION");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_EXPECT_FUNCTION));
        Flags.BooleanFlagField IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
        Intrinsics.checkNotNullExpressionValue(IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES, "IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES");
        FlagDelegatesImplKt.functionBooleanFlag(new FlagImpl(IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES));
        FlagDelegatesImplKt.visibilityDelegate(l.f);
        FlagDelegatesImplKt.modalityDelegate(g.f);
        FlagDelegatesImplKt.memberKindDelegate(d.f);
        Flags.BooleanFlagField IS_VAR = Flags.IS_VAR;
        Intrinsics.checkNotNullExpressionValue(IS_VAR, "IS_VAR");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(IS_VAR));
        Flags.BooleanFlagField IS_CONST = Flags.IS_CONST;
        Intrinsics.checkNotNullExpressionValue(IS_CONST, "IS_CONST");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(IS_CONST));
        Flags.BooleanFlagField IS_LATEINIT = Flags.IS_LATEINIT;
        Intrinsics.checkNotNullExpressionValue(IS_LATEINIT, "IS_LATEINIT");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(IS_LATEINIT));
        Flags.BooleanFlagField HAS_CONSTANT = Flags.HAS_CONSTANT;
        Intrinsics.checkNotNullExpressionValue(HAS_CONSTANT, "HAS_CONSTANT");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(HAS_CONSTANT));
        Flags.BooleanFlagField IS_EXTERNAL_PROPERTY = Flags.IS_EXTERNAL_PROPERTY;
        Intrinsics.checkNotNullExpressionValue(IS_EXTERNAL_PROPERTY, "IS_EXTERNAL_PROPERTY");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(IS_EXTERNAL_PROPERTY));
        Flags.BooleanFlagField IS_DELEGATED = Flags.IS_DELEGATED;
        Intrinsics.checkNotNullExpressionValue(IS_DELEGATED, "IS_DELEGATED");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(IS_DELEGATED));
        Flags.BooleanFlagField IS_EXPECT_PROPERTY = Flags.IS_EXPECT_PROPERTY;
        Intrinsics.checkNotNullExpressionValue(IS_EXPECT_PROPERTY, "IS_EXPECT_PROPERTY");
        FlagDelegatesImplKt.propertyBooleanFlag(new FlagImpl(IS_EXPECT_PROPERTY));
        FlagDelegatesImplKt.visibilityDelegate(m.f);
        FlagDelegatesImplKt.modalityDelegate(h.f);
        Flags.BooleanFlagField IS_NOT_DEFAULT = Flags.IS_NOT_DEFAULT;
        Intrinsics.checkNotNullExpressionValue(IS_NOT_DEFAULT, "IS_NOT_DEFAULT");
        FlagDelegatesImplKt.propertyAccessorBooleanFlag(new FlagImpl(IS_NOT_DEFAULT));
        Flags.BooleanFlagField IS_EXTERNAL_ACCESSOR = Flags.IS_EXTERNAL_ACCESSOR;
        Intrinsics.checkNotNullExpressionValue(IS_EXTERNAL_ACCESSOR, "IS_EXTERNAL_ACCESSOR");
        FlagDelegatesImplKt.propertyAccessorBooleanFlag(new FlagImpl(IS_EXTERNAL_ACCESSOR));
        Flags.BooleanFlagField IS_INLINE_ACCESSOR = Flags.IS_INLINE_ACCESSOR;
        Intrinsics.checkNotNullExpressionValue(IS_INLINE_ACCESSOR, "IS_INLINE_ACCESSOR");
        FlagDelegatesImplKt.propertyAccessorBooleanFlag(new FlagImpl(IS_INLINE_ACCESSOR));
        f186735h = FlagDelegatesImplKt.typeBooleanFlag(new FlagImpl(0, 1, 1));
        Flags.BooleanFlagField booleanFlagField = Flags.SUSPEND_TYPE;
        FlagDelegatesImplKt.typeBooleanFlag(new FlagImpl(booleanFlagField.offset + 1, booleanFlagField.bitWidth, 1));
        Flags.BooleanFlagField booleanFlagField2 = Flags.DEFINITELY_NOT_NULL_TYPE;
        FlagDelegatesImplKt.typeBooleanFlag(new FlagImpl(booleanFlagField2.offset + 1, booleanFlagField2.bitWidth, 1));
        i = new BooleanFlagDelegate(c.f, new FlagImpl(0, 1, 1));
        FlagDelegatesImplKt.visibilityDelegate(n.f);
        Flags.BooleanFlagField DECLARES_DEFAULT_VALUE = Flags.DECLARES_DEFAULT_VALUE;
        Intrinsics.checkNotNullExpressionValue(DECLARES_DEFAULT_VALUE, "DECLARES_DEFAULT_VALUE");
        FlagDelegatesImplKt.valueParameterBooleanFlag(new FlagImpl(DECLARES_DEFAULT_VALUE));
        Flags.BooleanFlagField IS_CROSSINLINE = Flags.IS_CROSSINLINE;
        Intrinsics.checkNotNullExpressionValue(IS_CROSSINLINE, "IS_CROSSINLINE");
        FlagDelegatesImplKt.valueParameterBooleanFlag(new FlagImpl(IS_CROSSINLINE));
        Flags.BooleanFlagField IS_NOINLINE = Flags.IS_NOINLINE;
        Intrinsics.checkNotNullExpressionValue(IS_NOINLINE, "IS_NOINLINE");
        FlagDelegatesImplKt.valueParameterBooleanFlag(new FlagImpl(IS_NOINLINE));
        ijm.a aVar = ijm.a.f;
        Flags.BooleanFlagField IS_NEGATED = Flags.IS_NEGATED;
        Intrinsics.checkNotNullExpressionValue(IS_NEGATED, "IS_NEGATED");
        new BooleanFlagDelegate(aVar, new FlagImpl(IS_NEGATED));
        b bVar = b.f;
        Flags.BooleanFlagField IS_NULL_CHECK_PREDICATE = Flags.IS_NULL_CHECK_PREDICATE;
        Intrinsics.checkNotNullExpressionValue(IS_NULL_CHECK_PREDICATE, "IS_NULL_CHECK_PREDICATE");
        new BooleanFlagDelegate(bVar, new FlagImpl(IS_NULL_CHECK_PREDICATE));
    }

    @NotNull
    public static final ClassKind getKind(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        return (ClassKind) f186733c.getValue(kmClass, f186731a[9]);
    }

    @NotNull
    public static final Modality getModality(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        return (Modality) f186732b.getValue(kmClass, f186731a[7]);
    }

    public static final boolean isData(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        return e.getValue(kmClass, f186731a[11]);
    }

    public static final boolean isFunInterface(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        return f186734g.getValue(kmClass, f186731a[15]);
    }

    public static final boolean isInner(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        return d.getValue(kmClass, f186731a[10]);
    }

    public static final boolean isNullable(@NotNull KmType kmType) {
        Intrinsics.checkNotNullParameter(kmType, "<this>");
        return f186735h.getValue(kmType, f186731a[46]);
    }

    public static final boolean isReified(@NotNull KmTypeParameter kmTypeParameter) {
        Intrinsics.checkNotNullParameter(kmTypeParameter, "<this>");
        return i.getValue(kmTypeParameter, f186731a[49]);
    }

    public static final boolean isValue(@NotNull KmClass kmClass) {
        Intrinsics.checkNotNullParameter(kmClass, "<this>");
        return f.getValue(kmClass, f186731a[14]);
    }
}

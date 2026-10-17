package kotlin.reflect.jvm.internal.impl.km.internal;

import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmConstantValue;
import kotlin.reflect.jvm.internal.impl.km.KmEffectExpression;
import kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.km.KmProperty;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeParameter;
import kotlin.reflect.jvm.internal.impl.km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.KmVersion;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirement;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirement;
import org.jetbrains.annotations.NotNull;
import yhm.e;
import zhm.f0;

/* JADX INFO: loaded from: classes14.dex */
public final class ReadersKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;

        static {
            int[] iArr = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr[ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProtoBuf.VersionRequirement.VersionKind.values().length];
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.VersionRequirement.VersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[e.values().length];
            try {
                iArr4[e.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[e.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[e.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ProtoBuf.Effect.EffectType.values().length];
            try {
                iArr5[ProtoBuf.Effect.EffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[ProtoBuf.Effect.EffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[ProtoBuf.Effect.EffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ProtoBuf.Effect.InvocationKind.values().length];
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[ProtoBuf.Effect.InvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[ProtoBuf.Expression.ConstantValue.values().length];
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.TRUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.FALSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr7[ProtoBuf.Expression.ConstantValue.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$6 = iArr7;
        }
    }

    public static final KmVersionRequirement a(int i, ReadContext readContext) {
        KmVersionRequirementVersionKind kmVersionRequirementVersionKind;
        KmVersionRequirementLevel kmVersionRequirementLevel;
        VersionRequirement.Version version;
        KmVersionRequirement kmVersionRequirement = new KmVersionRequirement();
        VersionRequirement versionRequirementCreate = VersionRequirement.Companion.create(i, readContext.getStrings(), readContext.getVersionRequirements$kotlin_metadata());
        if (versionRequirementCreate == null && !readContext.getIgnoreUnknownVersionRequirements$kotlin_metadata()) {
            throw new InconsistentKotlinMetadataException("No VersionRequirement with the given id in the table", null, 2, null);
        }
        ProtoBuf.VersionRequirement.VersionKind kind = versionRequirementCreate != null ? versionRequirementCreate.getKind() : null;
        int i2 = kind == null ? -1 : WhenMappings.$EnumSwitchMapping$2[kind.ordinal()];
        if (i2 == -1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.UNKNOWN;
        } else if (i2 == 1) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.LANGUAGE_VERSION;
        } else if (i2 == 2) {
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.COMPILER_VERSION;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            kmVersionRequirementVersionKind = KmVersionRequirementVersionKind.API_VERSION;
        }
        e level = versionRequirementCreate != null ? versionRequirementCreate.getLevel() : null;
        int i3 = level == null ? -1 : WhenMappings.$EnumSwitchMapping$3[level.ordinal()];
        if (i3 == -1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else if (i3 == 1) {
            kmVersionRequirementLevel = KmVersionRequirementLevel.WARNING;
        } else if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            kmVersionRequirementLevel = KmVersionRequirementLevel.HIDDEN;
        } else {
            kmVersionRequirementLevel = KmVersionRequirementLevel.ERROR;
        }
        kmVersionRequirement.setKind(kmVersionRequirementVersionKind);
        kmVersionRequirement.setLevel(kmVersionRequirementLevel);
        kmVersionRequirement.setErrorCode(versionRequirementCreate != null ? versionRequirementCreate.getErrorCode() : null);
        kmVersionRequirement.setMessage(versionRequirementCreate != null ? versionRequirementCreate.getMessage() : null);
        if (versionRequirementCreate == null || (version = versionRequirementCreate.getVersion()) == null) {
            version = VersionRequirement.Version.INFINITY;
        }
        kmVersionRequirement.setVersion(new KmVersion(version.component1(), version.component2(), version.component3()));
        return kmVersionRequirement;
    }

    public static final KmEffectExpression b(ProtoBuf.Expression expression, ReadContext readContext) {
        Boolean bool;
        KmEffectExpression kmEffectExpression = new KmEffectExpression();
        kmEffectExpression.setFlags$kotlin_metadata(expression.getFlags());
        kmEffectExpression.setParameterIndex(expression.hasValueParameterReference() ? Integer.valueOf(expression.getValueParameterReference()) : null);
        if (expression.hasConstantValue()) {
            ProtoBuf.Expression.ConstantValue constantValue = expression.getConstantValue();
            if (constantValue == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i = WhenMappings.$EnumSwitchMapping$6[constantValue.ordinal()];
            if (i == 1) {
                bool = Boolean.TRUE;
            } else if (i == 2) {
                bool = Boolean.FALSE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bool = null;
            }
            kmEffectExpression.setConstantValue(new KmConstantValue(bool));
        }
        ProtoBuf.Type typeIsInstanceType = ProtoTypeTableUtilKt.isInstanceType(expression, readContext.getTypes());
        kmEffectExpression.setInstanceType(typeIsInstanceType != null ? c(typeIsInstanceType, readContext) : null);
        List<ProtoBuf.Expression> andArgumentList = expression.getAndArgumentList();
        Intrinsics.checkNotNullExpressionValue(andArgumentList, "getAndArgumentList(...)");
        List<KmEffectExpression> andArguments = kmEffectExpression.getAndArguments();
        for (ProtoBuf.Expression expression2 : andArgumentList) {
            Intrinsics.h(expression2);
            andArguments.add(b(expression2, readContext));
        }
        List<ProtoBuf.Expression> orArgumentList = expression.getOrArgumentList();
        Intrinsics.checkNotNullExpressionValue(orArgumentList, "getOrArgumentList(...)");
        List<KmEffectExpression> orArguments = kmEffectExpression.getOrArguments();
        for (ProtoBuf.Expression expression3 : orArgumentList) {
            Intrinsics.h(expression3);
            orArguments.add(b(expression3, readContext));
        }
        return kmEffectExpression;
    }

    public static final KmType c(ProtoBuf.Type type, ReadContext readContext) {
        KmClassifier typeParameter;
        KmVariance kmVariance;
        KmType kmType = new KmType((type.getNullable() ? 1 : 0) + (type.getFlags() << 1));
        if (type.hasClassName()) {
            typeParameter = new KmClassifier.Class(readContext.className$kotlin_metadata(type.getClassName()));
        } else if (type.hasTypeAliasName()) {
            typeParameter = new KmClassifier.TypeAlias(readContext.className$kotlin_metadata(type.getTypeAliasName()));
        } else if (type.hasTypeParameter()) {
            typeParameter = new KmClassifier.TypeParameter(type.getTypeParameter());
        } else {
            if (!type.hasTypeParameterName()) {
                throw new InconsistentKotlinMetadataException("No classifier (class, type alias or type parameter) recorded for Type", null, 2, null);
            }
            Integer typeParameterId$kotlin_metadata = readContext.getTypeParameterId$kotlin_metadata(type.getTypeParameterName());
            if (typeParameterId$kotlin_metadata == null) {
                throw new InconsistentKotlinMetadataException("No type parameter id for " + readContext.get(type.getTypeParameterName()), null, 2, null);
            }
            typeParameter = new KmClassifier.TypeParameter(typeParameterId$kotlin_metadata.intValue());
        }
        kmType.setClassifier(typeParameter);
        for (ProtoBuf.Type.Argument argument : type.getArgumentList()) {
            ProtoBuf.Type.Argument.Projection projection = argument.getProjection();
            if (projection == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int i = WhenMappings.$EnumSwitchMapping$1[projection.ordinal()];
            if (i == 1) {
                kmVariance = KmVariance.IN;
            } else if (i == 2) {
                kmVariance = KmVariance.OUT;
            } else if (i == 3) {
                kmVariance = KmVariance.INVARIANT;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                kmVariance = null;
            }
            if (kmVariance != null) {
                ProtoBuf.Type type2 = ProtoTypeTableUtilKt.type(argument, readContext.getTypes());
                if (type2 == null) {
                    throw new InconsistentKotlinMetadataException("No type argument for non-STAR projection in Type", null, 2, null);
                }
                kmType.getArguments().add(new KmTypeProjection(kmVariance, c(type2, readContext)));
            } else {
                kmType.getArguments().add(KmTypeProjection.STAR);
            }
        }
        ProtoBuf.Type typeAbbreviatedType = ProtoTypeTableUtilKt.abbreviatedType(type, readContext.getTypes());
        kmType.setAbbreviatedType(typeAbbreviatedType != null ? c(typeAbbreviatedType, readContext) : null);
        ProtoBuf.Type typeOuterType = ProtoTypeTableUtilKt.outerType(type, readContext.getTypes());
        kmType.setOuterType(typeOuterType != null ? c(typeOuterType, readContext) : null);
        ProtoBuf.Type typeFlexibleUpperBound = ProtoTypeTableUtilKt.flexibleUpperBound(type, readContext.getTypes());
        kmType.setFlexibleTypeUpperBound(typeFlexibleUpperBound != null ? new KmFlexibleTypeUpperBound(c(typeFlexibleUpperBound, readContext), type.hasFlexibleTypeCapabilitiesId() ? readContext.get(type.getFlexibleTypeCapabilitiesId()) : null) : null);
        Iterator<T> it8 = readContext.getExtensions$kotlin_metadata().iterator();
        while (it8.hasNext()) {
            ((MetadataExtensions) it8.next()).readTypeExtensions(kmType, type, readContext);
        }
        return kmType;
    }

    public static final KmTypeParameter d(ProtoBuf.TypeParameter typeParameter, ReadContext readContext) {
        KmVariance kmVariance;
        ProtoBuf.TypeParameter.Variance variance = typeParameter.getVariance();
        if (variance == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i == 1) {
            kmVariance = KmVariance.IN;
        } else if (i == 2) {
            kmVariance = KmVariance.OUT;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            kmVariance = KmVariance.INVARIANT;
        }
        boolean reified = typeParameter.getReified();
        KmTypeParameter kmTypeParameter = new KmTypeParameter(reified ? 1 : 0, readContext.get(typeParameter.getName()), typeParameter.getId(), kmVariance);
        List<ProtoBuf.Type> listUpperBounds = ProtoTypeTableUtilKt.upperBounds(typeParameter, readContext.getTypes());
        List<KmType> upperBounds = kmTypeParameter.getUpperBounds();
        Iterator<T> it8 = listUpperBounds.iterator();
        while (it8.hasNext()) {
            upperBounds.add(c((ProtoBuf.Type) it8.next(), readContext));
        }
        Iterator<T> it9 = readContext.getExtensions$kotlin_metadata().iterator();
        while (it9.hasNext()) {
            ((MetadataExtensions) it9.next()).readTypeParameterExtensions(kmTypeParameter, typeParameter, readContext);
        }
        return kmTypeParameter;
    }

    public static final KmValueParameter e(ProtoBuf.ValueParameter valueParameter, ReadContext readContext) {
        KmValueParameter kmValueParameter = new KmValueParameter(valueParameter.getFlags(), readContext.get(valueParameter.getName()));
        kmValueParameter.setType(c(ProtoTypeTableUtilKt.type(valueParameter, readContext.getTypes()), readContext));
        ProtoBuf.Type typeVarargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, readContext.getTypes());
        kmValueParameter.setVarargElementType(typeVarargElementType != null ? c(typeVarargElementType, readContext) : null);
        if (valueParameter.hasAnnotationParameterDefaultValue()) {
            ProtoBuf.Annotation.Argument.Value annotationParameterDefaultValue = valueParameter.getAnnotationParameterDefaultValue();
            Intrinsics.checkNotNullExpressionValue(annotationParameterDefaultValue, "getAnnotationParameterDefaultValue(...)");
            kmValueParameter.setAnnotationParameterDefaultValue(ReadUtilsKt.readAnnotationArgument(annotationParameterDefaultValue, readContext.getStrings()));
        }
        Iterator<T> it8 = readContext.getExtensions$kotlin_metadata().iterator();
        while (it8.hasNext()) {
            ((MetadataExtensions) it8.next()).readValueParameterExtensions(kmValueParameter, valueParameter, readContext);
        }
        return kmValueParameter;
    }

    public static final int getDefaultPropertyAccessorFlags(int i) {
        Boolean bool = Flags.HAS_ANNOTATIONS.get(i);
        Intrinsics.checkNotNullExpressionValue(bool, "get(...)");
        return Flags.getAccessorFlags(bool.booleanValue(), Flags.VISIBILITY.get(i), Flags.MODALITY.get(i), false, false, false);
    }

    public static final int getPropertyGetterFlags(@NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        return property.hasGetterFlags() ? property.getGetterFlags() : getDefaultPropertyAccessorFlags(property.getFlags());
    }

    public static final int getPropertySetterFlags(@NotNull ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        return property.hasSetterFlags() ? property.getSetterFlags() : getDefaultPropertyAccessorFlags(property.getFlags());
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0618  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.km.KmClass toKmClass(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r24, boolean r25, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r26) {
        /*
            Method dump skipped, instruction units count: 1771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.km.internal.ReadersKt.toKmClass(kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, boolean, java.util.List):kotlin.reflect.jvm.internal.impl.km.KmClass");
    }

    public static KmClass toKmClass$default(ProtoBuf.Class r06, NameResolver nameResolver, boolean z, List list, int i, Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = f0.f322471a;
        }
        return toKmClass(r06, nameResolver, z, list);
    }

    @NotNull
    public static final KmProperty toKmProperty(@NotNull ProtoBuf.Property property, @NotNull ReadContext outer) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(outer, "outer");
        KmProperty kmProperty = new KmProperty(property.getFlags(), outer.get(property.getName()), getPropertyGetterFlags(property), getPropertySetterFlags(property));
        List<ProtoBuf.TypeParameter> typeParameterList = property.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "getTypeParameterList(...)");
        ReadContext readContextWithTypeParameters$kotlin_metadata = outer.withTypeParameters$kotlin_metadata(typeParameterList);
        List<ProtoBuf.TypeParameter> typeParameterList2 = property.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList2, "getTypeParameterList(...)");
        List<KmTypeParameter> typeParameters = kmProperty.getTypeParameters();
        for (ProtoBuf.TypeParameter typeParameter : typeParameterList2) {
            Intrinsics.h(typeParameter);
            typeParameters.add(d(typeParameter, readContextWithTypeParameters$kotlin_metadata));
        }
        ProtoBuf.Type typeReceiverType = ProtoTypeTableUtilKt.receiverType(property, readContextWithTypeParameters$kotlin_metadata.getTypes());
        kmProperty.setReceiverParameterType(typeReceiverType != null ? c(typeReceiverType, readContextWithTypeParameters$kotlin_metadata) : null);
        List<ProtoBuf.ValueParameter> contextParameterList = property.getContextParameterList();
        Intrinsics.checkNotNullExpressionValue(contextParameterList, "getContextParameterList(...)");
        List<KmValueParameter> contextParameters = kmProperty.getContextParameters();
        for (ProtoBuf.ValueParameter valueParameter : contextParameterList) {
            Intrinsics.h(valueParameter);
            contextParameters.add(e(valueParameter, readContextWithTypeParameters$kotlin_metadata));
        }
        if (property.getContextParameterList().isEmpty()) {
            List<ProtoBuf.Type> contextReceiverTypeList = property.getContextReceiverTypeList();
            Intrinsics.checkNotNullExpressionValue(contextReceiverTypeList, "getContextReceiverTypeList(...)");
            if (!contextReceiverTypeList.isEmpty()) {
                List<ProtoBuf.Type> listContextReceiverTypes = ProtoTypeTableUtilKt.contextReceiverTypes(property, readContextWithTypeParameters$kotlin_metadata.getTypes());
                List<KmValueParameter> contextParameters2 = kmProperty.getContextParameters();
                Iterator<T> it8 = listContextReceiverTypes.iterator();
                while (it8.hasNext()) {
                    KmType kmTypeC = c((ProtoBuf.Type) it8.next(), readContextWithTypeParameters$kotlin_metadata);
                    KmValueParameter kmValueParameter = new KmValueParameter(0, "_");
                    kmValueParameter.setType(kmTypeC);
                    contextParameters2.add(kmValueParameter);
                }
            }
        }
        if (property.hasSetterValueParameter()) {
            ProtoBuf.ValueParameter setterValueParameter = property.getSetterValueParameter();
            Intrinsics.checkNotNullExpressionValue(setterValueParameter, "getSetterValueParameter(...)");
            kmProperty.setSetterParameter(e(setterValueParameter, readContextWithTypeParameters$kotlin_metadata));
        }
        kmProperty.setReturnType(c(ProtoTypeTableUtilKt.returnType(property, readContextWithTypeParameters$kotlin_metadata.getTypes()), readContextWithTypeParameters$kotlin_metadata));
        List<Integer> versionRequirementList = property.getVersionRequirementList();
        Intrinsics.checkNotNullExpressionValue(versionRequirementList, "getVersionRequirementList(...)");
        List<KmVersionRequirement> versionRequirements = kmProperty.getVersionRequirements();
        for (Integer num : versionRequirementList) {
            Intrinsics.h(num);
            versionRequirements.add(a(num.intValue(), readContextWithTypeParameters$kotlin_metadata));
        }
        Iterator<T> it9 = readContextWithTypeParameters$kotlin_metadata.getExtensions$kotlin_metadata().iterator();
        while (it9.hasNext()) {
            ((MetadataExtensions) it9.next()).readPropertyExtensions(kmProperty, property, readContextWithTypeParameters$kotlin_metadata);
        }
        return kmProperty;
    }
}

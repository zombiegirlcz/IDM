package kotlin.reflect.jvm.internal.impl.km.internal;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.InconsistentKotlinMetadataException;
import kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.km.KmClassifier;
import kotlin.reflect.jvm.internal.impl.km.KmEffectInvocationKind;
import kotlin.reflect.jvm.internal.impl.km.KmEffectType;
import kotlin.reflect.jvm.internal.impl.km.KmFlexibleTypeUpperBound;
import kotlin.reflect.jvm.internal.impl.km.KmType;
import kotlin.reflect.jvm.internal.impl.km.KmTypeProjection;
import kotlin.reflect.jvm.internal.impl.km.KmValueParameter;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementLevel;
import kotlin.reflect.jvm.internal.impl.km.KmVersionRequirementVersionKind;
import kotlin.reflect.jvm.internal.impl.km.internal.extensions.MetadataExtensions;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;

/* JADX INFO: loaded from: classes14.dex */
public final class WritersKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[KmVersionRequirementVersionKind.values().length];
            try {
                iArr[KmVersionRequirementVersionKind.LANGUAGE_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.COMPILER_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.API_VERSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KmVersionRequirementVersionKind.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[KmVersionRequirementLevel.values().length];
            try {
                iArr2[KmVersionRequirementLevel.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[KmVersionRequirementLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[KmVersionRequirementLevel.HIDDEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[KmEffectType.values().length];
            try {
                iArr3[KmEffectType.RETURNS_CONSTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[KmEffectType.CALLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[KmEffectType.RETURNS_NOT_NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[KmEffectInvocationKind.values().length];
            try {
                iArr4[KmEffectInvocationKind.AT_MOST_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[KmEffectInvocationKind.EXACTLY_ONCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[KmEffectInvocationKind.AT_LEAST_ONCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final ProtoBuf.Type.Builder a(WriteContext writeContext, KmType kmType) {
        ProtoBuf.Type.Builder builderNewBuilder = ProtoBuf.Type.newBuilder();
        KmClassifier classifier = kmType.getClassifier();
        if (classifier instanceof KmClassifier.Class) {
            builderNewBuilder.setClassName(writeContext.getClassName$kotlin_metadata(((KmClassifier.Class) classifier).getName()));
        } else if (classifier instanceof KmClassifier.TypeAlias) {
            builderNewBuilder.setTypeAliasName(writeContext.getClassName$kotlin_metadata(((KmClassifier.TypeAlias) classifier).getName()));
        } else {
            if (!(classifier instanceof KmClassifier.TypeParameter)) {
                throw new NoWhenBranchMatchedException();
            }
            builderNewBuilder.setTypeParameter(((KmClassifier.TypeParameter) classifier).getId());
        }
        for (KmTypeProjection kmTypeProjection : kmType.getArguments()) {
            ProtoBuf.Type.Argument.Builder builderNewBuilder2 = ProtoBuf.Type.Argument.newBuilder();
            if (Intrinsics.f(kmTypeProjection, KmTypeProjection.STAR)) {
                builderNewBuilder2.setProjection(ProtoBuf.Type.Argument.Projection.STAR);
            } else {
                KmVariance kmVarianceComponent1 = kmTypeProjection.component1();
                KmType kmTypeComponent2 = kmTypeProjection.component2();
                if (kmVarianceComponent1 == null || kmTypeComponent2 == null) {
                    throw new InconsistentKotlinMetadataException("Variance and type must be set for non-star type projection", null, 2, null);
                }
                if (kmVarianceComponent1 == KmVariance.IN) {
                    builderNewBuilder2.setProjection(ProtoBuf.Type.Argument.Projection.IN);
                } else if (kmVarianceComponent1 == KmVariance.OUT) {
                    builderNewBuilder2.setProjection(ProtoBuf.Type.Argument.Projection.OUT);
                }
                builderNewBuilder2.setType(a(writeContext, kmTypeComponent2).build());
            }
            Intrinsics.h(builderNewBuilder2);
            builderNewBuilder.addArgument(builderNewBuilder2);
        }
        KmType abbreviatedType = kmType.getAbbreviatedType();
        if (abbreviatedType != null) {
            builderNewBuilder.setAbbreviatedType(a(writeContext, abbreviatedType).build());
        }
        KmType outerType = kmType.getOuterType();
        if (outerType != null) {
            builderNewBuilder.setOuterType(a(writeContext, outerType).build());
        }
        KmFlexibleTypeUpperBound flexibleTypeUpperBound = kmType.getFlexibleTypeUpperBound();
        if (flexibleTypeUpperBound != null) {
            ProtoBuf.Type.Builder builderA = a(writeContext, flexibleTypeUpperBound.getType());
            String typeFlexibilityId = flexibleTypeUpperBound.getTypeFlexibilityId();
            if (typeFlexibilityId != null) {
                builderNewBuilder.setFlexibleTypeCapabilitiesId(writeContext.get(typeFlexibilityId));
            }
            builderNewBuilder.setFlexibleUpperBound(builderA.build());
        }
        for (MetadataExtensions metadataExtensions : writeContext.getExtensions$kotlin_metadata()) {
            Intrinsics.h(builderNewBuilder);
            metadataExtensions.writeTypeExtensions(kmType, builderNewBuilder, writeContext);
        }
        if (Attributes.isNullable(kmType)) {
            builderNewBuilder.setNullable(true);
        }
        int flags$kotlin_metadata = kmType.getFlags$kotlin_metadata() >> 1;
        if (flags$kotlin_metadata != ProtoBuf.Type.getDefaultInstance().getFlags()) {
            builderNewBuilder.setFlags(flags$kotlin_metadata);
        }
        Intrinsics.h(builderNewBuilder);
        return builderNewBuilder;
    }

    public static final ProtoBuf.ValueParameter.Builder b(WriteContext writeContext, KmValueParameter kmValueParameter) {
        ProtoBuf.ValueParameter.Builder builderNewBuilder = ProtoBuf.ValueParameter.newBuilder();
        builderNewBuilder.setType(a(writeContext, kmValueParameter.getType()).build());
        KmType varargElementType = kmValueParameter.getVarargElementType();
        if (varargElementType != null) {
            builderNewBuilder.setVarargElementType(a(writeContext, varargElementType).build());
        }
        KmAnnotationArgument annotationParameterDefaultValue = kmValueParameter.getAnnotationParameterDefaultValue();
        if (annotationParameterDefaultValue != null) {
            builderNewBuilder.setAnnotationParameterDefaultValue(WriteUtilsKt.writeAnnotationArgument(annotationParameterDefaultValue, writeContext.getStrings()).build());
        }
        Iterator<T> it8 = writeContext.getExtensions$kotlin_metadata().iterator();
        while (it8.hasNext()) {
            ((MetadataExtensions) it8.next()).writeValueParameterExtensions(kmValueParameter, builderNewBuilder, writeContext);
        }
        int flags$kotlin_metadata = kmValueParameter.getFlags$kotlin_metadata() | Flags.HAS_ANNOTATIONS.toFlags(Boolean.valueOf(!kmValueParameter.getAnnotations().isEmpty()));
        if (flags$kotlin_metadata != ProtoBuf.ValueParameter.getDefaultInstance().getFlags()) {
            builderNewBuilder.setFlags(flags$kotlin_metadata);
        }
        builderNewBuilder.setName(writeContext.get(kmValueParameter.getName()));
        return builderNewBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x020f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0150 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder writeProperty(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.internal.WriteContext r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.km.KmProperty r14) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.km.internal.WritersKt.writeProperty(kotlin.reflect.jvm.internal.impl.km.internal.WriteContext, kotlin.reflect.jvm.internal.impl.km.KmProperty):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$Builder");
    }
}

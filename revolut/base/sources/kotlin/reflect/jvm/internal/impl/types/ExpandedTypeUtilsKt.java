package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class ExpandedTypeUtilsKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final TypeParameterMarker a(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker) {
        KotlinTypeMarker type;
        TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker));
        if (typeParameterClassifier != null) {
            return typeParameterClassifier;
        }
        if (typeSystemCommonBackendContext.isArrayOrNullableArray(kotlinTypeMarker) && (type = typeSystemCommonBackendContext.getType((TypeArgumentMarker) d0.K0(typeSystemCommonBackendContext.getArguments(kotlinTypeMarker)))) != null) {
            return a(typeSystemCommonBackendContext, type);
        }
        return null;
    }

    public static final KotlinTypeMarker b(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, HashSet hashSet) {
        KotlinTypeMarker kotlinTypeMarkerSafeSubstitute;
        KotlinTypeMarker kotlinTypeMarkerB;
        TypeConstructorMarker typeConstructorMarkerTypeConstructor = typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker);
        if (hashSet.add(typeConstructorMarkerTypeConstructor)) {
            TypeParameterMarker typeParameterClassifier = typeSystemCommonBackendContext.getTypeParameterClassifier(typeConstructorMarkerTypeConstructor);
            int i = 0;
            if (typeParameterClassifier == null) {
                if (typeSystemCommonBackendContext.isInlineClass(typeConstructorMarkerTypeConstructor)) {
                    List<TypeParameterMarker> parameters = typeSystemCommonBackendContext.getParameters(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker));
                    List<TypeArgumentMarker> arguments = typeSystemCommonBackendContext.getArguments(kotlinTypeMarker);
                    ArrayList arrayList = new ArrayList(w.t(arguments, 10));
                    for (Object obj2 : arguments) {
                        int i2 = i + 1;
                        if (i < 0) {
                            v.s();
                            throw null;
                        }
                        KotlinTypeMarker type = typeSystemCommonBackendContext.getType((TypeArgumentMarker) obj2);
                        if (type == null) {
                            type = typeSystemCommonBackendContext.getRepresentativeUpperBound(parameters.get(i));
                        }
                        arrayList.add(type);
                        i = i2;
                    }
                    List<TypeParameterMarker> list = parameters;
                    ArrayList arrayList2 = new ArrayList(w.t(list, 10));
                    Iterator<T> it8 = list.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(typeSystemCommonBackendContext.getTypeConstructor((TypeParameterMarker) it8.next()));
                    }
                    TypeSubstitutorMarker typeSubstitutorMarkerTypeSubstitutorForUnderlyingType = typeSystemCommonBackendContext.typeSubstitutorForUnderlyingType(r0.t(d0.l1(arrayList2, arrayList)));
                    KotlinTypeMarker unsubstitutedUnderlyingType = typeSystemCommonBackendContext.getUnsubstitutedUnderlyingType(kotlinTypeMarker);
                    if (unsubstitutedUnderlyingType == null) {
                        kotlinTypeMarkerSafeSubstitute = null;
                    } else {
                        TypeParameterMarker typeParameterMarkerA = a(typeSystemCommonBackendContext, unsubstitutedUnderlyingType);
                        kotlinTypeMarkerSafeSubstitute = typeParameterMarkerA == null ? typeSystemCommonBackendContext.safeSubstitute(typeSubstitutorMarkerTypeSubstitutorForUnderlyingType, unsubstitutedUnderlyingType) : c(typeSystemCommonBackendContext, unsubstitutedUnderlyingType, typeSystemCommonBackendContext.safeSubstitute(typeSubstitutorMarkerTypeSubstitutorForUnderlyingType, typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterMarkerA)));
                    }
                    if (kotlinTypeMarkerSafeSubstitute != null && (kotlinTypeMarkerB = b(typeSystemCommonBackendContext, kotlinTypeMarkerSafeSubstitute, hashSet)) != null) {
                        if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker)) {
                            return kotlinTypeMarkerB;
                        }
                        if (!typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerB) && (!(kotlinTypeMarkerB instanceof SimpleTypeMarker) || !typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerB))) {
                            return typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerB);
                        }
                    }
                }
                return kotlinTypeMarker;
            }
            KotlinTypeMarker representativeUpperBound = typeSystemCommonBackendContext.getRepresentativeUpperBound(typeParameterClassifier);
            KotlinTypeMarker kotlinTypeMarkerB2 = b(typeSystemCommonBackendContext, representativeUpperBound, hashSet);
            if (kotlinTypeMarkerB2 != null) {
                if (typeSystemCommonBackendContext.isInlineClass(typeSystemCommonBackendContext.typeConstructor(representativeUpperBound)) || ((representativeUpperBound instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) representativeUpperBound))) {
                    i = 1;
                }
                return ((kotlinTypeMarkerB2 instanceof SimpleTypeMarker) && typeSystemCommonBackendContext.isPrimitiveType((SimpleTypeMarker) kotlinTypeMarkerB2) && typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) && i != 0) ? typeSystemCommonBackendContext.makeNullable(representativeUpperBound) : (typeSystemCommonBackendContext.isNullableType(kotlinTypeMarkerB2) || !typeSystemCommonBackendContext.isMarkedNullable(kotlinTypeMarker)) ? kotlinTypeMarkerB2 : typeSystemCommonBackendContext.makeNullable(kotlinTypeMarkerB2);
            }
        }
        return null;
    }

    public static final KotlinTypeMarker c(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker kotlinTypeMarker, KotlinTypeMarker kotlinTypeMarker2) {
        KotlinTypeMarker kotlinTypeMarkerC;
        if (typeSystemCommonBackendContext.getTypeParameterClassifier(typeSystemCommonBackendContext.typeConstructor(kotlinTypeMarker)) != null) {
            return typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) ? typeSystemCommonBackendContext.makeNullable(kotlinTypeMarker2) : kotlinTypeMarker2;
        }
        TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) d0.K0(typeSystemCommonBackendContext.getArguments(kotlinTypeMarker));
        if (WhenMappings.$EnumSwitchMapping$0[typeSystemCommonBackendContext.getVariance(typeArgumentMarker).ordinal()] == 1) {
            kotlinTypeMarkerC = typeSystemCommonBackendContext.nullableAnyType();
        } else {
            KotlinTypeMarker type = typeSystemCommonBackendContext.getType(typeArgumentMarker);
            Intrinsics.h(type);
            kotlinTypeMarkerC = c(typeSystemCommonBackendContext, type, kotlinTypeMarker2);
        }
        SimpleTypeMarker simpleTypeMarkerArrayType = typeSystemCommonBackendContext.arrayType(kotlinTypeMarkerC);
        return typeSystemCommonBackendContext.isNullableType(kotlinTypeMarker) ? typeSystemCommonBackendContext.makeNullable(simpleTypeMarkerArrayType) : simpleTypeMarkerArrayType;
    }

    public static final KotlinTypeMarker computeExpandedTypeForInlineClass(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker inlineClassType) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(inlineClassType, "inlineClassType");
        return b(typeSystemCommonBackendContext, inlineClassType, new HashSet());
    }
}

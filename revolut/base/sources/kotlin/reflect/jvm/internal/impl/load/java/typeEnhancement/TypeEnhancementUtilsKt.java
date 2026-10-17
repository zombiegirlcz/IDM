package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.d0;

/* JADX INFO: loaded from: classes14.dex */
public final class TypeEnhancementUtilsKt {
    public static final Object a(Set set, Enum r2, Enum r3, Enum r4, boolean z) {
        Set setI1;
        if (!z) {
            if (r4 != null && (setI1 = d0.i1(a1.m(set, r4))) != null) {
                set = setI1;
            }
            return d0.L0(set);
        }
        Enum r110 = set.contains(r2) ? r2 : set.contains(r3) ? r3 : null;
        if (Intrinsics.f(r110, r2) && Intrinsics.f(r4, r3)) {
            return null;
        }
        return r4 == null ? r110 : r4;
    }

    @NotNull
    public static final JavaTypeQualifiers computeQualifiersForOverride(@NotNull JavaTypeQualifiers javaTypeQualifiers, @NotNull Collection<JavaTypeQualifiers> superQualifiers, boolean z, boolean z3, boolean z4) {
        NullabilityQualifier nullability;
        NullabilityQualifier nullabilityQualifier;
        Intrinsics.checkNotNullParameter(javaTypeQualifiers, "<this>");
        Intrinsics.checkNotNullParameter(superQualifiers, "superQualifiers");
        Collection<JavaTypeQualifiers> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = collection.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            JavaTypeQualifiers javaTypeQualifiers2 = (JavaTypeQualifiers) it8.next();
            nullability = javaTypeQualifiers2.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers2.getNullability();
            if (nullability != null) {
                arrayList.add(nullability);
            }
        }
        Set setI1 = d0.i1(arrayList);
        NullabilityQualifier nullability2 = javaTypeQualifiers.isNullabilityQualifierForWarning() ? null : javaTypeQualifiers.getNullability();
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        if (nullability2 != nullabilityQualifier2) {
            nullabilityQualifier2 = (NullabilityQualifier) a(setI1, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability2, z);
        }
        if (nullabilityQualifier2 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it9 = collection.iterator();
            while (it9.hasNext()) {
                NullabilityQualifier nullability3 = ((JavaTypeQualifiers) it9.next()).getNullability();
                if (nullability3 != null) {
                    arrayList2.add(nullability3);
                }
            }
            Set setI12 = d0.i1(arrayList2);
            NullabilityQualifier nullability4 = javaTypeQualifiers.getNullability();
            nullabilityQualifier = NullabilityQualifier.FORCE_FLEXIBILITY;
            if (nullability4 != nullabilityQualifier) {
                nullabilityQualifier = (NullabilityQualifier) a(setI12, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullability4, z);
            }
        } else {
            nullabilityQualifier = nullabilityQualifier2;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it10 = collection.iterator();
        while (it10.hasNext()) {
            MutabilityQualifier mutability = ((JavaTypeQualifiers) it10.next()).getMutability();
            if (mutability != null) {
                arrayList3.add(mutability);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) a(d0.i1(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, javaTypeQualifiers.getMutability(), z);
        if (nullabilityQualifier != null && !z4 && (!z3 || nullabilityQualifier != NullabilityQualifier.NULLABLE)) {
            nullability = nullabilityQualifier;
        }
        boolean z6 = false;
        boolean z11 = nullability != null && nullabilityQualifier2 == null;
        if (nullability == NullabilityQualifier.NOT_NULL) {
            if (javaTypeQualifiers.isNullabilityQualifierForWarning() == z11 && javaTypeQualifiers.getDefinitelyNotNull()) {
                z6 = true;
                break;
            }
            if (!collection.isEmpty()) {
                for (JavaTypeQualifiers javaTypeQualifiers3 : collection) {
                    if (javaTypeQualifiers3.isNullabilityQualifierForWarning() == z11 && javaTypeQualifiers3.getDefinitelyNotNull()) {
                        z6 = true;
                        break;
                    }
                }
            }
        }
        return new JavaTypeQualifiers(nullability, mutabilityQualifier, z6, z11);
    }

    public static final boolean hasEnhancedNullability(@NotNull TypeSystemCommonBackendContext typeSystemCommonBackendContext, @NotNull KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }
}

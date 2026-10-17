package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ajm.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractAnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import nyb.q;
import org.jetbrains.annotations.NotNull;
import rjm.a;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractSignatureParts<TAnnotation> {
    public static void a(Object obj2, ArrayList arrayList, q qVar) {
        arrayList.add(obj2);
        Iterable iterable = (Iterable) qVar.invoke(obj2);
        if (iterable != null) {
            Iterator it8 = iterable.iterator();
            while (it8.hasNext()) {
                a(it8.next(), arrayList, qVar);
            }
        }
    }

    public final NullabilityQualifierWithMigrationStatus b(TypeParameterMarker typeParameterMarker) {
        List<KotlinTypeMarker> list;
        NullabilityQualifier nullabilityQualifier;
        TypeSystemContext typeSystem = getTypeSystem();
        if (!isFromJava(typeParameterMarker)) {
            return null;
        }
        List<KotlinTypeMarker> upperBounds = typeSystem.getUpperBounds(typeParameterMarker);
        List<KotlinTypeMarker> list2 = upperBounds;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return null;
        }
        Iterator<T> it8 = list2.iterator();
        while (it8.hasNext()) {
            if (!typeSystem.isError((KotlinTypeMarker) it8.next())) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (d((KotlinTypeMarker) obj2) != null) {
                        arrayList.add(obj2);
                    }
                }
                Lazy lazyC = j.c(k.NONE, new e(upperBounds, this, 18));
                if (!arrayList.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        Iterator it9 = arrayList.iterator();
                        while (it9.hasNext()) {
                            if (getShouldPropagateBoundNullness((KotlinTypeMarker) it9.next())) {
                                list = upperBounds;
                            }
                        }
                    }
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false);
                }
                if (((List) lazyC.getValue()).isEmpty()) {
                    return null;
                }
                List list3 = (List) lazyC.getValue();
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it10 = list3.iterator();
                    while (it10.hasNext()) {
                        if (getShouldPropagateBoundNullness((KotlinTypeMarker) it10.next())) {
                            list = (List) lazyC.getValue();
                        }
                    }
                }
                return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, true);
                List<KotlinTypeMarker> list4 = list;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                } else {
                    Iterator<T> it11 = list4.iterator();
                    while (it11.hasNext()) {
                        if (!typeSystem.isNullableType((KotlinTypeMarker) it11.next())) {
                            nullabilityQualifier = NullabilityQualifier.NOT_NULL;
                            break;
                        }
                    }
                    nullabilityQualifier = NullabilityQualifier.NULLABLE;
                }
                return new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, list != upperBounds);
            }
        }
        return null;
    }

    public abstract NullabilityQualifierWithMigrationStatus c(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009b  */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiers(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker r18, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> r19, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 687
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts.computeIndexedQualifiers(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker, java.lang.Iterable, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementInfo, boolean):kotlin.jvm.functions.Function1");
    }

    public final NullabilityQualifier d(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        if (typeSystem.isMarkedNullable(typeSystem.lowerBoundIfFlexible(kotlinTypeMarker))) {
            return NullabilityQualifier.NULLABLE;
        }
        if (typeSystem.isMarkedNullable(typeSystem.upperBoundIfFlexible(kotlinTypeMarker))) {
            return null;
        }
        return NullabilityQualifier.NOT_NULL;
    }

    public final ArrayList e(KotlinTypeMarker kotlinTypeMarker) {
        TypeSystemContext typeSystem = getTypeSystem();
        a aVar = new a(kotlinTypeMarker, getAnnotationTypeQualifierResolver().extractAndMergeDefaultQualifiers(getContainerDefaultTypeQualifiers(), getAnnotations(kotlinTypeMarker)), null);
        q qVar = new q(this, typeSystem, 16);
        ArrayList arrayList = new ArrayList(1);
        a(aVar, arrayList, qVar);
        return arrayList;
    }

    public abstract boolean forceWarning(@NotNull TAnnotation tannotation, KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract AbstractAnnotationTypeQualifierResolver<TAnnotation> getAnnotationTypeQualifierResolver();

    @NotNull
    public abstract Iterable<TAnnotation> getAnnotations(@NotNull KotlinTypeMarker kotlinTypeMarker);

    @NotNull
    public abstract Iterable<TAnnotation> getContainerAnnotations();

    @NotNull
    public abstract AnnotationQualifierApplicabilityType getContainerApplicabilityType();

    public abstract JavaTypeQualifiersByElementType getContainerDefaultTypeQualifiers();

    public abstract boolean getContainerIsVarargParameter();

    public abstract boolean getEnableImprovementsInStrictMode();

    public abstract KotlinTypeMarker getEnhancedForWarnings(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public boolean getForceOnlyHeadTypeConstructor() {
        return false;
    }

    public abstract FqNameUnsafe getFqNameUnsafe(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public boolean getShouldPropagateBoundNullness(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return true;
    }

    public abstract boolean getSkipRawTypeArguments();

    @NotNull
    public abstract TypeSystemContext getTypeSystem();

    public abstract boolean isArrayOrPrimitiveArray(@NotNull KotlinTypeMarker kotlinTypeMarker);

    public abstract boolean isCovariant();

    public abstract boolean isEqual(@NotNull KotlinTypeMarker kotlinTypeMarker, @NotNull KotlinTypeMarker kotlinTypeMarker2);

    public abstract boolean isFromJava(@NotNull TypeParameterMarker typeParameterMarker);

    public boolean isNotNullTypeParameterCompat(@NotNull KotlinTypeMarker kotlinTypeMarker) {
        Intrinsics.checkNotNullParameter(kotlinTypeMarker, "<this>");
        return false;
    }
}

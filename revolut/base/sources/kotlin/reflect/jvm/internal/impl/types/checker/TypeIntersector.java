package kotlin.reflect.jvm.internal.impl.types.checker;

import fi7.s;
import hkm.f;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class TypeIntersector {

    @NotNull
    public static final TypeIntersector INSTANCE = new TypeIntersector();

    public static ArrayList a(AbstractCollection abstractCollection, Function2 function2) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it8 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
        while (it8.hasNext()) {
            SimpleType simpleType = (SimpleType) it8.next();
            if (!arrayList.isEmpty()) {
                Iterator it9 = arrayList.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    SimpleType simpleType2 = (SimpleType) it9.next();
                    if (simpleType2 != simpleType) {
                        Intrinsics.h(simpleType2);
                        Intrinsics.h(simpleType);
                        if (((Boolean) function2.invoke(simpleType2, simpleType)).booleanValue()) {
                            it8.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final boolean access$isStrictSupertype(TypeIntersector typeIntersector, KotlinType kotlinType, KotlinType kotlinType2) {
        typeIntersector.getClass();
        NewKotlinTypeCheckerImpl newKotlinTypeCheckerImpl = NewKotlinTypeChecker.Companion.getDefault();
        return newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType, kotlinType2) && !newKotlinTypeCheckerImpl.isSubtypeOf(kotlinType2, kotlinType);
    }

    @NotNull
    public final SimpleType intersectTypes$descriptors(@NotNull List<? extends SimpleType> types) {
        SimpleType simpleTypeCreateType;
        Intrinsics.checkNotNullParameter(types, "types");
        types.size();
        ArrayList<SimpleType> arrayList = new ArrayList();
        for (SimpleType simpleType : types) {
            if (simpleType.getConstructor() instanceof IntersectionTypeConstructor) {
                Collection<KotlinType> supertypes = simpleType.getConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                Collection<KotlinType> collection = supertypes;
                ArrayList arrayList2 = new ArrayList(w.t(collection, 10));
                for (KotlinType kotlinType : collection) {
                    Intrinsics.h(kotlinType);
                    SimpleType simpleTypeUpperIfFlexible = FlexibleTypesKt.upperIfFlexible(kotlinType);
                    if (simpleType.isMarkedNullable()) {
                        simpleTypeUpperIfFlexible = simpleTypeUpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(simpleTypeUpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(simpleType);
            }
        }
        f fVarA = f.START;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            fVarA = fVarA.a((UnwrappedType) it8.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (SimpleType simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default : arrayList) {
            if (fVarA == f.NOT_NULL) {
                if (simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default instanceof NewCapturedType) {
                    simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.withNotNullProjection((NewCapturedType) simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
                }
                simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default = SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull$default(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default, false, 1, null);
            }
            linkedHashSet.add(simpleTypeMakeSimpleTypeDefinitelyNotNullOrNotNull$default);
        }
        List<? extends SimpleType> list = types;
        ArrayList arrayList3 = new ArrayList(w.t(list, 10));
        Iterator<T> it9 = list.iterator();
        while (it9.hasNext()) {
            arrayList3.add(((SimpleType) it9.next()).getAttributes());
        }
        Iterator it10 = arrayList3.iterator();
        if (!it10.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it10.next();
        while (it10.hasNext()) {
            next = ((TypeAttributes) next).intersect((TypeAttributes) it10.next());
        }
        TypeAttributes typeAttributes = (TypeAttributes) next;
        if (linkedHashSet.size() == 1) {
            simpleTypeCreateType = (SimpleType) d0.J0(linkedHashSet);
        } else {
            ArrayList arrayListA = a(linkedHashSet, new s(2, this, TypeIntersector.class, "isStrictSupertype", "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 13));
            arrayListA.isEmpty();
            SimpleType simpleTypeFindIntersectionType = IntegerLiteralTypeConstructor.Companion.findIntersectionType(arrayListA);
            if (simpleTypeFindIntersectionType != null) {
                simpleTypeCreateType = simpleTypeFindIntersectionType;
            } else {
                ArrayList arrayListA2 = a(arrayListA, new s(2, NewKotlinTypeChecker.Companion.getDefault(), NewKotlinTypeCheckerImpl.class, "equalTypes", "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z", 0, 14));
                arrayListA2.isEmpty();
                simpleTypeCreateType = arrayListA2.size() < 2 ? (SimpleType) d0.J0(arrayListA2) : new IntersectionTypeConstructor(linkedHashSet).createType();
            }
        }
        return simpleTypeCreateType.replaceAttributes(typeAttributes);
    }
}

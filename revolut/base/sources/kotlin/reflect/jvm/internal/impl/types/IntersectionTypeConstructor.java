package kotlin.reflect.jvm.internal.impl.types;

import ghk.x;
import gkm.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.model.IntersectionTypeConstructorMarker;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class IntersectionTypeConstructor implements TypeConstructor, IntersectionTypeConstructorMarker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public KotlinType f187780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f187781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f187782c;

    public IntersectionTypeConstructor(@NotNull Collection<? extends KotlinType> typesToIntersect) {
        Intrinsics.checkNotNullParameter(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(typesToIntersect);
        this.f187781b = linkedHashSet;
        this.f187782c = linkedHashSet.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String makeDebugNameForIntersectionType$default(IntersectionTypeConstructor intersectionTypeConstructor, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = b.f144509c;
        }
        return intersectionTypeConstructor.makeDebugNameForIntersectionType(function1);
    }

    @NotNull
    public final MemberScope createScopeForKotlinType() {
        return TypeIntersectionScope.Companion.create("member scope for intersection type", this.f187781b);
    }

    @NotNull
    public final SimpleType createType() {
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(TypeAttributes.Companion.getEmpty(), this, f0.f322471a, false, createScopeForKotlinType(), new x(this, 1));
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IntersectionTypeConstructor)) {
            return false;
        }
        return Intrinsics.f(this.f187781b, ((IntersectionTypeConstructor) obj2).f187781b);
    }

    public final KotlinType getAlternativeType() {
        return this.f187780a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        KotlinBuiltIns builtIns = ((KotlinType) this.f187781b.iterator().next()).getConstructor().getBuiltIns();
        Intrinsics.checkNotNullExpressionValue(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo3795getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return f0.f322471a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return this.f187781b;
    }

    public int hashCode() {
        return this.f187782c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @NotNull
    public final String makeDebugNameForIntersectionType(@NotNull final Function1<? super KotlinType, ? extends Object> getProperTypeRelatedToStringify) {
        Intrinsics.checkNotNullParameter(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return d0.k0(d0.P0(this.f187781b, new Comparator() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                KotlinType kotlinType = (KotlinType) t2;
                Intrinsics.h(kotlinType);
                Function1 function1 = getProperTypeRelatedToStringify;
                String string = function1.invoke(kotlinType).toString();
                KotlinType kotlinType2 = (KotlinType) t3;
                Intrinsics.h(kotlinType2);
                return cim.b.b(string, function1.invoke(kotlinType2).toString());
            }
        }), " & ", "{", "}", 0, new bbm.a(1, getProperTypeRelatedToStringify), 24);
    }

    @NotNull
    public final IntersectionTypeConstructor setAlternative(KotlinType kotlinType) {
        IntersectionTypeConstructor intersectionTypeConstructor = new IntersectionTypeConstructor(this.f187781b);
        intersectionTypeConstructor.f187780a = kotlinType;
        return intersectionTypeConstructor;
    }

    @NotNull
    public String toString() {
        return makeDebugNameForIntersectionType$default(this, null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public IntersectionTypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<KotlinType> supertypes = getSupertypes();
        ArrayList arrayList = new ArrayList(w.t(supertypes, 10));
        Iterator<T> it8 = supertypes.iterator();
        boolean z = false;
        while (it8.hasNext()) {
            arrayList.add(((KotlinType) it8.next()).refine(kotlinTypeRefiner));
            z = true;
        }
        IntersectionTypeConstructor alternative = null;
        if (z) {
            KotlinType alternativeType = getAlternativeType();
            alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType != null ? alternativeType.refine(kotlinTypeRefiner) : null);
        }
        return alternative == null ? this : alternative;
    }
}

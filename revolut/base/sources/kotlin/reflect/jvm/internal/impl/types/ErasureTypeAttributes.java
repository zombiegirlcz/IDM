package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes14.dex */
public class ErasureTypeAttributes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TypeUsage f187772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f187773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SimpleType f187774c;

    public ErasureTypeAttributes(@NotNull TypeUsage howThisTypeIsUsed, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f187772a = howThisTypeIsUsed;
        this.f187773b = set;
        this.f187774c = simpleType;
    }

    public boolean equals(Object obj2) {
        if (!(obj2 instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj2;
        return Intrinsics.f(erasureTypeAttributes.getDefaultType(), getDefaultType()) && erasureTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed();
    }

    public SimpleType getDefaultType() {
        return this.f187774c;
    }

    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.f187772a;
    }

    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f187773b;
    }

    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        return getHowThisTypeIsUsed().hashCode() + (iHashCode * 31) + iHashCode;
    }

    @NotNull
    public ErasureTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        return new ErasureTypeAttributes(howThisTypeIsUsed, visitedTypeParameters != null ? a1.m(visitedTypeParameters, typeParameter) : y0.b(typeParameter), getDefaultType());
    }
}

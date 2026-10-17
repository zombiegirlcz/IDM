package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import ch.qos.logback.core.CoreConstants;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;
import zhm.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaTypeAttributes extends ErasureTypeAttributes {
    public final TypeUsage d;
    public final JavaTypeFlexibility e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f187016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f187017h;
    public final SimpleType i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTypeAttributes(@NotNull TypeUsage howThisTypeIsUsed, @NotNull JavaTypeFlexibility flexibility, boolean z, boolean z3, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        super(howThisTypeIsUsed, set, simpleType);
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        this.d = howThisTypeIsUsed;
        this.e = flexibility;
        this.f = z;
        this.f187016g = z3;
        this.f187017h = set;
        this.i = simpleType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaTypeAttributes copy$default(JavaTypeAttributes javaTypeAttributes, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z3, Set set, SimpleType simpleType, int i, Object obj2) {
        if ((i & 1) != 0) {
            typeUsage = javaTypeAttributes.d;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = javaTypeAttributes.e;
        }
        if ((i & 4) != 0) {
            z = javaTypeAttributes.f;
        }
        if ((i & 8) != 0) {
            z3 = javaTypeAttributes.f187016g;
        }
        if ((i & 16) != 0) {
            set = javaTypeAttributes.f187017h;
        }
        if ((i & 32) != 0) {
            simpleType = javaTypeAttributes.i;
        }
        Set set2 = set;
        SimpleType simpleType2 = simpleType;
        return javaTypeAttributes.copy(typeUsage, javaTypeFlexibility, z, z3, set2, simpleType2);
    }

    @NotNull
    public final JavaTypeAttributes copy(@NotNull TypeUsage howThisTypeIsUsed, @NotNull JavaTypeFlexibility flexibility, boolean z, boolean z3, Set<? extends TypeParameterDescriptor> set, SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return new JavaTypeAttributes(howThisTypeIsUsed, flexibility, z, z3, set, simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public boolean equals(Object obj2) {
        if (!(obj2 instanceof JavaTypeAttributes)) {
            return false;
        }
        JavaTypeAttributes javaTypeAttributes = (JavaTypeAttributes) obj2;
        return Intrinsics.f(javaTypeAttributes.getDefaultType(), getDefaultType()) && javaTypeAttributes.getHowThisTypeIsUsed() == getHowThisTypeIsUsed() && javaTypeAttributes.e == this.e && javaTypeAttributes.f == this.f && javaTypeAttributes.f187016g == this.f187016g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public SimpleType getDefaultType() {
        return this.i;
    }

    @NotNull
    public final JavaTypeFlexibility getFlexibility() {
        return this.e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f187017h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    public int hashCode() {
        SimpleType defaultType = getDefaultType();
        int iHashCode = defaultType != null ? defaultType.hashCode() : 0;
        int iHashCode2 = getHowThisTypeIsUsed().hashCode() + (iHashCode * 31) + iHashCode;
        int iHashCode3 = this.e.hashCode() + (iHashCode2 * 31) + iHashCode2;
        int i = (iHashCode3 * 31) + (this.f ? 1 : 0) + iHashCode3;
        return (i * 31) + (this.f187016g ? 1 : 0) + i;
    }

    public final boolean isForAnnotationParameter() {
        return this.f187016g;
    }

    public final boolean isRaw() {
        return this.f;
    }

    @NotNull
    public final JavaTypeAttributes markIsRaw(boolean z) {
        return copy$default(this, null, null, z, false, null, null, 59, null);
    }

    @NotNull
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.d + ", flexibility=" + this.e + ", isRaw=" + this.f + ", isForAnnotationParameter=" + this.f187016g + ", visitedTypeParameters=" + this.f187017h + ", defaultType=" + this.i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @NotNull
    public JavaTypeAttributes withDefaultType(SimpleType simpleType) {
        return copy$default(this, null, null, false, false, null, simpleType, 31, null);
    }

    @NotNull
    public final JavaTypeAttributes withFlexibility(@NotNull JavaTypeFlexibility flexibility) {
        Intrinsics.checkNotNullParameter(flexibility, "flexibility");
        return copy$default(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.ErasureTypeAttributes
    @NotNull
    public JavaTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameter) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        return copy$default(this, null, null, false, false, getVisitedTypeParameters() != null ? a1.m(getVisitedTypeParameters(), typeParameter) : y0.b(typeParameter), null, 47, null);
    }

    public /* synthetic */ JavaTypeAttributes(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z3, Set set, SimpleType simpleType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : simpleType);
    }
}

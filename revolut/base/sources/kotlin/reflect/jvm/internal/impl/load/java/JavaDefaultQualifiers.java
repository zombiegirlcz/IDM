package kotlin.reflect.jvm.internal.impl.load.java;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaDefaultQualifiers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NullabilityQualifierWithMigrationStatus f186868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f186869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186870c;
    public final boolean d;

    public JavaDefaultQualifiers(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifier, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f186868a = nullabilityQualifier;
        this.f186869b = qualifierApplicabilityTypes;
        this.f186870c = z;
        this.d = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JavaDefaultQualifiers copy$default(JavaDefaultQualifiers javaDefaultQualifiers, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers.f186868a;
        }
        if ((i & 2) != 0) {
            collection = javaDefaultQualifiers.f186869b;
        }
        if ((i & 4) != 0) {
            z = javaDefaultQualifiers.f186870c;
        }
        if ((i & 8) != 0) {
            z3 = javaDefaultQualifiers.d;
        }
        return javaDefaultQualifiers.copy(nullabilityQualifierWithMigrationStatus, collection, z, z3);
    }

    @NotNull
    public final JavaDefaultQualifiers copy(@NotNull NullabilityQualifierWithMigrationStatus nullabilityQualifier, @NotNull Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new JavaDefaultQualifiers(nullabilityQualifier, qualifierApplicabilityTypes, z, z3);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JavaDefaultQualifiers)) {
            return false;
        }
        JavaDefaultQualifiers javaDefaultQualifiers = (JavaDefaultQualifiers) obj2;
        return Intrinsics.f(this.f186868a, javaDefaultQualifiers.f186868a) && Intrinsics.f(this.f186869b, javaDefaultQualifiers.f186869b) && this.f186870c == javaDefaultQualifiers.f186870c && this.d == javaDefaultQualifiers.d;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f186870c;
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus getNullabilityQualifier() {
        return this.f186868a;
    }

    @NotNull
    public final Collection<AnnotationQualifierApplicabilityType> getQualifierApplicabilityTypes() {
        return this.f186869b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f186869b.hashCode() + (this.f186868a.hashCode() * 31)) * 31, 31, this.f186870c);
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb6.append(this.f186868a);
        sb6.append(", qualifierApplicabilityTypes=");
        sb6.append(this.f186869b);
        sb6.append(", definitelyNotNull=");
        sb6.append(this.f186870c);
        sb6.append(", preferQualifierOverBound=");
        return j6.a.x(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ JavaDefaultQualifiers(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, Collection collection, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifierWithMigrationStatus, collection, (i & 4) != 0 ? nullabilityQualifierWithMigrationStatus.getQualifier() == NullabilityQualifier.NOT_NULL : z, (i & 8) != 0 ? false : z3);
    }
}

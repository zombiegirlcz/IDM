package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class NullabilityQualifierWithMigrationStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f187030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187031b;

    public NullabilityQualifierWithMigrationStatus(@NotNull NullabilityQualifier qualifier, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f187030a = qualifier;
        this.f187031b = z;
    }

    public static /* synthetic */ NullabilityQualifierWithMigrationStatus copy$default(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifier nullabilityQualifier, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            nullabilityQualifier = nullabilityQualifierWithMigrationStatus.f187030a;
        }
        if ((i & 2) != 0) {
            z = nullabilityQualifierWithMigrationStatus.f187031b;
        }
        return nullabilityQualifierWithMigrationStatus.copy(nullabilityQualifier, z);
    }

    @NotNull
    public final NullabilityQualifierWithMigrationStatus copy(@NotNull NullabilityQualifier qualifier, boolean z) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new NullabilityQualifierWithMigrationStatus(qualifier, z);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof NullabilityQualifierWithMigrationStatus)) {
            return false;
        }
        NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = (NullabilityQualifierWithMigrationStatus) obj2;
        return this.f187030a == nullabilityQualifierWithMigrationStatus.f187030a && this.f187031b == nullabilityQualifierWithMigrationStatus.f187031b;
    }

    @NotNull
    public final NullabilityQualifier getQualifier() {
        return this.f187030a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f187031b) + (this.f187030a.hashCode() * 31);
    }

    public final boolean isForWarningOnly() {
        return this.f187031b;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb6.append(this.f187030a);
        sb6.append(", isForWarningOnly=");
        return a.x(sb6, this.f187031b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ NullabilityQualifierWithMigrationStatus(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}

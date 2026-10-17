package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JavaTypeQualifiers {

    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final JavaTypeQualifiers e = new JavaTypeQualifiers(null, null, false, false, 8, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NullabilityQualifier f187026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutabilityQualifier f187027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187028c;
    public final boolean d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final JavaTypeQualifiers getNONE() {
            return JavaTypeQualifiers.e;
        }
    }

    public JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z3) {
        this.f187026a = nullabilityQualifier;
        this.f187027b = mutabilityQualifier;
        this.f187028c = z;
        this.d = z3;
    }

    public static /* synthetic */ JavaTypeQualifiers copy$default(JavaTypeQualifiers javaTypeQualifiers, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            nullabilityQualifier = javaTypeQualifiers.f187026a;
        }
        if ((i & 2) != 0) {
            mutabilityQualifier = javaTypeQualifiers.f187027b;
        }
        if ((i & 4) != 0) {
            z = javaTypeQualifiers.f187028c;
        }
        if ((i & 8) != 0) {
            z3 = javaTypeQualifiers.d;
        }
        return javaTypeQualifiers.copy(nullabilityQualifier, mutabilityQualifier, z, z3);
    }

    @NotNull
    public final JavaTypeQualifiers copy(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z3) {
        return new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, z, z3);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JavaTypeQualifiers)) {
            return false;
        }
        JavaTypeQualifiers javaTypeQualifiers = (JavaTypeQualifiers) obj2;
        return this.f187026a == javaTypeQualifiers.f187026a && this.f187027b == javaTypeQualifiers.f187027b && this.f187028c == javaTypeQualifiers.f187028c && this.d == javaTypeQualifiers.d;
    }

    public final boolean getDefinitelyNotNull() {
        return this.f187028c;
    }

    public final MutabilityQualifier getMutability() {
        return this.f187027b;
    }

    public final NullabilityQualifier getNullability() {
        return this.f187026a;
    }

    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.f187026a;
        int iHashCode = (nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode()) * 31;
        MutabilityQualifier mutabilityQualifier = this.f187027b;
        return Boolean.hashCode(this.d) + a.c((iHashCode + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31, 31, this.f187028c);
    }

    public final boolean isNullabilityQualifierForWarning() {
        return this.d;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("JavaTypeQualifiers(nullability=");
        sb6.append(this.f187026a);
        sb6.append(", mutability=");
        sb6.append(this.f187027b);
        sb6.append(", definitelyNotNull=");
        sb6.append(this.f187028c);
        sb6.append(", isNullabilityQualifierForWarning=");
        return a.x(sb6, this.d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public /* synthetic */ JavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z3);
    }
}

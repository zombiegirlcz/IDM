package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmFlexibleTypeUpperBound {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KmType f186783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186784b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KmFlexibleTypeUpperBound(@NotNull KmType type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f186783a = type;
        this.f186784b = str;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KmFlexibleTypeUpperBound)) {
            return false;
        }
        KmFlexibleTypeUpperBound kmFlexibleTypeUpperBound = (KmFlexibleTypeUpperBound) obj2;
        return Intrinsics.f(this.f186783a, kmFlexibleTypeUpperBound.f186783a) && Intrinsics.f(this.f186784b, kmFlexibleTypeUpperBound.f186784b);
    }

    @NotNull
    public final KmType getType() {
        return this.f186783a;
    }

    public final String getTypeFlexibilityId() {
        return this.f186784b;
    }

    public int hashCode() {
        int iHashCode = this.f186783a.hashCode() * 31;
        String str = this.f186784b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb6.append(this.f186783a);
        sb6.append(", typeFlexibilityId=");
        return a.u(sb6, this.f186784b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}

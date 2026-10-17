package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmTypeProjection {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final KmTypeProjection STAR = new KmTypeProjection(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KmVariance f186810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KmType f186811b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public KmTypeProjection(KmVariance kmVariance, KmType kmType) {
        this.f186810a = kmVariance;
        this.f186811b = kmType;
    }

    public final KmVariance component1() {
        return this.f186810a;
    }

    public final KmType component2() {
        return this.f186811b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KmTypeProjection)) {
            return false;
        }
        KmTypeProjection kmTypeProjection = (KmTypeProjection) obj2;
        return this.f186810a == kmTypeProjection.f186810a && Intrinsics.f(this.f186811b, kmTypeProjection.f186811b);
    }

    public int hashCode() {
        KmVariance kmVariance = this.f186810a;
        int iHashCode = (kmVariance == null ? 0 : kmVariance.hashCode()) * 31;
        KmType kmType = this.f186811b;
        return iHashCode + (kmType != null ? kmType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "KmTypeProjection(variance=" + this.f186810a + ", type=" + this.f186811b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

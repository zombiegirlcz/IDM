package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ApproximationBounds<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f187851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f187852b;

    public ApproximationBounds(T t2, T t3) {
        this.f187851a = t2;
        this.f187852b = t3;
    }

    public final T component1() {
        return (T) this.f187851a;
    }

    public final T component2() {
        return (T) this.f187852b;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApproximationBounds)) {
            return false;
        }
        ApproximationBounds approximationBounds = (ApproximationBounds) obj2;
        return Intrinsics.f(this.f187851a, approximationBounds.f187851a) && Intrinsics.f(this.f187852b, approximationBounds.f187852b);
    }

    public final T getLower() {
        return (T) this.f187851a;
    }

    public final T getUpper() {
        return (T) this.f187852b;
    }

    public int hashCode() {
        Object obj2 = this.f187851a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        Object obj3 = this.f187852b;
        return iHashCode + (obj3 != null ? obj3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ApproximationBounds(lower=" + this.f187851a + ", upper=" + this.f187852b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

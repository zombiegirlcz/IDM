package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class KmConstantValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186772a;

    public KmConstantValue(Object obj2) {
        this.f186772a = obj2;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof KmConstantValue) && Intrinsics.f(this.f186772a, ((KmConstantValue) obj2).f186772a);
    }

    public int hashCode() {
        Object obj2 = this.f186772a;
        if (obj2 == null) {
            return 0;
        }
        return obj2.hashCode();
    }

    @NotNull
    public String toString() {
        return "KmConstantValue(value=" + this.f186772a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

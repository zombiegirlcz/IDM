package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import ijm.q;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.t0;

/* JADX INFO: loaded from: classes14.dex */
public final class KmAnnotation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f186737b;

    public KmAnnotation(@NotNull String className, @NotNull Map<String, ? extends KmAnnotationArgument> arguments) {
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f186736a = className;
        this.f186737b = arguments;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof KmAnnotation)) {
            return false;
        }
        KmAnnotation kmAnnotation = (KmAnnotation) obj2;
        return Intrinsics.f(this.f186736a, kmAnnotation.f186736a) && Intrinsics.f(this.f186737b, kmAnnotation.f186737b);
    }

    @NotNull
    public final Map<String, KmAnnotationArgument> getArguments() {
        return this.f186737b;
    }

    @NotNull
    public final String getClassName() {
        return this.f186736a;
    }

    public int hashCode() {
        return this.f186737b.hashCode() + (this.f186736a.hashCode() * 31);
    }

    @NotNull
    public String toString() throws IOException {
        return "@" + this.f186736a + CoreConstants.LEFT_PARENTHESIS_CHAR + d0.k0(t0.C(this.f186737b), null, null, null, 0, q.f161862a, 31) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

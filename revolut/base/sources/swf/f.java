package swf;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f266209c = new f(r0.g(), f0.f322471a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f266210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266211b;

    public f(Map values, List errors) {
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(errors, "errors");
        this.f266210a = values;
        this.f266211b = errors;
    }

    public static f a(f fVar, Map values, List errors, int i) {
        if ((i & 1) != 0) {
            values = fVar.f266210a;
        }
        if ((i & 2) != 0) {
            errors = fVar.f266211b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(errors, "errors");
        return new f(values, errors);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f266210a, fVar.f266210a) && Intrinsics.f(this.f266211b, fVar.f266211b);
    }

    public final int hashCode() {
        return this.f266211b.hashCode() + (this.f266210a.hashCode() * 31);
    }
}

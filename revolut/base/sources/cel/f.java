package cel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements n {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23501a;

    public f(ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f23501a = points;
    }

    @Override // cel.n
    public final List a() {
        return this.f23501a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f23501a.equals(((f) obj2).f23501a);
    }

    public final int hashCode() {
        return this.f23501a.hashCode();
    }
}

package cel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23502a;

    public h(ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f23502a = points;
    }

    @Override // cel.n
    public final List a() {
        return this.f23502a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f23502a.equals(((h) obj2).f23502a);
    }

    public final int hashCode() {
        return this.f23502a.hashCode();
    }
}

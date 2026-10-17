package cel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23503a;

    public j(ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f23503a = points;
    }

    @Override // cel.n
    public final List a() {
        return this.f23503a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f23503a.equals(((j) obj2).f23503a);
    }

    public final int hashCode() {
        return this.f23503a.hashCode();
    }
}

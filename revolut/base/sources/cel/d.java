package cel;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f23500a;

    public d(ArrayList points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f23500a = points;
    }

    @Override // cel.n
    public final List a() {
        return this.f23500a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f23500a.equals(((d) obj2).f23500a);
    }

    public final int hashCode() {
        return this.f23500a.hashCode();
    }
}

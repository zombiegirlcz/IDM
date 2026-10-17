package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements b0 {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f13922a;

    public a0(z pointsRedemption) {
        Intrinsics.checkNotNullParameter(pointsRedemption, "pointsRedemption");
        this.f13922a = pointsRedemption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f13922a, ((a0) obj2).f13922a);
    }

    public final int hashCode() {
        return this.f13922a.hashCode();
    }
}

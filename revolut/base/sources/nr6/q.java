package nr6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f218579b;

    public q(String id10, String formattedNumber) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(formattedNumber, "formattedNumber");
        this.f218578a = id10;
        this.f218579b = formattedNumber;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f218578a, qVar.f218578a) && Intrinsics.f(this.f218579b, qVar.f218579b);
    }

    public final int hashCode() {
        return this.f218579b.hashCode() + (this.f218578a.hashCode() * 31);
    }
}

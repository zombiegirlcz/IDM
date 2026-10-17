package pr6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f238960b;

    public q(List payments, String str) {
        Intrinsics.checkNotNullParameter(payments, "payments");
        this.f238959a = payments;
        this.f238960b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f238959a, qVar.f238959a) && Intrinsics.f(this.f238960b, qVar.f238960b);
    }

    public final int hashCode() {
        int iHashCode = this.f238959a.hashCode() * 31;
        String str = this.f238960b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

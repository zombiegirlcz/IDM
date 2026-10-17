package ugb;

import cli.j;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f279990a;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f279990a, ((a) obj2).f279990a);
    }

    public final int hashCode() {
        return this.f279990a.hashCode();
    }

    public a(Set selectedCriteria) {
        Intrinsics.checkNotNullParameter(selectedCriteria, "selectedCriteria");
        this.f279990a = selectedCriteria;
    }

    public a(int i) {
        this(h0.f322473a);
    }
}

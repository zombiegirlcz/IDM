package fj0;

import a0.d;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements Serializable {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135518a;

    public static final void a(int i) {
        if (i < 0 || i >= 1000) {
            throw new IllegalStateException(d.n("value should be in range 0-999, but ", i).toString());
        }
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof b) {
            return this.f135518a == ((b) obj2).f135518a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f135518a);
    }

    public final String toString() {
        return j6.a.l(this.f135518a, "CountryPhoneCode(value=", ")");
    }
}

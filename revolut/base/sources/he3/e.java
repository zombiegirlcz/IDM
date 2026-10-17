package he3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151557a;

    public e(ArrayList amounts) {
        Intrinsics.checkNotNullParameter(amounts, "amounts");
        this.f151557a = amounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f151557a, ((e) obj2).f151557a);
    }

    public final int hashCode() {
        return this.f151557a.hashCode();
    }
}

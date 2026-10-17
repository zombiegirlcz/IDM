package he3;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151558a;

    public f(ArrayList amounts) {
        Intrinsics.checkNotNullParameter(amounts, "amounts");
        this.f151558a = amounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f151558a, ((f) obj2).f151558a);
    }

    public final int hashCode() {
        return this.f151558a.hashCode();
    }
}

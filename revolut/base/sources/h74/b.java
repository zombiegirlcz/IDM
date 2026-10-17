package h74;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f149843a;

    public b(List consentsNames) {
        Intrinsics.checkNotNullParameter(consentsNames, "consentsNames");
        this.f149843a = consentsNames;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f149843a, ((b) obj2).f149843a);
    }

    public final int hashCode() {
        return this.f149843a.hashCode();
    }
}

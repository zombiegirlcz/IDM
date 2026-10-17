package r7a;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f252055a;

    public f(LinkedHashMap result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f252055a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f252055a.equals(((f) obj2).f252055a);
    }

    public final int hashCode() {
        return this.f252055a.hashCode();
    }
}

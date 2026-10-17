package r7a;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f252054a;

    public e(LinkedHashMap result) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.f252054a = result;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f252054a.equals(((e) obj2).f252054a);
    }

    public final int hashCode() {
        return this.f252054a.hashCode();
    }
}

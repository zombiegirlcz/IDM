package sy3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266617a;

    public g(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f266617a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f266617a, ((g) obj2).f266617a);
    }

    public final int hashCode() {
        return this.f266617a.hashCode();
    }
}

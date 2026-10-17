package z45;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f319313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f319314b;

    public b(String text, a action) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f319313a = text;
        this.f319314b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f319313a, bVar.f319313a) && this.f319314b == bVar.f319314b;
    }

    public final int hashCode() {
        return this.f319314b.hashCode() + (this.f319313a.hashCode() * 31);
    }
}

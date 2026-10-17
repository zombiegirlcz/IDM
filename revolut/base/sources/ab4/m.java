package ab4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2878a;

    public m(List consents) {
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f2878a = consents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f2878a, ((m) obj2).f2878a);
    }

    public final int hashCode() {
        return this.f2878a.hashCode();
    }
}

package g48;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140347a;

    public a(List features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f140347a = features;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f140347a, ((a) obj2).f140347a);
    }

    public final int hashCode() {
        return this.f140347a.hashCode();
    }
}

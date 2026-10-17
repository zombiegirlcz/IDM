package e93;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f123879a;

    public k0(List texturesUrls) {
        Intrinsics.checkNotNullParameter(texturesUrls, "texturesUrls");
        this.f123879a = texturesUrls;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f123879a, ((k0) obj2).f123879a);
    }

    public final int hashCode() {
        return this.f123879a.hashCode();
    }
}

package wn2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f298709b;

    public c(String key, List params) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f298708a = key;
        this.f298709b = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f298708a, cVar.f298708a) && Intrinsics.f(this.f298709b, cVar.f298709b);
    }

    public final int hashCode() {
        return this.f298709b.hashCode() + (this.f298708a.hashCode() * 31);
    }
}

package dm3;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f115840b;

    public k(aim.e items, f header) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        this.f115839a = items;
        this.f115840b = header;
    }

    @Override // cli.p
    public final List c() {
        return this.f115839a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f115839a, kVar.f115839a) && Intrinsics.f(this.f115840b, kVar.f115840b);
    }

    public final int hashCode() {
        return this.f115840b.hashCode() + (this.f115839a.hashCode() * 31);
    }
}

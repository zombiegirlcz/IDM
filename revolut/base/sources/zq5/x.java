package zq5;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f324403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f324404c;

    public x(List items, String str, w navBarData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarData, "navBarData");
        this.f324402a = items;
        this.f324403b = str;
        this.f324404c = navBarData;
    }

    @Override // cli.p
    public final List c() {
        return this.f324402a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f324402a, xVar.f324402a) && Intrinsics.f(this.f324403b, xVar.f324403b) && Intrinsics.f(this.f324404c, xVar.f324404c);
    }

    public final int hashCode() {
        int iHashCode = this.f324402a.hashCode() * 31;
        String str = this.f324403b;
        return this.f324404c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}

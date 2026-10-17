package d6g;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f111542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f111543b;

    public k(a navBarModel, ArrayList items) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f111542a = navBarModel;
        this.f111543b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f111543b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f111542a.equals(kVar.f111542a) && this.f111543b.equals(kVar.f111543b);
    }

    public final int hashCode() {
        return this.f111543b.hashCode() + (this.f111542a.hashCode() * 31);
    }
}

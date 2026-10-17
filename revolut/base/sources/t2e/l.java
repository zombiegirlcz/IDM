package t2e;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f267551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f267552b;

    public l() {
        this(null, 3, 0);
    }

    @Override // cli.p
    public final List c() {
        return this.f267551a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f267551a, lVar.f267551a) && this.f267552b == lVar.f267552b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f267552b) + (this.f267551a.hashCode() * 31);
    }

    public l(List items, int i) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f267551a = items;
        this.f267552b = i;
    }

    public l(List list, int i, int i2) {
        this((i & 1) != 0 ? f0.f322471a : list, R$attr.uikit_dp0);
    }
}

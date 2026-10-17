package gi1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f144042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f144043c;
    public final Clause d;

    public n(Clause largeButtonText, List items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(largeButtonText, "largeButtonText");
        this.f144041a = items;
        this.f144042b = z;
        this.f144043c = menuItems;
        this.d = largeButtonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f144041a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f144041a, nVar.f144041a) && this.f144042b == nVar.f144042b && Intrinsics.f(this.f144043c, nVar.f144043c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(j6.a.c(this.f144041a.hashCode() * 31, 31, this.f144042b), 31, this.f144043c);
    }
}

package h0f;

import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f148395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f148396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IconNavBarMenuItem f148397c;

    public n(aim.e items, boolean z, IconNavBarMenuItem headerMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerMenuItem, "headerMenuItem");
        this.f148395a = items;
        this.f148396b = z;
        this.f148397c = headerMenuItem;
    }

    @Override // cli.p
    public final List c() {
        return this.f148395a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f148395a, nVar.f148395a) && this.f148396b == nVar.f148396b && Intrinsics.f(this.f148397c, nVar.f148397c);
    }

    public final int hashCode() {
        return this.f148397c.hashCode() + j6.a.c(this.f148395a.hashCode() * 31, 31, this.f148396b);
    }
}

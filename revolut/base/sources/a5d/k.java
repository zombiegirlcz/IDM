package a5d;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f1360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1361b;

    public k(NavBarWithContainerBackground background, int i) {
        Intrinsics.checkNotNullParameter(background, "background");
        this.f1360a = background;
        this.f1361b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f1360a, kVar.f1360a) && this.f1361b == kVar.f1361b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1361b) + (this.f1360a.hashCode() * 31);
    }
}

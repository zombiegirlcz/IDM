package au0;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g1 implements koi.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground f9208b;

    public g1(String listId, NavBarWithContainerBackground background) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f9207a = listId;
        this.f9208b = background;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF58244a() {
        return this.f9207a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj2;
        return Intrinsics.f(this.f9207a, g1Var.f9207a) && Intrinsics.f(this.f9208b, g1Var.f9208b);
    }

    public final int hashCode() {
        return this.f9208b.hashCode() + (this.f9207a.hashCode() * 31);
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if ((oldItem instanceof g1 ? (g1) oldItem : null) != null) {
            return new j1(!Intrinsics.f(((g1) oldItem).f9208b, this.f9208b));
        }
        return null;
    }
}

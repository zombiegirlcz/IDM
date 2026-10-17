package l5a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f192213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f192214b;

    public p(m navbarUiState, ArrayList items) {
        Intrinsics.checkNotNullParameter(navbarUiState, "navbarUiState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f192213a = navbarUiState;
        this.f192214b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f192214b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f192213a.equals(pVar.f192213a) && this.f192214b.equals(pVar.f192214b);
    }

    public final int hashCode() {
        return this.f192214b.hashCode() + (this.f192213a.hashCode() * 31);
    }
}

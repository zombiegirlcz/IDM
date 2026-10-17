package lv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f200334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a f200335b;

    public q(List items, com.revolut.feature.freelancer.impl.ui.cashback.screen.booster.a headerUiState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerUiState, "headerUiState");
        this.f200334a = items;
        this.f200335b = headerUiState;
    }

    @Override // cli.p
    public final List c() {
        return this.f200334a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f200334a, qVar.f200334a) && Intrinsics.f(this.f200335b, qVar.f200335b);
    }

    public final int hashCode() {
        return this.f200335b.hashCode() + (this.f200334a.hashCode() * 31);
    }
}

package rv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.a f257709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f257710b;

    public r(com.revolut.feature.freelancer.impl.ui.cashback.screen.plan.a headerDetailsUiState, List items) {
        Intrinsics.checkNotNullParameter(headerDetailsUiState, "headerDetailsUiState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f257709a = headerDetailsUiState;
        this.f257710b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f257710b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f257709a, rVar.f257709a) && Intrinsics.f(this.f257710b, rVar.f257710b);
    }

    public final int hashCode() {
        return this.f257710b.hashCode() + (this.f257709a.hashCode() * 31);
    }
}

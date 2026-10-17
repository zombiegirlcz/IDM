package gc6;

import com.revolut.feature.donations.impl.domain.model.CharityTransactionsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharityTransactionsParams f142357a;

    public k(CharityTransactionsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f142357a = params;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f142357a, ((k) obj2).f142357a);
    }

    public final int hashCode() {
        return this.f142357a.hashCode();
    }
}

package oug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureFeedbackFeature;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountClosureFeedbackFeature f229871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229872b;

    public e(AccountClosureFeedbackFeature feature, String str) {
        Intrinsics.checkNotNullParameter(feature, "feature");
        this.f229871a = feature;
        this.f229872b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f229871a, eVar.f229871a) && Intrinsics.f(this.f229872b, eVar.f229872b);
    }

    public final int hashCode() {
        int iHashCode = this.f229871a.hashCode() * 31;
        String str = this.f229872b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

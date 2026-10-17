package yv9;

import com.revolut.feature.payments.money_request.api.navigation.MoneyRequestActionNavigation$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequestActionNavigation$InputData f317151a;

    public b(MoneyRequestActionNavigation$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f317151a = inputData;
    }

    public final MoneyRequestActionNavigation$InputData b() {
        return this.f317151a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f317151a, ((b) obj2).f317151a);
    }

    public final int hashCode() {
        return this.f317151a.hashCode();
    }
}

package bse;

import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AddMoneyMethod f18184a;

    public h(AddMoneyMethod addMoneyMethod) {
        Intrinsics.checkNotNullParameter(addMoneyMethod, "addMoneyMethod");
        this.f18184a = addMoneyMethod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f18184a, ((h) obj2).f18184a);
    }

    public final int hashCode() {
        return this.f18184a.hashCode();
    }
}

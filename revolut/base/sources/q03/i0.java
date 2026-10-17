package q03;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f241081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f241082c;
    public final Data d;
    public final wy2.b e;

    public i0(String cardId, AccountId accountId, Data settingsItems, Data legalContext, wy2.b flowType) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(settingsItems, "settingsItems");
        Intrinsics.checkNotNullParameter(legalContext, "legalContext");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f241080a = cardId;
        this.f241081b = accountId;
        this.f241082c = settingsItems;
        this.d = legalContext;
        this.e = flowType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj2;
        return Intrinsics.f(this.f241080a, i0Var.f241080a) && Intrinsics.f(this.f241081b, i0Var.f241081b) && Intrinsics.f(this.f241082c, i0Var.f241082c) && Intrinsics.f(this.d, i0Var.d) && this.e == i0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + kii.e.c(this.d, kii.e.c(this.f241082c, h30.l.b(this.f241081b, this.f241080a.hashCode() * 31, 31), 31), 31);
    }
}

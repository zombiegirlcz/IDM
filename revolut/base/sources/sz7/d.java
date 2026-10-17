package sz7;

import com.revolut.feature.insurance_pet.impl.ui.pet.amount.AmountData;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import sx2.g;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements rz7.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rz7.c f266774a;

    public d(rz7.c state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f266774a = state;
    }

    @Override // rz7.b
    public final r A1() {
        return this.f266774a.f().a();
    }

    @Override // rz7.b
    public final r K() {
        r map = this.f266774a.f().a().map(new sx4.c(new g(28), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // rz7.b
    public final efm.b w2(AmountData amount) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        return w.z0(this.f266774a.f(), amount);
    }
}

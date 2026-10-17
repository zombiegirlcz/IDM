package u4i;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature_market_data_api.navigation.Breakdown;
import com.revolut.feature_market_data_impl.ui.breakdown.kompot.screens.fee.FeeBreakdownScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntry;
import com.revolut.shared.feature.market_data.models.domain.models.ChargeEntryDetails;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class t extends oki.h implements s {
    public final FeeBreakdownScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f277362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vii.b f277363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f277364r;

    public t(FeeBreakdownScreenContract$InputData inputData, c feeBreakdownDelegate, v stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(feeBreakdownDelegate, "feeBreakdownDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f277362p = feeBreakdownDelegate;
        this.f277363q = new vii.b();
        this.f277364r = mra.d.b(this, new j(new Data(inputData.f97171a.getF97037a(), null, false, 6, null)), stateMapper, null, false, 12);
    }

    public final void I2(Object obj2) {
        Breakdown.Fee fee2 = this.o.f97171a;
        if (!(obj2 instanceof q)) {
            if (!(obj2 instanceof p) || !(fee2 instanceof Breakdown.FeeDynamic)) {
                hx7.e.h(new IllegalArgumentException(a0.d.m(obj2, "Unknown parcel ")));
                return;
            } else {
                Breakdown.FeeDynamic feeDynamic = (Breakdown.FeeDynamic) fee2;
                C2(new m(((p) obj2).f277360a, feeDynamic.e, feeDynamic.f97030c));
                return;
            }
        }
        ChargeEntry chargeEntry = ((q) obj2).f277361a;
        ChargeEntryDetails chargeEntryDetails = chargeEntry.d;
        String str = chargeEntryDetails != null ? chargeEntryDetails.f104730b : null;
        if (str == null || str.length() == 0) {
            C2(new k(chargeEntry));
        } else {
            C2(new l(str));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.f277363q, new tik.b(continuation, this, 22)), null, new tz6.e(this, continuation, 22), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f277364r;
    }
}

package dd5;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.feature.staking.api.tierrate.v2.TiersRateItemMapper$Parcel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import vkm.v1;
import yji.n;
import yud.g;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends pc5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g f113113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f113114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wwd.d f113115n;
    public final sud.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f113116p;

    public f(g stakingInteractor, ang.f userInteractor, wwd.d tiersRateItemMapper, sud.b earnRateBottomSheetResolver, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tiersRateItemMapper, "tiersRateItemMapper");
        Intrinsics.checkNotNullParameter(earnRateBottomSheetResolver, "earnRateBottomSheetResolver");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f113113l = stakingInteractor;
        this.f113114m = userInteractor;
        this.f113115n = tiersRateItemMapper;
        this.o = earnRateBottomSheetResolver;
        this.f113116p = featureToggleInteractor;
    }

    @Override // c8j.b
    public final Flow Z2(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return new v1(new c(this, currency, null));
    }

    @Override // c8j.b
    public final void b3(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f51787l;
        TiersRateItemMapper$Parcel tiersRateItemMapper$Parcel = obj2 instanceof TiersRateItemMapper$Parcel ? (TiersRateItemMapper$Parcel) obj2 : null;
        if (tiersRateItemMapper$Parcel == null) {
            return;
        }
        n.P2(this, this.o.a(tiersRateItemMapper$Parcel), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
    }
}

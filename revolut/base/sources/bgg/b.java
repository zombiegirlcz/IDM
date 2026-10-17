package bgg;

import b74.e;
import b9i.f;
import be7.s;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccount;
import com.revolut.feature.travel.miles.api.model.TravelMilesAccountV2;
import com.revolut.feature.travel.miles.api.model.TravelMilesAirline;
import com.revolut.feature.travel.miles.api.model.TravelMilesProvider;
import eig.n;
import eig.u;
import ip0.um0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import vfg.d;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f15199l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f15200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f15201n;

    public b(u unlinkAccountBottomDialogFactory, j60.a bottomDialog, d accountsInteractor) {
        Intrinsics.checkNotNullParameter(unlinkAccountBottomDialogFactory, "unlinkAccountBottomDialogFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(accountsInteractor, "accountsInteractor");
        this.f15199l = unlinkAccountBottomDialogFactory;
        this.f15200m = bottomDialog;
        this.f15201n = accountsInteractor;
    }

    @Override // bgg.a
    public final void Z2(vh clickData) {
        n nVar;
        TravelMilesProvider travelMilesProvider;
        TravelMilesAccount travelMilesAccount;
        String str;
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        SwipeToActionDelegate.SwipeAction swipeAction = clickData.f54883a;
        Object obj2 = clickData.f54884b;
        if (Intrinsics.f(swipeAction.f53505a, "ACCOUNT_UNLINK_ITEM_ID")) {
            RowDelegate.Model model = (RowDelegate.Model) obj2;
            Object obj3 = model.u;
            Continuation continuation = null;
            if (obj3 instanceof TravelMilesAccountV2) {
                TravelMilesAccountV2 travelMilesAccountV2 = (TravelMilesAccountV2) obj3;
                nVar = new n(travelMilesAccountV2.f94085a, travelMilesAccountV2.f94087c.f94110b);
            } else {
                nVar = (!(obj3 instanceof TravelMilesAirline) || (travelMilesAccount = (travelMilesProvider = ((TravelMilesAirline) obj3).f94091g).f) == null || (str = travelMilesAccount.f94082a) == null) ? null : new n(str, travelMilesProvider.f94104b);
            }
            if (nVar != null) {
                T2(new e(this, nVar, continuation, 24), new yi5.b(27));
                return;
            }
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(model.u, "Unexpected parcel "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, illegalStateException, h0Var);
        }
    }

    @Override // bgg.a
    public final void b3(um0 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        j60.a.v(this.f15200m, false, null, 3);
    }

    @Override // bgg.a
    public final void c3(um0 model) {
        String str;
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.d;
        n nVar = obj2 instanceof n ? (n) obj2 : null;
        if (nVar == null || (str = nVar.f126636a) == null) {
            throw new IllegalStateException("Unexpected parcel");
        }
        T2(new s(this, str, null, 5), new f(this, 25));
    }
}

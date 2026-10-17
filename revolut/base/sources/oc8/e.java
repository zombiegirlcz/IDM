package oc8;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.spousal_consent_initiator.request_consent.RequestConsentConfiguration;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import obg.q;
import rp0.y;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements o, p, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f224109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f224110b;

    public /* synthetic */ e(int i, Function1 function1) {
        this.f224109a = i;
        this.f224110b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f224109a) {
            case 13:
                ((oee.n) this.f224110b).invoke(obj2);
                break;
            case 14:
            default:
                ((oee.n) this.f224110b).invoke(obj2);
                break;
            case 15:
                ((oee.n) this.f224110b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f224109a;
        Function1 function1 = this.f224110b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((q) function1).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((o54.a) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (y) ((kwg.e) function1).invoke(p0);
            case 3:
                KProperty[] kPropertyArr = CashbackProductScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ActionsView.Item) ((q) function1).invoke(p0);
            case 4:
            case 13:
            case 14:
            case 15:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mid.m) ((oh3.a) function1).invoke(p0);
            case 5:
                KProperty[] kPropertyArr2 = CashbackProductScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (bbj.d) ((q) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((oee.k) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((oee.k) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((oee.k) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((q) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Address) ((q) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((oee.k) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((o54.a) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((oee.n) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((q) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((oee.n) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((q) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gal.e) ((o9h.b) function1).invoke(p0);
            case 22:
                return (RequestConsentConfiguration) ((oh3.a) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((oh3.a) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((oid.g) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ShopsCampaignOffer) ((o9h.b) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ShopsCampaignOffer) ((o9h.b) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (oid.j) ((avj.o) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((oh3.a) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f224109a;
        q qVar = (q) this.f224110b;
        switch (i) {
            case 4:
                KProperty[] kPropertyArr = CashbackProductScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) qVar.invoke(p0)).booleanValue();
    }
}

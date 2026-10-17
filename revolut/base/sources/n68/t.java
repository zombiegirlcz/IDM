package n68;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import com.youTransactor.uCube.rpc.Constants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f212737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f212738b;

    public /* synthetic */ t(RowDelegate.Model model, int i) {
        this.f212737a = i;
        this.f212738b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f212737a) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Object obj3 = this.f212738b.u;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.model.gender.Gender");
                return k.c(update, null, null, null, (bj0.b) obj3, null, null, null, Constants.TAG_BLE_FIRMWARE_VERSION);
            case 1:
                wl8.g update2 = (wl8.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                RowDelegate.Model model = this.f212738b;
                if (model.J()) {
                    return wl8.g.a(update2, null, null, null, null, null, 23);
                }
                Object obj4 = model.u;
                Intrinsics.i(obj4, "null cannot be cast to non-null type com.revolut.feature.contacts.models.DeviceContact.Phone");
                return wl8.g.a(update2, null, null, null, (zm3.f) obj4, null, 23);
            case 2:
                zlb.b update3 = (zlb.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                Object obj5 = this.f212738b.u;
                Intrinsics.i(obj5, "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.product.ProductGroup");
                Data productsData = update3.f323211a;
                Intrinsics.checkNotNullParameter(productsData, "productsData");
                return new zlb.b(productsData, (ProductGroup) obj5);
            default:
                zq5.u update4 = (zq5.u) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                Object obj6 = this.f212738b.u;
                return zq5.u.a(update4, null, false, null, null, obj6 instanceof String ? (String) obj6 : null, 15);
        }
    }
}

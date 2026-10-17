package hs5;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.crypto_feed.impl.sections.revolutx.futures.dialog.NoRevolutXBottomSheetController;
import com.revolut.feature.crypto_investments.api.widget.split.SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import ut5.f;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qr5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j5c.a f155002l;

    public b(j5c.a revolutXPromoNavigationExtension) {
        Intrinsics.checkNotNullParameter(revolutXPromoNavigationExtension, "revolutXPromoNavigationExtension");
        this.f155002l = revolutXPromoNavigationExtension;
    }

    @Override // qr5.a
    public final void Z2(RowDelegate.Model model) {
        Object obj2 = model != null ? model.u : null;
        if ((obj2 instanceof SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel) && ((SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel) obj2).f71417a == f.OPEN_REV_X_DERIVATIVES_BALANCE) {
            j5c.a aVar = this.f155002l;
            if (aVar.Z2()) {
                aVar.c3();
            } else {
                n.P2(this, new NoRevolutXBottomSheetController(), ModalDestination.Style.BOTTOM_DIALOG.f98301a, null, 2);
            }
        }
    }
}

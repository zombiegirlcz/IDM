package elf;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.image_gallery.ImageGalleryController;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b2 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v0a.c f127300l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mq9.f f127301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w0a.g f127302n;

    public b2(v0a.c splitBillsInteractor, mq9.f paymentsGroupsInteractor, w0a.g splitBillItemizationItemsMapper) {
        Intrinsics.checkNotNullParameter(splitBillsInteractor, "splitBillsInteractor");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(splitBillItemizationItemsMapper, "splitBillItemizationItemsMapper");
        this.f127300l = splitBillsInteractor;
        this.f127301m = paymentsGroupsInteractor;
        this.f127302n = splitBillItemizationItemsMapper;
    }

    public final void Z2(w0a.c cVar) {
        boolean z = cVar instanceof w0a.a;
        ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
        if (z) {
            String str = ((w0a.a) cVar).f293671a;
            rd7.j.Companion.getClass();
            yji.n.P2(this, new ImageGalleryController(rd7.i.a(str), null, null, 6), popup, null, 2);
        } else {
            if (!(cVar instanceof w0a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            yji.n.P2(this, o2(new x0a.b(((w0a.b) cVar).f293673a)), popup, null, 2);
        }
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        ItemizationReceiptDeletionData itemizationReceiptDeletionData;
        boolean z = false;
        if (obj2 instanceof cw0.d) {
            Object obj3 = ((cw0.d) obj2).f109514a.e;
            w0a.a aVar = obj3 instanceof w0a.a ? (w0a.a) obj3 : null;
            if (aVar != null && (itemizationReceiptDeletionData = aVar.f293672b) != null) {
                k9 k9Var = k9.Transaction;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                N2(new ActionsBottomSheetController(((m1a.q) this.f127302n).b(com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new eed.j(this, itemizationReceiptDeletionData, 19));
                z = true;
            }
        } else if (obj2 instanceof cw0.c) {
            Object obj4 = ((cw0.c) obj2).f109513a.e;
            w0a.c cVar = obj4 instanceof w0a.c ? (w0a.c) obj4 : null;
            if (cVar != null) {
                Z2(cVar);
                z = true;
            }
        } else if (obj2 instanceof w0a.c) {
            Z2((w0a.c) obj2);
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

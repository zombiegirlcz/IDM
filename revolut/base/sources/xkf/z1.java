package xkf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer.models.ScannedBillDetails;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.payments.core.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class z1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f306804l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bl9.a f306805m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final al9.c f306806n;
    public final fnc.s o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f306807p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final bmf.b f306808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vkm.z1 f306809r;

    public z1(klf.h0 commonDataSource, bl9.a transferScannedBillDetailsInteractor, al9.c payWithPhotoMapper, fnc.s transferScannedBillDestinationProvider, gte.a featureToggleInteractor, bmf.b modalFactory) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(transferScannedBillDetailsInteractor, "transferScannedBillDetailsInteractor");
        Intrinsics.checkNotNullParameter(payWithPhotoMapper, "payWithPhotoMapper");
        Intrinsics.checkNotNullParameter(transferScannedBillDestinationProvider, "transferScannedBillDestinationProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(modalFactory, "modalFactory");
        this.f306804l = commonDataSource;
        this.f306805m = transferScannedBillDetailsInteractor;
        this.f306806n = payWithPhotoMapper;
        this.o = transferScannedBillDestinationProvider;
        this.f306807p = featureToggleInteractor;
        this.f306808q = modalFactory;
        vkm.z1 z1VarB = vkm.q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f306809r = z1VarB;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (!Intrinsics.f(str, "SCANNED_FILE_DETAILS_FROM_ID")) {
            return Boolean.FALSE;
        }
        if (obj2 instanceof cw0.c) {
            cw0.i iVar = ((cw0.c) obj2).f109513a;
            Object obj3 = iVar.e;
            ScannedBillDetails scannedBillDetails = obj3 instanceof ScannedBillDetails ? (ScannedBillDetails) obj3 : null;
            if (scannedBillDetails == null) {
                throw new IllegalArgumentException(a0.d.m(iVar.e, "Expected ScannedBillDetails in attachment.parcel for listId=SCANNED_FILE_DETAILS_FROM_ID, got: "));
            }
            A2(this.o.g(scannedBillDetails));
        } else {
            if (!(obj2 instanceof cw0.d)) {
                throw new IllegalArgumentException(a0.d.m(obj2, "Expected Attachment.Action parcel for listId=SCANNED_FILE_DETAILS_FROM_ID, got: "));
            }
            N2(bmf.a.b(this.f306808q, new TextLocalisedClause(R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_title, null, null, 14), new TextLocalisedClause(R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_description, null, null, 14), new TextLocalisedClause(R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_cancel, null, null, 14), null, new TextLocalisedClause(R$string.payments_bank_transfer_review_pay_with_photo_remove_dialog_confirm, null, null, 14), null, 472), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new xe7.a(this, 14));
        }
        return Boolean.TRUE;
    }
}

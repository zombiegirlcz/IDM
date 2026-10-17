package bt9;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.d2;
import com.revolut.feature.image_gallery.ImageGalleryController;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.payments.splitbill.models.itemization.ItemizationReceiptDeletionData;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import grl.k9;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupDetailsBillScreen f18462w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(GroupDetailsBillScreen groupDetailsBillScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f18462w = groupDetailsBillScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f18462w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f18462w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((d2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Object[] objArr = 0;
        GroupDetailsBillScreen groupDetailsBillScreen = this.f18462w;
        switch (i) {
            case 0:
                b action = (b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarJ3 = groupDetailsBillScreen.T2();
                Intrinsics.h(action);
                w wVar = (w) mVarJ3;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(action, "action");
                int i2 = p.f18473a[action.ordinal()];
                if (i2 == 1) {
                    wVar.C2(new a54.g(wVar, objArr == true ? 1 : 0, 7));
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wVar.C2(new r(wVar, null));
                }
                return Unit.f186387a;
            default:
                d2 d2Var = (d2) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVarJ32 = groupDetailsBillScreen.T2();
                cw0.a action2 = d2Var.f54010b;
                w wVar2 = (w) mVarJ32;
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(action2, "action");
                if (action2 instanceof cw0.c) {
                    cw0.i iVar = ((cw0.c) action2).f109513a;
                    Object obj3 = iVar.e;
                    w0a.a aVar3 = obj3 instanceof w0a.a ? (w0a.a) obj3 : null;
                    if (aVar3 != null) {
                        rd7.i iVar2 = rd7.j.Companion;
                        String str = aVar3.f293671a;
                        iVar2.getClass();
                        yji.l.j2(wVar2, new ImageGalleryController(rd7.i.a(str), null, null, 6), ModalDestination.Style.POPUP.f98311a, null, 2);
                    } else {
                        hx7.e.h(new IllegalStateException(a0.d.m(iVar.e, "Unsupported attachment parcel: ")));
                    }
                } else if (action2 instanceof cw0.d) {
                    Object obj4 = ((cw0.d) action2).f109514a.e;
                    w0a.a aVar4 = obj4 instanceof w0a.a ? (w0a.a) obj4 : null;
                    ItemizationReceiptDeletionData itemizationReceiptDeletionData = aVar4 != null ? aVar4.f293672b : null;
                    ItemizationReceiptDeletionData.GroupBill groupBill = itemizationReceiptDeletionData instanceof ItemizationReceiptDeletionData.GroupBill ? (ItemizationReceiptDeletionData.GroupBill) itemizationReceiptDeletionData : null;
                    if (groupBill == null) {
                        hx7.e.h(new IllegalStateException(a0.d.m(obj4, "Unsupported remove attachment parcel: ")));
                    } else {
                        m1a.q qVar = wVar2.f18482y;
                        k9 value = k9.Payments;
                        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                        Intrinsics.checkNotNullParameter(value, "value");
                        wVar2.f2(new ActionsBottomSheetController(qVar.b(new AnalyticsProduct.Retail(value))), ModalDestination.Style.BOTTOM_DIALOG.f98301a, new bnj.n(wVar2, groupBill, 20));
                    }
                } else {
                    hx7.e.h(new IllegalStateException(j6.a.q("Unsupported attachment action: ", o0.f186429a.b(action2.getClass()).m())));
                }
                return Unit.f186387a;
        }
    }
}

package wic;

import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.RentAndBillsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.common.R$string;
import com.revolut.kompot.common.transition.AccountCreationTransitionAnimation;
import ijc.g;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import oki.h;
import yic.j;
import yic.k;
import yic.m;
import yic.n;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c f297875b;

    public /* synthetic */ c(com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar, int i) {
        this.f297874a = i;
        this.f297875b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f297874a;
        Continuation continuation = null;
        com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar = this.f297875b;
        switch (i) {
            case 0:
                Throwable throwable = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
                l.b1(cVar, cVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), new TextLocalisedClause(R$string.common_error_state_description, null, null, 14), null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5)), null, new w65.c(cVar, continuation, 24), 3);
                return Boolean.TRUE;
            case 1:
                hub.b result = (hub.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result.f155599b;
                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar2 = this.f297875b;
                if (z) {
                    h.t2(cVar2, cVar2.u, cVar2.o.f84954a, false, null, false, 12);
                } else {
                    h.D2(cVar2.u);
                }
                return Unit.f186387a;
            case 2:
                yja.b output = (yja.b) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                int i2 = f.f297879a[output.ordinal()];
                com.revolut.feature.rewards.impl.ui.rent_and_bills.flow.c cVar3 = this.f297875b;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    h.t2(cVar3, cVar3.u, RentAndBillsFlowContract$Step.Home.f84960a, false, null, false, 12);
                } else {
                    if (i2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.D2(cVar3.u);
                }
                return Unit.f186387a;
            case 3:
                i iVar = cVar.u;
                n output2 = (n) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean z3 = output2 instanceof k;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z3) {
                    h.w2(iVar, new RentAndBillsFlowContract$Step.LinkPaymentInfo(egc.a.RENT, ((k) output2).f314288a), bottom_dialog);
                } else if (output2 instanceof j) {
                    h.w2(iVar, new RentAndBillsFlowContract$Step.LinkPaymentInfo(egc.a.BILLS, ((j) output2).f314287a), bottom_dialog);
                } else {
                    boolean z4 = output2 instanceof m;
                    ModalDestination.Style.POPUP popup = ModalDestination.Style.POPUP.f98311a;
                    if (z4) {
                        h.z2(iVar, new RentAndBillsFlowContract$Step.ManageLinkedPayments(egc.a.RENT, ((m) output2).f314290a), popup);
                    } else {
                        if (!(output2 instanceof yic.l)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h.z2(iVar, new RentAndBillsFlowContract$Step.ManageLinkedPayments(egc.a.BILLS, ((yic.l) output2).f314289a), popup);
                    }
                }
                return Unit.f186387a;
            default:
                i iVar2 = cVar.u;
                g output3 = (g) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                if (Intrinsics.f(output3, ijc.d.f161759a) || Intrinsics.f(output3, ijc.f.f161761a)) {
                    h.D2(iVar2);
                } else {
                    if (!Intrinsics.f(output3, ijc.e.f161760a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.C1(new MainContainerScreenDestination.JustShow(ibb.c.e, (Parcelable) null, (AccountCreationTransitionAnimation) null, 14));
                    h.D2(iVar2);
                }
                return Unit.f186387a;
        }
    }
}

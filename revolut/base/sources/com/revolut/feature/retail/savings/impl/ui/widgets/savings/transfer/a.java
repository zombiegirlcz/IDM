package com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer;

import aqb.e;
import aqb.f;
import aqb.j;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreenContract$BottomSheetState;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import djb.k;
import djb.n;
import java.util.Iterator;
import java.util.List;
import jki.g;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;
import rnb.i;
import w4l.h;
import yji.l;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f83394p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f83395q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final mjb.a f83396r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final elb.b f83397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f83398t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n savingsAccountsDetailsInteractor, j60.a bottomDialogExtension, mjb.a savingsNavigationProvider, elb.b savingsFeatureConfigInteractor, SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData inputData, p stateMapper) {
        TransferWidgetCustomisationScreenContract$BottomSheetState topUp;
        super(stateMapper);
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        Intrinsics.checkNotNullParameter(savingsFeatureConfigInteractor, "savingsFeatureConfigInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f83394p = savingsAccountsDetailsInteractor;
        this.f83395q = bottomDialogExtension;
        this.f83396r = savingsNavigationProvider;
        this.f83397s = savingsFeatureConfigInteractor;
        boolean z = inputData instanceof SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.Customise;
        if (z) {
            topUp = TransferWidgetCustomisationScreenContract$BottomSheetState.Customise.f83388a;
        } else if (inputData instanceof SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectTopUpAccount) {
            topUp = new TransferWidgetCustomisationScreenContract$BottomSheetState.TopUp(((SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectTopUpAccount) inputData).f83177a);
        } else if (Intrinsics.f(inputData, SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectWithdrawAccount.f83178a)) {
            topUp = TransferWidgetCustomisationScreenContract$BottomSheetState.Withdraw.f83393a;
        } else if (Intrinsics.f(inputData, SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectSpareChangeAccount.f83176a)) {
            topUp = TransferWidgetCustomisationScreenContract$BottomSheetState.SpareChange.f83391a;
        } else {
            if (!Intrinsics.f(inputData, SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.SelectGoalAccount.f83175a)) {
                throw new NoWhenBranchMatchedException();
            }
            topUp = TransferWidgetCustomisationScreenContract$BottomSheetState.Goal.f83389a;
        }
        TransferWidgetCustomisationScreenContract$BottomSheetState transferWidgetCustomisationScreenContract$BottomSheetState = topUp;
        SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.Customise customise = z ? (SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$InputData.Customise) inputData : null;
        this.f83398t = new f(transferWidgetCustomisationScreenContract$BottomSheetState, new Data(null, null, true, 3, null), customise != null && customise.f83174c, customise != null ? customise.f83172a : null, customise != null ? customise.f83173b : null);
    }

    public static final s y2(a aVar, String str) {
        ejb.b bVar;
        List list;
        Object next;
        e eVar = (e) ((f) aVar.t2()).f8283b.getContent();
        s sVar = null;
        if (eVar != null && (bVar = eVar.f8280a) != null && (list = bVar.f126837b) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((SavingsAccountDetails) next).f86460a.f234881a, str)) {
                    break;
                }
            }
            SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) next;
            if (savingsAccountDetails != null) {
                sVar = savingsAccountDetails.f86460a;
            }
        }
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Illegal state moneyBox should not be null");
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, nim.a.v(u0.m(rd0.e.b(((i) this.f83394p).f(k.b.f115282a, h.f294642c)), this.f83397s.a(w4l.j.f294644c)), new anf.p(28)), null, null, new ap7.k(this, null, 3), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f83398t;
    }

    public final void z2() {
        ejb.b bVar;
        List list;
        Object next;
        e eVar = (e) ((f) t2()).f8283b.getContent();
        s sVar = null;
        if (eVar != null && (bVar = eVar.f8280a) != null && (list = bVar.f126837b) != null) {
            Iterator it8 = list.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it8.next();
                    if (Intrinsics.f(((SavingsAccountDetails) next).f86460a.f234881a, ((f) t2()).d)) {
                        break;
                    }
                }
            }
            SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) next;
            if (savingsAccountDetails != null) {
                sVar = savingsAccountDetails.f86460a;
            }
        }
        v2(sVar == null ? new aqb.h(((f) t2()).f8284c) : new aqb.g(sVar.f234881a, sVar.f234885h.f234859a, ((f) t2()).f8284c));
    }
}

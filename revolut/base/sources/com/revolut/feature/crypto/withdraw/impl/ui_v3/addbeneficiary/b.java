package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary;

import an4.f;
import bq5.c;
import com.revolut.feature.crypto.remittance.models.CounterpartyRequiredFields;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import com.revolut.feature.crypto.remittance.models.CryptoAddressRecipientDetails;
import com.revolut.feature.crypto.withdraw.api.CryptoWithdrawApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingInfo;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$Step;
import hx7.e;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import oki.h;
import x7a.d;
import yki.i;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements aq5.b {
    public final ap5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uj5.b f71217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CryptoAddBeneficiaryInput f71218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f71219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f71220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final gte.a f71221t;
    public final qki.d u;
    public final i v;

    public b(ap5.b cryptoWithdrawInteractor, uj5.b restrictedActionNavigationProvider, CryptoAddBeneficiaryInput input, c cryptoCreateBeneficiaryDialogProvider, d countryPickerInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(restrictedActionNavigationProvider, "restrictedActionNavigationProvider");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cryptoCreateBeneficiaryDialogProvider, "cryptoCreateBeneficiaryDialogProvider");
        Intrinsics.checkNotNullParameter(countryPickerInteractor, "countryPickerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.o = cryptoWithdrawInteractor;
        this.f71217p = restrictedActionNavigationProvider;
        this.f71218q = input;
        this.f71219r = cryptoCreateBeneficiaryDialogProvider;
        this.f71220s = countryPickerInteractor;
        this.f71221t = featureToggleInteractor;
        this.u = e.b(this, new CryptoAddBeneficiaryFlowContract$State(null));
        this.v = d8l.d.a(this, new anc.b(this, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof aq5.h
            if (r0 == 0) goto L14
            r0 = r10
            aq5.h r0 = (aq5.h) r0
            int r1 = r0.f8266w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f8266w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            aq5.h r0 = new aq5.h
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f8266w
            r8 = 0
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            yhm.o.b(r10)
            r1 = r9
            goto L72
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            yhm.o.b(r10)
            qki.d r10 = r9.u
            java.lang.Object r10 = r10.f22677a
            vkm.j2 r10 = (vkm.j2) r10
            java.lang.Object r10 = r10.getValue()
            com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$State r10 = (com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$State) r10
            com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$CollectedDetails r10 = r10.f71213a
            if (r10 != 0) goto L59
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Trying to submit details but no details in state"
            r9.<init>(r10)
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r8, r8, r9, r10)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L59:
            an1.d r4 = new an1.d
            r4.<init>(r9, r2)
            a2j.c r5 = new a2j.c
            r1 = 23
            r5.<init>(r9, r10, r8, r1)
            r6.f8266w = r2
            r2 = 0
            r3 = 0
            r7 = 2
            r1 = r9
            java.lang.Object r10 = n14.k.V(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L72
            return r0
        L72:
            nii.h r10 = (nii.h) r10
            boolean r9 = r10 instanceof nii.g
            if (r9 == 0) goto L99
            com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddBeneficiaryInput r9 = r1.f71218q
            java.lang.Integer r9 = r9.getF71130c()
            if (r9 == 0) goto L94
            com.revolut.kompot.bridge.navigation.BridgeDestination r9 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FinishCommand r10 = new com.revolut.retail.core.navigation.FinishCommand
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2 = 6
            r10.<init>(r0, r8, r8, r2)
            r9.<init>(r10)
            r1.C1(r9)
            goto L99
        L94:
            lo5.d r9 = lo5.d.f197398a
            r1.C2(r9)
        L99:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b.I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.b, gim.c):java.lang.Object");
    }

    public final boolean J2(wk5.i iVar, CounterpartyRequiredFields counterpartyRequiredFields) {
        if (!((jte.d) this.f71221t).c(CryptoWithdrawApi$Toggles.CryptoDepositRequiredFields.f71057c)) {
            return iVar == wk5.i.INDIVIDUAL;
        }
        int i = aq5.d.f8262b[iVar.ordinal()];
        List list = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (counterpartyRequiredFields != null) {
                list = counterpartyRequiredFields.f70976b;
            }
        } else if (counterpartyRequiredFields != null) {
            list = counterpartyRequiredFields.f70975a;
        }
        if (list == null) {
            list = f0.f322471a;
        }
        return list.contains(wk5.c.ADDRESS);
    }

    public final void K2() {
        CryptoAddressCounterparty cryptoAddressCounterparty;
        CryptoAddressRecipientDetails cryptoAddressRecipientDetails;
        wk5.h hVar;
        String str;
        CryptoAddBeneficiaryInput cryptoAddBeneficiaryInput = this.f71218q;
        CryptoAddBeneficiaryInput.SubmitCounterpartyDetails submitCounterpartyDetails = cryptoAddBeneficiaryInput instanceof CryptoAddBeneficiaryInput.SubmitCounterpartyDetails ? (CryptoAddBeneficiaryInput.SubmitCounterpartyDetails) cryptoAddBeneficiaryInput : null;
        CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails = (submitCounterpartyDetails == null || (cryptoAddressRecipientDetails = (cryptoAddressCounterparty = submitCounterpartyDetails.f71125a).f70980g) == null || !J2(cryptoAddressRecipientDetails.f70985b, submitCounterpartyDetails.f71127c) || (hVar = cryptoAddressCounterparty.d) == null || (str = cryptoAddressCounterparty.f) == null || d0.W(str)) ? null : new CryptoAddBeneficiaryFlowContract$CollectedDetails(cryptoAddressCounterparty.f70977a, new CryptoAddressHostingInfo(hVar, str, cryptoAddressRecipientDetails), null, null);
        i iVar = this.v;
        if (cryptoAddBeneficiaryFlowContract$CollectedDetails == null) {
            h.u2(this, iVar, CryptoAddBeneficiaryFlowContract$Step.CreateBeneficiary.f71215a, null, 6);
        } else {
            H2(this.u, new f(cryptoAddBeneficiaryFlowContract$CollectedDetails, 22));
            h.u2(this, iVar, CryptoAddBeneficiaryFlowContract$Step.Address.f71214a, null, 6);
        }
    }

    @Override // yki.j
    public final void M0() {
        if (!this.f71218q.getD()) {
            K2();
        } else {
            l2(new aq5.f(this, null, 2), new yi5.b(26));
        }
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.u;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}

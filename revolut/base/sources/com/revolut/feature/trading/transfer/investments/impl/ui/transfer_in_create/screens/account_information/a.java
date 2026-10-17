package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information;

import b7d.c;
import baf.i;
import baf.l;
import cli.g;
import cli.n;
import cli.y;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements l {
    public final phm.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f91596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f91597q;

    public a(AccountInformationScreenContract$InputData inputData, n stateMapper, phm.a brokerCountryPickerControllerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(brokerCountryPickerControllerInteractor, "brokerCountryPickerControllerInteractor");
        this.o = brokerCountryPickerControllerInteractor;
        this.f91596p = d.b(this, new i(null, null, null, false, inputData.f91589a, false, inputData.f91590b, inputData.f91591c), stateMapper, new baf.a(), false, 8);
        this.f91597q = e.a(this, new c(this, 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I2(cli.y r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r1 = r5.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r0 = r0.getValue()
            baf.i r0 = (baf.i) r0
            com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker r0 = r0.e
            u8f.h r0 = r0.f91502c
            if (r0 != 0) goto L16
            r0 = -1
            goto L1e
        L16:
            int[] r2 = baf.n.f14061a
            int r0 = r0.ordinal()
            r0 = r2[r0]
        L1e:
            r2 = 0
            r3 = 1
            switch(r0) {
                case -1: goto L73;
                case 0: goto L23;
                case 1: goto L73;
                case 2: goto L73;
                case 3: goto L73;
                case 4: goto L3c;
                case 5: goto L3c;
                case 6: goto L29;
                default: goto L23;
            }
        L23:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L29:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            java.lang.String r0 = r0.f14052a
            if (r0 == 0) goto L99
            boolean r0 = kotlin.text.d0.W(r0)
            if (r0 == 0) goto L3a
            goto L99
        L3a:
            r2 = r3
            goto L99
        L3c:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            java.lang.String r0 = r0.f14052a
            if (r0 == 0) goto L99
            boolean r0 = kotlin.text.d0.W(r0)
            if (r0 == 0) goto L4d
            goto L99
        L4d:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            java.lang.String r0 = r0.f14053b
            if (r0 == 0) goto L99
            boolean r0 = kotlin.text.d0.W(r0)
            if (r0 == 0) goto L5e
            goto L99
        L5e:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            boolean r0 = r0.d
            if (r0 == 0) goto L99
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            wi0.b r0 = r0.f14054c
            if (r0 == 0) goto L99
            goto L3a
        L73:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            java.lang.String r0 = r0.f14052a
            if (r0 == 0) goto L99
            boolean r0 = kotlin.text.d0.W(r0)
            if (r0 == 0) goto L84
            goto L99
        L84:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            boolean r0 = r0.d
            if (r0 == 0) goto L99
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            wi0.b r0 = r0.f14054c
            if (r0 == 0) goto L99
            goto L3a
        L99:
            java.lang.Object r0 = r1.getValue()
            baf.i r0 = (baf.i) r0
            boolean r0 = r0.f
            if (r0 == r2) goto Lad
            a2g.p r0 = new a2g.p
            r1 = 17
            r0.<init>(r2, r1)
            r4.H2(r5, r0)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.screens.account_information.a.I2(cli.y):void");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f91597q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f91596p;
    }
}

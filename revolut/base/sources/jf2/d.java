package jf2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.apm.upi.impl.provider.UpiAliasDialogProvider;
import j82.q;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nii.w;
import nii.y0;
import yji.n;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends n implements a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hg2.e f173639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final UpiAliasDialogProvider f173640m;

    public d(hg2.e upiInteractor, UpiAliasDialogProvider dialogProvider) {
        Intrinsics.checkNotNullParameter(upiInteractor, "upiInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        this.f173639l = upiInteractor;
        this.f173640m = dialogProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(jf2.d r4, eim.c r5, nii.n1 r6, com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient r7, java.lang.String r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof jf2.b
            if (r0 == 0) goto L13
            r0 = r9
            jf2.b r0 = (jf2.b) r0
            int r1 = r0.f173635x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f173635x = r1
            goto L18
        L13:
            jf2.b r0 = new jf2.b
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f173635x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            eim.c r5 = r0.u
            yhm.o.b(r9)
            goto L7b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r9)
            boolean r6 = r6 instanceof nii.l1
            if (r6 == 0) goto Lb3
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r6 = d3(r7, r8)
            if (r6 != 0) goto L52
            yhm.m$a r4 = yhm.m.INSTANCE
            jf2.g r4 = new jf2.g
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Alias Resolved can't be done for Bank Beneficiary"
            r6.<init>(r7)
            r4.<init>(r6)
            r5.resumeWith(r4)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L52:
            hg2.e r4 = r4.f173639l
            java.lang.String r7 = r6.f61904b
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias$ExpectedOverrides r8 = r6.f61905c
            r9 = 0
            if (r8 == 0) goto L5e
            java.lang.String r8 = r8.f61906a
            goto L5f
        L5e:
            r8 = r9
        L5f:
            a02.a r6 = r6.f61903a
            r0.u = r5
            r0.f173635x = r3
            r4.getClass()
            if (r8 == 0) goto L6f
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias$ExpectedOverrides r9 = new com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias$ExpectedOverrides
            r9.<init>(r8)
        L6f:
            com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r8 = new com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias
            r8.<init>(r6, r7, r9)
            java.lang.Object r9 = r4.a(r8, r0)
            if (r9 != r1) goto L7b
            return r1
        L7b:
            hg2.c r9 = (hg2.c) r9
            boolean r4 = r9 instanceof hg2.a
            if (r4 == 0) goto L8b
            com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient$UpiMerchant r4 = new com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient$UpiMerchant
            hg2.a r9 = (hg2.a) r9
            com.revolut.feature.apm.core.models.alias.beneficiary.AliasMerchant r6 = r9.f152064a
            r4.<init>(r6, r3)
            goto La2
        L8b:
            boolean r4 = r9 instanceof hg2.b
            if (r4 == 0) goto Lad
            com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient$Alias r4 = new com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient$Alias
            hg2.b r9 = (hg2.b) r9
            com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo r6 = r9.f152065a
            java.lang.String r7 = "UPI_ID"
            java.lang.String r7 = r6.a(r7)
            if (r7 != 0) goto L9f
            java.lang.String r7 = ""
        L9f:
            r4.<init>(r6, r7, r3)
        La2:
            yhm.m$a r6 = yhm.m.INSTANCE
            jf2.e r6 = new jf2.e
            r6.<init>(r4)
            r5.resumeWith(r6)
            goto Lba
        Lad:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        Lb3:
            yhm.m$a r4 = yhm.m.INSTANCE
            jf2.f$a r4 = jf2.f.a.f173642a
            r5.resumeWith(r4)
        Lba:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: jf2.d.Z2(jf2.d, eim.c, nii.n1, com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient, java.lang.String, gim.c):java.lang.Object");
    }

    public static ResolveAlias d3(UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient, String str) {
        if (upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.BankBeneficiary) {
            return null;
        }
        if (!(upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.Alias)) {
            if (upiTransferFlowContract$Recipient instanceof UpiTransferFlowContract$Recipient.UpiMerchant) {
                return new ResolveAlias(a02.a.UPI_ID, ((UpiTransferFlowContract$Recipient.UpiMerchant) upiTransferFlowContract$Recipient).f62967a.f61900a, str != null ? new ResolveAlias.ExpectedOverrides(str) : null);
            }
            throw new NoWhenBranchMatchedException();
        }
        a02.a aVar = a02.a.UPI_ID;
        String strA = ((UpiTransferFlowContract$Recipient.Alias) upiTransferFlowContract$Recipient).f62963a.a("UPI_ID");
        if (strA != null) {
            return new ResolveAlias(aVar, strA, str != null ? new ResolveAlias.ExpectedOverrides(str) : null);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("trying to resolve UPI Id but counterparty UPI ID is null");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        throw illegalArgumentException;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jf2.d.b3(com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient, gim.c):java.lang.Object");
    }

    public final Object c3(w wVar, Throwable th10, c frame) {
        eim.c cVar = new eim.c(fim.h.b(frame));
        n.j2(this, L2(new y0(null, wVar, false, 5)), null, new q(cVar, th10, null, 20), 3);
        Object objB = cVar.b();
        if (objB == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objB;
    }
}

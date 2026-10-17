package kuf;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.transfer.core.models.FundingSource;
import eli.j;
import gim.i;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final vv9.a f189785l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bqf.d f189786m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final wsg.n f189787n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rr9.d f189788p;

    public d(vv9.a moneyRequestActionsInteractor, bqf.d trustInteractor, wsg.n walletInteractor, j twoFaErrorHandler, rr9.d settlementInteractor) {
        Intrinsics.checkNotNullParameter(moneyRequestActionsInteractor, "moneyRequestActionsInteractor");
        Intrinsics.checkNotNullParameter(trustInteractor, "trustInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(settlementInteractor, "settlementInteractor");
        this.f189785l = moneyRequestActionsInteractor;
        this.f189786m = trustInteractor;
        this.f189787n = walletInteractor;
        this.o = twoFaErrorHandler;
        this.f189788p = settlementInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
    
        if (c3(r0) == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable Z2(com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData r13, com.revolut.domain.models.moneyrequest.MoneyRequest r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kuf.d.Z2(com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.ManualTransferData, com.revolut.domain.models.moneyrequest.MoneyRequest, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (c3(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.payments.groups.api.models.PaymentGroup r6, java.util.ArrayList r7, com.revolut.feature.transfer.core.models.FundingSource r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof kuf.c
            if (r0 == 0) goto L13
            r0 = r9
            kuf.c r0 = (kuf.c) r0
            int r1 = r0.f189784w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189784w = r1
            goto L18
        L13:
            kuf.c r0 = new kuf.c
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189784w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L64
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r9)
            goto L5b
        L36:
            yhm.o.b(r9)
            rr9.d r9 = r5.f189788p
            qk.d r8 = czi.c.S(r8)
            pfm.r r6 = r9.c(r6, r7, r8)
            eli.j r7 = r5.o
            eli.a r7 = sjg.a.b(r7)
            efm.b r6 = r6.h(r7)
            java.lang.String r7 = "compose(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f189784w = r4
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L5b
            goto L63
        L5b:
            r0.f189784w = r3
            java.lang.Object r6 = r5.c3(r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kuf.d.b3(com.revolut.feature.payments.groups.api.models.PaymentGroup, java.util.ArrayList, com.revolut.feature.transfer.core.models.FundingSource, gim.c):java.lang.Object");
    }

    public final Object c3(gim.c cVar) {
        wsg.n nVar = this.f189787n;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        efm.b bVarP = efm.b.p(nVar.j0(personal), nVar.k0(personal));
        Intrinsics.checkNotNullExpressionValue(bVarP, "mergeArray(...)");
        Object objA = nim.a.a(ue0.e.v(bVarP), cVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    public final Object d3(qq9.d dVar, PaymentGroup paymentGroup, ArrayList arrayList, FundingSource fundingSource, i iVar) {
        Object objB3;
        int i = a.f189781a[dVar.ordinal()];
        if (i == 1) {
            return (fundingSource == null || (objB3 = b3(paymentGroup, arrayList, fundingSource, iVar)) != fim.a.COROUTINE_SUSPENDED) ? Unit.f186387a : objB3;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        efm.b bVarH = this.f189788p.b(paymentGroup, arrayList).h(sjg.a.b(this.o));
        Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
        Object objA = nim.a.a(bVarH, iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objA != aVar) {
            objA = Unit.f186387a;
        }
        return objA == aVar ? objA : Unit.f186387a;
    }
}

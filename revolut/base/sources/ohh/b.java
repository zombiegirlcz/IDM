package ohh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import kotlin.jvm.internal.Intrinsics;
import kpj.f;
import nii.z;
import ybl.l;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements t1h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f225367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f225368b;

    public b(l tradingConfigInteractor, f wealthAccountHeaderUiMapper) {
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        this.f225367a = tradingConfigInteractor;
        this.f225368b = wealthAccountHeaderUiMapper;
    }

    @Override // t1h.a
    public final z a() {
        return new z(new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // t1h.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(dj0.d r22, com.revolut.feature.wealth.models.addmoney.TransferSubjectId r23, efl.h r24, gim.c r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r25
            boolean r2 = r1 instanceof ohh.a
            if (r2 == 0) goto L17
            r2 = r1
            ohh.a r2 = (ohh.a) r2
            int r3 = r2.f225366x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f225366x = r3
            goto L1c
        L17:
            ohh.a r2 = new ohh.a
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f225366x
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L37
            if (r4 != r5) goto L2f
            dj0.d r2 = r2.u
            yhm.o.b(r1)
            r8 = r2
            goto L53
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r1)
            ybl.l r1 = r0.f225367a
            akg.n r1 = ybl.l.d(r1)
            r4 = 3
            jhi.b r1 = mo3.a.g(r1, r6, r6, r4)
            r4 = r22
            r2.u = r4
            r2.f225366x = r5
            java.lang.Object r1 = vkm.q.z(r1, r2)
            if (r1 != r3) goto L52
            return r3
        L52:
            r8 = r4
        L53:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r1 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r1
            if (r1 == 0) goto L5a
            hel.b r1 = r1.f105106a
            goto L5b
        L5a:
            r1 = r6
        L5b:
            com.revolut.core.ui_kit.models.MoneyClause r7 = new com.revolut.core.ui_kit.models.MoneyClause
            com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults r9 = new com.revolut.core.ui_kit.models.MoneyClause$Format$Defaults
            aw0.k7 r10 = aw0.k7.NEVER
            r13 = 0
            r14 = 14
            r11 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            com.revolut.core.ui_kit.models.Custom r10 = new com.revolut.core.ui_kit.models.Custom
            int r2 = com.revolut.core.ui_kit_resources.R$attr.uikit_colorAccent
            java.lang.Integer r11 = new java.lang.Integer
            r11.<init>(r2)
            r15 = 0
            r16 = 254(0xfe, float:3.56E-43)
            r13 = 0
            r14 = 0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r11 = 0
            r12 = 8
            r7.<init>(r8, r9, r10, r11, r12)
            kpj.f r2 = r0.f225368b
            n2l.d r3 = n2l.d.f211586a
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = r2.h(r3, r1, r6)
            nii.j0 r8 = new nii.j0
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.retail.wealth.resources.R$string.wealth_trading_withdraw_success
            r3 = 2
            com.revolut.core.ui_kit.models.Clause[] r3 = new com.revolut.core.ui_kit.models.Clause[r3]
            r4 = 0
            r3[r4] = r7
            r3[r5] = r1
            java.util.List r1 = zhm.v.k(r3)
            r3 = 12
            r9.<init>(r2, r1, r6, r3)
            r19 = 0
            r20 = 4094(0xffe, float:5.737E-42)
            r10 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ohh.b.b(dj0.d, com.revolut.feature.wealth.models.addmoney.TransferSubjectId, efl.h, gim.c):java.lang.Object");
    }
}

package gn1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.ApmToggles$BillsTransferJointAccounts;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import io3.l;
import java.util.Set;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import wsg.n;
import zhm.y0;
import zhm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo9.a f144902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f144903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f144904c;

    public b(vo9.a paymentPocketMapper, gte.a featureToggleInteractor, n walletInteractor) {
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f144902a = paymentPocketMapper;
        this.f144903b = featureToggleInteractor;
        this.f144904c = walletInteractor;
    }

    public final CurrencyChooserFlowDestination.InputData a(String str) {
        Set setI = z0.i(k1j.a.POCKETS, ((d) this.f144903b).c(ApmToggles$BillsTransferJointAccounts.f61786c) ? k1j.a.JOINT_ACCOUNT : null);
        xi0.b.Companion.getClass();
        xi0.b bVar = xi0.b.D;
        return new CurrencyChooserFlowDestination.InputData(new CurrencyChooserFlowDestination.StartType.BalancePicker(str, bVar, l.CURRENT, y0.b(bVar.f306286a), (Set) null, setI, (TextLocalisedClause) null, false, (Integer) null, (Set) null, 1960));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId r11, gim.c r12, java.lang.String r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof gn1.a
            if (r0 == 0) goto L13
            r0 = r12
            gn1.a r0 = (gn1.a) r0
            int r1 = r0.f144901w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f144901w = r1
            goto L18
        L13:
            gn1.a r0 = new gn1.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f144901w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L54
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            wsg.n r4 = r10.f144904c
            if (r13 != 0) goto L47
            xi0.a r11 = xi0.b.Companion
            r11.getClass()
            xi0.b r5 = xi0.b.D
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)
            goto L4b
        L47:
            efm.d0 r11 = r4.z(r11, r13)
        L4b:
            r0.f144901w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L54
            return r1
        L54:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: gn1.b.b(com.revolut.core.model.account.AccountId, gim.c, java.lang.String):java.lang.Object");
    }
}

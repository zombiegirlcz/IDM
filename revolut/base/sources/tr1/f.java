package tr1;

import al4.n;
import com.revolut.feature.apm.bills.tapi.api.TapiFeatureApi$Toggles$TransferFromJointAccounts;
import io3.l;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import om4.k0;
import om4.x2;
import q97.g3;
import tq0.j;
import vkm.q;
import w4l.h;
import zhm.h0;
import zhm.z0;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vo9.a f273633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f273634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f273635c;
    public final n d;

    public f(vo9.a paymentPocketMapper, k0 creditCardFeatureInteractor, gte.a featureToggleInteractor, n creditCardInteractor) {
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        this.f273633a = paymentPocketMapper;
        this.f273634b = creditCardFeatureInteractor;
        this.f273635c = featureToggleInteractor;
        this.d = creditCardInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof tr1.b
            if (r0 == 0) goto L13
            r0 = r5
            tr1.b r0 = (tr1.b) r0
            int r1 = r0.f273628x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f273628x = r1
            goto L18
        L13:
            tr1.b r0 = new tr1.b
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f273628x
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            tr1.f r0 = r0.u
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L4a
        L29:
            r5 = move-exception
            goto L57
        L2b:
            r5 = move-exception
            goto L75
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            om4.k0 r5 = r4.f273634b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            yw4.f r2 = yw4.f.BILL_PAYMENTS     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.u = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r0.f273628x = r3     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r5 = r5.e(r2, r0)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r5 != r1) goto L49
            return r1
        L49:
            r0 = r4
        L4a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.util.Set r5 = r0.b(r5)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L5d
        L57:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L5d:
            java.lang.Throwable r0 = yhm.m.a(r5)
            if (r0 == 0) goto L66
            hx7.e.n(r0)
        L66:
            boolean r0 = r5 instanceof yhm.n
            if (r0 == 0) goto L6b
            r5 = 0
        L6b:
            java.util.Set r5 = (java.util.Set) r5
            if (r5 != 0) goto L74
            r5 = 0
            java.util.Set r5 = r4.b(r5)
        L74:
            return r5
        L75:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tr1.f.a(gim.c):java.lang.Object");
    }

    public final Set b(boolean z) {
        return z0.i(k1j.a.POCKETS, k1j.a.VAULTS, k1j.a.CRYPTO, k1j.a.COMMODITIES, z ? k1j.a.CREDIT_CARDS : null, ((jte.d) this.f273635c).c(TapiFeatureApi$Toggles$TransferFromJointAccounts.f61531c) ? k1j.a.JOINT_ACCOUNT : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r17, gim.c r18) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof tr1.c
            if (r2 == 0) goto L17
            r2 = r1
            tr1.c r2 = (tr1.c) r2
            int r3 = r2.f273630x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f273630x = r3
            goto L1c
        L17:
            tr1.c r2 = new tr1.c
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.v
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f273630x
            r5 = 1
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            java.lang.String r2 = r2.u
            yhm.o.b(r1)
            r5 = r2
            goto L48
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L36:
            yhm.o.b(r1)
            r1 = r17
            r2.u = r1
            r2.f273630x = r5
            java.lang.Object r2 = r0.a(r2)
            if (r2 != r3) goto L46
            return r3
        L46:
            r5 = r1
            r1 = r2
        L48:
            r10 = r1
            java.util.Set r10 = (java.util.Set) r10
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$InputData r1 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$InputData
            com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$StartType$BalancePicker r4 = new com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination$StartType$BalancePicker
            xi0.a r2 = xi0.b.Companion
            r2.getClass()
            xi0.b r6 = xi0.b.z
            io3.l r7 = io3.l.CURRENT
            com.revolut.feature.apm.bills.tapi.api.TapiFeatureApi$Toggles$NonMxCurrencyPocketSelection r2 = com.revolut.feature.apm.bills.tapi.api.TapiFeatureApi$Toggles$NonMxCurrencyPocketSelection.f61529c
            gte.a r3 = r0.f273635c
            jte.d r3 = (jte.d) r3
            boolean r2 = r3.c(r2)
            if (r2 == 0) goto L67
            r2 = 0
        L65:
            r8 = r2
            goto L6e
        L67:
            java.lang.String r2 = r6.f306286a
            java.util.Set r2 = zhm.y0.b(r2)
            goto L65
        L6e:
            r14 = 0
            r15 = 1960(0x7a8, float:2.747E-42)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1.<init>(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tr1.f.c(java.lang.String, gim.c):java.lang.Object");
    }

    public final Flow d(io3.d pocket, Double d) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        if (pocket.e == l.CREDIT) {
            return q.q(new g3(mo3.a.g(rd0.e.n(nim.a.A(nim.a.v(((x2) this.d).B(pocket.f163145a, h.f294642c), new a(0, d)), new tpi.g(3)), h0.f322473a), null, new j(4), 1), 20));
        }
        Intrinsics.checkNotNullParameter(pocket, "<this>");
        String str = pocket.f163147c;
        xi0.b.Companion.getClass();
        return new go.g(Intrinsics.f(str, xi0.b.z.f306286a) ? z92.f.j(pocket) : yh5.b.p(z92.f.j(pocket), d), 2);
    }
}

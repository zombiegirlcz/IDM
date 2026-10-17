package rbj;

import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.CryptoDepositsOverviewControllerContract$InputData;
import com.revolut.retail.feature.crypto_deposits.impl.ui.overview.flow.CryptoDepositsOverviewFlowContract$InputData;
import efm.r;
import h30.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import om4.r0;
import te0.w;
import xx9.p;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbj.d f253137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl3.a f253138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f253139c;
    public final fkg.a d;
    public final b e;
    public final jbj.c f;

    public l(kbj.d depositsFeatureStateChecker, cl3.a contactsInteractor, p recentsInteractor, CryptoDepositsOverviewControllerContract$InputData inputData, m dataSourceFactory, fkg.a qrCodeGenerator) {
        b bVar;
        Intrinsics.checkNotNullParameter(depositsFeatureStateChecker, "depositsFeatureStateChecker");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(recentsInteractor, "recentsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dataSourceFactory, "dataSourceFactory");
        Intrinsics.checkNotNullParameter(qrCodeGenerator, "qrCodeGenerator");
        this.f253137a = depositsFeatureStateChecker;
        this.f253138b = contactsInteractor;
        this.f253139c = recentsInteractor;
        this.d = qrCodeGenerator;
        CryptoDepositsOverviewFlowContract$InputData.Source source = inputData.f;
        Intrinsics.checkNotNullParameter(source, "source");
        if (source instanceof CryptoDepositsOverviewFlowContract$InputData.Source.CeFi) {
            bVar = new b(dataSourceFactory.f253140a, true);
        } else {
            if (!(source instanceof CryptoDepositsOverviewFlowContract$InputData.Source.DeFi)) {
                throw new NoWhenBranchMatchedException();
            }
            r10.f fVar = dataSourceFactory.f253141b;
            CryptoDepositsOverviewFlowContract$InputData.Source.DeFi deFi = (CryptoDepositsOverviewFlowContract$InputData.Source.DeFi) source;
            String accountId = deFi.f100100a;
            String assetExternalId = deFi.f100101b;
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(assetExternalId, "assetExternalId");
            bVar = new b(new q(accountId, assetExternalId, (k18.c) fVar.b, (g26.b) fVar.c), false);
        }
        this.e = bVar;
        this.f = bVar.f253122a;
    }

    public final vkm.d a(r contactsPermissionsGrantedObservable, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contactsPermissionsGrantedObservable, "contactsPermissionsGrantedObservable");
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        cl3.e eVar = new cl3.e("");
        r rVarW = nim.a.w(((wl3.h) this.f253138b).l(new cl3.c[]{cl3.c.ON_REVOLUT}, eVar), new g(0));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        r map = w.l(contactsPermissionsGrantedObservable, nim.a.w(kli.a.h(rVarW, nim.a.w(p.b(this.f253139c, ""), new r7i.r(29))), new r7i.r(28))).map(new rbf.c(new ou5.a(16, currency), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    public final wkm.l b(xi0.b currency, Flow userSelectedBlockchainFlow) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(userSelectedBlockchainFlow, "userSelectedBlockchainFlow");
        Continuation continuation = null;
        return vkm.q.Q(new t38.e(this.f.k(currency), 24, userSelectedBlockchainFlow, new p24.q(3, 22, continuation)), new r0(continuation, currency, this, 17));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum c(xi0.b r6, boolean r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof rbj.j
            if (r0 == 0) goto L13
            r0 = r8
            rbj.j r0 = (rbj.j) r0
            int r1 = r0.f253135x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f253135x = r1
            goto L18
        L13:
            rbj.j r0 = new rbj.j
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f253135x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r7 = r0.u
            yhm.o.b(r8)
            goto L6c
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            rbj.b r8 = r5.e
            boolean r8 = r8.f253123b
            if (r8 != 0) goto L3d
            zbj.w r6 = zbj.w.Wallet
            return r6
        L3d:
            java.lang.String r8 = "currency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            kbj.d r8 = r5.f253137a
            pfm.z r8 = r8.a()
            i5f.g r2 = new i5f.g
            r4 = 9
            r2.<init>(r4, r6)
            k64.a r6 = new k64.a
            r4 = 24
            r6.<init>(r4, r2)
            ufm.i r2 = new ufm.i
            r4 = 1
            r2.<init>(r8, r6, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r6)
            r0.u = r7
            r0.f253135x = r3
            java.lang.Object r8 = nim.a.b(r2, r0)
            if (r8 != r1) goto L6c
            return r1
        L6c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r6 = r8.booleanValue()
            if (r6 != 0) goto L77
            zbj.w r6 = zbj.w.RevolutFriends
            return r6
        L77:
            if (r7 != 0) goto L7c
            zbj.w r6 = zbj.w.Tabs
            return r6
        L7c:
            zbj.w r6 = zbj.w.Wallet
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rbj.l.c(xi0.b, boolean, gim.c):java.lang.Enum");
    }
}

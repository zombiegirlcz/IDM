package bof;

import aw0.o9;
import cli.y;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.transactions.impl.ui.transactiondetails.content_provider.crypto.card.linked_transaction.LinkedTransactionScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import rnf.u;
import tof.a3;
import tof.o3;
import tof.p0;
import tof.y6;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class q extends oki.h implements g {
    public final boolean A;
    public final wkm.l B;
    public final wkm.l C;
    public final y D;
    public final LinkedTransactionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kye.e f17420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final hof.d f17421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kgm.i f17422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f17423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final pff.a f17424t;
    public final gte.a u;
    public final zxd.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final vnf.a f17425w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final wa7.m f17426x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f17427y;
    public final z1 z;

    public q(LinkedTransactionScreenContract$InputData inputData, kye.e transactionFeeBreakdownInteractor, cli.n stateMapper, hof.d cryptoOrCommodityExchangeItemsContentProvider, kgm.i helpRouter, j60.a bottomExpandableDialogControllerExtension, pff.a transactionTroubleshooterInteractor, gte.a featureToggleInteractor, zxd.c statementsInteractor, vnf.a helpItemsProvider, wa7.m hiddenAccountsInteractor) {
        dj0.d dVar;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionFeeBreakdownInteractor, "transactionFeeBreakdownInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(cryptoOrCommodityExchangeItemsContentProvider, "cryptoOrCommodityExchangeItemsContentProvider");
        Intrinsics.checkNotNullParameter(helpRouter, "helpRouter");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(transactionTroubleshooterInteractor, "transactionTroubleshooterInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(helpItemsProvider, "helpItemsProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.o = inputData;
        this.f17420p = transactionFeeBreakdownInteractor;
        this.f17421q = cryptoOrCommodityExchangeItemsContentProvider;
        this.f17422r = helpRouter;
        this.f17423s = bottomExpandableDialogControllerExtension;
        this.f17424t = transactionTroubleshooterInteractor;
        this.u = featureToggleInteractor;
        this.v = statementsInteractor;
        this.f17425w = helpItemsProvider;
        this.f17426x = hiddenAccountsInteractor;
        Continuation continuation = null;
        z1 z1VarB = vkm.q.b(0, 7, null);
        this.f17427y = z1VarB;
        z1 z1VarB2 = vkm.q.b(0, 7, null);
        this.z = z1VarB2;
        rhf.d dVar2 = inputData.f92088c;
        do3.n nVar = inputData.f92087b;
        boolean z = dVar2 == rhf.d.CRYPTO;
        this.A = z;
        this.B = vkm.q.Q(z1VarB, new p(0, this, continuation));
        this.C = vkm.q.Q(z1VarB2, new p(1, this, continuation));
        a3 a3VarJ2 = J2();
        dj0.d dVar3 = a3VarJ2.k;
        i iVar = inputData.d;
        iVar.getClass();
        if (z != (iVar == i.CRYPTO_CARDS)) {
            o3 o3Var = new o3(dVar3, null);
            o3 o3Var2 = a3VarJ2.J;
            if (o3Var2 != null && (dVar = o3Var2.f272965a) != null) {
                dVar3 = dVar;
            }
            a3VarJ2 = a3.b(a3VarJ2, null, dVar3.a(), a3VarJ2.f272606p, a3VarJ2.f272599l, 0.0d, false, p0.BUY, o3Var, null, -67144705, -17, -1);
        }
        rnf.m mVarI2 = I2(a3VarJ2, nVar);
        rnf.m mVarI22 = I2(J2(), nVar);
        u uVar = mVarI22.f255666a;
        Intrinsics.checkNotNullParameter(mVarI22, "<this>");
        a3 a3Var = uVar.f255687a;
        m70.a.c(t0.f186434a);
        thf.a aVar = new thf.a(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false);
        dj0.d dVar4 = a3Var.f272606p;
        Intrinsics.checkNotNullParameter(mVarI22, "<this>");
        uVar.getClass();
        this.D = mra.d.b(this, new f(mVarI2, new hof.a(a3Var, aVar, false, dVar4, null, null)), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final rnf.m I2(tof.a3 r35, do3.n r36) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.q.I2(tof.a3, do3.n):rnf.m");
    }

    public final a3 J2() {
        return a3.b(this.o.f92086a, y6.EXCHANGE, null, null, null, 0.0d, false, p0.SELL, null, null, -69730321, -12582913, -1025);
    }

    public final void K2() {
        C1(u0.b(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedHelpDestination((SharedHelpDestination.InputData) null, 3), false, (Integer) null, 0, 61))));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0035  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T1(long r11) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bof.q.T1(long):void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}

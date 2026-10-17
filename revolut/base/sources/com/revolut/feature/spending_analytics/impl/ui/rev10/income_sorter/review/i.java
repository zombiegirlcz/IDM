package com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.review;

import aqd.i0;
import cli.y;
import com.revolut.core.error.data.model.ServerErrorException;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.spending_analytics.api.models.income_sorter.IncomeSorterDestinationInfo;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.home.IncomeSorterHomeContract$DestinationValue;
import com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.models.RemainingBalanceDestination;
import com.revolut.retail.common.ui.R$string;
import dqd.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ofm.q;
import s9b.n;
import sqd.e0;
import sqd.h0;
import tof.a3;
import ybl.l;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements sqd.e {
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final vii.b B;
    public final sqd.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.b f87865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j9l.a f87866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l f87867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final k f87868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uqd.a f87869t;
    public final q06.l u;
    public final wzi.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final sh5.d f87870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final mre.c f87871x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final v60.e f87872y;
    public final y z;

    public i(sqd.d inputData, whf.b transactionsContentProvider, j9l.a moneyCalculator, l tradingConfigInteractor, k incomeSorterDisclaimersProvider, uqd.a incomeSorterReviewDisclaimersMapper, q06.l deeplinkRouter, wzi.a incomeSorterInteractor, sh5.d cryptoFcaDisclaimerWidget, mre.c termsNavigationFactory, j stateMapper, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(incomeSorterDisclaimersProvider, "incomeSorterDisclaimersProvider");
        Intrinsics.checkNotNullParameter(incomeSorterReviewDisclaimersMapper, "incomeSorterReviewDisclaimersMapper");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(incomeSorterInteractor, "incomeSorterInteractor");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.o = inputData;
        this.f87865p = transactionsContentProvider;
        this.f87866q = moneyCalculator;
        this.f87867r = tradingConfigInteractor;
        this.f87868s = incomeSorterDisclaimersProvider;
        this.f87869t = incomeSorterReviewDisclaimersMapper;
        this.u = deeplinkRouter;
        this.v = incomeSorterInteractor;
        this.f87870w = cryptoFcaDisclaimerWidget;
        this.f87871x = termsNavigationFactory;
        this.f87872y = serverErrorsProvider;
        this.z = mra.d.b(this, new sqd.a(new Data(null, null, true, 3, null), false, null), stateMapper, null, false, 12);
        this.A = hx7.e.a(this, new scl.h(this, 23));
        this.B = new vii.b();
    }

    public static final Flow I2(i iVar, Throwable th10) throws Throwable {
        if (th10 instanceof ServerErrorException) {
            v60.c cVarB = ((ao0.a) iVar.f87872y).b(Integer.valueOf(((ServerErrorException) th10).f.f51362a));
            return cVarB != null ? iVar.X1(new mii.h(q.O(cVarB), "server_error")) : iVar.L2();
        }
        if (th10 instanceof CancellationException) {
            throw th10;
        }
        return iVar.L2();
    }

    public static final void J2(i iVar) {
        sqd.d dVar = iVar.o;
        ArrayList arrayList = dVar.f265051b;
        List list = dVar.e;
        ArrayList arrayListP = pyd.c.p(arrayList);
        a3 a3Var = dVar.d;
        dj0.d dVar2 = a3Var.k;
        RemainingBalanceDestination remainingBalanceDestination = dVar.f265052c;
        IncomeSorterHomeContract$DestinationValue incomeSorterHomeContract$DestinationValue = null;
        if (!tpd.a.e(remainingBalanceDestination, dVar2.f115083b)) {
            j9l.a aVar = iVar.f87866q;
            xi0.b bVar = dVar2.f115083b;
            ArrayList arrayList2 = new ArrayList(w.t(arrayListP, 10));
            Iterator it8 = arrayListP.iterator();
            while (it8.hasNext()) {
                arrayList2.add(((IncomeSorterHomeContract$DestinationValue) it8.next()).f87826b);
            }
            dj0.d dVarA = aVar.a(bVar, arrayList2, list);
            if (dVarA != null) {
                dj0.d dVarH = pyd.c.H(dVar2, dVarA);
                RemainingBalanceDestination.DestinationInfo destinationInfo = remainingBalanceDestination instanceof RemainingBalanceDestination.DestinationInfo ? (RemainingBalanceDestination.DestinationInfo) remainingBalanceDestination : null;
                IncomeSorterDestinationInfo incomeSorterDestinationInfo = destinationInfo != null ? destinationInfo.f87835a : null;
                if (incomeSorterDestinationInfo != null && dVarH.f(dj0.d.e)) {
                    incomeSorterHomeContract$DestinationValue = new IncomeSorterHomeContract$DestinationValue(incomeSorterDestinationInfo, dVarH);
                }
            }
        }
        iVar.C2(new sqd.f(arrayListP, incomeSorterHomeContract$DestinationValue, a3Var.k, list));
    }

    public static final hzi.a K2(i iVar, i0 i0Var) {
        int i = i0Var == null ? -1 : e0.f265055a[i0Var.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return hzi.a.AUTO;
        }
        if (i == 2) {
            return hzi.a.MANUALLY;
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final void I1() {
        l2(new h0(this, null, 0), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    public final Flow L2() {
        return X1(new mii.h(new TextLocalisedClause(R$string.common_error_title, null, null, 14), "error"));
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, vkm.q.Q(this.B, new n(continuation, this, 7)), null, new sek.q(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.z;
    }
}

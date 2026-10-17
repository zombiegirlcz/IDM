package com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.multibanco.MultibancoWithdrawalCode;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoCodeDetailsInputData;
import com.revolut.feature.apm.multibanco.api.navigation.MultibancoWithdrawalInputData;
import com.revolut.feature.apm.multibanco.impl.common.MultibancoArticles;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.MultibancoWithdrawalFlow;
import com.revolut.feature.apm.multibanco.impl.ui.withdrawal.details.WithdrawalCodeDetailsContract$ModalStep;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.product_article.api.navigation.ProductArticleDescriptor;
import com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour;
import com.revolut.feature.shared.help_centre.api.main.SharedHelpDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.kompot.common.ModalDestination;
import f01.c;
import hx7.e;
import ip0.v7;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlinx.coroutines.Job;
import oki.h;
import org.jetbrains.annotations.NotNull;
import tb4.t;
import tof.a3;
import tqi.g;
import ukm.f;
import vkm.q;
import vkm.z1;
import x82.d;
import x82.k;
import x82.o;
import y62.b;
import yji.l;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements d {

    @NotNull
    public static final k Companion = new k();
    public final MultibancoCodeDetailsInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f62636p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f62637q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f62638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zj2.a f62639s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f62640t;
    public final y u;
    public final com.revolut.kompot.navigable.vc.modal.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1 f62641w;

    public a(MultibancoCodeDetailsInputData inputData, t interactor, b withdrawalExtension, g shareNaviCommandFactory, zj2.a atmDestinationsResolver, c uiKitResources, n stateMapper) {
        Data data;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(withdrawalExtension, "withdrawalExtension");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(atmDestinationsResolver, "atmDestinationsResolver");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62636p = interactor;
        this.f62637q = withdrawalExtension;
        this.f62638r = shareNaviCommandFactory;
        this.f62639s = atmDestinationsResolver;
        this.f62640t = uiKitResources;
        if (inputData instanceof MultibancoCodeDetailsInputData.ByCode) {
            data = zi0.c.P(((MultibancoCodeDetailsInputData.ByCode) inputData).f62539a, false, null, 3);
        } else {
            if (!(inputData instanceof MultibancoCodeDetailsInputData.ById)) {
                throw new NoWhenBranchMatchedException();
            }
            data = new Data(null, null, true, 3, null);
        }
        this.u = mra.d.b(this, new x82.b(data, null, withdrawalExtension.Z2()), stateMapper, null, false, 12);
        this.v = e.a(this, new x2g.b(this, 9));
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f62641w = z1VarB;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.Q(this.f62641w, new x82.n(0, this, continuation)), null, null, new o(0, this, continuation), 3);
        l.a1(this, q.Q(v7.w(this.u.B(new x64.a(15))), new x82.n(1, this, continuation)), null, null, new o(1, this, continuation), 3);
    }

    public final void I2(x62.b item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.f303030b;
        boolean z = obj2 instanceof x82.a;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.v;
        if (z) {
            int i = x82.l.f303269a[((x82.a) obj2).ordinal()];
            if (i == 1) {
                l.j2(this, e1(new ProductArticleDescriptor(new ProductArticleParams(new ProductArticleParams.ArticleReference.Key(MultibancoArticles.WITHDRAWAL)), SkipShownArticleBehaviour.AlwaysShow.f81285a, false, null, null, false, 60)), null, null, 3);
                return;
            }
            if (i == 2) {
                C1(zj2.a.a(this.f62639s, null, 3));
                return;
            } else if (i == 3) {
                h.v2(aVar, WithdrawalCodeDetailsContract$ModalStep.CancelConfirmation.f62634a, bottom_dialog);
                return;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                C1(new SharedHelpDestination((SharedHelpDestination.InputData) null, 3));
                return;
            }
        }
        if (obj2 instanceof a3) {
            C1(u0.c(new TransactionsFeatureConfig.Details(ofm.q.P((a3) obj2), null, null, null, 126)));
            return;
        }
        if (obj2 instanceof MultibancoWithdrawalCode) {
            l.j2(this, new MultibancoWithdrawalFlow(new MultibancoWithdrawalInputData(new TransferMoneyPocket(((MultibancoWithdrawalCode) obj2).f, null, 2))), null, null, 3);
            return;
        }
        String str = item.f303029a;
        c92.d.Companion.getClass();
        if (d0.J(str, c92.d.f22267b.f190615a, false)) {
            h.v2(aVar, WithdrawalCodeDetailsContract$ModalStep.ShareConfirmation.f62635a, bottom_dialog);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj2, "Cannot handle: "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.v;
    }

    @Override // yji.l
    public final void T1(long j2) {
        wp0.b func = new wp0.b(this, 18);
        b bVar = this.f62637q;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(func, "func");
        Job job2 = bVar.f311119m;
        if (job2 != null) {
            job2.f(null);
        }
        bVar.f311119m = (Job) func.invoke();
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}

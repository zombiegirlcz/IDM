package hkj;

import bej.m;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_invoices.EsimMobilePlanInvoicesScreenContract$InputData;
import dfj.s3;
import hba.k;
import hcj.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends h implements dli.b {
    public final EsimMobilePlanInvoicesScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f152934p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s3 f152935q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final jkj.a f152936r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f152937s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f152938t;

    public f(n stateMapper, EsimMobilePlanInvoicesScreenContract$InputData inputData, m statementsInteractor, s3 subscriptionsInteractor, jkj.a documentLoadingDialogsMapper) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(documentLoadingDialogsMapper, "documentLoadingDialogsMapper");
        this.o = inputData;
        this.f152934p = statementsInteractor;
        this.f152935q = subscriptionsInteractor;
        this.f152936r = documentLoadingDialogsMapper;
        this.f152937s = new vii.b();
        this.f152938t = mra.d.b(this, new d(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, nim.a.v(q.Q(this.f152937s, new o(continuation, this, 7)), new hhd.n(17)), null, null, new k(this, continuation, 25), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.f152938t;
    }
}

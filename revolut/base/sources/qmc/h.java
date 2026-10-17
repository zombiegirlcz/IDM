package qmc;

import akg.n;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ql6.s;
import vkm.q;
import ybl.k;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements glc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.f f247801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final emc.e f247802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f247803c;

    public h(zjh.f portfolioInteractor, emc.e templatesInteractor, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(templatesInteractor, "templatesInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f247801a = portfolioInteractor;
        this.f247802b = templatesInteractor;
        this.f247803c = tradingAccountsInteractor;
    }

    public final Flow d(String templateId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q.q(xam.a.h(new a9h.a(26, this, loadingStrategy, templateId, (Continuation) null), q.q(nim.a.v(k.k(this.f247803c, null, null, null, 7), new s(20)))));
    }

    public final n e(String templateId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(d(templateId, loadingStrategy), new s(17));
    }
}

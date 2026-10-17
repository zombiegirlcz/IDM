package lia;

import akg.n;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.freelancer.common.models.acquiring_order.AcquiringOrderFilter;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import nr6.b0;
import w4l.j;
import w4l.k;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9k.f f195444a;

    public f(b9k.f acquiringOrderInteractor, c intervalCalculator) {
        Intrinsics.checkNotNullParameter(acquiringOrderInteractor, "acquiringOrderInteractor");
        Intrinsics.checkNotNullParameter(intervalCalculator, "intervalCalculator");
        this.f195444a = acquiringOrderInteractor;
    }

    public final n a(kia.b params, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Set set = params.e;
        AcquiringOrderFilter.Currency currency = set != null ? new AcquiringOrderFilter.Currency(set) : null;
        gr6.c loadingMode = new gr6.c(loadingStrategy);
        b0 sorting = new b0(false);
        Intrinsics.checkNotNullParameter(sorting, "sorting");
        Intrinsics.checkNotNullParameter(loadingMode, "loadingMode");
        b9k.f fVar = this.f195444a;
        return nim.a.v(boh.f.e(rd0.e.b(((wsg.n) fVar.f13819g).J(AccountId.Personal.f51414a, j.f294644c)), new dqd.a(fVar, currency, sorting, loadingMode, 6)), new laj.b(this, params));
    }
}

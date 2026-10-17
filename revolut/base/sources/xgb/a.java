package xgb;

import a0.d;
import com.revolut.feature.retail.salary_account.impl.model.salary_promotion.SalaryPromotionParams;
import com.revolut.feature.retail.salary_account.impl.salary_promotion.data.SalaryPromotionService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import ue0.c;
import wqj.g;
import wvg.i;
import x2g.b;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SalaryPromotionService f305670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f305671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f305672c;
    public final x4l.c d;

    public a(SalaryPromotionService service, j memoryCache, c storage) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f305670a = service;
        this.f305671b = memoryCache;
        this.f305672c = storage;
        Continuation continuation = null;
        this.d = new x4l.c(new g(this, continuation, 5), new xe7.a(this, 6), new b(this, 24), new x64.b(this, continuation, 21), new i(this, continuation, 15));
    }

    public static String a(SalaryPromotionParams salaryPromotionParams) {
        return d.s("SALARY_PROMOTION_KEY_", salaryPromotionParams.f82984a, "_", salaryPromotionParams.f82985b);
    }
}

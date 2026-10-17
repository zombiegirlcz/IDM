package ryd;

import com.revolut.domain.models.statement.StatementTemplateId;
import efm.c0;
import efm.d0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f258333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StatementTemplateId f258334c;

    public /* synthetic */ e(w wVar, StatementTemplateId statementTemplateId, int i) {
        this.f258332a = i;
        this.f258333b = wVar;
        this.f258334c = statementTemplateId;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f258332a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                d0 d0VarFirstOrError = m70.a.g(this.f258333b.f258359c.a(this.f258334c, false), null, new ru5.m(28), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
                return d0VarFirstOrError;
            default:
                String cachedCheckSum = (String) obj2;
                Intrinsics.checkNotNullParameter(cachedCheckSum, "cachedCheckSum");
                w wVar = this.f258333b;
                c31.e eVar = wVar.f258359c;
                StatementTemplateId id10 = this.f258334c;
                d0 d0VarFirstOrError2 = m70.a.g(eVar.a(id10, true), null, new ru5.m(27), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError2, "firstOrError(...)");
                rxb.f fVar = new rxb.f(26, new e(wVar, id10, 0));
                d0VarFirstOrError2.getClass();
                ufm.i iVar = new ufm.i(d0VarFirstOrError2, fVar, 2);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                d0 d0VarFirstOrError3 = m70.a.g(eVar.a(id10, false), null, new ru5.m(28), 1).firstOrError();
                Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError3, "firstOrError(...)");
                mfm.f.b(d0VarFirstOrError3, "other is null");
                c0 c0Var = hhm.f.f152430b;
                mfm.f.b(timeUnit, "unit is null");
                mfm.f.b(c0Var, "scheduler is null");
                ufm.p pVar = new ufm.p(iVar, 3L, timeUnit, c0Var, d0VarFirstOrError3);
                Intrinsics.checkNotNullExpressionValue(pVar, "timeout(...)");
                Intrinsics.checkNotNullParameter(id10, "id");
                ufm.c cVar = new ufm.c(new c31.c(eVar, id10, 1), 2);
                Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                return new ufm.i(te0.w.H0(pVar, te0.w.i0(cVar)), new rxb.f(23, new rvc.k(cachedCheckSum, 3)), 1);
        }
    }
}

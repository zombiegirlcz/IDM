package up5;

import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f281871b;

    public /* synthetic */ c0(g0 g0Var, int i) {
        this.f281870a = i;
        this.f281871b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f281870a) {
            case 0:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f281871b.f281893b.a(it8);
            case 1:
                NaviCommand it9 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return this.f281871b.f281893b.a(it9);
            case 2:
                d step = (d) obj2;
                Intrinsics.checkNotNullParameter(step, "step");
                efm.d0 d0VarFirstOrError = ((a0) this.f281871b.f281892a).C3().firstOrError();
                d0 d0Var = new d0(0, new b0(step, 0));
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, d0Var, 1);
            case 3:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                return new pfm.h(new r2d.e(this.f281871b, 15, (d) obj3, (xi0.b) obj4), 2);
            case 4:
                wi0.b countryCode = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                g0 g0Var = this.f281871b;
                mre.c cVar = g0Var.e;
                TermsScope.INSTANCE.getClass();
                pfm.a aVar = new pfm.a(((rre.d) cVar).c(TermsScope.S, countryCode), new j(new c0(g0Var, 1), 28), 4);
                Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
                return aVar;
            case 5:
                wi0.b countryCode2 = (wi0.b) obj2;
                Intrinsics.checkNotNullParameter(countryCode2, "countryCode");
                g0 g0Var2 = this.f281871b;
                mre.c cVar2 = g0Var2.e;
                TermsScope.INSTANCE.getClass();
                pfm.a aVar2 = new pfm.a(((rre.d) cVar2).c(TermsScope.o, countryCode2), new j(new c0(g0Var2, 0), 27), 4);
                Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
                return aVar2;
            default:
                d step2 = (d) obj2;
                Intrinsics.checkNotNullParameter(step2, "step");
                efm.d0 d0VarFirstOrError2 = ((a0) this.f281871b.f281892a).C3().firstOrError();
                j jVar = new j(new b0(step2, 1), 29);
                d0VarFirstOrError2.getClass();
                return new ufm.i(d0VarFirstOrError2, jVar, 1);
        }
    }
}

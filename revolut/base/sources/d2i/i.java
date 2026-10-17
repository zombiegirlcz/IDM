package d2i;

import com.revolut.feature.exchange.models.ExchangeResult;
import efm.d0;
import et6.h1;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr6.m0;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f110859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f110860c;

    public /* synthetic */ i(k kVar, j jVar, int i) {
        this.f110858a = i;
        this.f110859b = kVar;
        this.f110860c = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f110858a) {
            case 0:
                k kVar = this.f110859b;
                rea.m mVar = kVar.f110864a;
                j jVar = this.f110860c;
                dj0.d dVar = jVar.f110861a;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                io3.l lVar = (io3.l) pair.f186386b;
                if (!zBooleanValue) {
                    ufm.b bVarM = d0.m(new ExchangeResult.PocketActivationRequired(dVar.f115083b, wd6.i.MERCHANT, lVar, jVar.d));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                xi0.b bVar = dVar.f115083b;
                io3.l lVar2 = io3.l.MERCHANT;
                ufm.i iVar = new ufm.i(w.H0(eda.f.a(mVar, bVar, lVar2, null, 4), eda.f.a(mVar, jVar.f110862b.f115083b, lVar2, null, 4)), new a(new i(kVar, jVar, 1), 5), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                return iVar;
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                eda.e eVar = (eda.e) pair2.f186385a;
                eda.e eVar2 = (eda.e) pair2.f186386b;
                h1 h1Var = this.f110859b.f110865b;
                String str = eVar.f124961a.f163145a;
                String str2 = eVar2.f124961a.f163145a;
                j jVar2 = this.f110860c;
                dj0.d dVar2 = jVar2.f110861a;
                return h1Var.e(new m0(dVar2.f115082a, str, str2, dVar2.f115083b)).f(d0.m(new ExchangeResult.FreelancerSuccess(dVar2, jVar2.f110862b, jVar2.f110863c)));
        }
    }
}

package a7j;

import com.revolut.feature.exchange.models.ExchangeResult;
import efm.d0;
import et6.h1;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lr6.m0;
import rea.m;
import te0.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f1923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f1924c;

    public /* synthetic */ h(j jVar, i iVar, int i) {
        this.f1922a = i;
        this.f1923b = jVar;
        this.f1924c = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f1922a) {
            case 0:
                j jVar = this.f1923b;
                m mVar = jVar.f1928a;
                i iVar = this.f1924c;
                dj0.d dVar = iVar.f1925a;
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                boolean zBooleanValue = ((Boolean) pair.f186385a).booleanValue();
                io3.l lVar = (io3.l) pair.f186386b;
                if (!zBooleanValue) {
                    ufm.b bVarM = d0.m(new ExchangeResult.PocketActivationRequired(dVar.f115083b, wd6.i.MERCHANT, lVar, iVar.d));
                    Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                    return bVarM;
                }
                xi0.b bVar = dVar.f115083b;
                io3.l lVar2 = io3.l.MERCHANT;
                ufm.i iVar2 = new ufm.i(w.H0(eda.f.a(mVar, bVar, lVar2, null, 4), eda.f.a(mVar, iVar.f1926b.f115083b, lVar2, null, 4)), new a6b.a(new h(jVar, iVar, 1), 12), 0);
                Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
                return iVar2;
            default:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                eda.e eVar = (eda.e) pair2.f186385a;
                eda.e eVar2 = (eda.e) pair2.f186386b;
                h1 h1Var = this.f1923b.f1929b;
                String str = eVar.f124961a.f163145a;
                String str2 = eVar2.f124961a.f163145a;
                i iVar3 = this.f1924c;
                dj0.d dVar2 = iVar3.f1925a;
                return h1Var.e(new m0(dVar2.f115082a, str, str2, dVar2.f115083b)).f(d0.m(new ExchangeResult.FreelancerSuccess(dVar2, iVar3.f1926b, iVar3.f1927c)));
        }
    }
}

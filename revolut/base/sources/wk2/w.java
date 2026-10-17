package wk2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.atm.impl.ui.redesign.v2.map.a f298225b;

    public /* synthetic */ w(com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar, int i) {
        this.f298224a = i;
        this.f298225b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws Throwable {
        switch (this.f298224a) {
            case 0:
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar = this.f298225b;
                aVar.H2(aVar.C, new wje.m(8));
                aVar.M2();
                break;
            case 1:
                this.f298225b.R2();
                break;
            case 2:
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar2 = this.f298225b;
                aVar2.o.f271847c.i();
                aVar2.J2();
                break;
            default:
                com.revolut.feature.atm.impl.ui.redesign.v2.map.a aVar3 = this.f298225b;
                aVar3.o.i.i();
                aVar3.J2();
                break;
        }
        return Unit.f186387a;
    }
}

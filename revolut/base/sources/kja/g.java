package kja;

import k7c.l0;
import ke7.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f184351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.product.lifecycle.flow.a f184352b;

    public /* synthetic */ g(com.revolut.feature.product.lifecycle.flow.a aVar, int i) {
        this.f184351a = i;
        this.f184352b = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f184351a) {
            case 0:
                com.revolut.feature.product.lifecycle.flow.a aVar = this.f184352b;
                aVar.l2(new l0(aVar, null, 16), new v(aVar, 11));
                break;
            default:
                this.f184352b.C2(new o(1));
                break;
        }
        return Unit.f186387a;
    }
}

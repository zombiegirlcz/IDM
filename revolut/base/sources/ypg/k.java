package ypg;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f315880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f315881c;
    public final /* synthetic */ npg.l d;

    public /* synthetic */ k(p pVar, List list, xi0.b bVar, npg.l lVar, int i) {
        this.f315879a = i;
        this.f315880b = list;
        this.f315881c = bVar;
        this.d = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List exchangeRates = (List) obj2;
        switch (this.f315879a) {
            case 0:
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                break;
            default:
                Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
                break;
        }
        return p.r(this.f315880b, exchangeRates, this.f315881c, this.d);
    }
}

package ppk;

import com.revolut.data.model.Data;
import efm.r;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vpk.q;
import vpk.v;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f238622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n9l.b f238623c;

    public /* synthetic */ d(f fVar, n9l.b bVar, int i) {
        this.f238621a = i;
        this.f238622b = fVar;
        this.f238623c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r rVarJust;
        r rVarJust2;
        Collection currencyPairs = (Collection) obj2;
        switch (this.f238621a) {
            case 0:
                Intrinsics.checkNotNullParameter(currencyPairs, "pairs");
                if (currencyPairs.isEmpty()) {
                    rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                } else {
                    v vVar = this.f238622b.f238627b;
                    vVar.getClass();
                    Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                    n9l.b period = this.f238623c;
                    Intrinsics.checkNotNullParameter(period, "period");
                    Set setB = v.b(currencyPairs);
                    r rVarW = nim.a.w(vVar.f291271j.a(setB, period.a(), false), new q(vVar, setB, 2));
                    Set currencyPairs2 = setB;
                    Intrinsics.checkNotNullParameter(currencyPairs2, "currencyPairs");
                    r rVarConcatWith = mo3.a.n(nim.a.w(vVar.i.f(v.b(currencyPairs2), false), new vn8.a(22))).concatWith(rVarW);
                    Intrinsics.checkNotNullExpressionValue(rVarConcatWith, "concatWith(...)");
                    rVarJust = rVarConcatWith.distinctUntilChanged();
                }
                Intrinsics.h(rVarJust);
                return rVarJust;
            default:
                Intrinsics.checkNotNullParameter(currencyPairs, "pairs");
                if (currencyPairs.isEmpty()) {
                    rVarJust2 = r.just(new Data(f0.f322471a, null, false, 6, null));
                } else {
                    v vVar2 = this.f238622b.f238627b;
                    vVar2.getClass();
                    Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
                    n9l.b period2 = this.f238623c;
                    Intrinsics.checkNotNullParameter(period2, "period");
                    Set setB2 = v.b(currencyPairs);
                    r rVarConcatWith2 = mo3.a.n(nim.a.w(vVar2.f291269g.f(setB2, false), new vn8.a(28))).concatWith(nim.a.w(vVar2.f291270h.a(setB2, period2.a(), false), new q(vVar2, setB2, 0)));
                    Intrinsics.checkNotNullExpressionValue(rVarConcatWith2, "concatWith(...)");
                    rVarJust2 = rVarConcatWith2.distinctUntilChanged();
                }
                Intrinsics.h(rVarJust2);
                return rVarJust2;
        }
    }
}

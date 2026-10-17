package se1;

import com.revolut.feature.acquiring.lite_pos.impl.ui.flow.manage_tax_rates.ManageTaxRatesFlow;
import dd1.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f262087b;

    public /* synthetic */ g(i iVar, int i) {
        this.f262086a = i;
        this.f262087b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f262086a) {
            case 0:
                ee1.e it8 = (ee1.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f262087b.A2(it8.f125062a);
                return Unit.f186387a;
            case 1:
                ee1.e it9 = (ee1.e) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                this.f262087b.A2(it9.f125062a);
                return Unit.f186387a;
            default:
                dd1.a result = (dd1.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof dd1.b;
                i iVar = this.f262087b;
                if (z) {
                    iVar.B2(((dd1.b) result).f113084a);
                } else if (Intrinsics.f(result, a.C0672a.f113082a)) {
                    iVar.B2(null);
                } else {
                    if (!Intrinsics.f(result, a.b.f113083a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    l.i2(iVar, new ManageTaxRatesFlow(), null, null, 3);
                }
                return Unit.f186387a;
        }
    }
}

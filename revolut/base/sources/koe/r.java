package koe;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.tax_residency.impl.screens.list.a f186330b;

    public /* synthetic */ r(com.revolut.feature.tax_residency.impl.screens.list.a aVar, int i) {
        this.f186329a = i;
        this.f186330b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f186329a) {
            case 0:
                boe.g it8 = (boe.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.feature.tax_residency.impl.screens.list.a aVar = this.f186330b;
                aVar.l2(new a31.v(aVar, null), new yi5.b(26));
                break;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 2:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                break;
            case 3:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar2 = this.f186330b;
                aVar2.H2(aVar2.f90097w, new ab4.q((Throwable) obj2, 23));
                break;
            case 4:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar3 = this.f186330b;
                aVar3.H2(aVar3.f90097w, new k37.t((List) obj2, 8));
                break;
            case 5:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar4 = this.f186330b;
                aVar4.H2(aVar4.f90097w, new ka2.b0((Data) obj2, 22));
                break;
            case 6:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar5 = this.f186330b;
                aVar5.H2(aVar5.f90097w, new ka2.b0((Data) obj2, 23));
                break;
            default:
                com.revolut.feature.tax_residency.impl.screens.list.a aVar6 = this.f186330b;
                aVar6.H2(aVar6.f90097w, new ka2.b0((Data) obj2, 24));
                break;
        }
        return Unit.f186387a;
    }
}

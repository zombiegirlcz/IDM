package x9h;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vel.h;
import xzg.j0;
import xzg.k0;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b9k.f f303731b;

    public /* synthetic */ b(b9k.f fVar, int i) {
        this.f303730a = i;
        this.f303731b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        h hVar;
        switch (this.f303730a) {
            case 0:
                List entries = (List) obj2;
                Intrinsics.checkNotNullParameter(entries, "entries");
                List<k0> list = entries;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (k0 k0Var : list) {
                    String str = k0Var.f310003a;
                    j0 j0Var = k0Var.f310004b;
                    this.f303731b.getClass();
                    int i = e.f303739c[j0Var.ordinal()];
                    if (i == 1) {
                        hVar = h.STOCK;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        hVar = h.CURRENCY;
                    }
                    arrayList.add(new vel.g(str, hVar, k0Var.f310005c, k0Var.d));
                }
                return arrayList;
            case 1:
                this.f303731b.f = (List) obj2;
                return Unit.f186387a;
            default:
                this.f303731b.f13819g = (List) obj2;
                return Unit.f186387a;
        }
    }
}

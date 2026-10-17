package b96;

import efm.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f13667b;

    public /* synthetic */ b(e eVar, int i) {
        this.f13666a = i;
        this.f13667b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f13666a) {
            case 0:
                List revolutBankAccounts = (List) obj2;
                Intrinsics.checkNotNullParameter(revolutBankAccounts, "revolutBankAccounts");
                List list = revolutBankAccounts;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((n71.b) it8.next()).f212980l, Boolean.TRUE)) {
                            r rVarFromIterable = r.fromIterable(list);
                            e eVar = this.f13667b;
                            efm.b bVarFlatMapCompletable = rVarFromIterable.flatMapCompletable(new b79.g(new b(eVar, 1), 9));
                            Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                            return bVarFlatMapCompletable.g(eVar.a(true));
                        }
                    }
                }
                return r.just(revolutBankAccounts);
            default:
                n71.b it9 = (n71.b) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                if (!Intrinsics.f(it9.f212980l, Boolean.TRUE)) {
                    return m.f235744a;
                }
                y1k.a aVar = this.f13667b.f13673c;
                String currency = it9.f212975b;
                Intrinsics.checkNotNullParameter(currency, "currency");
                j31.g gVar = (j31.g) ((q2k.e) aVar).d;
                Intrinsics.checkNotNullParameter(currency, "currency");
                return w.g0(gVar.f170930a.createRevolutBankAccountAddressByCurrency(currency));
        }
    }
}

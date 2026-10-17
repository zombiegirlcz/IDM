package nc0;

import com.revolut.data.model.Data;
import fc0.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w4l.h;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f214104b;

    public /* synthetic */ b(f fVar, int i) {
        this.f214103a = i;
        this.f214104b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214103a) {
            case 0:
                Set transactionIds = (Set) obj2;
                Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
                i iVar = this.f214104b.f214116c;
                iVar.getClass();
                Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
                h loadingStrategy = h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(iVar.f133607b.d(transactionIds, loadingStrategy), g.f186406a);
            case 1:
                List list = (List) ((Data) obj2).getContent();
                if (list != null) {
                    this.f214104b.f214117g.onNext(list);
                }
                return Unit.f186387a;
            case 2:
                e it8 = (e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new pfm.h(new i1i.a(this.f214104b, 21), 2);
            default:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                List<v9l.a> list2 = transactions;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                for (v9l.a aVar : list2) {
                    this.f214104b.getClass();
                    arrayList.add(f.b(aVar));
                }
                return d0.i1(arrayList);
        }
    }
}

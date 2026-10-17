package f1e;

import efm.d0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import ufm.i;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f131258b;

    public /* synthetic */ a(d dVar, int i) {
        this.f131257a = i;
        this.f131258b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f131257a) {
            case 0:
                e1e.b dto = (e1e.b) obj2;
                Intrinsics.checkNotNullParameter(dto, "dto");
                if (dto.getItems().isEmpty()) {
                    com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f131258b.d, "is_empty_transactions_valid_key", Boolean.TRUE);
                }
                List<e1e.a> items = dto.getItems();
                ArrayList arrayList = new ArrayList(w.t(items, 10));
                for (e1e.a aVar : items) {
                    Intrinsics.checkNotNullParameter(aVar, "<this>");
                    arrayList.add(new c1e.a(aVar.getId(), mo3.a.o(aVar.getAmount()), new DateTime(aVar.getCompletedAt())));
                }
                return arrayList;
            case 1:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                d dVar = this.f131258b;
                d0<e1e.b> transactions = dVar.f131261a.getTransactions(100);
                ey7.a aVar2 = new ey7.a(new a(dVar, 0), 20);
                transactions.getClass();
                i iVar = new i(transactions, aVar2, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
            case 2:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                return (List) this.f131258b.f131263c.get("slip_transactions_key");
            default:
                Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                d dVar2 = this.f131258b;
                List<x0e.a> listC = dVar2.f131262b.c();
                ArrayList arrayList2 = new ArrayList(w.t(listC, 10));
                for (x0e.a aVar3 : listC) {
                    Intrinsics.checkNotNullParameter(aVar3, "<this>");
                    arrayList2.add(new c1e.a(aVar3.f301574a, hx7.a.v(aVar3.f301575b), aVar3.f301576c));
                }
                if (!arrayList2.isEmpty()) {
                    return arrayList2;
                }
                Boolean bool = (Boolean) dVar2.d.T2("is_empty_transactions_valid_key", Boolean.TYPE);
                if (bool == null || !bool.equals(Boolean.TRUE)) {
                    return null;
                }
                return arrayList2;
        }
    }
}

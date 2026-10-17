package f1e;

import com.revolut.feature.stock_lending.impl.network.StockLendingService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import te0.w;
import w4l.f;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StockLendingService f131261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0e.a f131262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f131263c;
    public final ue0.c d;
    public final f e;

    public d(b80.c networkStateRepository, StockLendingService service, w0e.a dao, j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f131261a = service;
        this.f131262b = dao;
        this.f131263c = memoryCache;
        this.d = storage;
        final int i = 0;
        final int i2 = 1;
        this.e = new f(w.k0(networkStateRepository, new a(this, 1)), new a(this, 2), new Function2(this) { // from class: f1e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f131260b;

            {
                this.f131260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                List transactions = (List) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactions, "transactions");
                        this.f131260b.f131263c.f("slip_transactions_key", transactions);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactions, "transactions");
                        List<c1e.a> list = transactions;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (c1e.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new x0e.a(aVar.f20459a, hx7.a.A(aVar.f20460b), aVar.f20461c));
                        }
                        this.f131260b.f131262b.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, new a(this, 3), new Function2(this) { // from class: f1e.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f131260b;

            {
                this.f131260b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Unit unit = (Unit) obj2;
                List transactions = (List) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactions, "transactions");
                        this.f131260b.f131263c.f("slip_transactions_key", transactions);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(unit, "<unused var>");
                        Intrinsics.checkNotNullParameter(transactions, "transactions");
                        List<c1e.a> list = transactions;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
                        for (c1e.a aVar : list) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            arrayList.add(new x0e.a(aVar.f20459a, hx7.a.A(aVar.f20460b), aVar.f20461c));
                        }
                        this.f131260b.f131262b.b(arrayList);
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }
}

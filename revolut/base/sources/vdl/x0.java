package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.StockExchangeService;
import fdl.b3;
import hcl.c3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StockExchangeService f288060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f288061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f288062c;
    public final ue0.c d;
    public final AtomicBoolean e;
    public final w4l.f f;

    public x0(StockExchangeService stockExchangeService, l80.e dateProvider, ne0.j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(stockExchangeService, "stockExchangeService");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f288060a = stockExchangeService;
        this.f288061b = dateProvider;
        this.f288062c = memoryCache;
        this.d = storage;
        this.e = new AtomicBoolean(false);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: vdl.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f288053b;

            {
                this.f288053b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String stockExchangeCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
                        x0 x0Var = this.f288053b;
                        efm.d0<b3> stockExchange = x0Var.f288060a.getStockExchange(stockExchangeCode);
                        s sVar = new s(11, new u0(x0Var, 0));
                        stockExchange.getClass();
                        ufm.f fVar = new ufm.f(stockExchange, sVar, 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 1:
                        String stockExchangeCode2 = (String) obj2;
                        b3 stockExchange2 = (b3) obj3;
                        Intrinsics.checkNotNullParameter(stockExchangeCode2, "stockExchangeCode");
                        Intrinsics.checkNotNullParameter(stockExchange2, "stockExchange");
                        this.f288053b.f288062c.f(x0.a(stockExchangeCode2), stockExchange2);
                        break;
                    default:
                        String stockExchangeCode3 = (String) obj2;
                        b3 dto = (b3) obj3;
                        Intrinsics.checkNotNullParameter(stockExchangeCode3, "stockExchangeCode");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x0 x0Var2 = this.f288053b;
                        x0Var2.d.G(new c3(((l80.f) x0Var2.f288061b).b().toEpochMilli(), dto), x0.a(stockExchangeCode3), wim.z.d(kotlin.jvm.internal.o0.b(c3.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i2 = 1;
        u0 u0Var = new u0(this, i2);
        Function2 function22 = new Function2(this) { // from class: vdl.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f288053b;

            {
                this.f288053b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i2) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String stockExchangeCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
                        x0 x0Var = this.f288053b;
                        efm.d0<b3> stockExchange = x0Var.f288060a.getStockExchange(stockExchangeCode);
                        s sVar = new s(11, new u0(x0Var, 0));
                        stockExchange.getClass();
                        ufm.f fVar = new ufm.f(stockExchange, sVar, 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 1:
                        String stockExchangeCode2 = (String) obj2;
                        b3 stockExchange2 = (b3) obj3;
                        Intrinsics.checkNotNullParameter(stockExchangeCode2, "stockExchangeCode");
                        Intrinsics.checkNotNullParameter(stockExchange2, "stockExchange");
                        this.f288053b.f288062c.f(x0.a(stockExchangeCode2), stockExchange2);
                        break;
                    default:
                        String stockExchangeCode3 = (String) obj2;
                        b3 dto = (b3) obj3;
                        Intrinsics.checkNotNullParameter(stockExchangeCode3, "stockExchangeCode");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x0 x0Var2 = this.f288053b;
                        x0Var2.d.G(new c3(((l80.f) x0Var2.f288061b).b().toEpochMilli(), dto), x0.a(stockExchangeCode3), wim.z.d(kotlin.jvm.internal.o0.b(c3.class)));
                        break;
                }
                return Unit.f186387a;
            }
        };
        final int i3 = 2;
        this.f = new w4l.f(function2, u0Var, function22, new u0(this, i3), new Function2(this) { // from class: vdl.v0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x0 f288053b;

            {
                this.f288053b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                switch (i3) {
                    case 0:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        String stockExchangeCode = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(stockExchangeCode, "stockExchangeCode");
                        x0 x0Var = this.f288053b;
                        efm.d0<b3> stockExchange = x0Var.f288060a.getStockExchange(stockExchangeCode);
                        s sVar = new s(11, new u0(x0Var, 0));
                        stockExchange.getClass();
                        ufm.f fVar = new ufm.f(stockExchange, sVar, 3);
                        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
                        break;
                    case 1:
                        String stockExchangeCode2 = (String) obj2;
                        b3 stockExchange2 = (b3) obj3;
                        Intrinsics.checkNotNullParameter(stockExchangeCode2, "stockExchangeCode");
                        Intrinsics.checkNotNullParameter(stockExchange2, "stockExchange");
                        this.f288053b.f288062c.f(x0.a(stockExchangeCode2), stockExchange2);
                        break;
                    default:
                        String stockExchangeCode3 = (String) obj2;
                        b3 dto = (b3) obj3;
                        Intrinsics.checkNotNullParameter(stockExchangeCode3, "stockExchangeCode");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x0 x0Var2 = this.f288053b;
                        x0Var2.d.G(new c3(((l80.f) x0Var2.f288061b).b().toEpochMilli(), dto), x0.a(stockExchangeCode3), wim.z.d(kotlin.jvm.internal.o0.b(c3.class)));
                        break;
                }
                return Unit.f186387a;
            }
        }, null, null, null, BERTags.FLAGS);
    }

    public static String a(String str) {
        return j6.a.q("STOCK_EXCHANGE_KEY_", str);
    }
}

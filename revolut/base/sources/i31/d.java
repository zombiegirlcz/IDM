package i31;

import com.revolut.data.network.models.transfer.mapper.ExchangeResultMapperKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xhf.d1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xi0.b f158071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f158072c;
    public final /* synthetic */ String d;

    public /* synthetic */ d(xi0.b bVar, xi0.b bVar2, String str, int i) {
        this.f158070a = i;
        this.f158071b = bVar;
        this.f158072c = bVar2;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List transactions = (List) obj2;
        switch (this.f158070a) {
            case 0:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return ExchangeResultMapperKt.toExchangeResult((List<d1>) transactions, this.f158071b, this.f158072c, this.d, true);
            default:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                return ExchangeResultMapperKt.toExchangeResult((List<d1>) transactions, this.f158071b, this.f158072c, this.d, false);
        }
    }
}

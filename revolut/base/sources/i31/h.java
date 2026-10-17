package i31;

import com.revolut.data.network.models.transfer.mapper.ExchangeResultMapperKt;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import xhf.d1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f158080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f158081c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ h(int i, String str, boolean z, String str2, String str3) {
        this.f158079a = i;
        this.f158080b = str;
        this.f158081c = str2;
        this.d = str3;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List transactions = (List) obj2;
        switch (this.f158079a) {
            case 0:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                break;
            default:
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                break;
        }
        return ExchangeResultMapperKt.toExchangeResult((List<d1>) transactions, this.f158080b, this.f158081c, this.d, this.e);
    }
}

package tt4;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.q implements Function1 {
    public static final p f = new p();

    public p() {
        super(1, do3.q.class, "requireCountryCode", "requireCountryCode(Lcom/revolut/feature/core/model/domain/user/User;)Lcom/revolut/core/model/country/CountryCode;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        do3.n p0 = (do3.n) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return do3.q.y(p0);
    }
}

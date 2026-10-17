package o8i;

import do3.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c extends q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, do3.q.class, "requireCountryCode", "requireCountryCode(Lcom/revolut/feature/core/model/domain/user/User;)Lcom/revolut/core/model/country/CountryCode;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        n p0 = (n) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return do3.q.y(p0);
    }
}

package fci;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, do3.q.class, "requireCountryCode", "requireCountryCode(Lcom/revolut/feature/core/model/domain/user/User;)Lcom/revolut/core/model/country/CountryCode;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        do3.n p0 = (do3.n) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return do3.q.y(p0);
    }
}

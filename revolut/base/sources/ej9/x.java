package ej9;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.q implements Function1 {
    public static final x f = new x();

    public x() {
        super(1, cj9.e.class, "toDomain", "toDomain(Lcom/revolut/feature/pay_later/impl/network/models/PayLaterSwitchOptionsDto;)Lcom/revolut/feature/pay_later/api/models/PayLaterSwitchOptions;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        dj9.z p0 = (dj9.z) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return cj9.e.a(p0);
    }
}

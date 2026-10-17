package jb3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h extends q implements Function1 {
    public static final h f = new h();

    public h() {
        super(1, l.class, "toDomain", "toDomain(Lcom/revolut/feature/cash_topup/impl/data/dto/CurrentLimitsDto;)Lcom/revolut/feature/cash_topup/api/models/CurrentLimits;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        hb3.g p0 = (hb3.g) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new fb3.d(mo3.a.o(p0.getMax()), mo3.a.o(p0.getMin()), p0.getInfo());
    }
}

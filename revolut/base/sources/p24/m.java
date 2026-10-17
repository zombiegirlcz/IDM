package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class m extends kotlin.jvm.internal.q implements Function1 {
    public static final m f = new m();

    public m() {
        super(1, v04.b.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/application/plugins/impl/network/models/direct_debit/DirectDebitInfoDto;)Lcom/revolut/feature/credit/autopay/models/AutoPayInfo;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        v04.a p0 = (v04.a) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        return new bk4.e(p0.getAccountNumber(), p0.getSortCode());
    }
}

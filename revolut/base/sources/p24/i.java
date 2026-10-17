package p24;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.q implements Function1 {
    public static final i f = new i();

    public i() {
        super(1, s14.c.class, "toDomain", "toDomain(Lcom/revolut/feature/credit/application/plugins/impl/network/models/offer/CreditOfferDetailsContentDto;)Lcom/revolut/feature/credit/application/plugins/api/models/offer/CreditOfferDetailsContent;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        s14.b p0 = (s14.b) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p0, "<this>");
        bv3.c cVarA = s14.c.a(p0.getOfferInfoDto());
        c04.a editOfferDto = p0.getEditOfferDto();
        eu3.c cVarB = editOfferDto != null ? n14.a.b(editOfferDto) : null;
        d04.a repaymentTypeSelectionDto = p0.getRepaymentTypeSelectionDto();
        return new bv3.b(cVarA, cVarB, repaymentTypeSelectionDto != null ? d04.b.a(repaymentTypeSelectionDto) : null);
    }
}

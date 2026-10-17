package lnd;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tia.b f197205a;

    public t0(tia.b proAnalyticsSaleTypeMapper) {
        Intrinsics.checkNotNullParameter(proAnalyticsSaleTypeMapper, "proAnalyticsSaleTypeMapper");
        this.f197205a = proAnalyticsSaleTypeMapper;
    }

    public static cs6.e a(he3.l type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "<this>");
        switch (s0.f197201a[type.ordinal()]) {
            case 1:
                return cs6.e.APPLE_TAP_TO_PAY;
            case 2:
                return cs6.e.CARD_READER;
            case 3:
                return cs6.e.POS;
            case 4:
                return cs6.e.ECOMMERCE;
            case 5:
                return cs6.e.INVOICE;
            case 6:
                return cs6.e.LINK;
            case 7:
                return cs6.e.QR_CODE;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new UnsupportedOperationException("types not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static cs6.g b(he3.l type) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "<this>");
        switch (s0.f197201a[type.ordinal()]) {
            case 1:
                return cs6.g.IN_PERSON;
            case 2:
                return cs6.g.IN_PERSON;
            case 3:
                return cs6.g.IN_PERSON;
            case 4:
                return cs6.g.ECOMMERCE;
            case 5:
                return cs6.g.INVOICES;
            case 6:
                return cs6.g.PAYMENT_LINKS;
            case 7:
                return cs6.g.IN_PERSON;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new UnsupportedOperationException("types not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static jia.c c(he3.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        switch (s0.f197201a[lVar.ordinal()]) {
            case 1:
                return jia.c.APPLE_PAY;
            case 2:
                return jia.c.CARD_READER;
            case 3:
                return jia.c.POS;
            case 4:
                return jia.c.ECOMMERCE;
            case 5:
                return jia.c.INVOICE;
            case 6:
                return jia.c.PAYMENT_LINK;
            case 7:
                return jia.c.QR_CODE;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                throw new UnsupportedOperationException("types not supported");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

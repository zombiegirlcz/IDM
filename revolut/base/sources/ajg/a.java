package ajg;

import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDateTime;
import zig.a;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {
    public static final TrustedMerchant a(zig.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (aVar instanceof a.C1789a) {
            a.C1789a c1789a = (a.C1789a) aVar;
            Intrinsics.checkNotNullParameter(c1789a, "<this>");
            String id10 = c1789a.getId();
            String name = c1789a.getName();
            String category = c1789a.getCategory();
            String logo = c1789a.getLogo();
            Long approve = c1789a.getApprove();
            if (approve != null) {
                return new TrustedMerchant.Approved(new LocalDateTime(approve.longValue()), id10, name, category, logo);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        if (!(aVar instanceof a.c)) {
            if (!(aVar instanceof a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            a.b bVar = (a.b) aVar;
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            return new TrustedMerchant.Reviewed(bVar.getId(), bVar.getName(), bVar.getCategory(), bVar.getLogo());
        }
        a.c cVar = (a.c) aVar;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        String id11 = cVar.getId();
        String name2 = cVar.getName();
        String category2 = cVar.getCategory();
        String logo2 = cVar.getLogo();
        Long lastDecline = cVar.getLastDecline();
        if (lastDecline != null) {
            return new TrustedMerchant.ToReview(new LocalDateTime(lastDecline.longValue()), id11, name2, category2, logo2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

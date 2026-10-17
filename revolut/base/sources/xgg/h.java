package xgg;

import com.revolut.feature.rev_points.giftcards.api.model.UserVoucher;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((UserVoucher) obj3).f83621c), Long.valueOf(((UserVoucher) obj2).f83621c));
    }
}

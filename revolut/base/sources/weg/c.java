package weg;

import com.revolut.feature_travel_hotels_models.cashback.CashbackDetails;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Integer.valueOf(((CashbackDetails) obj2).f97896a.ordinal()), Integer.valueOf(((CashbackDetails) obj3).f97896a.ordinal()));
    }
}

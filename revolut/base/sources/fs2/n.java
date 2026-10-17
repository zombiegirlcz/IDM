package fs2;

import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((JuniorBankingProfile) obj2).f77099b, ((JuniorBankingProfile) obj3).f77099b);
    }
}

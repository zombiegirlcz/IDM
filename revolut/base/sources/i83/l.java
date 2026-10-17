package i83;

import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((TerminatedCard) obj3).f), Long.valueOf(((TerminatedCard) obj2).f));
    }
}

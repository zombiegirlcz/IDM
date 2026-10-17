package wzb;

import com.revolut.feature.rev_points.models.IssuedPoints;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((IssuedPoints) obj2).f83951h, ((IssuedPoints) obj3).f83951h);
    }
}

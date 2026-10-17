package bdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold;
import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((RevPointsPocketThreshold) obj2).f97795c, ((RevPointsPocketThreshold) obj3).f97795c);
    }
}

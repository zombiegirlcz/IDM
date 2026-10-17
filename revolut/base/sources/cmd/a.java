package cmd;

import com.revolut.feature.spending_analytics.api.models.GroupingExtraData;
import fnd.d;
import he3.j;
import java.util.List;
import yld.i;

/* JADX INFO: loaded from: classes7.dex */
public interface a {
    static /* synthetic */ i a(a aVar, j jVar, List list, String str, GroupingExtraData groupingExtraData, int i) {
        boolean z = (i & 4) != 0;
        if ((i & 16) != 0) {
            groupingExtraData = GroupingExtraData.None.f87450a;
        }
        return ((d) aVar).c(jVar, list, z, str, groupingExtraData);
    }
}

package xte;

import aze.b;
import com.revolut.domain.models.topup.methods.TopupMethod;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface a {
    static /* synthetic */ ArrayList a(a aVar, List list, TopupMethod topupMethod, int i) {
        if ((i & 2) != 0) {
            topupMethod = null;
        }
        return ((b) aVar).e(list, topupMethod, null);
    }
}

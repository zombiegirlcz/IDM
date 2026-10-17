package yj2;

import com.revolut.feature.atm.api.model.Atm;
import java.util.Comparator;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Float.valueOf(((Atm) obj2).d), Float.valueOf(((Atm) obj3).d));
    }
}

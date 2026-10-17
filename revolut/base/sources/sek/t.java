package sek;

import com.revolut.retail.feature.pod_nominees.impl.model.PodNominee;
import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((PodNominee) obj2).d, ((PodNominee) obj3).d);
    }
}

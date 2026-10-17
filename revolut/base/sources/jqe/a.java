package jqe;

import com.revolut.feature.teen_profile.api.models.TeenProfile;
import gc0.c;
import java.util.Comparator;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(c.l((TeenProfile) obj2), c.l((TeenProfile) obj3));
    }
}

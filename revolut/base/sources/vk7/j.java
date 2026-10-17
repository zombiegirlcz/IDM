package vk7;

import com.revolut.feature.insurance.api.models.cfac.CFACClaim;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(Long.valueOf(((CFACClaim) obj3).f74933b), Long.valueOf(((CFACClaim) obj2).f74933b));
    }
}

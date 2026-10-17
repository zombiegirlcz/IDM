package cp4;

import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements xx4.b, xx4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f107827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107828c;

    public m(String facilityId, ArrayList actions) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f107826a = facilityId;
        this.f107827b = actions;
        this.f107828c = a0.d.s("credit_card_remote_deeplinks_", facilityId, "_", zhm.d0.k0(zhm.d0.O0(actions), ",", null, null, 0, null, 62));
    }

    @Override // xx4.c
    public final TypeToken e() {
        return new TypeToken<List<? extends xo4.m>>() { // from class: com.revolut.feature.credit.card.impl.repositories.CreditCardCacheKey$Deeplinks$storageCacheType$1
        };
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f107826a, mVar.f107826a) && this.f107827b.equals(mVar.f107827b);
    }

    @Override // ne0.a
    public final String getKey() {
        return this.f107828c;
    }

    public final int hashCode() {
        return this.f107827b.hashCode() + (this.f107826a.hashCode() * 31);
    }
}

package wna;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f298741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f298743c;

    public c() {
        this(7);
    }

    public static c a(c cVar, Data profileTypeData, Data flexibleStakingConsent, int i) {
        if ((i & 1) != 0) {
            profileTypeData = cVar.f298741a;
        }
        if ((i & 2) != 0) {
            flexibleStakingConsent = cVar.f298742b;
        }
        boolean z = cVar.f298743c;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(profileTypeData, "profileTypeData");
        Intrinsics.checkNotNullParameter(flexibleStakingConsent, "flexibleStakingConsent");
        return new c(profileTypeData, flexibleStakingConsent, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f298741a, cVar.f298741a) && Intrinsics.f(this.f298742b, cVar.f298742b) && this.f298743c == cVar.f298743c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f298743c) + kii.e.c(this.f298742b, this.f298741a.hashCode() * 31, 31);
    }

    public c(Data profileTypeData, Data flexibleStakingConsent, boolean z) {
        Intrinsics.checkNotNullParameter(profileTypeData, "profileTypeData");
        Intrinsics.checkNotNullParameter(flexibleStakingConsent, "flexibleStakingConsent");
        this.f298741a = profileTypeData;
        this.f298742b = flexibleStakingConsent;
        this.f298743c = z;
    }

    public /* synthetic */ c(int i) {
        this(new Data(null, null, false, 7, null), new Data(null, null, false, 7, null), false);
    }
}

package kjk;

import java.util.Base64;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184456c;

    public l(String type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f184454a = type;
        this.f184455b = str;
        Pair[] params = {new Pair("type", type), new Pair("planReferralId", str)};
        Base64.Encoder encoder = a.f184418a;
        Intrinsics.checkNotNullParameter("plan_offer_prompt", "prefix");
        Intrinsics.checkNotNullParameter(params, "params");
        this.f184456c = a.a("plan_offer_prompt", zhm.p.c(params));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f184454a, lVar.f184454a) && Intrinsics.f(this.f184455b, lVar.f184455b);
    }

    public final int hashCode() {
        int iHashCode = this.f184454a.hashCode() * 31;
        String str = this.f184455b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

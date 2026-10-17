package j6k;

import com.revolut.domain.models.moneyrequest.MoneyRequest;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyRequest f171808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f171809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f171810c;
    public final String d;

    public i(MoneyRequest newMoneyRequest, ArrayList allMoneyRequests, Set profileIds, String str) {
        Intrinsics.checkNotNullParameter(newMoneyRequest, "newMoneyRequest");
        Intrinsics.checkNotNullParameter(allMoneyRequests, "allMoneyRequests");
        Intrinsics.checkNotNullParameter(profileIds, "profileIds");
        this.f171808a = newMoneyRequest;
        this.f171809b = allMoneyRequests;
        this.f171810c = profileIds;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f171808a.equals(iVar.f171808a) && this.f171809b.equals(iVar.f171809b) && Intrinsics.f(this.f171810c, iVar.f171810c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iF = p.a.f(com.google.android.gms.internal.mlkit_vision_face.a.b(this.f171809b, this.f171808a.hashCode() * 31, 31), 31, this.f171810c);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}

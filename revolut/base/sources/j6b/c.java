package j6b;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements oki.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f171718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f171719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f171720c;
    public final boolean d;
    public final String e;

    public c(List pagerItems, String selectedPagerItemId, Data planHubInfoData, boolean z, String str) {
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(planHubInfoData, "planHubInfoData");
        this.f171718a = pagerItems;
        this.f171719b = selectedPagerItemId;
        this.f171720c = planHubInfoData;
        this.d = z;
        this.e = str;
    }

    public static c a(c cVar, String str, int i) {
        List pagerItems = cVar.f171718a;
        if ((i & 2) != 0) {
            str = cVar.f171719b;
        }
        String selectedPagerItemId = str;
        Data planHubInfoData = cVar.f171720c;
        boolean z = (i & 8) != 0 ? cVar.d : true;
        String str2 = (i & 16) != 0 ? cVar.e : null;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(planHubInfoData, "planHubInfoData");
        return new c(pagerItems, selectedPagerItemId, planHubInfoData, z, str2);
    }

    @Override // oki.a
    /* JADX INFO: renamed from: W */
    public final List getF85711b() {
        return this.f171718a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f171718a, cVar.f171718a) && Intrinsics.f(this.f171719b, cVar.f171719b) && Intrinsics.f(this.f171720c, cVar.f171720c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(kii.e.c(this.f171720c, p.a.c(this.f171718a.hashCode() * 31, 31, this.f171719b), 31), 31, this.d);
        String str = this.e;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @Override // oki.a
    /* JADX INFO: renamed from: z */
    public final String getF85710a() {
        return this.f171719b;
    }
}

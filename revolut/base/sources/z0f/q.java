package z0f;

import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f318273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TopupMethod f318274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f318275c;
    public final List d;
    public final List e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f318276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TopupMethod f318277h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f318278j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f318279l;

    public q(Data topUpMethodsData, TopupMethod topupMethod, String selectedCurrencyCode, List list, List list2, boolean z, boolean z3, TopupMethod topupMethod2, boolean z4, boolean z6, Data legalEntityContext, String str) {
        Intrinsics.checkNotNullParameter(topUpMethodsData, "topUpMethodsData");
        Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        this.f318273a = topUpMethodsData;
        this.f318274b = topupMethod;
        this.f318275c = selectedCurrencyCode;
        this.d = list;
        this.e = list2;
        this.f = z;
        this.f318276g = z3;
        this.f318277h = topupMethod2;
        this.i = z4;
        this.f318278j = z6;
        this.k = legalEntityContext;
        this.f318279l = str;
    }

    public static q a(q qVar, Data data, TopupMethod topupMethod, String str, List list, List list2, boolean z, TopupMethod topupMethod2, Data data2, int i) {
        Data topUpMethodsData = (i & 1) != 0 ? qVar.f318273a : data;
        TopupMethod topupMethod3 = (i & 2) != 0 ? qVar.f318274b : topupMethod;
        String selectedCurrencyCode = (i & 4) != 0 ? qVar.f318275c : str;
        List list3 = (i & 8) != 0 ? qVar.d : list;
        List list4 = (i & 16) != 0 ? qVar.e : list2;
        boolean z3 = (i & 32) != 0 ? qVar.f : false;
        boolean z4 = (i & 64) != 0 ? qVar.f318276g : z;
        TopupMethod topupMethod4 = (i & 128) != 0 ? qVar.f318277h : topupMethod2;
        boolean z6 = (i & 256) != 0 ? qVar.i : false;
        boolean z11 = qVar.f318278j;
        Data legalEntityContext = (i & 1024) != 0 ? qVar.k : data2;
        String str2 = qVar.f318279l;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(topUpMethodsData, "topUpMethodsData");
        Intrinsics.checkNotNullParameter(selectedCurrencyCode, "selectedCurrencyCode");
        Intrinsics.checkNotNullParameter(legalEntityContext, "legalEntityContext");
        return new q(topUpMethodsData, topupMethod3, selectedCurrencyCode, list3, list4, z3, z4, topupMethod4, z6, z11, legalEntityContext, str2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f318273a, qVar.f318273a) && Intrinsics.f(this.f318274b, qVar.f318274b) && Intrinsics.f(this.f318275c, qVar.f318275c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && this.f == qVar.f && this.f318276g == qVar.f318276g && Intrinsics.f(this.f318277h, qVar.f318277h) && this.i == qVar.i && this.f318278j == qVar.f318278j && Intrinsics.f(this.k, qVar.k) && Intrinsics.f(this.f318279l, qVar.f318279l);
    }

    public final int hashCode() {
        int iHashCode = this.f318273a.hashCode() * 31;
        TopupMethod topupMethod = this.f318274b;
        int iC = p.a.c((iHashCode + (topupMethod == null ? 0 : topupMethod.hashCode())) * 31, 31, this.f318275c);
        List list = this.d;
        int iHashCode2 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iC2 = j6.a.c(j6.a.c((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f), 31, this.f318276g);
        TopupMethod topupMethod2 = this.f318277h;
        int iC3 = kii.e.c(this.k, j6.a.c(j6.a.c((iC2 + (topupMethod2 == null ? 0 : topupMethod2.hashCode())) * 31, 31, this.i), 31, this.f318278j), 31);
        String str = this.f318279l;
        return iC3 + (str != null ? str.hashCode() : 0);
    }
}

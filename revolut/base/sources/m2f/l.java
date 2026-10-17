package m2f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f201977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f201978c;
    public final Data d;
    public final double e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f201979g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f201980h;
    public final m i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f201981j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f201982l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f201983m;

    public l(String topUpId, Data agent, Data account, Data revPointsAccountStatus, double d, String revPointsEnteredAmountFormatted, int i, String partnerPointsEnteredAmountFormatted, m focusedField, s userInputField, Data currentPlan, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(revPointsEnteredAmountFormatted, "revPointsEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(partnerPointsEnteredAmountFormatted, "partnerPointsEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(userInputField, "userInputField");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        this.f201976a = topUpId;
        this.f201977b = agent;
        this.f201978c = account;
        this.d = revPointsAccountStatus;
        this.e = d;
        this.f = revPointsEnteredAmountFormatted;
        this.f201979g = i;
        this.f201980h = partnerPointsEnteredAmountFormatted;
        this.i = focusedField;
        this.f201981j = userInputField;
        this.k = currentPlan;
        this.f201982l = z;
        this.f201983m = z3;
    }

    public static l a(l lVar, Data data, Data data2, double d, String str, int i, String str2, m mVar, s sVar, Data data3, boolean z, boolean z3, int i2) {
        String topUpId = lVar.f201976a;
        Data agent = (i2 & 2) != 0 ? lVar.f201977b : data;
        Data account = lVar.f201978c;
        Data revPointsAccountStatus = (i2 & 8) != 0 ? lVar.d : data2;
        double d5 = (i2 & 16) != 0 ? lVar.e : d;
        String revPointsEnteredAmountFormatted = (i2 & 32) != 0 ? lVar.f : str;
        int i3 = (i2 & 64) != 0 ? lVar.f201979g : i;
        String partnerPointsEnteredAmountFormatted = (i2 & 128) != 0 ? lVar.f201980h : str2;
        m focusedField = (i2 & 256) != 0 ? lVar.i : mVar;
        s userInputField = (i2 & 512) != 0 ? lVar.f201981j : sVar;
        Data currentPlan = (i2 & 1024) != 0 ? lVar.k : data3;
        boolean z4 = (i2 & 2048) != 0 ? lVar.f201982l : z;
        boolean z6 = (i2 & 4096) != 0 ? lVar.f201983m : z3;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        Intrinsics.checkNotNullParameter(agent, "agent");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        Intrinsics.checkNotNullParameter(revPointsEnteredAmountFormatted, "revPointsEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(partnerPointsEnteredAmountFormatted, "partnerPointsEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(userInputField, "userInputField");
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        return new l(topUpId, agent, account, revPointsAccountStatus, d5, revPointsEnteredAmountFormatted, i3, partnerPointsEnteredAmountFormatted, focusedField, userInputField, currentPlan, z4, z6);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f201976a, lVar.f201976a) && Intrinsics.f(this.f201977b, lVar.f201977b) && Intrinsics.f(this.f201978c, lVar.f201978c) && Intrinsics.f(this.d, lVar.d) && Double.compare(this.e, lVar.e) == 0 && Intrinsics.f(this.f, lVar.f) && this.f201979g == lVar.f201979g && Intrinsics.f(this.f201980h, lVar.f201980h) && this.i == lVar.i && this.f201981j == lVar.f201981j && Intrinsics.f(this.k, lVar.k) && this.f201982l == lVar.f201982l && this.f201983m == lVar.f201983m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201983m) + j6.a.c(kii.e.c(this.k, (this.f201981j.hashCode() + ((this.i.hashCode() + p.a.c(j6.a.b(this.f201979g, p.a.c(m72.b.c(kii.e.c(this.d, kii.e.c(this.f201978c, kii.e.c(this.f201977b, this.f201976a.hashCode() * 31, 31), 31), 31), this.e, 31), 31, this.f), 31), 31, this.f201980h)) * 31)) * 31, 31), 31, this.f201982l);
    }
}

package pig;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f236482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f236483c;
    public final Data d;
    public final Data e;
    public final RevPoints f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f236484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f236485h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k f236486j;
    public final q k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f236487l;

    public j(String topUpId, Data account, xi0.b bVar, Data pointsAccountStatus, Data milesRate, RevPoints revPointsEnteredAmount, String revPointsEnteredAmountFormatted, int i, String milesEnteredAmountFormatted, k focusedField, q userInputField, boolean z) {
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(pointsAccountStatus, "pointsAccountStatus");
        Intrinsics.checkNotNullParameter(milesRate, "milesRate");
        Intrinsics.checkNotNullParameter(revPointsEnteredAmount, "revPointsEnteredAmount");
        Intrinsics.checkNotNullParameter(revPointsEnteredAmountFormatted, "revPointsEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(milesEnteredAmountFormatted, "milesEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(userInputField, "userInputField");
        this.f236481a = topUpId;
        this.f236482b = account;
        this.f236483c = bVar;
        this.d = pointsAccountStatus;
        this.e = milesRate;
        this.f = revPointsEnteredAmount;
        this.f236484g = revPointsEnteredAmountFormatted;
        this.f236485h = i;
        this.i = milesEnteredAmountFormatted;
        this.f236486j = focusedField;
        this.k = userInputField;
        this.f236487l = z;
    }

    public static j a(j jVar, Data data, xi0.b bVar, Data pointsAccountStatus, Data milesRate, RevPoints revPointsEnteredAmount, String revPointsEnteredAmountFormatted, int i, String milesEnteredAmountFormatted, k focusedField, q userInputField, boolean z, int i2) {
        Data account = data;
        String topUpId = jVar.f236481a;
        if ((i2 & 2) != 0) {
            account = jVar.f236482b;
        }
        if ((i2 & 4) != 0) {
            bVar = jVar.f236483c;
        }
        if ((i2 & 8) != 0) {
            pointsAccountStatus = jVar.d;
        }
        if ((i2 & 16) != 0) {
            milesRate = jVar.e;
        }
        if ((i2 & 32) != 0) {
            revPointsEnteredAmount = jVar.f;
        }
        if ((i2 & 64) != 0) {
            revPointsEnteredAmountFormatted = jVar.f236484g;
        }
        if ((i2 & 128) != 0) {
            i = jVar.f236485h;
        }
        if ((i2 & 256) != 0) {
            milesEnteredAmountFormatted = jVar.i;
        }
        if ((i2 & 512) != 0) {
            focusedField = jVar.f236486j;
        }
        if ((i2 & 1024) != 0) {
            userInputField = jVar.k;
        }
        if ((i2 & 2048) != 0) {
            z = jVar.f236487l;
        }
        boolean z3 = z;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(topUpId, "topUpId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(pointsAccountStatus, "pointsAccountStatus");
        Intrinsics.checkNotNullParameter(milesRate, "milesRate");
        Intrinsics.checkNotNullParameter(revPointsEnteredAmount, "revPointsEnteredAmount");
        Intrinsics.checkNotNullParameter(revPointsEnteredAmountFormatted, "revPointsEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(milesEnteredAmountFormatted, "milesEnteredAmountFormatted");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(userInputField, "userInputField");
        q qVar = userInputField;
        k kVar = focusedField;
        String str = milesEnteredAmountFormatted;
        int i3 = i;
        String str2 = revPointsEnteredAmountFormatted;
        RevPoints revPoints = revPointsEnteredAmount;
        Data data2 = milesRate;
        Data data3 = pointsAccountStatus;
        return new j(topUpId, account, bVar, data3, data2, revPoints, str2, i3, str, kVar, qVar, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f236481a, jVar.f236481a) && Intrinsics.f(this.f236482b, jVar.f236482b) && Intrinsics.f(this.f236483c, jVar.f236483c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f236484g, jVar.f236484g) && this.f236485h == jVar.f236485h && Intrinsics.f(this.i, jVar.i) && this.f236486j == jVar.f236486j && this.k == jVar.k && this.f236487l == jVar.f236487l;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f236482b, this.f236481a.hashCode() * 31, 31);
        xi0.b bVar = this.f236483c;
        return Boolean.hashCode(this.f236487l) + ((this.k.hashCode() + ((this.f236486j.hashCode() + p.a.c(j6.a.b(this.f236485h, p.a.c(v7.c(kii.e.c(this.e, kii.e.c(this.d, (iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31), 31), 31, this.f.f83960a), 31, this.f236484g), 31), 31, this.i)) * 31)) * 31);
    }
}

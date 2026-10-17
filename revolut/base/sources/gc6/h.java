package gc6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f142351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f142352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f142353c;
    public final Data d;
    public final Data e;
    public final Data f;

    public h(Data charitiesOverview, Data userTotalContribution, Data donationSpareChange, Data recurringPayments, Data transactionsContent, Data charityTransactionsContent) {
        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
        Intrinsics.checkNotNullParameter(userTotalContribution, "userTotalContribution");
        Intrinsics.checkNotNullParameter(donationSpareChange, "donationSpareChange");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(charityTransactionsContent, "charityTransactionsContent");
        this.f142351a = charitiesOverview;
        this.f142352b = userTotalContribution;
        this.f142353c = donationSpareChange;
        this.d = recurringPayments;
        this.e = transactionsContent;
        this.f = charityTransactionsContent;
    }

    public static h a(h hVar, Data data, Data data2, Data data3, Data data4, Data data5, Data data6, int i) {
        if ((i & 1) != 0) {
            data = hVar.f142351a;
        }
        Data charitiesOverview = data;
        if ((i & 2) != 0) {
            data2 = hVar.f142352b;
        }
        Data userTotalContribution = data2;
        if ((i & 4) != 0) {
            data3 = hVar.f142353c;
        }
        Data donationSpareChange = data3;
        if ((i & 8) != 0) {
            data4 = hVar.d;
        }
        Data recurringPayments = data4;
        if ((i & 16) != 0) {
            data5 = hVar.e;
        }
        Data transactionsContent = data5;
        if ((i & 32) != 0) {
            data6 = hVar.f;
        }
        Data charityTransactionsContent = data6;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(charitiesOverview, "charitiesOverview");
        Intrinsics.checkNotNullParameter(userTotalContribution, "userTotalContribution");
        Intrinsics.checkNotNullParameter(donationSpareChange, "donationSpareChange");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        Intrinsics.checkNotNullParameter(charityTransactionsContent, "charityTransactionsContent");
        return new h(charitiesOverview, userTotalContribution, donationSpareChange, recurringPayments, transactionsContent, charityTransactionsContent);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f142351a, hVar.f142351a) && Intrinsics.f(this.f142352b, hVar.f142352b) && Intrinsics.f(this.f142353c, hVar.f142353c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f142353c, kii.e.c(this.f142352b, this.f142351a.hashCode() * 31, 31), 31), 31), 31);
    }
}

package fo9;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f136843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f136844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b6k.e f136845c;
    public final String d;

    public h(Data counterPartyInfo, Data transactionsData, b6k.e recipientAnalytics, String selectedTabId) {
        Intrinsics.checkNotNullParameter(counterPartyInfo, "counterPartyInfo");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f136843a = counterPartyInfo;
        this.f136844b = transactionsData;
        this.f136845c = recipientAnalytics;
        this.d = selectedTabId;
    }

    public static h a(h hVar, Data counterPartyInfo, Data transactionsData, b6k.e recipientAnalytics, String selectedTabId, int i) {
        if ((i & 1) != 0) {
            counterPartyInfo = hVar.f136843a;
        }
        if ((i & 2) != 0) {
            transactionsData = hVar.f136844b;
        }
        if ((i & 4) != 0) {
            recipientAnalytics = hVar.f136845c;
        }
        if ((i & 8) != 0) {
            selectedTabId = hVar.d;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(counterPartyInfo, "counterPartyInfo");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(recipientAnalytics, "recipientAnalytics");
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        return new h(counterPartyInfo, transactionsData, recipientAnalytics, selectedTabId);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f136843a, hVar.f136843a) && Intrinsics.f(this.f136844b, hVar.f136844b) && Intrinsics.f(this.f136845c, hVar.f136845c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f136845c.hashCode() + kii.e.c(this.f136844b, this.f136843a.hashCode() * 31, 31)) * 31);
    }
}

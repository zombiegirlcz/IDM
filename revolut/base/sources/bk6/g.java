package bk6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f16268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f16269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f16270c;
    public final Data d;

    public g(h selectedTab, Data transactionsData, Data consentsGroupsData, Data linkedAccountsGroupsData) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(consentsGroupsData, "consentsGroupsData");
        Intrinsics.checkNotNullParameter(linkedAccountsGroupsData, "linkedAccountsGroupsData");
        this.f16268a = selectedTab;
        this.f16269b = transactionsData;
        this.f16270c = consentsGroupsData;
        this.d = linkedAccountsGroupsData;
    }

    public static g a(g gVar, h selectedTab, Data transactionsData, Data consentsGroupsData, Data linkedAccountsGroupsData, int i) {
        if ((i & 1) != 0) {
            selectedTab = gVar.f16268a;
        }
        if ((i & 2) != 0) {
            transactionsData = gVar.f16269b;
        }
        if ((i & 4) != 0) {
            consentsGroupsData = gVar.f16270c;
        }
        if ((i & 8) != 0) {
            linkedAccountsGroupsData = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(consentsGroupsData, "consentsGroupsData");
        Intrinsics.checkNotNullParameter(linkedAccountsGroupsData, "linkedAccountsGroupsData");
        return new g(selectedTab, transactionsData, consentsGroupsData, linkedAccountsGroupsData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f16268a == gVar.f16268a && Intrinsics.f(this.f16269b, gVar.f16269b) && Intrinsics.f(this.f16270c, gVar.f16270c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f16270c, kii.e.c(this.f16269b, this.f16268a.hashCode() * 31, 31), 31);
    }
}

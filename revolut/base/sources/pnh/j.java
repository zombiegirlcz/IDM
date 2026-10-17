package pnh;

import com.revolut.data.model.Data;
import dfl.i0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f237783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f237784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f237785c;
    public final Data d;
    public final Data e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od0.i f237786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Data f237787h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f237788j;

    public j(i0 trade, Data tradingAccount, Data instrumentInfo, Data feeBreakdown, Data tradingLegalEntityInformation, List upsellingBanners, od0.i entryPointOptional, Data corporateEventWithRestructuredInstruments, Data userData, List list) {
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrumentInfo, "instrumentInfo");
        Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(upsellingBanners, "upsellingBanners");
        Intrinsics.checkNotNullParameter(entryPointOptional, "entryPointOptional");
        Intrinsics.checkNotNullParameter(corporateEventWithRestructuredInstruments, "corporateEventWithRestructuredInstruments");
        Intrinsics.checkNotNullParameter(userData, "userData");
        this.f237783a = trade;
        this.f237784b = tradingAccount;
        this.f237785c = instrumentInfo;
        this.d = feeBreakdown;
        this.e = tradingLegalEntityInformation;
        this.f = upsellingBanners;
        this.f237786g = entryPointOptional;
        this.f237787h = corporateEventWithRestructuredInstruments;
        this.i = userData;
        this.f237788j = list;
    }

    public static j a(j jVar, Data data, Data data2, Data data3, Data data4, od0.i iVar, Data data5, Data data6, List list, int i) {
        i0 trade = jVar.f237783a;
        if ((i & 2) != 0) {
            data = jVar.f237784b;
        }
        Data tradingAccount = data;
        if ((i & 4) != 0) {
            data2 = jVar.f237785c;
        }
        Data instrumentInfo = data2;
        if ((i & 8) != 0) {
            data3 = jVar.d;
        }
        Data feeBreakdown = data3;
        Data tradingLegalEntityInformation = (i & 16) != 0 ? jVar.e : data4;
        List upsellingBanners = jVar.f;
        od0.i entryPointOptional = (i & 64) != 0 ? jVar.f237786g : iVar;
        Data corporateEventWithRestructuredInstruments = (i & 128) != 0 ? jVar.f237787h : data5;
        Data userData = (i & 256) != 0 ? jVar.i : data6;
        List list2 = (i & 512) != 0 ? jVar.f237788j : list;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(trade, "trade");
        Intrinsics.checkNotNullParameter(tradingAccount, "tradingAccount");
        Intrinsics.checkNotNullParameter(instrumentInfo, "instrumentInfo");
        Intrinsics.checkNotNullParameter(feeBreakdown, "feeBreakdown");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(upsellingBanners, "upsellingBanners");
        Intrinsics.checkNotNullParameter(entryPointOptional, "entryPointOptional");
        Intrinsics.checkNotNullParameter(corporateEventWithRestructuredInstruments, "corporateEventWithRestructuredInstruments");
        Intrinsics.checkNotNullParameter(userData, "userData");
        return new j(trade, tradingAccount, instrumentInfo, feeBreakdown, tradingLegalEntityInformation, upsellingBanners, entryPointOptional, corporateEventWithRestructuredInstruments, userData, list2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f237783a, jVar.f237783a) && Intrinsics.f(this.f237784b, jVar.f237784b) && Intrinsics.f(this.f237785c, jVar.f237785c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f237786g, jVar.f237786g) && Intrinsics.f(this.f237787h, jVar.f237787h) && Intrinsics.f(this.i, jVar.i) && Intrinsics.f(this.f237788j, jVar.f237788j);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.i, kii.e.c(this.f237787h, r6.b.f(this.f237786g, p.a.d(kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f237785c, kii.e.c(this.f237784b, this.f237783a.hashCode() * 31, 31), 31), 31), 31), 31, this.f), 31), 31), 31);
        List list = this.f237788j;
        return iC + (list == null ? 0 : list.hashCode());
    }
}

package com.fourthline.orca.internal;

import com.fourthline.core.CountryNetworkModel;
import com.fourthline.core.DocumentType;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class di {
    public static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DocumentType f27761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f27762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Date f27763c;
    private final boolean d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(fd issuingCountry, List supportedCountries) {
            Object next;
            List<CountryNetworkModel.Document> idDocuments;
            Date time;
            Intrinsics.checkNotNullParameter(issuingCountry, "issuingCountry");
            Intrinsics.checkNotNullParameter(supportedCountries, "supportedCountries");
            Iterator it8 = supportedCountries.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((CountryNetworkModel) next).getIssuingCountry(), issuingCountry.c())) {
                    break;
                }
            }
            CountryNetworkModel countryNetworkModel = (CountryNetworkModel) next;
            if (countryNetworkModel == null || (idDocuments = countryNetworkModel.getIdDocuments()) == null) {
                return zhm.f0.f322471a;
            }
            ArrayList arrayList = new ArrayList(zhm.w.t(idDocuments, 10));
            for (CountryNetworkModel.Document document : idDocuments) {
                Date nfcIssueDate = document.getNfcIssueDate();
                if (nfcIssueDate != null) {
                    Integer validityPeriod = document.getValidityPeriod();
                    int iIntValue = validityPeriod != null ? validityPeriod.intValue() : 10;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(nfcIssueDate);
                    calendar.add(1, iIntValue);
                    time = calendar.getTime();
                } else {
                    time = null;
                }
                arrayList.add(new di(document.getType(), document.getNationalities(), time, !document.getNationalities().isEmpty()));
            }
            return arrayList;
        }

        private a() {
        }
    }

    public di(DocumentType type, List nationalities, Date date, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        this.f27761a = type;
        this.f27762b = nationalities;
        this.f27763c = date;
        this.d = z;
    }

    public final di a(DocumentType type, List nationalities, Date date, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(nationalities, "nationalities");
        return new di(type, nationalities, date, z);
    }

    public final Date b() {
        return this.f27763c;
    }

    public final DocumentType c() {
        return this.f27761a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof di)) {
            return false;
        }
        di diVar = (di) obj2;
        return this.f27761a == diVar.f27761a && Intrinsics.f(this.f27762b, diVar.f27762b) && Intrinsics.f(this.f27763c, diVar.f27763c) && this.d == diVar.d;
    }

    public int hashCode() {
        int iHashCode = ((this.f27761a.hashCode() * 31) + this.f27762b.hashCode()) * 31;
        Date date = this.f27763c;
        return ((iHashCode + (date == null ? 0 : date.hashCode())) * 31) + Boolean.hashCode(this.d);
    }

    public String toString() {
        return "DocumentDetails(type=" + this.f27761a + ", nationalities=" + this.f27762b + ", nfcExpiryDate=" + this.f27763c + ", isSupported=" + this.d + ")";
    }

    public static /* synthetic */ di a(di diVar, DocumentType documentType, List list, Date date, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            documentType = diVar.f27761a;
        }
        if ((i & 2) != 0) {
            list = diVar.f27762b;
        }
        if ((i & 4) != 0) {
            date = diVar.f27763c;
        }
        if ((i & 8) != 0) {
            z = diVar.d;
        }
        return diVar.a(documentType, list, date, z);
    }

    public final List a() {
        return this.f27762b;
    }
}

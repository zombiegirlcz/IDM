package com.revolut.feature.freelancer.common.models.tax_hub;

import android.os.Parcel;
import android.os.Parcelable;
import ds6.j;
import ds6.n;
import ds6.s;
import ds6.t;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/tax_hub/TaxHubCalendarEvent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "ds6/s", "ds6/t", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubCalendarEvent implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f73484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f73485c;
    public final ds6.a d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f73486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f73487h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f73488j;

    @NotNull
    public static final Parcelable.Creator<TaxHubCalendarEvent> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            j jVarValueOf = j.valueOf(parcel.readString());
            t tVarValueOf = t.valueOf(parcel.readString());
            ds6.a aVarValueOf = ds6.a.valueOf(parcel.readString());
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LocalDate localDate2 = (LocalDate) parcel.readSerializable();
            LocalDate localDate3 = (LocalDate) parcel.readSerializable();
            LocalDate localDate4 = (LocalDate) parcel.readSerializable();
            LocalDate localDate5 = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TaxHubAssessmentStep.CREATOR, parcel, arrayList, iA, 1);
            }
            return new TaxHubCalendarEvent(string, jVarValueOf, tVarValueOf, aVarValueOf, localDate, localDate2, localDate3, localDate4, localDate5, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubCalendarEvent[i];
        }
    }

    public TaxHubCalendarEvent(String id10, j taxType, t state, ds6.a period, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate filingStartDate, LocalDate filingEndDate, List steps) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(filingStartDate, "filingStartDate");
        Intrinsics.checkNotNullParameter(filingEndDate, "filingEndDate");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f73483a = id10;
        this.f73484b = taxType;
        this.f73485c = state;
        this.d = period;
        this.e = localDate;
        this.f = localDate2;
        this.f73486g = localDate3;
        this.f73487h = filingStartDate;
        this.i = filingEndDate;
        this.f73488j = steps;
    }

    public final s a(LocalDate currentDate) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        LocalDate localDate = this.f73487h;
        if (currentDate.compareTo((ChronoLocalDate) localDate) < 0) {
            return s.NOT_STARTED;
        }
        LocalDate localDate2 = this.i;
        if (currentDate.compareTo((Object) localDate2) <= 0 && currentDate.compareTo((Object) localDate) >= 0) {
            List list = this.f73488j;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it8 = list.iterator();
                while (it8.hasNext()) {
                    if (((TaxHubAssessmentStep) it8.next()).f73482c == n.COMPLETED) {
                        return s.IN_PROGRESS;
                    }
                }
            }
        }
        return (currentDate.compareTo((Object) localDate2) > 0 || currentDate.compareTo((Object) localDate) < 0) ? s.UNKNOWN : s.FILING_PERIOD_STARTED;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubCalendarEvent)) {
            return false;
        }
        TaxHubCalendarEvent taxHubCalendarEvent = (TaxHubCalendarEvent) obj2;
        return Intrinsics.f(this.f73483a, taxHubCalendarEvent.f73483a) && this.f73484b == taxHubCalendarEvent.f73484b && this.f73485c == taxHubCalendarEvent.f73485c && this.d == taxHubCalendarEvent.d && Intrinsics.f(this.e, taxHubCalendarEvent.e) && Intrinsics.f(this.f, taxHubCalendarEvent.f) && Intrinsics.f(this.f73486g, taxHubCalendarEvent.f73486g) && Intrinsics.f(this.f73487h, taxHubCalendarEvent.f73487h) && Intrinsics.f(this.i, taxHubCalendarEvent.i) && Intrinsics.f(this.f73488j, taxHubCalendarEvent.f73488j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.f73485c.hashCode() + ((this.f73484b.hashCode() + (this.f73483a.hashCode() * 31)) * 31)) * 31)) * 31;
        LocalDate localDate = this.e;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f;
        int iHashCode3 = (iHashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f73486g;
        return this.f73488j.hashCode() + y.a(y.a((iHashCode3 + (localDate3 != null ? localDate3.hashCode() : 0)) * 31, 31, this.f73487h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73483a);
        dest.writeString(this.f73484b.name());
        dest.writeString(this.f73485c.name());
        dest.writeString(this.d.name());
        dest.writeSerializable(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f73486g);
        dest.writeSerializable(this.f73487h);
        dest.writeSerializable(this.i);
        Iterator itV = p.a.v(this.f73488j, dest);
        while (itV.hasNext()) {
            ((TaxHubAssessmentStep) itV.next()).writeToParcel(dest, i);
        }
    }
}

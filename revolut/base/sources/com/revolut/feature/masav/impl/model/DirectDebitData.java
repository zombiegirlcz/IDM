package com.revolut.feature.masav.impl.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.bills.billers.api.model.Biller;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/masav/impl/model/DirectDebitData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_masav_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebitData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DirectDebitData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f78095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f78096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f78097c;
    public final LocalDate d;
    public final d e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebitData((Biller) parcel.readParcelable(DirectDebitData.class.getClassLoader()), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebitData[i];
        }
    }

    public DirectDebitData(Biller creditor, String reference, LocalDate startDate, LocalDate localDate, d dVar) {
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f78095a = creditor;
        this.f78096b = reference;
        this.f78097c = startDate;
        this.d = localDate;
        this.e = dVar;
    }

    public static DirectDebitData a(DirectDebitData directDebitData, Biller biller, String str, LocalDate localDate, d dVar, int i) {
        if ((i & 1) != 0) {
            biller = directDebitData.f78095a;
        }
        Biller creditor = biller;
        if ((i & 2) != 0) {
            str = directDebitData.f78096b;
        }
        String reference = str;
        LocalDate startDate = directDebitData.f78097c;
        if ((i & 8) != 0) {
            localDate = directDebitData.d;
        }
        LocalDate localDate2 = localDate;
        if ((i & 16) != 0) {
            dVar = directDebitData.e;
        }
        directDebitData.getClass();
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        return new DirectDebitData(creditor, reference, startDate, localDate2, dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebitData)) {
            return false;
        }
        DirectDebitData directDebitData = (DirectDebitData) obj2;
        return Intrinsics.f(this.f78095a, directDebitData.f78095a) && Intrinsics.f(this.f78096b, directDebitData.f78096b) && Intrinsics.f(this.f78097c, directDebitData.f78097c) && Intrinsics.f(this.d, directDebitData.d) && Intrinsics.f(this.e, directDebitData.e);
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(this.f78095a.hashCode() * 31, 31, this.f78096b), 31, this.f78097c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        d dVar = this.e;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78095a, i);
        dest.writeString(this.f78096b);
        dest.writeSerializable(this.f78097c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}

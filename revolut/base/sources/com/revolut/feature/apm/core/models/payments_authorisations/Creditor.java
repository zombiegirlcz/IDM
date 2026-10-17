package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Creditor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Details", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Creditor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Creditor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f62011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Details f62012c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Creditor$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f62014b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String str, String str2) {
            this.f62013a = str;
            this.f62014b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Details)) {
                return false;
            }
            Details details = (Details) obj2;
            return Intrinsics.f(this.f62013a, details.f62013a) && Intrinsics.f(this.f62014b, details.f62014b);
        }

        public final int hashCode() {
            String str = this.f62013a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f62014b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62013a);
            dest.writeString(this.f62014b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Creditor(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Details.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Creditor[i];
        }
    }

    public Creditor(String str, String str2, Details details) {
        this.f62010a = str;
        this.f62011b = str2;
        this.f62012c = details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Creditor)) {
            return false;
        }
        Creditor creditor = (Creditor) obj2;
        return Intrinsics.f(this.f62010a, creditor.f62010a) && Intrinsics.f(this.f62011b, creditor.f62011b) && Intrinsics.f(this.f62012c, creditor.f62012c);
    }

    public final int hashCode() {
        String str = this.f62010a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62011b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Details details = this.f62012c;
        return iHashCode2 + (details != null ? details.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62010a);
        dest.writeString(this.f62011b);
        Details details = this.f62012c;
        if (details == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            details.writeToParcel(dest, i);
        }
    }
}

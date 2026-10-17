package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.models.recipients.ApmContact;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDraft;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Details", "FieldSettings", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentDraft implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentDraft> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f62194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62195c;
    public final Details d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDraft$Details;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f62196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Long f62197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FieldSettings f62198c;
        public final ApmContact d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Details(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), FieldSettings.CREATOR.createFromParcel(parcel), (ApmContact) parcel.readParcelable(Details.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        public Details(String str, Long l2, FieldSettings modifiableFields, ApmContact recipient) {
            Intrinsics.checkNotNullParameter(modifiableFields, "modifiableFields");
            Intrinsics.checkNotNullParameter(recipient, "recipient");
            this.f62196a = str;
            this.f62197b = l2;
            this.f62198c = modifiableFields;
            this.d = recipient;
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
            return Intrinsics.f(this.f62196a, details.f62196a) && Intrinsics.f(this.f62197b, details.f62197b) && Intrinsics.f(this.f62198c, details.f62198c) && Intrinsics.f(this.d, details.d);
        }

        public final int hashCode() {
            String str = this.f62196a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l2 = this.f62197b;
            return this.d.hashCode() + ((this.f62198c.hashCode() + ((iHashCode + (l2 != null ? l2.hashCode() : 0)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f62196a);
            Long l2 = this.f62197b;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                b.A(dest, 1, l2);
            }
            this.f62198c.writeToParcel(dest, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmPaymentDraft$FieldSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldSettings implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<FieldSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f62199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f62200b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FieldSettings(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FieldSettings[i];
            }
        }

        public FieldSettings(boolean z, boolean z3) {
            this.f62199a = z;
            this.f62200b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FieldSettings)) {
                return false;
            }
            FieldSettings fieldSettings = (FieldSettings) obj2;
            return this.f62199a == fieldSettings.f62199a && this.f62200b == fieldSettings.f62200b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f62200b) + (Boolean.hashCode(this.f62199a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f62199a ? 1 : 0);
            dest.writeInt(this.f62200b ? 1 : 0);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentDraft(parcel.readString(), (d) parcel.readSerializable(), parcel.readString(), Details.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentDraft[i];
        }
    }

    public ApmPaymentDraft(String id10, d paymentAmount, String str, Details details) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f62193a = id10;
        this.f62194b = paymentAmount;
        this.f62195c = str;
        this.d = details;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentDraft)) {
            return false;
        }
        ApmPaymentDraft apmPaymentDraft = (ApmPaymentDraft) obj2;
        return Intrinsics.f(this.f62193a, apmPaymentDraft.f62193a) && Intrinsics.f(this.f62194b, apmPaymentDraft.f62194b) && Intrinsics.f(this.f62195c, apmPaymentDraft.f62195c) && Intrinsics.f(this.d, apmPaymentDraft.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f62193a.hashCode() * 31, 31, this.f62194b);
        String str = this.f62195c;
        return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62193a);
        dest.writeSerializable(this.f62194b);
        dest.writeString(this.f62195c);
        this.d.writeToParcel(dest, i);
    }
}

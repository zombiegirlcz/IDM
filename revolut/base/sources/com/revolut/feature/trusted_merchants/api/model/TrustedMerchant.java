package com.revolut.feature.trusted_merchants.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant;", "Landroid/os/Parcelable;", "Approved", "ToReview", "Reviewed", "Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant$Approved;", "Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant$Reviewed;", "Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant$ToReview;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TrustedMerchant implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant$Approved;", "Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Approved extends TrustedMerchant {

        @NotNull
        public static final Parcelable.Creator<Approved> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f94404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94406c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Approved((LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Approved[i];
            }
        }

        public Approved(LocalDateTime approveDate, String id10, String name, String category, String str) {
            Intrinsics.checkNotNullParameter(approveDate, "approveDate");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            this.f94404a = approveDate;
            this.f94405b = id10;
            this.f94406c = name;
            this.d = category;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Approved)) {
                return false;
            }
            Approved approved = (Approved) obj2;
            return Intrinsics.f(this.f94404a, approved.f94404a) && Intrinsics.f(this.f94405b, approved.f94405b) && Intrinsics.f(this.f94406c, approved.f94406c) && Intrinsics.f(this.d, approved.d) && Intrinsics.f(this.e, approved.e);
        }

        @Override // com.revolut.feature.trusted_merchants.api.model.TrustedMerchant
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF94411b() {
            return this.f94405b;
        }

        @Override // com.revolut.feature.trusted_merchants.api.model.TrustedMerchant
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF94412c() {
            return this.f94406c;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f94404a.hashCode() * 31, 31, this.f94405b), 31, this.f94406c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94404a);
            dest.writeString(this.f94405b);
            dest.writeString(this.f94406c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant$Reviewed;", "Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Reviewed extends TrustedMerchant {

        @NotNull
        public static final Parcelable.Creator<Reviewed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f94407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94409c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Reviewed(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Reviewed[i];
            }
        }

        public Reviewed(String id10, String name, String category, String str) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            this.f94407a = id10;
            this.f94408b = name;
            this.f94409c = category;
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Reviewed)) {
                return false;
            }
            Reviewed reviewed = (Reviewed) obj2;
            return Intrinsics.f(this.f94407a, reviewed.f94407a) && Intrinsics.f(this.f94408b, reviewed.f94408b) && Intrinsics.f(this.f94409c, reviewed.f94409c) && Intrinsics.f(this.d, reviewed.d);
        }

        @Override // com.revolut.feature.trusted_merchants.api.model.TrustedMerchant
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF94411b() {
            return this.f94407a;
        }

        @Override // com.revolut.feature.trusted_merchants.api.model.TrustedMerchant
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF94412c() {
            return this.f94408b;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(this.f94407a.hashCode() * 31, 31, this.f94408b), 31, this.f94409c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f94407a);
            dest.writeString(this.f94408b);
            dest.writeString(this.f94409c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant$ToReview;", "Lcom/revolut/feature/trusted_merchants/api/model/TrustedMerchant;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToReview extends TrustedMerchant {

        @NotNull
        public static final Parcelable.Creator<ToReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f94410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f94411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f94412c;
        public final String d;
        public final String e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ToReview((LocalDateTime) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToReview[i];
            }
        }

        public ToReview(LocalDateTime lastDeclineDate, String id10, String name, String category, String str) {
            Intrinsics.checkNotNullParameter(lastDeclineDate, "lastDeclineDate");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(category, "category");
            this.f94410a = lastDeclineDate;
            this.f94411b = id10;
            this.f94412c = name;
            this.d = category;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ToReview)) {
                return false;
            }
            ToReview toReview = (ToReview) obj2;
            return Intrinsics.f(this.f94410a, toReview.f94410a) && Intrinsics.f(this.f94411b, toReview.f94411b) && Intrinsics.f(this.f94412c, toReview.f94412c) && Intrinsics.f(this.d, toReview.d) && Intrinsics.f(this.e, toReview.e);
        }

        @Override // com.revolut.feature.trusted_merchants.api.model.TrustedMerchant
        /* JADX INFO: renamed from: getId, reason: from getter */
        public final String getF94411b() {
            return this.f94411b;
        }

        @Override // com.revolut.feature.trusted_merchants.api.model.TrustedMerchant
        /* JADX INFO: renamed from: getName, reason: from getter */
        public final String getF94412c() {
            return this.f94412c;
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f94410a.hashCode() * 31, 31, this.f94411b), 31, this.f94412c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f94410a);
            dest.writeString(this.f94411b);
            dest.writeString(this.f94412c);
            dest.writeString(this.d);
            dest.writeString(this.e);
        }
    }

    /* JADX INFO: renamed from: getId */
    public abstract String getF94411b();

    /* JADX INFO: renamed from: getName */
    public abstract String getF94412c();
}

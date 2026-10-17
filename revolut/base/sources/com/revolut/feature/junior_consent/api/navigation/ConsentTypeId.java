package com.revolut.feature.junior_consent.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xc8.d;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId;", "Landroid/os/Parcelable;", "DataManagementConsentId", "ConsentName", "ConsentRequestId", "Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId$ConsentName;", "Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId$ConsentRequestId;", "Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId$DataManagementConsentId;", "feature_junior_consent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConsentTypeId extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId$ConsentName;", "Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId;", "", "toString", "()Ljava/lang/String;", "feature_junior_consent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentName implements ConsentTypeId {

        @NotNull
        public static final Parcelable.Creator<ConsentName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v6d.a f76860a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentName(v6d.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentName[i];
            }
        }

        public ConsentName(v6d.a consentName) {
            Intrinsics.checkNotNullParameter(consentName, "consentName");
            this.f76860a = consentName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ConsentName) && this.f76860a == ((ConsentName) obj2).f76860a;
        }

        public final int hashCode() {
            return this.f76860a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76860a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId$ConsentRequestId;", "Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId;", "", "toString", "()Ljava/lang/String;", "feature_junior_consent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConsentRequestId implements ConsentTypeId {

        @NotNull
        public static final Parcelable.Creator<ConsentRequestId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f76862b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ConsentRequestId(parcel.readString(), d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConsentRequestId[i];
            }
        }

        public ConsentRequestId(String consentRequestId, d code) {
            Intrinsics.checkNotNullParameter(consentRequestId, "consentRequestId");
            Intrinsics.checkNotNullParameter(code, "code");
            this.f76861a = consentRequestId;
            this.f76862b = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConsentRequestId)) {
                return false;
            }
            ConsentRequestId consentRequestId = (ConsentRequestId) obj2;
            return Intrinsics.f(this.f76861a, consentRequestId.f76861a) && this.f76862b == consentRequestId.f76862b;
        }

        public final int hashCode() {
            return this.f76862b.hashCode() + (this.f76861a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76861a);
            dest.writeString(this.f76862b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId$DataManagementConsentId;", "Lcom/revolut/feature/junior_consent/api/navigation/ConsentTypeId;", "", "toString", "()Ljava/lang/String;", "feature_junior_consent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DataManagementConsentId implements ConsentTypeId {

        @NotNull
        public static final Parcelable.Creator<DataManagementConsentId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zc8.a f76864b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DataManagementConsentId(parcel.readString(), zc8.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DataManagementConsentId[i];
            }
        }

        public DataManagementConsentId(String consentId, zc8.a entryPoint) {
            Intrinsics.checkNotNullParameter(consentId, "consentId");
            Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
            this.f76863a = consentId;
            this.f76864b = entryPoint;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DataManagementConsentId)) {
                return false;
            }
            DataManagementConsentId dataManagementConsentId = (DataManagementConsentId) obj2;
            return Intrinsics.f(this.f76863a, dataManagementConsentId.f76863a) && this.f76864b == dataManagementConsentId.f76864b;
        }

        public final int hashCode() {
            return this.f76864b.hashCode() + (this.f76863a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76863a);
            dest.writeString(this.f76864b.name());
        }
    }
}

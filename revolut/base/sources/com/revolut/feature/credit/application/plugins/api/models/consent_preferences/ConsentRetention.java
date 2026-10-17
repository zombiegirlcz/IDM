package com.revolut.feature.credit.application.plugins.api.models.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention;", "Landroid/os/Parcelable;", "ActiveFacility", "Application", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ConsentRetention extends Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention;", "Indefinitely", "Until", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility$Indefinitely;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility$Until;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ActiveFacility extends ConsentRetention {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility$Indefinitely;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Indefinitely implements ActiveFacility {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Indefinitely f66438a = new Indefinitely();

            @NotNull
            public static final Parcelable.Creator<Indefinitely> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Indefinitely.f66438a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Indefinitely[i];
                }
            }

            private Indefinitely() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention
            /* JADX INFO: renamed from: getDate */
            public final LocalDate getF66441a() {
                return null;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility$Until;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$ActiveFacility;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Until implements ActiveFacility {

            @NotNull
            public static final Parcelable.Creator<Until> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LocalDate f66439a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Until((LocalDate) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Until[i];
                }
            }

            public Until(LocalDate date) {
                Intrinsics.checkNotNullParameter(date, "date");
                this.f66439a = date;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Until) && Intrinsics.f(this.f66439a, ((Until) obj2).f66439a);
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention
            /* JADX INFO: renamed from: getDate, reason: from getter */
            public final LocalDate getF66441a() {
                return this.f66439a;
            }

            public final int hashCode() {
                return this.f66439a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66439a);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention;", "DefaultDuration", "Until", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application$DefaultDuration;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application$Until;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Application extends ConsentRetention {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application$DefaultDuration;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DefaultDuration implements Application {

            @NotNull
            public static final Parcelable.Creator<DefaultDuration> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f66440a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new DefaultDuration(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new DefaultDuration[i];
                }
            }

            public DefaultDuration(int i) {
                this.f66440a = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof DefaultDuration) && this.f66440a == ((DefaultDuration) obj2).f66440a;
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention
            /* JADX INFO: renamed from: getDate */
            public final LocalDate getF66441a() {
                return null;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f66440a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f66440a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application$Until;", "Lcom/revolut/feature/credit/application/plugins/api/models/consent_preferences/ConsentRetention$Application;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Until implements Application {

            @NotNull
            public static final Parcelable.Creator<Until> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final LocalDate f66441a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Until((LocalDate) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Until[i];
                }
            }

            public Until(LocalDate date) {
                Intrinsics.checkNotNullParameter(date, "date");
                this.f66441a = date;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Until) && Intrinsics.f(this.f66441a, ((Until) obj2).f66441a);
            }

            @Override // com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention
            /* JADX INFO: renamed from: getDate, reason: from getter */
            public final LocalDate getF66441a() {
                return this.f66441a;
            }

            public final int hashCode() {
                return this.f66441a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f66441a);
            }
        }
    }

    /* JADX INFO: renamed from: getDate */
    LocalDate getF66441a();
}

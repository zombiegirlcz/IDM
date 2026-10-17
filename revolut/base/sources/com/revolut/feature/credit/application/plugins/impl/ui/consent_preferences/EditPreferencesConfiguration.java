package com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentRetention;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration;", "Landroid/os/Parcelable;", "ActiveFacility", "Application", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration$ActiveFacility;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration$Application;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EditPreferencesConfiguration extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration$ActiveFacility;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveFacility implements EditPreferencesConfiguration {

        @NotNull
        public static final Parcelable.Creator<ActiveFacility> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentRetention.ActiveFacility f67262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDate f67263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f67264c;
        public final LocalDate d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActiveFacility((ConsentRetention.ActiveFacility) parcel.readParcelable(ActiveFacility.class.getClassLoader()), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveFacility[i];
            }
        }

        public ActiveFacility(ConsentRetention.ActiveFacility selection, LocalDate minDate, LocalDate maxDate, LocalDate suggestedDate) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(minDate, "minDate");
            Intrinsics.checkNotNullParameter(maxDate, "maxDate");
            Intrinsics.checkNotNullParameter(suggestedDate, "suggestedDate");
            this.f67262a = selection;
            this.f67263b = minDate;
            this.f67264c = maxDate;
            this.d = suggestedDate;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        /* JADX INFO: renamed from: L2, reason: from getter */
        public final LocalDate getF67267c() {
            return this.f67263b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActiveFacility)) {
                return false;
            }
            ActiveFacility activeFacility = (ActiveFacility) obj2;
            return Intrinsics.f(this.f67262a, activeFacility.f67262a) && Intrinsics.f(this.f67263b, activeFacility.f67263b) && Intrinsics.f(this.f67264c, activeFacility.f67264c) && Intrinsics.f(this.d, activeFacility.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        /* JADX INFO: renamed from: f1, reason: from getter */
        public final LocalDate getD() {
            return this.f67264c;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        public final ConsentRetention getSelection() {
            return this.f67262a;
        }

        public final int hashCode() {
            return this.d.hashCode() + y.a(y.a(this.f67262a.hashCode() * 31, 31, this.f67263b), 31, this.f67264c);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        /* JADX INFO: renamed from: u6, reason: from getter */
        public final LocalDate getE() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67262a, i);
            dest.writeSerializable(this.f67263b);
            dest.writeSerializable(this.f67264c);
            dest.writeSerializable(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration$Application;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/consent_preferences/EditPreferencesConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Application implements EditPreferencesConfiguration {

        @NotNull
        public static final Parcelable.Creator<Application> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentRetention.Application f67265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LocalDate f67267c;
        public final LocalDate d;
        public final LocalDate e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Application((ConsentRetention.Application) parcel.readParcelable(Application.class.getClassLoader()), parcel.readInt(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Application[i];
            }
        }

        public Application(ConsentRetention.Application selection, int i, LocalDate minDate, LocalDate maxDate, LocalDate suggestedDate) {
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(minDate, "minDate");
            Intrinsics.checkNotNullParameter(maxDate, "maxDate");
            Intrinsics.checkNotNullParameter(suggestedDate, "suggestedDate");
            this.f67265a = selection;
            this.f67266b = i;
            this.f67267c = minDate;
            this.d = maxDate;
            this.e = suggestedDate;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        /* JADX INFO: renamed from: L2, reason: from getter */
        public final LocalDate getF67267c() {
            return this.f67267c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Application)) {
                return false;
            }
            Application application = (Application) obj2;
            return Intrinsics.f(this.f67265a, application.f67265a) && this.f67266b == application.f67266b && Intrinsics.f(this.f67267c, application.f67267c) && Intrinsics.f(this.d, application.d) && Intrinsics.f(this.e, application.e);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        /* JADX INFO: renamed from: f1, reason: from getter */
        public final LocalDate getD() {
            return this.d;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        public final ConsentRetention getSelection() {
            return this.f67265a;
        }

        public final int hashCode() {
            return this.e.hashCode() + y.a(y.a(j6.a.b(this.f67266b, this.f67265a.hashCode() * 31, 31), 31, this.f67267c), 31, this.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.consent_preferences.EditPreferencesConfiguration
        /* JADX INFO: renamed from: u6, reason: from getter */
        public final LocalDate getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67265a, i);
            dest.writeInt(this.f67266b);
            dest.writeSerializable(this.f67267c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    /* JADX INFO: renamed from: L2 */
    LocalDate getF67267c();

    /* JADX INFO: renamed from: f1 */
    LocalDate getD();

    ConsentRetention getSelection();

    /* JADX INFO: renamed from: u6 */
    LocalDate getE();
}

package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel;", "Landroid/os/Parcelable;", "Mandatory", "Consent", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel$Consent;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel$Mandatory;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CheckboxParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel$Consent;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Consent implements CheckboxParcel {

        @NotNull
        public static final Parcelable.Creator<Consent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ConsentMechanics.OptOut f77031a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Consent((ConsentMechanics.OptOut) parcel.readParcelable(Consent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Consent[i];
            }
        }

        public Consent(ConsentMechanics.OptOut mechanics) {
            Intrinsics.checkNotNullParameter(mechanics, "mechanics");
            this.f77031a = mechanics;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Consent) && Intrinsics.f(this.f77031a, ((Consent) obj2).f77031a);
        }

        public final int hashCode() {
            return this.f77031a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77031a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel$Mandatory;", "Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/mapper/CheckboxParcel;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Mandatory implements CheckboxParcel {

        @NotNull
        public static final Parcelable.Creator<Mandatory> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77032a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Mandatory(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Mandatory[i];
            }
        }

        public Mandatory(String id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f77032a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Mandatory) && Intrinsics.f(this.f77032a, ((Mandatory) obj2).f77032a);
        }

        public final int hashCode() {
            return this.f77032a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77032a);
        }
    }
}

package com.revolut.feature.crypto.tfr.validation.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ActionRequired", "ProvideMoreDetails", "DateOfBirth", "PlaceOfBirth", "LegalEntityId", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$ActionRequired;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$DateOfBirth;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$LegalEntityId;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$PlaceOfBirth;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$ProvideMoreDetails;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TfrValidationFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$ActionRequired;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step;", "<init>", "()V", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActionRequired extends TfrValidationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ActionRequired f71018a = new ActionRequired();

        @NotNull
        public static final Parcelable.Creator<ActionRequired> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ActionRequired.f71018a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionRequired[i];
            }
        }

        private ActionRequired() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$DateOfBirth;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step;", "<init>", "()V", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DateOfBirth extends TfrValidationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateOfBirth f71019a = new DateOfBirth();

        @NotNull
        public static final Parcelable.Creator<DateOfBirth> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DateOfBirth.f71019a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DateOfBirth[i];
            }
        }

        private DateOfBirth() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$LegalEntityId;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step;", "<init>", "()V", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LegalEntityId extends TfrValidationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final LegalEntityId f71020a = new LegalEntityId();

        @NotNull
        public static final Parcelable.Creator<LegalEntityId> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LegalEntityId.f71020a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LegalEntityId[i];
            }
        }

        private LegalEntityId() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$PlaceOfBirth;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlaceOfBirth extends TfrValidationFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PlaceOfBirth> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Date f71021a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlaceOfBirth((Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlaceOfBirth[i];
            }
        }

        public PlaceOfBirth(Date dateOfBirth) {
            Intrinsics.checkNotNullParameter(dateOfBirth, "dateOfBirth");
            this.f71021a = dateOfBirth;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlaceOfBirth) && Intrinsics.f(this.f71021a, ((PlaceOfBirth) obj2).f71021a);
        }

        public final int hashCode() {
            return this.f71021a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f71021a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step$ProvideMoreDetails;", "Lcom/revolut/feature/crypto/tfr/validation/api/navigation/TfrValidationFlowContract$Step;", "<init>", "()V", "feature_crypto_tfr_validation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProvideMoreDetails extends TfrValidationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProvideMoreDetails f71022a = new ProvideMoreDetails();

        @NotNull
        public static final Parcelable.Creator<ProvideMoreDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProvideMoreDetails.f71022a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProvideMoreDetails[i];
            }
        }

        private ProvideMoreDetails() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private TfrValidationFlowContract$Step() {
    }
}

package com.revolut.shared.feature.user_declarations.api.flows.place_of_birth;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData;", "Laii/r;", "Landroid/os/Parcelable;", "Cancel", "DescriptionClicked", "Success", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData$Cancel;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData$DescriptionClicked;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData$Success;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlaceOfBirthFlowOutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData$Cancel;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData;", "<init>", "()V", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancel implements PlaceOfBirthFlowOutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancel f105027a = new Cancel();

        @NotNull
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cancel.f105027a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData$DescriptionClicked;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData;", "<init>", "()V", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DescriptionClicked implements PlaceOfBirthFlowOutputData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DescriptionClicked f105028a = new DescriptionClicked();

        @NotNull
        public static final Parcelable.Creator<DescriptionClicked> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DescriptionClicked.f105028a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DescriptionClicked[i];
            }
        }

        private DescriptionClicked() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData$Success;", "Lcom/revolut/shared/feature/user_declarations/api/flows/place_of_birth/PlaceOfBirthFlowOutputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_user_declarations_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success implements PlaceOfBirthFlowOutputData {

        @NotNull
        public static final Parcelable.Creator<Success> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f105029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f105030b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Success((b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(b country, String city) {
            Intrinsics.checkNotNullParameter(country, "country");
            Intrinsics.checkNotNullParameter(city, "city");
            this.f105029a = country;
            this.f105030b = city;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Success)) {
                return false;
            }
            Success success = (Success) obj2;
            return Intrinsics.f(this.f105029a, success.f105029a) && Intrinsics.f(this.f105030b, success.f105030b);
        }

        public final int hashCode() {
            return this.f105030b.hashCode() + (this.f105029a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f105029a);
            dest.writeString(this.f105030b);
        }
    }
}

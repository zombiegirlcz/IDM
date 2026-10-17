package com.revolut.feature.junior.isa.impl.ui.jisa_details;

import android.os.Parcel;
import android.os.Parcelable;
import bj0.b;
import com.revolut.feature.address.models.Address;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "UpdateAddress", "UpdateGender", "UpdateNationalNumber", "UpdatePhone", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdateAddress;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdateGender;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdateNationalNumber;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdatePhone;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorIsaDetailsScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdateAddress;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateAddress implements JuniorIsaDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UpdateAddress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Address f76788a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateAddress((Address) parcel.readParcelable(UpdateAddress.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateAddress[i];
            }
        }

        public UpdateAddress(Address address) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.f76788a = address;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateAddress) && Intrinsics.f(this.f76788a, ((UpdateAddress) obj2).f76788a);
        }

        public final int hashCode() {
            return this.f76788a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76788a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdateGender;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateGender implements JuniorIsaDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UpdateGender> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f76789a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateGender(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateGender[i];
            }
        }

        public UpdateGender(b juniorGender) {
            Intrinsics.checkNotNullParameter(juniorGender, "juniorGender");
            this.f76789a = juniorGender;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateGender) && this.f76789a == ((UpdateGender) obj2).f76789a;
        }

        public final int hashCode() {
            return this.f76789a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76789a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdateNationalNumber;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateNationalNumber implements JuniorIsaDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UpdateNationalNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76790a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateNationalNumber(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateNationalNumber[i];
            }
        }

        public UpdateNationalNumber(String juniorName) {
            Intrinsics.checkNotNullParameter(juniorName, "juniorName");
            this.f76790a = juniorName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UpdateNationalNumber) && Intrinsics.f(this.f76790a, ((UpdateNationalNumber) obj2).f76790a);
        }

        public final int hashCode() {
            return this.f76790a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76790a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep$UpdatePhone;", "Lcom/revolut/feature/junior/isa/impl/ui/jisa_details/JuniorIsaDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_isa_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdatePhone implements JuniorIsaDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<UpdatePhone> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76791a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76792b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76793c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdatePhone(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdatePhone[i];
            }
        }

        public UpdatePhone(String juniorName, String juniorCountry, String str) {
            Intrinsics.checkNotNullParameter(juniorName, "juniorName");
            Intrinsics.checkNotNullParameter(juniorCountry, "juniorCountry");
            this.f76791a = juniorName;
            this.f76792b = juniorCountry;
            this.f76793c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdatePhone)) {
                return false;
            }
            UpdatePhone updatePhone = (UpdatePhone) obj2;
            return Intrinsics.f(this.f76791a, updatePhone.f76791a) && Intrinsics.f(this.f76792b, updatePhone.f76792b) && Intrinsics.f(this.f76793c, updatePhone.f76793c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f76791a.hashCode() * 31, 31, this.f76792b);
            String str = this.f76793c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76791a);
            dest.writeString(this.f76792b);
            dest.writeString(this.f76793c);
        }
    }
}

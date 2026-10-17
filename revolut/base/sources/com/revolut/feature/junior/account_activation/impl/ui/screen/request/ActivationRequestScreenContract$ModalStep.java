package com.revolut.feature.junior.account_activation.impl.ui.screen.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "EditName", "EditBirthDate", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep$EditBirthDate;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep$EditName;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ActivationRequestScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep$EditBirthDate;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditBirthDate implements ActivationRequestScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditBirthDate> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f76677a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditBirthDate((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditBirthDate[i];
            }
        }

        public EditBirthDate(LocalDate birthDate) {
            Intrinsics.checkNotNullParameter(birthDate, "birthDate");
            this.f76677a = birthDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EditBirthDate) && Intrinsics.f(this.f76677a, ((EditBirthDate) obj2).f76677a);
        }

        public final int hashCode() {
            return this.f76677a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f76677a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep$EditName;", "Lcom/revolut/feature/junior/account_activation/impl/ui/screen/request/ActivationRequestScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_junior_account_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditName implements ActivationRequestScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EditName> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f76680c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditName(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditName[i];
            }
        }

        public EditName(String firstName, String lastName, boolean z) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            this.f76678a = firstName;
            this.f76679b = lastName;
            this.f76680c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditName)) {
                return false;
            }
            EditName editName = (EditName) obj2;
            return Intrinsics.f(this.f76678a, editName.f76678a) && Intrinsics.f(this.f76679b, editName.f76679b) && this.f76680c == editName.f76680c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76680c) + p.a.c(this.f76678a.hashCode() * 31, 31, this.f76679b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76678a);
            dest.writeString(this.f76679b);
            dest.writeInt(this.f76680c ? 1 : 0);
        }
    }
}

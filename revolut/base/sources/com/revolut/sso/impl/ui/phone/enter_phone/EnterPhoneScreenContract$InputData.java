package com.revolut.sso.impl.ui.phone.enter_phone;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnterPhoneScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EnterPhoneScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f106662a;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode;", "Landroid/os/Parcelable;", "LostAccess", "Create", "SignUp", "Collect", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Collect;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$LostAccess;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$SignUp;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Collect;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Collect implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Collect f106663a = new Collect();

            @NotNull
            public static final Parcelable.Creator<Collect> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Collect.f106663a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Collect[i];
                }
            }

            private Collect() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode;", "", "toString", "()Ljava/lang/String;", "PhoneData", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Create implements Mode {

            @NotNull
            public static final Parcelable.Creator<Create> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f106664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PhoneData f106665b;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData;", "Landroid/os/Parcelable;", "FullNumber", "CountryOnly", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData$CountryOnly;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData$FullNumber;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface PhoneData extends Parcelable {

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData$CountryOnly;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class CountryOnly implements PhoneData {

                    @NotNull
                    public static final Parcelable.Creator<CountryOnly> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final wi0.b f106666a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new CountryOnly((wi0.b) parcel.readSerializable());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new CountryOnly[i];
                        }
                    }

                    public CountryOnly(wi0.b countryCode) {
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        this.f106666a = countryCode;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof CountryOnly) && Intrinsics.f(this.f106666a, ((CountryOnly) obj2).f106666a);
                    }

                    public final int hashCode() {
                        return this.f106666a.f297794a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeSerializable(this.f106666a);
                    }
                }

                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData$FullNumber;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$Create$PhoneData;", "", "toString", "()Ljava/lang/String;", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class FullNumber implements PhoneData {

                    @NotNull
                    public static final Parcelable.Creator<FullNumber> CREATOR = new a();

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final String f106667a;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        public final Object createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new FullNumber(parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        public final Object[] newArray(int i) {
                            return new FullNumber[i];
                        }
                    }

                    public FullNumber(String phoneNumber) {
                        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
                        this.f106667a = phoneNumber;
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj2) {
                        if (this == obj2) {
                            return true;
                        }
                        return (obj2 instanceof FullNumber) && Intrinsics.f(this.f106667a, ((FullNumber) obj2).f106667a);
                    }

                    public final int hashCode() {
                        return this.f106667a.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel dest, int i) {
                        Intrinsics.checkNotNullParameter(dest, "dest");
                        dest.writeString(this.f106667a);
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Create(parcel.readInt() != 0, (PhoneData) parcel.readParcelable(Create.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Create[i];
                }
            }

            public Create(boolean z, PhoneData phoneData) {
                this.f106664a = z;
                this.f106665b = phoneData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Create)) {
                    return false;
                }
                Create create = (Create) obj2;
                return this.f106664a == create.f106664a && Intrinsics.f(this.f106665b, create.f106665b);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.f106664a) * 31;
                PhoneData phoneData = this.f106665b;
                return iHashCode + (phoneData == null ? 0 : phoneData.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(this.f106664a ? 1 : 0);
                dest.writeParcelable(this.f106665b, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$LostAccess;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class LostAccess implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final LostAccess f106668a = new LostAccess();

            @NotNull
            public static final Parcelable.Creator<LostAccess> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LostAccess.f106668a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LostAccess[i];
                }
            }

            private LostAccess() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode$SignUp;", "Lcom/revolut/sso/impl/ui/phone/enter_phone/EnterPhoneScreenContract$InputData$Mode;", "<init>", "()V", "revolut_sso_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SignUp implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SignUp f106669a = new SignUp();

            @NotNull
            public static final Parcelable.Creator<SignUp> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SignUp.f106669a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SignUp[i];
                }
            }

            private SignUp() {
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
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EnterPhoneScreenContract$InputData((Mode) parcel.readParcelable(EnterPhoneScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EnterPhoneScreenContract$InputData[i];
        }
    }

    public EnterPhoneScreenContract$InputData(Mode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f106662a = mode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EnterPhoneScreenContract$InputData) && Intrinsics.f(this.f106662a, ((EnterPhoneScreenContract$InputData) obj2).f106662a);
    }

    public final int hashCode() {
        return this.f106662a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f106662a, i);
    }
}

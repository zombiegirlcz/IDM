package com.revolut.feature.apm.blik.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BlikFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<BlikFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f61647b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f61648a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f61648a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f61648a, ((InputData) obj2).f61648a);
        }

        public final int hashCode() {
            return this.f61648a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f61648a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType;", "Landroid/os/Parcelable;", "OpenBlikCode", "OpenBlikConfirmation", "NewContact", "RecipientList", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$NewContact;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$OpenBlikCode;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$OpenBlikConfirmation;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$RecipientList;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StartType extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$NewContact;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType;", "<init>", "()V", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class NewContact implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final NewContact f61649a = new NewContact();

            @NotNull
            public static final Parcelable.Creator<NewContact> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return NewContact.f61649a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new NewContact[i];
                }
            }

            private NewContact() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$OpenBlikCode;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBlikCode implements StartType {

            @NotNull
            public static final Parcelable.Creator<OpenBlikCode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f61650a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenBlikCode((b) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenBlikCode[i];
                }
            }

            public OpenBlikCode(b currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                this.f61650a = currency;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenBlikCode) && Intrinsics.f(this.f61650a, ((OpenBlikCode) obj2).f61650a);
            }

            public final int hashCode() {
                return this.f61650a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f61650a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$OpenBlikConfirmation;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenBlikConfirmation implements StartType {

            @NotNull
            public static final Parcelable.Creator<OpenBlikConfirmation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f61651a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenBlikConfirmation(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenBlikConfirmation[i];
                }
            }

            public OpenBlikConfirmation() {
                this(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenBlikConfirmation) && Intrinsics.f(this.f61651a, ((OpenBlikConfirmation) obj2).f61651a);
            }

            public final int hashCode() {
                String str = this.f61651a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f61651a);
            }

            public OpenBlikConfirmation(String str) {
                this.f61651a = str;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType$RecipientList;", "Lcom/revolut/feature/apm/blik/api/navigation/BlikFlowDestination$StartType;", "<init>", "()V", "feature_apm_blik_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class RecipientList implements StartType {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RecipientList f61652a = new RecipientList();

            @NotNull
            public static final Parcelable.Creator<RecipientList> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RecipientList.f61652a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RecipientList[i];
                }
            }

            private RecipientList() {
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
            return new BlikFlowDestination((StartType) parcel.readParcelable(BlikFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BlikFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlikFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f61647b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof BlikFlowDestination) && Intrinsics.f(this.f61647b, ((BlikFlowDestination) obj2).f61647b);
    }

    public final int hashCode() {
        return this.f61647b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61647b, i);
    }
}

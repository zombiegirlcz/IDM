package com.revolut.feature.shared.help_centre.api.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "StartPoint", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SharedHelpDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SharedHelpDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f86144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f86145c;

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartPoint f86146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InternalDestination f86147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final NewTicketContext f86148c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartPoint) parcel.readParcelable(InputData.class.getClassLoader()), (InternalDestination) parcel.readParcelable(InputData.class.getClassLoader()), (NewTicketContext) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public InputData() {
            this((StartPoint) null, (NewTicketContext) (0 == true ? 1 : 0), 7);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InternalDestination getF86147b() {
            return this.f86147b;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final NewTicketContext getF86148c() {
            return this.f86148c;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final StartPoint getF86146a() {
            return this.f86146a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f86146a, inputData.f86146a) && Intrinsics.f(this.f86147b, inputData.f86147b) && Intrinsics.f(this.f86148c, inputData.f86148c);
        }

        public final int hashCode() {
            int iHashCode = this.f86146a.hashCode() * 31;
            InternalDestination internalDestination = this.f86147b;
            int iHashCode2 = (iHashCode + (internalDestination == null ? 0 : internalDestination.hashCode())) * 31;
            NewTicketContext newTicketContext = this.f86148c;
            return iHashCode2 + (newTicketContext != null ? newTicketContext.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86146a, i);
            dest.writeParcelable(this.f86147b, i);
            dest.writeParcelable(this.f86148c, i);
        }

        public InputData(StartPoint startPoint, InternalDestination internalDestination, NewTicketContext newTicketContext) {
            Intrinsics.checkNotNullParameter(startPoint, "startPoint");
            this.f86146a = startPoint;
            this.f86147b = internalDestination;
            this.f86148c = newTicketContext;
        }

        public /* synthetic */ InputData(StartPoint startPoint, NewTicketContext newTicketContext, int i) {
            this((i & 1) != 0 ? StartPoint.Home.f86150a : startPoint, (InternalDestination) null, (i & 4) != 0 ? null : newTicketContext);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint;", "Landroid/os/Parcelable;", "Home", "HelpWithCard", "ViewCardPin", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint$HelpWithCard;", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint$Home;", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint$ViewCardPin;", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StartPoint extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint$HelpWithCard;", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint;", "<init>", "()V", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class HelpWithCard implements StartPoint {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final HelpWithCard f86149a = new HelpWithCard();

            @NotNull
            public static final Parcelable.Creator<HelpWithCard> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HelpWithCard.f86149a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HelpWithCard[i];
                }
            }

            private HelpWithCard() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint$Home;", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint;", "<init>", "()V", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Home implements StartPoint {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Home f86150a = new Home();

            @NotNull
            public static final Parcelable.Creator<Home> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Home.f86150a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Home[i];
                }
            }

            private Home() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint$ViewCardPin;", "Lcom/revolut/feature/shared/help_centre/api/main/SharedHelpDestination$StartPoint;", "<init>", "()V", "feature_shared_help_centre_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ViewCardPin implements StartPoint {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ViewCardPin f86151a = new ViewCardPin();

            @NotNull
            public static final Parcelable.Creator<ViewCardPin> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ViewCardPin.f86151a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ViewCardPin[i];
                }
            }

            private ViewCardPin() {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharedHelpDestination(InputData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SharedHelpDestination[i];
        }
    }

    public SharedHelpDestination() {
        this((InputData) null, 3);
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f86144b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SharedHelpDestination)) {
            return false;
        }
        SharedHelpDestination sharedHelpDestination = (SharedHelpDestination) obj2;
        return Intrinsics.f(this.f86144b, sharedHelpDestination.f86144b) && this.f86145c == sharedHelpDestination.f86145c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f86145c) + (this.f86144b.hashCode() * 31);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getF86145c() {
        return this.f86145c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f86144b.writeToParcel(dest, i);
        dest.writeInt(this.f86145c ? 1 : 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedHelpDestination(InputData inputData, boolean z) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f86144b = inputData;
        this.f86145c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SharedHelpDestination(InputData inputData, int i) {
        this((i & 1) != 0 ? new InputData((StartPoint) null, (NewTicketContext) (0 == true ? 1 : 0), 7) : inputData, (i & 2) != 0);
    }
}

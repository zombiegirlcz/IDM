package com.revolut.feature.kyc.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "ActionOnResult", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmAddressDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ConfirmAddressDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionOnResult f77477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f77478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gt8.a f77479c;

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenNextScreen", "Finish", "Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult$Finish;", "Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult$OpenNextScreen;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ActionOnResult implements Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult$Finish;", "Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult;", "<init>", "()V", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Finish extends ActionOnResult {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Finish f77480a = new Finish();

            @NotNull
            public static final Parcelable.Creator<Finish> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Finish.f77480a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Finish[i];
                }
            }

            private Finish() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult$OpenNextScreen;", "Lcom/revolut/feature/kyc/api/navigation/ConfirmAddressDestination$ActionOnResult;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenNextScreen extends ActionOnResult {

            @NotNull
            public static final Parcelable.Creator<OpenNextScreen> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NaviCommand f77481a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenNextScreen((NaviCommand) parcel.readParcelable(OpenNextScreen.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenNextScreen[i];
                }
            }

            public OpenNextScreen(NaviCommand naviCommand) {
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                this.f77481a = naviCommand;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final NaviCommand getF77481a() {
                return this.f77481a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenNextScreen) && Intrinsics.f(this.f77481a, ((OpenNextScreen) obj2).f77481a);
            }

            public final int hashCode() {
                return this.f77481a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f77481a, i);
            }
        }

        private ActionOnResult() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConfirmAddressDestination((ActionOnResult) parcel.readParcelable(ConfirmAddressDestination.class.getClassLoader()), (b) parcel.readSerializable(), gt8.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConfirmAddressDestination[i];
        }
    }

    public ConfirmAddressDestination() {
        this(null, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConfirmAddressDestination)) {
            return false;
        }
        ConfirmAddressDestination confirmAddressDestination = (ConfirmAddressDestination) obj2;
        return Intrinsics.f(this.f77477a, confirmAddressDestination.f77477a) && Intrinsics.f(this.f77478b, confirmAddressDestination.f77478b) && this.f77479c == confirmAddressDestination.f77479c;
    }

    public final int hashCode() {
        int iHashCode = this.f77477a.hashCode() * 31;
        b bVar = this.f77478b;
        return this.f77479c.hashCode() + ((iHashCode + (bVar == null ? 0 : bVar.f297794a.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f77477a, i);
        dest.writeSerializable(this.f77478b);
        dest.writeString(this.f77479c.name());
    }

    public ConfirmAddressDestination(ActionOnResult actionOnResult, b bVar, gt8.a completionDialog) {
        Intrinsics.checkNotNullParameter(actionOnResult, "actionOnResult");
        Intrinsics.checkNotNullParameter(completionDialog, "completionDialog");
        this.f77477a = actionOnResult;
        this.f77478b = bVar;
        this.f77479c = completionDialog;
    }

    public /* synthetic */ ConfirmAddressDestination(ActionOnResult actionOnResult, int i) {
        this((i & 1) != 0 ? ActionOnResult.Finish.f77480a : actionOnResult, null, gt8.a.VERIFY_IDENTITY_IN_PROGRESS);
    }
}

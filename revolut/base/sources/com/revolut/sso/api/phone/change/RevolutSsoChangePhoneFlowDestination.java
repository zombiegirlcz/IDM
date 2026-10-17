package com.revolut.sso.api.phone.change;

import android.os.Parcel;
import android.os.Parcelable;
import cjl.o;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.sso.api.models.SsoChangeClaimMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/phone/change/RevolutSsoChangePhoneFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/sso/api/phone/change/RevolutSsoChangePhoneFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoChangePhoneFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoChangePhoneFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f106017b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoChangePhoneFlowDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoChangePhoneFlowDestination[i];
        }
    }

    public RevolutSsoChangePhoneFlowDestination() {
        this(0);
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f106017b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InputData getF106017b() {
        return this.f106017b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevolutSsoChangePhoneFlowDestination) && Intrinsics.f(this.f106017b, ((RevolutSsoChangePhoneFlowDestination) obj2).f106017b);
    }

    public final int hashCode() {
        return this.f106017b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f106017b.writeToParcel(dest, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutSsoChangePhoneFlowDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f106017b = inputData;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/phone/change/RevolutSsoChangePhoneFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SsoChangeClaimMode f106018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o f106019b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((SsoChangeClaimMode) parcel.readParcelable(InputData.class.getClassLoader()), o.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(SsoChangeClaimMode mode, o successNotificationType) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(successNotificationType, "successNotificationType");
            this.f106018a = mode;
            this.f106019b = successNotificationType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SsoChangeClaimMode getF106018a() {
            return this.f106018a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o getF106019b() {
            return this.f106019b;
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
            return Intrinsics.f(this.f106018a, inputData.f106018a) && this.f106019b == inputData.f106019b;
        }

        public final int hashCode() {
            return this.f106019b.hashCode() + (this.f106018a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f106018a, i);
            dest.writeString(this.f106019b.name());
        }

        public /* synthetic */ InputData(o oVar) {
            this(SsoChangeClaimMode.Current.f105982a, oVar);
        }
    }

    public /* synthetic */ RevolutSsoChangePhoneFlowDestination(int i) {
        this(new InputData(o.SHOT));
    }
}

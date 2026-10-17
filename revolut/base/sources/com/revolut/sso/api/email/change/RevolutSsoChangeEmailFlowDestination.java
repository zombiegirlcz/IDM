package com.revolut.sso.api.email.change;

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
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/sso/api/email/change/RevolutSsoChangeEmailFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/sso/api/email/change/RevolutSsoChangeEmailFlowDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutSsoChangeEmailFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevolutSsoChangeEmailFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f105833b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutSsoChangeEmailFlowDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutSsoChangeEmailFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RevolutSsoChangeEmailFlowDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f105833b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF80510b() {
        return this.f105833b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final InputData getF105833b() {
        return this.f105833b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RevolutSsoChangeEmailFlowDestination) && Intrinsics.f(this.f105833b, ((RevolutSsoChangeEmailFlowDestination) obj2).f105833b);
    }

    public final int hashCode() {
        return this.f105833b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f105833b.writeToParcel(dest, i);
    }

    public RevolutSsoChangeEmailFlowDestination() {
        this(new InputData((SsoChangeClaimMode.Multiple) null, o.SHOT, 3));
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/sso/api/email/change/RevolutSsoChangeEmailFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "revolut_sso_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevolutSsoChangeEmailDeeplinkData f105834a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SsoChangeClaimMode f105835b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o f105836c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(parcel.readInt() == 0 ? null : RevolutSsoChangeEmailDeeplinkData.CREATOR.createFromParcel(parcel), (SsoChangeClaimMode) parcel.readParcelable(InputData.class.getClassLoader()), o.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData, SsoChangeClaimMode mode, o successNotificationType) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            Intrinsics.checkNotNullParameter(successNotificationType, "successNotificationType");
            this.f105834a = revolutSsoChangeEmailDeeplinkData;
            this.f105835b = mode;
            this.f105836c = successNotificationType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final RevolutSsoChangeEmailDeeplinkData getF105834a() {
            return this.f105834a;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SsoChangeClaimMode getF105835b() {
            return this.f105835b;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final o getF105836c() {
            return this.f105836c;
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
            return Intrinsics.f(this.f105834a, inputData.f105834a) && Intrinsics.f(this.f105835b, inputData.f105835b) && this.f105836c == inputData.f105836c;
        }

        public final int hashCode() {
            RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData = this.f105834a;
            return this.f105836c.hashCode() + ((this.f105835b.hashCode() + ((revolutSsoChangeEmailDeeplinkData == null ? 0 : revolutSsoChangeEmailDeeplinkData.hashCode()) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            RevolutSsoChangeEmailDeeplinkData revolutSsoChangeEmailDeeplinkData = this.f105834a;
            if (revolutSsoChangeEmailDeeplinkData == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                revolutSsoChangeEmailDeeplinkData.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f105835b, i);
            dest.writeString(this.f105836c.name());
        }

        public /* synthetic */ InputData(SsoChangeClaimMode.Multiple multiple, o oVar, int i) {
            this((RevolutSsoChangeEmailDeeplinkData) null, (i & 2) != 0 ? SsoChangeClaimMode.Current.f105982a : multiple, oVar);
        }
    }
}

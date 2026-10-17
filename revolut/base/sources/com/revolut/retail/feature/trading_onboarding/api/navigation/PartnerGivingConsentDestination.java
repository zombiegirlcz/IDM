package com.revolut.retail.feature.trading_onboarding.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0003\u0007\b\tJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$InputData;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "InputData", "Configuration", "StartAction", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PartnerGivingConsentDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<PartnerGivingConsentDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f104098b;

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$Configuration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Configuration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Configuration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartAction f104099a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Configuration((StartAction) parcel.readParcelable(Configuration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Configuration[i];
            }
        }

        public Configuration(StartAction startAction) {
            this.f104099a = startAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Configuration) && Intrinsics.f(this.f104099a, ((Configuration) obj2).f104099a);
        }

        public final int hashCode() {
            StartAction startAction = this.f104099a;
            if (startAction == null) {
                return 0;
            }
            return startAction.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104099a, i);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Configuration f104100a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData(Configuration.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(Configuration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f104100a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f104100a, ((InputData) obj2).f104100a);
        }

        public final int hashCode() {
            return this.f104100a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f104100a.writeToParcel(dest, i);
        }
    }

    /* JADX INFO: loaded from: classes12.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$StartAction;", "Landroid/os/Parcelable;", "ShowPrompt", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$StartAction$ShowPrompt;", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface StartAction extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$StartAction$ShowPrompt;", "Lcom/revolut/retail/feature/trading_onboarding/api/navigation/PartnerGivingConsentDestination$StartAction;", "<init>", "()V", "feature_trading_onboarding_revamp_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ShowPrompt implements StartAction {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ShowPrompt f104101a = new ShowPrompt();

            @NotNull
            public static final Parcelable.Creator<ShowPrompt> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPrompt.f104101a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowPrompt[i];
                }
            }

            private ShowPrompt() {
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

    /* JADX INFO: loaded from: classes12.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PartnerGivingConsentDestination(Configuration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PartnerGivingConsentDestination[i];
        }
    }

    public PartnerGivingConsentDestination() {
        this(new Configuration(null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PartnerGivingConsentDestination) && Intrinsics.f(this.f104098b, ((PartnerGivingConsentDestination) obj2).f104098b);
    }

    public final int hashCode() {
        return this.f104098b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f104098b.writeToParcel(dest, i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PartnerGivingConsentDestination(Configuration configuration) {
        super(new InputData(configuration));
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f104098b = configuration;
    }
}

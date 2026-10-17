package com.revolut.screen.sim_binding.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Mode", "screen_sim_binding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SimBindingScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SimBindingScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mode f104680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104682c;
    public final String d;
    public final String e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode;", "Landroid/os/Parcelable;", "Linking", "Verification", "Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode$Linking;", "Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode$Verification;", "screen_sim_binding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Mode extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode$Linking;", "Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode;", "<init>", "()V", "screen_sim_binding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Linking implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Linking f104683a = new Linking();

            @NotNull
            public static final Parcelable.Creator<Linking> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Linking.f104683a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Linking[i];
                }
            }

            private Linking() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode$Verification;", "Lcom/revolut/screen/sim_binding/api/SimBindingScreenContract$InputData$Mode;", "<init>", "()V", "screen_sim_binding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Verification implements Mode {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Verification f104684a = new Verification();

            @NotNull
            public static final Parcelable.Creator<Verification> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Verification.f104684a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Verification[i];
                }
            }

            private Verification() {
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
            return new SimBindingScreenContract$InputData((Mode) parcel.readParcelable(SimBindingScreenContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SimBindingScreenContract$InputData[i];
        }
    }

    public SimBindingScreenContract$InputData(Mode mode, String challengeId, String userPhoneNumber, String simBindingChallengePhoneNumber, String simBindingChallengeSmsText) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        Intrinsics.checkNotNullParameter(userPhoneNumber, "userPhoneNumber");
        Intrinsics.checkNotNullParameter(simBindingChallengePhoneNumber, "simBindingChallengePhoneNumber");
        Intrinsics.checkNotNullParameter(simBindingChallengeSmsText, "simBindingChallengeSmsText");
        this.f104680a = mode;
        this.f104681b = challengeId;
        this.f104682c = userPhoneNumber;
        this.d = simBindingChallengePhoneNumber;
        this.e = simBindingChallengeSmsText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SimBindingScreenContract$InputData)) {
            return false;
        }
        SimBindingScreenContract$InputData simBindingScreenContract$InputData = (SimBindingScreenContract$InputData) obj2;
        return Intrinsics.f(this.f104680a, simBindingScreenContract$InputData.f104680a) && Intrinsics.f(this.f104681b, simBindingScreenContract$InputData.f104681b) && Intrinsics.f(this.f104682c, simBindingScreenContract$InputData.f104682c) && Intrinsics.f(this.d, simBindingScreenContract$InputData.d) && Intrinsics.f(this.e, simBindingScreenContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(p.a.c(this.f104680a.hashCode() * 31, 31, this.f104681b), 31, this.f104682c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104680a, i);
        dest.writeString(this.f104681b);
        dest.writeString(this.f104682c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}

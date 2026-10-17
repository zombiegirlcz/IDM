package com.revolut.feature.post_activation.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor;", "Laii/e;", "Laii/q;", "Lcom/revolut/kompot/common/ParcelableDestination;", "", "toString", "()Ljava/lang/String;", "Configuration", "feature_retail_post_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PostActivationFlowDescriptor implements e, ParcelableDestination {

    @NotNull
    public static final Parcelable.Creator<PostActivationFlowDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Configuration f80934a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration;", "Landroid/os/Parcelable;", "Onboarding", "Login", "Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration$Login;", "Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration$Onboarding;", "feature_retail_post_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Configuration extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration$Login;", "Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_retail_post_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Login implements Configuration {

            @NotNull
            public static final Parcelable.Creator<Login> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NaviCommand f80935a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Login((NaviCommand) parcel.readParcelable(Login.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Login[i];
                }
            }

            public Login(NaviCommand mainScreenCommand) {
                Intrinsics.checkNotNullParameter(mainScreenCommand, "mainScreenCommand");
                this.f80935a = mainScreenCommand;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Login) && Intrinsics.f(this.f80935a, ((Login) obj2).f80935a);
            }

            public final int hashCode() {
                return this.f80935a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f80935a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration$Onboarding;", "Lcom/revolut/feature/post_activation/api/navigation/PostActivationFlowDescriptor$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_retail_post_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Onboarding implements Configuration {

            @NotNull
            public static final Parcelable.Creator<Onboarding> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f80936a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f80937b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Onboarding((b) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Onboarding[i];
                }
            }

            public Onboarding(b countryCode, boolean z) {
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                this.f80936a = countryCode;
                this.f80937b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Onboarding)) {
                    return false;
                }
                Onboarding onboarding = (Onboarding) obj2;
                return Intrinsics.f(this.f80936a, onboarding.f80936a) && this.f80937b == onboarding.f80937b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f80937b) + (this.f80936a.f297794a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f80936a);
                dest.writeInt(this.f80937b ? 1 : 0);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PostActivationFlowDescriptor((Configuration) parcel.readParcelable(PostActivationFlowDescriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PostActivationFlowDescriptor[i];
        }
    }

    public PostActivationFlowDescriptor(Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f80934a = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PostActivationFlowDescriptor) && Intrinsics.f(this.f80934a, ((PostActivationFlowDescriptor) obj2).f80934a);
    }

    public final int hashCode() {
        return this.f80934a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80934a, i);
    }
}

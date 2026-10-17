package com.revolut.feature.joint.impl.ui.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig", "Landroid/os/Parcelable;", "<init>", "()V", "Rejected", "Cancelled", "Expired", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig$Cancelled;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig$Expired;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig$Rejected;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JointDeeplinkFlowContract$PromptConfig implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig$Cancelled;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Cancelled extends JointDeeplinkFlowContract$PromptConfig {

        @NotNull
        public static final Parcelable.Creator<Cancelled> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f76538a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Cancelled(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Cancelled[i];
            }
        }

        public Cancelled(boolean z) {
            this.f76538a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Cancelled) && this.f76538a == ((Cancelled) obj2).f76538a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76538a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f76538a ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig$Expired;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Expired extends JointDeeplinkFlowContract$PromptConfig {

        @NotNull
        public static final Parcelable.Creator<Expired> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f76540b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Expired(parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Expired[i];
            }
        }

        public Expired(String otherUserDisplayedName, long j2) {
            Intrinsics.checkNotNullParameter(otherUserDisplayedName, "otherUserDisplayedName");
            this.f76539a = otherUserDisplayedName;
            this.f76540b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Expired)) {
                return false;
            }
            Expired expired = (Expired) obj2;
            return Intrinsics.f(this.f76539a, expired.f76539a) && this.f76540b == expired.f76540b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f76540b) + (this.f76539a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76539a);
            dest.writeLong(this.f76540b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig$Rejected;", "Lcom/revolut/feature/joint/impl/ui/deeplink/JointDeeplinkFlowContract$PromptConfig;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Rejected extends JointDeeplinkFlowContract$PromptConfig {

        @NotNull
        public static final Parcelable.Creator<Rejected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f76541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76542b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Rejected(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Rejected[i];
            }
        }

        public Rejected(boolean z, String otherUserDisplayedName) {
            Intrinsics.checkNotNullParameter(otherUserDisplayedName, "otherUserDisplayedName");
            this.f76541a = z;
            this.f76542b = otherUserDisplayedName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Rejected)) {
                return false;
            }
            Rejected rejected = (Rejected) obj2;
            return this.f76541a == rejected.f76541a && Intrinsics.f(this.f76542b, rejected.f76542b);
        }

        public final int hashCode() {
            return this.f76542b.hashCode() + (Boolean.hashCode(this.f76541a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f76541a ? 1 : 0);
            dest.writeString(this.f76542b);
        }
    }

    private JointDeeplinkFlowContract$PromptConfig() {
    }
}

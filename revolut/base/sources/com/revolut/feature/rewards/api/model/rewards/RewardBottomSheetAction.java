package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenUrl", "CopyAndOpenUrl", "Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction$CopyAndOpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction$OpenUrl;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RewardBottomSheetAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction$CopyAndOpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CopyAndOpenUrl extends RewardBottomSheetAction {

        @NotNull
        public static final Parcelable.Creator<CopyAndOpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f84844b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CopyAndOpenUrl(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CopyAndOpenUrl[i];
            }
        }

        public CopyAndOpenUrl(String copyable, String url2) {
            Intrinsics.checkNotNullParameter(copyable, "copyable");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f84843a = copyable;
            this.f84844b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CopyAndOpenUrl)) {
                return false;
            }
            CopyAndOpenUrl copyAndOpenUrl = (CopyAndOpenUrl) obj2;
            return Intrinsics.f(this.f84843a, copyAndOpenUrl.f84843a) && Intrinsics.f(this.f84844b, copyAndOpenUrl.f84844b);
        }

        public final int hashCode() {
            return this.f84844b.hashCode() + (this.f84843a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84843a);
            dest.writeString(this.f84844b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction$OpenUrl;", "Lcom/revolut/feature/rewards/api/model/rewards/RewardBottomSheetAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenUrl extends RewardBottomSheetAction {

        @NotNull
        public static final Parcelable.Creator<OpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f84845a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenUrl[i];
            }
        }

        public OpenUrl(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f84845a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenUrl) && Intrinsics.f(this.f84845a, ((OpenUrl) obj2).f84845a);
        }

        public final int hashCode() {
            return this.f84845a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84845a);
        }
    }

    private RewardBottomSheetAction() {
    }
}

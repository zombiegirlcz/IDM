package com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/profile/impl/ui/profile/screens/notification_setting_details/NotificationSettingDetailsContract$Steps", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "InsightMarketAlertModeInfo", "Lcom/revolut/feature/profile/impl/ui/profile/screens/notification_setting_details/NotificationSettingDetailsContract$Steps$InsightMarketAlertModeInfo;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface NotificationSettingDetailsContract$Steps extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/screens/notification_setting_details/NotificationSettingDetailsContract$Steps$InsightMarketAlertModeInfo;", "Lcom/revolut/feature/profile/impl/ui/profile/screens/notification_setting_details/NotificationSettingDetailsContract$Steps;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InsightMarketAlertModeInfo implements NotificationSettingDetailsContract$Steps {

        @NotNull
        public static final Parcelable.Creator<InsightMarketAlertModeInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a59.a f81461a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InsightMarketAlertModeInfo(a59.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsightMarketAlertModeInfo[i];
            }
        }

        public InsightMarketAlertModeInfo(a59.a mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            this.f81461a = mode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InsightMarketAlertModeInfo) && this.f81461a == ((InsightMarketAlertModeInfo) obj2).f81461a;
        }

        public final int hashCode() {
            return this.f81461a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81461a.name());
        }
    }
}

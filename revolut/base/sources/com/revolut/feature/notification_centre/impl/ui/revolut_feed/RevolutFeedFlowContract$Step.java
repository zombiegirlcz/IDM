package com.revolut.feature.notification_centre.impl.ui.revolut_feed;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Feed", "Profile", "Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step$Feed;", "Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step$Profile;", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevolutFeedFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step$Feed;", "Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step;", "<init>", "()V", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Feed extends RevolutFeedFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Feed f78137a = new Feed();

        @NotNull
        public static final Parcelable.Creator<Feed> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Feed.f78137a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Feed[i];
            }
        }

        private Feed() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step$Profile;", "Lcom/revolut/feature/notification_centre/impl/ui/revolut_feed/RevolutFeedFlowContract$Step;", "<init>", "()V", "feature_notification_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Profile extends RevolutFeedFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Profile f78138a = new Profile();

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Profile.f78138a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        private Profile() {
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

    private RevolutFeedFlowContract$Step() {
    }
}

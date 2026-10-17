package com.revolut.feature.post_activation.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"com/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Landroid/os/Parcelable;", "ProfileDetails", "ContactsSync", "Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step$ContactsSync;", "Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step$ProfileDetails;", "feature_retail_post_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PostActivationFlowContract$Step extends FlowStep, Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step$ContactsSync;", "Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step;", "<init>", "()V", "feature_retail_post_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContactsSync implements PostActivationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ContactsSync f80939a = new ContactsSync();

        @NotNull
        public static final Parcelable.Creator<ContactsSync> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ContactsSync.f80939a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContactsSync[i];
            }
        }

        private ContactsSync() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step$ProfileDetails;", "Lcom/revolut/feature/post_activation/impl/ui/flow/PostActivationFlowContract$Step;", "<init>", "()V", "feature_retail_post_activation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfileDetails implements PostActivationFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileDetails f80940a = new ProfileDetails();

        @NotNull
        public static final Parcelable.Creator<ProfileDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfileDetails.f80940a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileDetails[i];
            }
        }

        private ProfileDetails() {
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

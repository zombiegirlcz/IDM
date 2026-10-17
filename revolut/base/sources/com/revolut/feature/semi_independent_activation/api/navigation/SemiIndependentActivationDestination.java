package com.revolut.feature.semi_independent_activation.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/semi_independent_activation/api/navigation/SemiIndependentActivationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "InvitationDetails", "Lcom/revolut/feature/semi_independent_activation/api/navigation/SemiIndependentActivationDestination$InvitationDetails;", "feature_semi_independent_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SemiIndependentActivationDestination implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_activation/api/navigation/SemiIndependentActivationDestination$InvitationDetails;", "Lcom/revolut/feature/semi_independent_activation/api/navigation/SemiIndependentActivationDestination;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_activation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationDetails extends SemiIndependentActivationDestination {

        @NotNull
        public static final Parcelable.Creator<InvitationDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85969a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitationDetails(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitationDetails[i];
            }
        }

        public InvitationDetails(String teenUserId) {
            Intrinsics.checkNotNullParameter(teenUserId, "teenUserId");
            this.f85969a = teenUserId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvitationDetails) && Intrinsics.f(this.f85969a, ((InvitationDetails) obj2).f85969a);
        }

        public final int hashCode() {
            return this.f85969a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85969a);
        }
    }

    private SemiIndependentActivationDestination() {
    }
}

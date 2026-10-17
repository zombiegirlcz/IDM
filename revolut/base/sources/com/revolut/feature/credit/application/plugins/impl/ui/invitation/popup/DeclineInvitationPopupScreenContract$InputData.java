package com.revolut.feature.credit.application.plugins.impl.ui.invitation.popup;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ds3.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/invitation/popup/DeclineInvitationPopupScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DeclineInvitationPopupScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DeclineInvitationPopupScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f67798b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeclineInvitationPopupScreenContract$InputData(parcel.readString(), (c) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DeclineInvitationPopupScreenContract$InputData[i];
        }
    }

    public DeclineInvitationPopupScreenContract$InputData(String invitationId, c configuration) {
        Intrinsics.checkNotNullParameter(invitationId, "invitationId");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f67797a = invitationId;
        this.f67798b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DeclineInvitationPopupScreenContract$InputData)) {
            return false;
        }
        DeclineInvitationPopupScreenContract$InputData declineInvitationPopupScreenContract$InputData = (DeclineInvitationPopupScreenContract$InputData) obj2;
        return Intrinsics.f(this.f67797a, declineInvitationPopupScreenContract$InputData.f67797a) && Intrinsics.f(this.f67798b, declineInvitationPopupScreenContract$InputData.f67798b);
    }

    public final int hashCode() {
        return this.f67798b.hashCode() + (this.f67797a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67797a);
        dest.writeSerializable(this.f67798b);
    }
}

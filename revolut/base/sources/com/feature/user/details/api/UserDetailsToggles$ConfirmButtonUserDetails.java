package com.feature.user.details.api;

import android.os.Parcel;
import android.os.Parcelable;
import cm.c;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/feature/user/details/api/UserDetailsToggles$ConfirmButtonUserDetails", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "feature_user_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserDetailsToggles$ConfirmButtonUserDetails extends RemoteFeatureDefinition {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UserDetailsToggles$ConfirmButtonUserDetails f26225c = new UserDetailsToggles$ConfirmButtonUserDetails();

    @NotNull
    public static final Parcelable.Creator<UserDetailsToggles$ConfirmButtonUserDetails> CREATOR = new c(9);

    @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
    public final Experiment a() {
        return new ReleaseFlagExperiment("confirmButtonUserDetails");
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

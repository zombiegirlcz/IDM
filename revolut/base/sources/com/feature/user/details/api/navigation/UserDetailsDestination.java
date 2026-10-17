package com.feature.user.details.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import cm.c;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/user/details/api/navigation/UserDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_user_details_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserDetailsDestination implements KompotDestination {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final UserDetailsDestination f26226a = new UserDetailsDestination();

    @NotNull
    public static final Parcelable.Creator<UserDetailsDestination> CREATOR = new c(10);

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

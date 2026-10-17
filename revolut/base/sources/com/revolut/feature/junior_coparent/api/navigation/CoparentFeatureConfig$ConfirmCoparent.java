package com.revolut.feature.junior_coparent.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vd8.f;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_coparent/api/navigation/CoparentFeatureConfig$ConfirmCoparent", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_coparent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CoparentFeatureConfig$ConfirmCoparent implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CoparentFeatureConfig$ConfirmCoparent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f76871a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CoparentFeatureConfig$ConfirmCoparent((f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CoparentFeatureConfig$ConfirmCoparent[i];
        }
    }

    public CoparentFeatureConfig$ConfirmCoparent(f invitationApplication) {
        Intrinsics.checkNotNullParameter(invitationApplication, "invitationApplication");
        this.f76871a = invitationApplication;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CoparentFeatureConfig$ConfirmCoparent) && Intrinsics.f(this.f76871a, ((CoparentFeatureConfig$ConfirmCoparent) obj2).f76871a);
    }

    public final int hashCode() {
        return this.f76871a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f76871a);
    }
}

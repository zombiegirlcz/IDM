package com.revolut.feature.junior_coparent.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lg.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/revolut/feature/junior_coparent/api/models/InvitationAcceptanceResponse;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getJuniorId", "juniorId", "feature_junior_coparent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InvitationAcceptanceResponse implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<InvitationAcceptanceResponse> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("youthId")
    @NotNull
    private final String juniorId;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InvitationAcceptanceResponse(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InvitationAcceptanceResponse[i];
        }
    }

    public InvitationAcceptanceResponse(String juniorId) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        this.juniorId = juniorId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof InvitationAcceptanceResponse) && Intrinsics.f(this.juniorId, ((InvitationAcceptanceResponse) obj2).juniorId);
    }

    public final String getJuniorId() {
        return this.juniorId;
    }

    public final int hashCode() {
        return this.juniorId.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.juniorId);
    }
}

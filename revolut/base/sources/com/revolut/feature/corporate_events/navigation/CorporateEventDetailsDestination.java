package com.revolut.feature.corporate_events.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/corporate_events/navigation/CorporateEventDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CorporateEventDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CorporateEventDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66157c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CorporateEventDetailsDestination(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CorporateEventDetailsDestination[i];
        }
    }

    public CorporateEventDetailsDestination(String eventId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.f66155a = eventId;
        this.f66156b = z;
        this.f66157c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CorporateEventDetailsDestination)) {
            return false;
        }
        CorporateEventDetailsDestination corporateEventDetailsDestination = (CorporateEventDetailsDestination) obj2;
        return Intrinsics.f(this.f66155a, corporateEventDetailsDestination.f66155a) && this.f66156b == corporateEventDetailsDestination.f66156b && this.f66157c == corporateEventDetailsDestination.f66157c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66157c) + j6.a.c(this.f66155a.hashCode() * 31, 31, this.f66156b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66155a);
        dest.writeInt(this.f66156b ? 1 : 0);
        dest.writeInt(this.f66157c ? 1 : 0);
    }
}

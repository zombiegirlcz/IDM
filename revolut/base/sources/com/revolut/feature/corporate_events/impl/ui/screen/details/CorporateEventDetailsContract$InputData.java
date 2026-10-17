package com.revolut.feature.corporate_events.impl.ui.screen.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/corporate_events/impl/ui/screen/details/CorporateEventDetailsContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_corporate_events_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CorporateEventDetailsContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CorporateEventDetailsContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66122c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CorporateEventDetailsContract$InputData(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CorporateEventDetailsContract$InputData[i];
        }
    }

    public CorporateEventDetailsContract$InputData(String eventId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.f66120a = eventId;
        this.f66121b = z;
        this.f66122c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CorporateEventDetailsContract$InputData)) {
            return false;
        }
        CorporateEventDetailsContract$InputData corporateEventDetailsContract$InputData = (CorporateEventDetailsContract$InputData) obj2;
        return Intrinsics.f(this.f66120a, corporateEventDetailsContract$InputData.f66120a) && this.f66121b == corporateEventDetailsContract$InputData.f66121b && this.f66122c == corporateEventDetailsContract$InputData.f66122c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f66122c) + j6.a.c(this.f66120a.hashCode() * 31, 31, this.f66121b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f66120a);
        dest.writeInt(this.f66121b ? 1 : 0);
        dest.writeInt(this.f66122c ? 1 : 0);
    }
}

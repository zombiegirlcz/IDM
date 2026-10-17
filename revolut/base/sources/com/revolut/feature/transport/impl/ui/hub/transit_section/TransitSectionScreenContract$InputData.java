package com.revolut.feature.transport.impl.ui.hub.transit_section;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transport.models.TransportLocation;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transport/impl/ui/hub/transit_section/TransitSectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transport_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransitSectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransitSectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransportLocation f92551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f92552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92553c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransitSectionScreenContract$InputData((TransportLocation) parcel.readParcelable(TransitSectionScreenContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(TransitSectionScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransitSectionScreenContract$InputData[i];
        }
    }

    public TransitSectionScreenContract$InputData(TransportLocation location, Clause title, String ticketTypeKey) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(ticketTypeKey, "ticketTypeKey");
        this.f92551a = location;
        this.f92552b = title;
        this.f92553c = ticketTypeKey;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransitSectionScreenContract$InputData)) {
            return false;
        }
        TransitSectionScreenContract$InputData transitSectionScreenContract$InputData = (TransitSectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92551a, transitSectionScreenContract$InputData.f92551a) && Intrinsics.f(this.f92552b, transitSectionScreenContract$InputData.f92552b) && Intrinsics.f(this.f92553c, transitSectionScreenContract$InputData.f92553c);
    }

    public final int hashCode() {
        return this.f92553c.hashCode() + p.a.a(this.f92551a.hashCode() * 31, 31, this.f92552b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92551a, i);
        dest.writeParcelable(this.f92552b, i);
        dest.writeString(this.f92553c);
    }
}

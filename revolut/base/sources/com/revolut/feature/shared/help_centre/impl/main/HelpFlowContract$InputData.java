package com.revolut.feature.shared.help_centre.impl.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.feature.shared.help_centre.impl.main.HelpFlowContract$StartPoint;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HelpFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<HelpFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HelpFlowContract$StartPoint f86372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InternalDestination f86373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NewTicketContext f86374c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new HelpFlowContract$InputData((HelpFlowContract$StartPoint) parcel.readParcelable(HelpFlowContract$InputData.class.getClassLoader()), (InternalDestination) parcel.readParcelable(HelpFlowContract$InputData.class.getClassLoader()), (NewTicketContext) parcel.readParcelable(HelpFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new HelpFlowContract$InputData[i];
        }
    }

    public HelpFlowContract$InputData() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof HelpFlowContract$InputData)) {
            return false;
        }
        HelpFlowContract$InputData helpFlowContract$InputData = (HelpFlowContract$InputData) obj2;
        return Intrinsics.f(this.f86372a, helpFlowContract$InputData.f86372a) && Intrinsics.f(this.f86373b, helpFlowContract$InputData.f86373b) && Intrinsics.f(this.f86374c, helpFlowContract$InputData.f86374c);
    }

    public final int hashCode() {
        int iHashCode = this.f86372a.hashCode() * 31;
        InternalDestination internalDestination = this.f86373b;
        int iHashCode2 = (iHashCode + (internalDestination == null ? 0 : internalDestination.hashCode())) * 31;
        NewTicketContext newTicketContext = this.f86374c;
        return iHashCode2 + (newTicketContext != null ? newTicketContext.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f86372a, i);
        dest.writeParcelable(this.f86373b, i);
        dest.writeParcelable(this.f86374c, i);
    }

    public HelpFlowContract$InputData(HelpFlowContract$StartPoint startPoint, InternalDestination internalDestination, NewTicketContext newTicketContext) {
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        this.f86372a = startPoint;
        this.f86373b = internalDestination;
        this.f86374c = newTicketContext;
    }

    public /* synthetic */ HelpFlowContract$InputData(int i) {
        this(HelpFlowContract$StartPoint.Home.f86376a, null, null);
    }
}

package com.revolut.feature.restricted_access.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.restricted_access.api.FeatureNotAvailableDestination;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/restricted_access/impl/ui/flow/FeatureNotAvailableFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_restricted_access_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeatureNotAvailableFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FeatureNotAvailableFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f82045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f82046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f82047c;
    public final FeatureNotAvailableDestination.Action d;
    public final FeatureNotAvailableDestination.Action e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FeatureNotAvailableFlowContract$InputData((Clause) parcel.readParcelable(FeatureNotAvailableFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(FeatureNotAvailableFlowContract$InputData.class.getClassLoader()), (Clause) parcel.readParcelable(FeatureNotAvailableFlowContract$InputData.class.getClassLoader()), (FeatureNotAvailableDestination.Action) parcel.readParcelable(FeatureNotAvailableFlowContract$InputData.class.getClassLoader()), (FeatureNotAvailableDestination.Action) parcel.readParcelable(FeatureNotAvailableFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FeatureNotAvailableFlowContract$InputData[i];
        }
    }

    public FeatureNotAvailableFlowContract$InputData(Clause title, Clause description, Clause primaryButtonText, FeatureNotAvailableDestination.Action closeAction, FeatureNotAvailableDestination.Action primaryAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(closeAction, "closeAction");
        Intrinsics.checkNotNullParameter(primaryAction, "primaryAction");
        this.f82045a = title;
        this.f82046b = description;
        this.f82047c = primaryButtonText;
        this.d = closeAction;
        this.e = primaryAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FeatureNotAvailableFlowContract$InputData)) {
            return false;
        }
        FeatureNotAvailableFlowContract$InputData featureNotAvailableFlowContract$InputData = (FeatureNotAvailableFlowContract$InputData) obj2;
        return Intrinsics.f(this.f82045a, featureNotAvailableFlowContract$InputData.f82045a) && Intrinsics.f(this.f82046b, featureNotAvailableFlowContract$InputData.f82046b) && Intrinsics.f(this.f82047c, featureNotAvailableFlowContract$InputData.f82047c) && Intrinsics.f(this.d, featureNotAvailableFlowContract$InputData.d) && Intrinsics.f(this.e, featureNotAvailableFlowContract$InputData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + p.a.a(p.a.a(this.f82045a.hashCode() * 31, 31, this.f82046b), 31, this.f82047c)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f82045a, i);
        dest.writeParcelable(this.f82046b, i);
        dest.writeParcelable(this.f82047c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}

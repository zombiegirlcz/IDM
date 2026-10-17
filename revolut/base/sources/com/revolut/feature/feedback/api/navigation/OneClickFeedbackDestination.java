package com.revolut.feature.feedback.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/revolut/feature/feedback/api/navigation/OneClickFeedbackDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature/feedback/api/navigation/OneClickFeedbackDestination$InputData;", "", "toString", "()Ljava/lang/String;", "InputData", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OneClickFeedbackDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<OneClickFeedbackDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputData f73150b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/feedback/api/navigation/OneClickFeedbackDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_feedback_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ParcelableDestination f73152b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((ParcelableDestination) parcel.readParcelable(InputData.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(ParcelableDestination parcelableDestination, String referenceId) {
            Intrinsics.checkNotNullParameter(referenceId, "referenceId");
            this.f73151a = referenceId;
            this.f73152b = parcelableDestination;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputData)) {
                return false;
            }
            InputData inputData = (InputData) obj2;
            return Intrinsics.f(this.f73151a, inputData.f73151a) && Intrinsics.f(this.f73152b, inputData.f73152b);
        }

        public final int hashCode() {
            int iHashCode = this.f73151a.hashCode() * 31;
            ParcelableDestination parcelableDestination = this.f73152b;
            return iHashCode + (parcelableDestination == null ? 0 : parcelableDestination.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f73151a);
            dest.writeParcelable(this.f73152b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OneClickFeedbackDestination(InputData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OneClickFeedbackDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneClickFeedbackDestination(InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f73150b = inputData;
    }

    @Override // com.revolut.kompot.common.InternalDestination
    /* JADX INFO: renamed from: b */
    public final IOData$Input getF98300a() {
        return this.f73150b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof OneClickFeedbackDestination) && Intrinsics.f(this.f73150b, ((OneClickFeedbackDestination) obj2).f73150b);
    }

    public final int hashCode() {
        return this.f73150b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f73150b.writeToParcel(dest, i);
    }
}

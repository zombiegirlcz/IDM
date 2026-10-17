package com.revolut.feature.cashback.impl.ui.yourcashback;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cashback.impl.ui.yourcashback.YourCashbackFlowContract$Step;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/cashback/impl/ui/yourcashback/YourCashbackFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cashback_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class YourCashbackFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<YourCashbackFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final YourCashbackFlowContract$Step f65704a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new YourCashbackFlowContract$InputData((YourCashbackFlowContract$Step) parcel.readParcelable(YourCashbackFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new YourCashbackFlowContract$InputData[i];
        }
    }

    public YourCashbackFlowContract$InputData(YourCashbackFlowContract$Step initialStep) {
        Intrinsics.checkNotNullParameter(initialStep, "initialStep");
        this.f65704a = initialStep;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof YourCashbackFlowContract$InputData) && Intrinsics.f(this.f65704a, ((YourCashbackFlowContract$InputData) obj2).f65704a);
    }

    public final int hashCode() {
        return this.f65704a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f65704a, i);
    }

    public YourCashbackFlowContract$InputData() {
        this(new YourCashbackFlowContract$Step.Home(false));
    }
}

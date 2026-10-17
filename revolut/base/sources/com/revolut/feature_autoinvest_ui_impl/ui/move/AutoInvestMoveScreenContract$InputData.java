package com.revolut.feature_autoinvest_ui_impl.ui.move;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yvh.b;
import yvh.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_autoinvest_ui_impl/ui/move/AutoInvestMoveScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_autoinvest_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoInvestMoveScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AutoInvestMoveScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f96624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f96625b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoInvestMoveScreenContract$InputData((b) parcel.readSerializable(), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoInvestMoveScreenContract$InputData[i];
        }
    }

    public AutoInvestMoveScreenContract$InputData(b current, h moveTargetType) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(moveTargetType, "moveTargetType");
        this.f96624a = current;
        this.f96625b = moveTargetType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoInvestMoveScreenContract$InputData)) {
            return false;
        }
        AutoInvestMoveScreenContract$InputData autoInvestMoveScreenContract$InputData = (AutoInvestMoveScreenContract$InputData) obj2;
        return Intrinsics.f(this.f96624a, autoInvestMoveScreenContract$InputData.f96624a) && this.f96625b == autoInvestMoveScreenContract$InputData.f96625b;
    }

    public final int hashCode() {
        return this.f96625b.hashCode() + (this.f96624a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f96624a);
        dest.writeString(this.f96625b.name());
    }
}

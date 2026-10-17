package com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/standingordertopup/impl/ui/flow/auto_top_up/AutoTopUpFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_standing_order_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AutoTopUpFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AutoTopUpFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f88178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f88179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88180c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AutoTopUpFlowContract$InputData((xi0.b) parcel.readSerializable(), l.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoTopUpFlowContract$InputData[i];
        }
    }

    public AutoTopUpFlowContract$InputData(xi0.b bVar, l pocketType, String str) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        this.f88178a = bVar;
        this.f88179b = pocketType;
        this.f88180c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AutoTopUpFlowContract$InputData)) {
            return false;
        }
        AutoTopUpFlowContract$InputData autoTopUpFlowContract$InputData = (AutoTopUpFlowContract$InputData) obj2;
        return Intrinsics.f(this.f88178a, autoTopUpFlowContract$InputData.f88178a) && this.f88179b == autoTopUpFlowContract$InputData.f88179b && Intrinsics.f(this.f88180c, autoTopUpFlowContract$InputData.f88180c);
    }

    public final int hashCode() {
        xi0.b bVar = this.f88178a;
        int iC = t61.a.c(this.f88179b, (bVar == null ? 0 : bVar.hashCode()) * 31, 31);
        String str = this.f88180c;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f88178a);
        dest.writeString(this.f88179b.name());
        dest.writeString(this.f88180c);
    }
}

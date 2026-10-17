package com.revolut.feature.junior_allowance.impl.ui.flow.allowance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_allowance.api.navigation.JuniorAllowanceLaunchMode;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_allowance/impl/ui/flow/allowance/JuniorAllowanceFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_junior_allowance_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorAllowanceFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<JuniorAllowanceFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JuniorAllowanceLaunchMode f76824c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorAllowanceFlowContract$InputData(parcel.readString(), parcel.readString(), (JuniorAllowanceLaunchMode) parcel.readParcelable(JuniorAllowanceFlowContract$InputData.class.getClassLoader()), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorAllowanceFlowContract$InputData[i];
        }
    }

    public JuniorAllowanceFlowContract$InputData(String juniorId, String str, JuniorAllowanceLaunchMode launchMode, b bVar) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        this.f76822a = juniorId;
        this.f76823b = str;
        this.f76824c = launchMode;
        this.d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorAllowanceFlowContract$InputData)) {
            return false;
        }
        JuniorAllowanceFlowContract$InputData juniorAllowanceFlowContract$InputData = (JuniorAllowanceFlowContract$InputData) obj2;
        return Intrinsics.f(this.f76822a, juniorAllowanceFlowContract$InputData.f76822a) && Intrinsics.f(this.f76823b, juniorAllowanceFlowContract$InputData.f76823b) && Intrinsics.f(this.f76824c, juniorAllowanceFlowContract$InputData.f76824c) && Intrinsics.f(this.d, juniorAllowanceFlowContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = this.f76822a.hashCode() * 31;
        String str = this.f76823b;
        int iHashCode2 = (this.f76824c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        b bVar = this.d;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76822a);
        dest.writeString(this.f76823b);
        dest.writeParcelable(this.f76824c, i);
        dest.writeSerializable(this.d);
    }
}

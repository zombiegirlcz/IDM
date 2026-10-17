package com.revolut.feature.joint.impl.ui.invite_flow;

import android.os.Parcel;
import android.os.Parcelable;
import cci.g;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/joint/impl/ui/invite_flow/InviteFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InviteFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InviteFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f76556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f76557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f76558c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            d0 d0Var = (d0) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(g.valueOf(parcel.readString()));
            }
            return new InviteFlowContract$InputData(z, d0Var, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InviteFlowContract$InputData[i];
        }
    }

    public InviteFlowContract$InputData(boolean z, d0 d0Var, List selectedPurposes) {
        Intrinsics.checkNotNullParameter(selectedPurposes, "selectedPurposes");
        this.f76556a = z;
        this.f76557b = d0Var;
        this.f76558c = selectedPurposes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InviteFlowContract$InputData)) {
            return false;
        }
        InviteFlowContract$InputData inviteFlowContract$InputData = (InviteFlowContract$InputData) obj2;
        return this.f76556a == inviteFlowContract$InputData.f76556a && Intrinsics.f(this.f76557b, inviteFlowContract$InputData.f76557b) && Intrinsics.f(this.f76558c, inviteFlowContract$InputData.f76558c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f76556a) * 31;
        d0 d0Var = this.f76557b;
        return this.f76558c.hashCode() + ((iHashCode + (d0Var == null ? 0 : d0Var.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f76556a ? 1 : 0);
        dest.writeSerializable(this.f76557b);
        Iterator itV = p.a.v(this.f76558c, dest);
        while (itV.hasNext()) {
            dest.writeString(((g) itV.next()).name());
        }
    }

    public InviteFlowContract$InputData(d0 d0Var, boolean z) {
        this(z, d0Var, f0.f322471a);
    }
}

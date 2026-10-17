package com.revolut.feature.rewards.impl.ui.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rewards/impl/ui/details/flow/PerkDetailsFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PerkDetailsFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PerkDetailsFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f84925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f84926b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PerkDetailsFlowContract$State(parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PerkDetailsFlowContract$State[i];
        }
    }

    public PerkDetailsFlowContract$State(boolean z, boolean z3) {
        this.f84925a = z;
        this.f84926b = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PerkDetailsFlowContract$State)) {
            return false;
        }
        PerkDetailsFlowContract$State perkDetailsFlowContract$State = (PerkDetailsFlowContract$State) obj2;
        return this.f84925a == perkDetailsFlowContract$State.f84925a && this.f84926b == perkDetailsFlowContract$State.f84926b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f84926b) + (Boolean.hashCode(this.f84925a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f84925a ? 1 : 0);
        dest.writeInt(this.f84926b ? 1 : 0);
    }

    public PerkDetailsFlowContract$State() {
        this(false, false);
    }
}

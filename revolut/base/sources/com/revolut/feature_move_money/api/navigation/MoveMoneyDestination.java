package com.revolut.feature_move_money.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.StackDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_move_money/api/navigation/MoveMoneyDestination;", "Lcom/revolut/kompot/common/StackDestination;", "", "toString", "()Ljava/lang/String;", "feature_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyDestination implements StackDestination {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyInputData f97235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransitionAnimation f97236b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyDestination((MoveMoneyInputData) parcel.readParcelable(MoveMoneyDestination.class.getClassLoader()), (TransitionAnimation) parcel.readParcelable(MoveMoneyDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyDestination[i];
        }
    }

    public MoveMoneyDestination(MoveMoneyInputData inputData, TransitionAnimation transitionAnimation) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f97235a = inputData;
        this.f97236b = transitionAnimation;
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: Y0, reason: from getter */
    public final TransitionAnimation getF97236b() {
        return this.f97236b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final MoveMoneyInputData getF97235a() {
        return this.f97235a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyDestination)) {
            return false;
        }
        MoveMoneyDestination moveMoneyDestination = (MoveMoneyDestination) obj2;
        return Intrinsics.f(this.f97235a, moveMoneyDestination.f97235a) && Intrinsics.f(this.f97236b, moveMoneyDestination.f97236b);
    }

    public final int hashCode() {
        int iHashCode = this.f97235a.hashCode() * 31;
        TransitionAnimation transitionAnimation = this.f97236b;
        return iHashCode + (transitionAnimation == null ? 0 : transitionAnimation.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97235a, i);
        dest.writeParcelable(this.f97236b, i);
    }
}

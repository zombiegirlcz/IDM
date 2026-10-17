package com.revolut.feature_move_money.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.shared.feature.move_money.api.model.MoveMoneyReason;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/flow/MoveMoneyFlowContract$MoveMoneyProcessState", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyFlowContract$MoveMoneyProcessState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyFlowContract$MoveMoneyProcessState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoveMoneyOrderInfo f97347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f97348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f97349c;
    public final MoveMoneyReason d;
    public final boolean e;
    public final Set f;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Class cls;
            MoveMoneyReason moveMoneyReason;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            MoveMoneyOrderInfo moveMoneyOrderInfoCreateFromParcel = MoveMoneyOrderInfo.CREATOR.createFromParcel(parcel);
            int iE = 0;
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z3 = false;
            }
            boolean z4 = parcel.readInt() != 0 ? i : 0;
            MoveMoneyReason moveMoneyReason2 = (MoveMoneyReason) parcel.readParcelable(MoveMoneyFlowContract$MoveMoneyProcessState.class.getClassLoader());
            if (parcel.readInt() != 0) {
                cls = MoveMoneyFlowContract$MoveMoneyProcessState.class;
                moveMoneyReason = moveMoneyReason2;
                z = i;
            } else {
                cls = MoveMoneyFlowContract$MoveMoneyProcessState.class;
                moveMoneyReason = moveMoneyReason2;
                z = 0;
            }
            int i2 = parcel.readInt();
            Class cls2 = cls;
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            while (iE != i2) {
                iE = com.revolut.data.database.models.openbanking.d.e(cls2, parcel, linkedHashSet, iE, i);
            }
            return new MoveMoneyFlowContract$MoveMoneyProcessState(moveMoneyOrderInfoCreateFromParcel, z3, z4, moveMoneyReason, z, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyFlowContract$MoveMoneyProcessState[i];
        }
    }

    public MoveMoneyFlowContract$MoveMoneyProcessState(MoveMoneyOrderInfo moveMoneyOrderInfo, boolean z, int i) {
        this(moveMoneyOrderInfo, false, (i & 4) != 0 ? true : z, null, false, h0.f322473a);
    }

    public static MoveMoneyFlowContract$MoveMoneyProcessState a(MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState, MoveMoneyOrderInfo moveMoneyOrderInfo, boolean z, MoveMoneyReason moveMoneyReason, LinkedHashSet linkedHashSet, int i) {
        if ((i & 1) != 0) {
            moveMoneyOrderInfo = moveMoneyFlowContract$MoveMoneyProcessState.f97347a;
        }
        MoveMoneyOrderInfo moveMoneyOrderInfo2 = moveMoneyOrderInfo;
        boolean z3 = (i & 2) != 0 ? moveMoneyFlowContract$MoveMoneyProcessState.f97348b : true;
        if ((i & 4) != 0) {
            z = moveMoneyFlowContract$MoveMoneyProcessState.f97349c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            moveMoneyReason = moveMoneyFlowContract$MoveMoneyProcessState.d;
        }
        MoveMoneyReason moveMoneyReason2 = moveMoneyReason;
        boolean z6 = (i & 16) != 0 ? moveMoneyFlowContract$MoveMoneyProcessState.e : true;
        Set set = linkedHashSet;
        if ((i & 32) != 0) {
            set = moveMoneyFlowContract$MoveMoneyProcessState.f;
        }
        Set confirmationModalChecksPassed = set;
        moveMoneyFlowContract$MoveMoneyProcessState.getClass();
        Intrinsics.checkNotNullParameter(moveMoneyOrderInfo2, "moveMoneyOrderInfo");
        Intrinsics.checkNotNullParameter(confirmationModalChecksPassed, "confirmationModalChecksPassed");
        return new MoveMoneyFlowContract$MoveMoneyProcessState(moveMoneyOrderInfo2, z3, z4, moveMoneyReason2, z6, confirmationModalChecksPassed);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyFlowContract$MoveMoneyProcessState)) {
            return false;
        }
        MoveMoneyFlowContract$MoveMoneyProcessState moveMoneyFlowContract$MoveMoneyProcessState = (MoveMoneyFlowContract$MoveMoneyProcessState) obj2;
        return Intrinsics.f(this.f97347a, moveMoneyFlowContract$MoveMoneyProcessState.f97347a) && this.f97348b == moveMoneyFlowContract$MoveMoneyProcessState.f97348b && this.f97349c == moveMoneyFlowContract$MoveMoneyProcessState.f97349c && Intrinsics.f(this.d, moveMoneyFlowContract$MoveMoneyProcessState.d) && this.e == moveMoneyFlowContract$MoveMoneyProcessState.e && Intrinsics.f(this.f, moveMoneyFlowContract$MoveMoneyProcessState.f);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f97347a.hashCode() * 31, 31, this.f97348b), 31, this.f97349c);
        MoveMoneyReason moveMoneyReason = this.d;
        return this.f.hashCode() + j6.a.c((iC + (moveMoneyReason == null ? 0 : moveMoneyReason.hashCode())) * 31, 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f97347a.writeToParcel(dest, i);
        dest.writeInt(this.f97348b ? 1 : 0);
        dest.writeInt(this.f97349c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        Iterator itV = n.v(this.f, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public MoveMoneyFlowContract$MoveMoneyProcessState(MoveMoneyOrderInfo moveMoneyOrderInfo, boolean z, boolean z3, MoveMoneyReason moveMoneyReason, boolean z4, Set confirmationModalChecksPassed) {
        Intrinsics.checkNotNullParameter(moveMoneyOrderInfo, "moveMoneyOrderInfo");
        Intrinsics.checkNotNullParameter(confirmationModalChecksPassed, "confirmationModalChecksPassed");
        this.f97347a = moveMoneyOrderInfo;
        this.f97348b = z;
        this.f97349c = z3;
        this.d = moveMoneyReason;
        this.e = z4;
        this.f = confirmationModalChecksPassed;
    }
}

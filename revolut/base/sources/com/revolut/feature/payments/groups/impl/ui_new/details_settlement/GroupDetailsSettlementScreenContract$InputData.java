package com.revolut.feature.payments.groups.impl.ui_new.details_settlement;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import do3.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import oq9.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/details_settlement/GroupDetailsSettlementScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupDetailsSettlementScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<GroupDetailsSettlementScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f79419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f79420b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupDetailsSettlementScreenContract$InputData((c0) parcel.readSerializable(), (n) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupDetailsSettlementScreenContract$InputData[i];
        }
    }

    public GroupDetailsSettlementScreenContract$InputData(c0 settlement, n user) {
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        Intrinsics.checkNotNullParameter(user, "user");
        this.f79419a = settlement;
        this.f79420b = user;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupDetailsSettlementScreenContract$InputData)) {
            return false;
        }
        GroupDetailsSettlementScreenContract$InputData groupDetailsSettlementScreenContract$InputData = (GroupDetailsSettlementScreenContract$InputData) obj2;
        return Intrinsics.f(this.f79419a, groupDetailsSettlementScreenContract$InputData.f79419a) && Intrinsics.f(this.f79420b, groupDetailsSettlementScreenContract$InputData.f79420b);
    }

    public final int hashCode() {
        return this.f79420b.hashCode() + (this.f79419a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79419a);
        dest.writeSerializable(this.f79420b);
    }
}

package com.revolut.feature_move_money.impl.automation.screen.limit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ibd.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_move_money/impl/automation/screen/limit/MoveMoneyAutomationLimitScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_move_money_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyAutomationLimitScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyAutomationLimitScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f97344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f97345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f97346c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyAutomationLimitScreenContract$InputData((b) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? j.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyAutomationLimitScreenContract$InputData[i];
        }
    }

    public MoveMoneyAutomationLimitScreenContract$InputData(b currency, Long l2, j jVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f97344a = currency;
        this.f97345b = l2;
        this.f97346c = jVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyAutomationLimitScreenContract$InputData)) {
            return false;
        }
        MoveMoneyAutomationLimitScreenContract$InputData moveMoneyAutomationLimitScreenContract$InputData = (MoveMoneyAutomationLimitScreenContract$InputData) obj2;
        return Intrinsics.f(this.f97344a, moveMoneyAutomationLimitScreenContract$InputData.f97344a) && Intrinsics.f(this.f97345b, moveMoneyAutomationLimitScreenContract$InputData.f97345b) && this.f97346c == moveMoneyAutomationLimitScreenContract$InputData.f97346c;
    }

    public final int hashCode() {
        int iHashCode = this.f97344a.hashCode() * 31;
        Long l2 = this.f97345b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        j jVar = this.f97346c;
        return iHashCode2 + (jVar != null ? jVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f97344a);
        Long l2 = this.f97345b;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        j jVar = this.f97346c;
        if (jVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(jVar.name());
        }
    }
}

package com.revolut.feature.vaults.impl.ui.money_flow.add_money.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/vaults/impl/ui/money_flow/add_money/screen/AddMoneyScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddMoneyScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddMoneyScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f94775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f94777c;
    public final int d;
    public final int e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f94778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f94779h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s sVar = (s) parcel.readSerializable();
            String string = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            boolean z6 = false;
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z6 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z11 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() == 0) {
                z4 = z;
            }
            return new AddMoneyScreenContract$InputData(sVar, string, lValueOf, i, i2, z6, z11, z3, z4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddMoneyScreenContract$InputData[i];
        }
    }

    public AddMoneyScreenContract$InputData(s vault, String str, Long l2, int i, int i2, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f94775a = vault;
        this.f94776b = str;
        this.f94777c = l2;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.f94778g = z3;
        this.f94779h = z4;
        this.i = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddMoneyScreenContract$InputData)) {
            return false;
        }
        AddMoneyScreenContract$InputData addMoneyScreenContract$InputData = (AddMoneyScreenContract$InputData) obj2;
        return Intrinsics.f(this.f94775a, addMoneyScreenContract$InputData.f94775a) && Intrinsics.f(this.f94776b, addMoneyScreenContract$InputData.f94776b) && Intrinsics.f(this.f94777c, addMoneyScreenContract$InputData.f94777c) && this.d == addMoneyScreenContract$InputData.d && this.e == addMoneyScreenContract$InputData.e && this.f == addMoneyScreenContract$InputData.f && this.f94778g == addMoneyScreenContract$InputData.f94778g && this.f94779h == addMoneyScreenContract$InputData.f94779h && this.i == addMoneyScreenContract$InputData.i;
    }

    public final int hashCode() {
        int iHashCode = this.f94775a.hashCode() * 31;
        String str = this.f94776b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.f94777c;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.e, j6.a.b(this.d, (iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31, 31), 31), 31, this.f), 31, this.f94778g), 31, this.f94779h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94775a);
        dest.writeString(this.f94776b);
        Long l2 = this.f94777c;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeInt(this.d);
        dest.writeInt(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f94778g ? 1 : 0);
        dest.writeInt(this.f94779h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
    }
}

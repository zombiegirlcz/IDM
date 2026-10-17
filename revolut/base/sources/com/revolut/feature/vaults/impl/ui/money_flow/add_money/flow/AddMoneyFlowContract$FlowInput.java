package com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/vaults/impl/ui/money_flow/add_money/flow/AddMoneyFlowContract$FlowInput", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_vaults_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddMoneyFlowContract$FlowInput implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddMoneyFlowContract$FlowInput> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f94761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f94763c;
    public final Long d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f94764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f94765h;
    public final Integer i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f94766j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            s sVar = (s) parcel.readSerializable();
            String string = parcel.readString();
            boolean z4 = parcel.readInt() != 0;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            boolean z6 = true;
            int i2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z6 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = z;
            } else {
                z3 = z;
                z = false;
            }
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() == 0) {
                z3 = false;
            }
            return new AddMoneyFlowContract$FlowInput(i, i2, numValueOf, lValueOf, string, sVar, z4, z6, z, z3);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddMoneyFlowContract$FlowInput[i];
        }
    }

    public AddMoneyFlowContract$FlowInput(int i, int i2, Integer num, Long l2, String str, s vault, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(vault, "vault");
        this.f94761a = vault;
        this.f94762b = str;
        this.f94763c = z;
        this.d = l2;
        this.e = i;
        this.f = i2;
        this.f94764g = z3;
        this.f94765h = z4;
        this.i = num;
        this.f94766j = z6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddMoneyFlowContract$FlowInput)) {
            return false;
        }
        AddMoneyFlowContract$FlowInput addMoneyFlowContract$FlowInput = (AddMoneyFlowContract$FlowInput) obj2;
        return Intrinsics.f(this.f94761a, addMoneyFlowContract$FlowInput.f94761a) && Intrinsics.f(this.f94762b, addMoneyFlowContract$FlowInput.f94762b) && this.f94763c == addMoneyFlowContract$FlowInput.f94763c && Intrinsics.f(this.d, addMoneyFlowContract$FlowInput.d) && this.e == addMoneyFlowContract$FlowInput.e && this.f == addMoneyFlowContract$FlowInput.f && this.f94764g == addMoneyFlowContract$FlowInput.f94764g && this.f94765h == addMoneyFlowContract$FlowInput.f94765h && Intrinsics.f(this.i, addMoneyFlowContract$FlowInput.i) && this.f94766j == addMoneyFlowContract$FlowInput.f94766j;
    }

    public final int hashCode() {
        int iHashCode = this.f94761a.hashCode() * 31;
        String str = this.f94762b;
        int iC = j6.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f94763c);
        Long l2 = this.d;
        int iC2 = j6.a.c(j6.a.c(j6.a.b(this.f, j6.a.b(this.e, (iC + (l2 == null ? 0 : l2.hashCode())) * 31, 31), 31), 31, this.f94764g), 31, this.f94765h);
        Integer num = this.i;
        return Boolean.hashCode(this.f94766j) + ((iC2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f94761a);
        dest.writeString(this.f94762b);
        dest.writeInt(this.f94763c ? 1 : 0);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeInt(this.f94764g ? 1 : 0);
        dest.writeInt(this.f94765h ? 1 : 0);
        Integer num = this.i;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f94766j ? 1 : 0);
    }

    public /* synthetic */ AddMoneyFlowContract$FlowInput(int i, int i2, Integer num, Long l2, String str, s sVar, boolean z, boolean z3, boolean z4) {
        this(i, i2, num, l2, str, sVar, z, z3, z4, false);
    }
}

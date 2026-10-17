package com.revolut.feature.apm.upi.impl.flow.screen.amount;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlowContract$Recipient;
import com.revolut.feature.apm.upi.impl.flow.model.ScreenConfiguration;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import h30.l;
import ip0.v7;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/screen/amount/UpiTransferAmountScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpiTransferAmountScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpiTransferAmountScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferFlowContract$Recipient f63000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f63001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f63002c;
    public final we2.a d;
    public final boolean e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f63003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f63004h;
    public final TransferScheduleData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScreenConfiguration f63005j;
    public final p k;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            LinkedHashMap linkedHashMap;
            UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = (UpiTransferFlowContract$Recipient) j6.a.f(parcel, "parcel", UpiTransferAmountScreenContract$InputData.class);
            d dVar = (d) parcel.readSerializable();
            int iD = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            we2.a aVarValueOf = we2.a.valueOf(parcel.readString());
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i2);
                while (iD != i2) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, i);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UpiTransferAmountScreenContract$InputData(upiTransferFlowContract$Recipient, dVar, z, aVarValueOf, z3, string, string2, linkedHashMap, (TransferScheduleData) parcel.readParcelable(UpiTransferAmountScreenContract$InputData.class.getClassLoader()), ScreenConfiguration.CREATOR.createFromParcel(parcel), (p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpiTransferAmountScreenContract$InputData[i];
        }
    }

    public UpiTransferAmountScreenContract$InputData(UpiTransferFlowContract$Recipient recipient, d amount, boolean z, we2.a transferSource, boolean z3, String str, String str2, Map map, TransferScheduleData scheduleData, ScreenConfiguration screenConfiguration, p pVar) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(transferSource, "transferSource");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f63000a = recipient;
        this.f63001b = amount;
        this.f63002c = z;
        this.d = transferSource;
        this.e = z3;
        this.f = str;
        this.f63003g = str2;
        this.f63004h = map;
        this.i = scheduleData;
        this.f63005j = screenConfiguration;
        this.k = pVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpiTransferAmountScreenContract$InputData)) {
            return false;
        }
        UpiTransferAmountScreenContract$InputData upiTransferAmountScreenContract$InputData = (UpiTransferAmountScreenContract$InputData) obj2;
        return Intrinsics.f(this.f63000a, upiTransferAmountScreenContract$InputData.f63000a) && Intrinsics.f(this.f63001b, upiTransferAmountScreenContract$InputData.f63001b) && this.f63002c == upiTransferAmountScreenContract$InputData.f63002c && this.d == upiTransferAmountScreenContract$InputData.d && this.e == upiTransferAmountScreenContract$InputData.e && Intrinsics.f(this.f, upiTransferAmountScreenContract$InputData.f) && Intrinsics.f(this.f63003g, upiTransferAmountScreenContract$InputData.f63003g) && Intrinsics.f(this.f63004h, upiTransferAmountScreenContract$InputData.f63004h) && Intrinsics.f(this.i, upiTransferAmountScreenContract$InputData.i) && Intrinsics.f(this.f63005j, upiTransferAmountScreenContract$InputData.f63005j) && Intrinsics.f(this.k, upiTransferAmountScreenContract$InputData.k);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + j6.a.c(v7.c(this.f63000a.hashCode() * 31, 31, this.f63001b), 31, this.f63002c)) * 31, 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f63003g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f63004h;
        int iHashCode3 = (this.f63005j.hashCode() + l.f(this.i, (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31, 31)) * 31;
        p pVar = this.k;
        return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63000a, i);
        dest.writeSerializable(this.f63001b);
        dest.writeInt(this.f63002c ? 1 : 0);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f);
        dest.writeString(this.f63003g);
        Map map = this.f63004h;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString((String) entry.getKey());
                dest.writeString((String) entry.getValue());
            }
        }
        dest.writeParcelable(this.i, i);
        this.f63005j.writeToParcel(dest, i);
        dest.writeSerializable(this.k);
    }
}

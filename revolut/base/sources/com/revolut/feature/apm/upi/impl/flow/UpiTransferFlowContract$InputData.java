package com.revolut.feature.apm.upi.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import h30.l;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qua.p;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/UpiTransferFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpiTransferFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpiTransferFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferFlowContract$Recipient f62957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f62958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f62959c;
    public final LocalDate d;
    public final boolean e;
    public final we2.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f62960g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f62961h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f62962j;
    public final m1l.a k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            LinkedHashMap linkedHashMap;
            UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = (UpiTransferFlowContract$Recipient) j6.a.f(parcel, "parcel", UpiTransferFlowContract$InputData.class);
            d dVar = (d) parcel.readSerializable();
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            int iD = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            we2.a aVarValueOf = we2.a.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
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
            return new UpiTransferFlowContract$InputData(upiTransferFlowContract$Recipient, dVar, string, localDate, z, aVarValueOf, string2, string3, linkedHashMap, (p) parcel.readSerializable(), m1l.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpiTransferFlowContract$InputData[i];
        }
    }

    public UpiTransferFlowContract$InputData(UpiTransferFlowContract$Recipient recipient, d dVar, String str, LocalDate localDate, boolean z, we2.a transferSource, String str2, String str3, Map map, p pVar, m1l.a scheduleMode) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(transferSource, "transferSource");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        this.f62957a = recipient;
        this.f62958b = dVar;
        this.f62959c = str;
        this.d = localDate;
        this.e = z;
        this.f = transferSource;
        this.f62960g = str2;
        this.f62961h = str3;
        this.i = map;
        this.f62962j = pVar;
        this.k = scheduleMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpiTransferFlowContract$InputData)) {
            return false;
        }
        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = (UpiTransferFlowContract$InputData) obj2;
        return Intrinsics.f(this.f62957a, upiTransferFlowContract$InputData.f62957a) && Intrinsics.f(this.f62958b, upiTransferFlowContract$InputData.f62958b) && Intrinsics.f(this.f62959c, upiTransferFlowContract$InputData.f62959c) && Intrinsics.f(this.d, upiTransferFlowContract$InputData.d) && this.e == upiTransferFlowContract$InputData.e && this.f == upiTransferFlowContract$InputData.f && Intrinsics.f(this.f62960g, upiTransferFlowContract$InputData.f62960g) && Intrinsics.f(this.f62961h, upiTransferFlowContract$InputData.f62961h) && Intrinsics.f(this.i, upiTransferFlowContract$InputData.i) && Intrinsics.f(this.f62962j, upiTransferFlowContract$InputData.f62962j) && this.k == upiTransferFlowContract$InputData.k;
    }

    public final int hashCode() {
        int iHashCode = this.f62957a.hashCode() * 31;
        d dVar = this.f62958b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f62959c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode4 = (this.f.hashCode() + j6.a.c((iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.e)) * 31;
        String str2 = this.f62960g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f62961h;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map map = this.i;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        p pVar = this.f62962j;
        return this.k.hashCode() + ((iHashCode7 + (pVar != null ? pVar.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62957a, i);
        dest.writeSerializable(this.f62958b);
        dest.writeString(this.f62959c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeString(this.f.name());
        dest.writeString(this.f62960g);
        dest.writeString(this.f62961h);
        Map map = this.i;
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
        dest.writeSerializable(this.f62962j);
        dest.writeString(this.k.name());
    }

    public /* synthetic */ UpiTransferFlowContract$InputData(UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient, d dVar, String str, we2.a aVar, String str2, String str3, Map map, p pVar, m1l.a aVar2, int i) {
        this(upiTransferFlowContract$Recipient, (i & 2) != 0 ? null : dVar, (i & 4) != 0 ? null : str, null, true, aVar, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : map, pVar, aVar2);
    }
}

package com.revolut.feature.apm.upi.impl.flow.screen.review;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/upi/impl/flow/screen/review/UpiTransferReviewScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UpiTransferReviewScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UpiTransferReviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UpiTransferFlowContract$Recipient f63006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f63007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63008c;
    public final TransferScheduleData d;
    public final io3.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final we2.a f63009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f63010h;
    public final Map i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f63011j;
    public final ScreenConfiguration k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f63012l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            UpiTransferFlowContract$Recipient upiTransferFlowContract$Recipient = (UpiTransferFlowContract$Recipient) j6.a.f(parcel, "parcel", UpiTransferReviewScreenContract$InputData.class);
            d dVar = (d) parcel.readSerializable();
            String string = parcel.readString();
            TransferScheduleData transferScheduleData = (TransferScheduleData) parcel.readParcelable(UpiTransferReviewScreenContract$InputData.class.getClassLoader());
            io3.d dVar2 = (io3.d) parcel.readSerializable();
            String string2 = parcel.readString();
            we2.a aVarValueOf = we2.a.valueOf(parcel.readString());
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i);
                int iD = 0;
                while (iD != i) {
                    iD = j6.a.d(parcel, linkedHashMap2, parcel.readString(), iD, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new UpiTransferReviewScreenContract$InputData(upiTransferFlowContract$Recipient, dVar, string, transferScheduleData, dVar2, string2, aVarValueOf, string3, linkedHashMap, parcel.readString(), ScreenConfiguration.CREATOR.createFromParcel(parcel), (p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UpiTransferReviewScreenContract$InputData[i];
        }
    }

    public UpiTransferReviewScreenContract$InputData(UpiTransferFlowContract$Recipient recipient, d amount, String reference, TransferScheduleData scheduleData, io3.d dVar, String str, we2.a transferSource, String str2, Map map, String str3, ScreenConfiguration screenConfiguration, p pVar) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(transferSource, "transferSource");
        Intrinsics.checkNotNullParameter(screenConfiguration, "screenConfiguration");
        this.f63006a = recipient;
        this.f63007b = amount;
        this.f63008c = reference;
        this.d = scheduleData;
        this.e = dVar;
        this.f = str;
        this.f63009g = transferSource;
        this.f63010h = str2;
        this.i = map;
        this.f63011j = str3;
        this.k = screenConfiguration;
        this.f63012l = pVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UpiTransferReviewScreenContract$InputData)) {
            return false;
        }
        UpiTransferReviewScreenContract$InputData upiTransferReviewScreenContract$InputData = (UpiTransferReviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f63006a, upiTransferReviewScreenContract$InputData.f63006a) && Intrinsics.f(this.f63007b, upiTransferReviewScreenContract$InputData.f63007b) && Intrinsics.f(this.f63008c, upiTransferReviewScreenContract$InputData.f63008c) && Intrinsics.f(this.d, upiTransferReviewScreenContract$InputData.d) && Intrinsics.f(this.e, upiTransferReviewScreenContract$InputData.e) && Intrinsics.f(this.f, upiTransferReviewScreenContract$InputData.f) && this.f63009g == upiTransferReviewScreenContract$InputData.f63009g && Intrinsics.f(this.f63010h, upiTransferReviewScreenContract$InputData.f63010h) && Intrinsics.f(this.i, upiTransferReviewScreenContract$InputData.i) && Intrinsics.f(this.f63011j, upiTransferReviewScreenContract$InputData.f63011j) && Intrinsics.f(this.k, upiTransferReviewScreenContract$InputData.k) && Intrinsics.f(this.f63012l, upiTransferReviewScreenContract$InputData.f63012l);
    }

    public final int hashCode() {
        int iF = l.f(this.d, p.a.c(v7.c(this.f63006a.hashCode() * 31, 31, this.f63007b), 31, this.f63008c), 31);
        io3.d dVar = this.e;
        int iHashCode = (iF + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f;
        int iHashCode2 = (this.f63009g.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f63010h;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.i;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.f63011j;
        int iHashCode5 = (this.k.hashCode() + ((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        p pVar = this.f63012l;
        return iHashCode5 + (pVar != null ? pVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f63006a, i);
        dest.writeSerializable(this.f63007b);
        dest.writeString(this.f63008c);
        dest.writeParcelable(this.d, i);
        dest.writeSerializable(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f63009g.name());
        dest.writeString(this.f63010h);
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
        dest.writeString(this.f63011j);
        this.k.writeToParcel(dest, i);
        dest.writeSerializable(this.f63012l);
    }
}

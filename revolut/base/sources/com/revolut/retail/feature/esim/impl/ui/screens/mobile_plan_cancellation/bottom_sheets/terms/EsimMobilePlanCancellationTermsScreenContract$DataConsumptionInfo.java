package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_cancellation/bottom_sheets/terms/EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f101130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f101131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f101132c;
    public final Long d;
    public final Long e;
    public final d f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo[i];
        }
    }

    public EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo(Long l2, Long l3, d dVar, Long l4, Long l5, d dVar2) {
        this.f101130a = l2;
        this.f101131b = l3;
        this.f101132c = dVar;
        this.d = l4;
        this.e = l5;
        this.f = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo)) {
            return false;
        }
        EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo = (EsimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo) obj2;
        return Intrinsics.f(this.f101130a, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.f101130a) && Intrinsics.f(this.f101131b, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.f101131b) && Intrinsics.f(this.f101132c, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.f101132c) && Intrinsics.f(this.d, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.d) && Intrinsics.f(this.e, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.e) && Intrinsics.f(this.f, esimMobilePlanCancellationTermsScreenContract$DataConsumptionInfo.f);
    }

    public final int hashCode() {
        Long l2 = this.f101130a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f101131b;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        d dVar = this.f101132c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Long l4 = this.d;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.e;
        int iHashCode5 = (iHashCode4 + (l5 == null ? 0 : l5.hashCode())) * 31;
        d dVar2 = this.f;
        return iHashCode5 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f101130a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f101131b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        dest.writeSerializable(this.f101132c);
        Long l4 = this.d;
        if (l4 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l4);
        }
        Long l5 = this.e;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l5);
        }
        dest.writeSerializable(this.f);
    }
}
